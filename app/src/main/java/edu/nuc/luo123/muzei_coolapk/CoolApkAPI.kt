package edu.nuc.luo123.muzei_coolapk

import android.os.Build
import androidx.annotation.RequiresApi
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
interface CoolApkAPI {

    companion object {
        val DEVICE_ID = "2c243f4f-faee-33fe-9141-de8bf3cfe7ec"
        val sign_origin =
            "token://com.coolapk.market/c67ef5943784d09750dcfbb31020f0ab?TIME$${DEVICE_ID}&com.coolapk.market"

        fun getClient(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://api.coolapk.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        fun signature(): String {
            val time = (System.currentTimeMillis()/1000).toInt()

            val time_md5 = time.toString().md5()

            val sign_str = sign_origin.replace("TIME", time_md5)

            var sign_md5 = sign_str.base64()

            sign_md5 = sign_md5.md5()
            return sign_md5 + DEVICE_ID + "0x"+ time.toString(16)
        }

        fun String.md5(): String {
            try {
                //获取md5加密对象
                val instance: MessageDigest = MessageDigest.getInstance("MD5")
                //对字符串加密，返回字节数组
                val digest: ByteArray = instance.digest(this.toByteArray())
                val sb: StringBuffer = StringBuffer()
                for (b in digest) {
                    //获取低八位有效值
                    val i: Int = b.toInt() and 0xff
                    //将整数转化为16进制
                    var hexString = Integer.toHexString(i)
                    if (hexString.length < 2) {
                        //如果是一位的话，补0
                        hexString = "0" + hexString
                    }
                    sb.append(hexString)
                }
                return sb.toString()

            } catch (e: NoSuchAlgorithmException) {
                e.printStackTrace()
            }
            return ""
        }


        fun String.base64(): String {
            return Base64.getEncoder().encodeToString(this.toByteArray())
        }
    }



    @GET("v6/picture/list")
    @Headers("X-Requested-With: XMLHttpRequest", "X-App-Id: com.coolapk.market")
    fun getImageList(
        @Header("X-App-Token") sign: String, @Query("tag") tag: String, @Query("type") type: String, @Query(
            "page"
        ) page: Int
    ): Call<ImageListEntity>


}