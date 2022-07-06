package edu.nuc.luo123.muzei_coolapk

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun api_test() {
        val client = CoolApkAPI.getClient()
        val api = client.create<CoolApkAPI>(CoolApkAPI::class.java)
        val rep = api.getImageList(CoolApkAPI.signature(), "二次元", "hot", 1)
            .also { print(it.request().headers().toString()) }.execute()

        for (i in rep.body()?.data!!) {
            println(i.message)
        }
        assert(true)
    }
}
