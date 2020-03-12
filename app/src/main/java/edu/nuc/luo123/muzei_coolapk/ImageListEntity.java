package edu.nuc.luo123.muzei_coolapk;

import java.util.List;

public class ImageListEntity {
    @com.google.gson.annotations.SerializedName("data")
    private List<DataBean> data;
    private String message;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * device_title : 魅族16th
         * dyh_name :
         * extra_info :
         * extra_key : 6073b380291b3eb5696496917dbe984e
         * extra_pic :
         * extra_title :
         * extra_url :
         * forwardid :
         * fromname : 酷安客户端
         * istag : 1
         * label : 900x1200
         * lastupdate : 1583988645
         * likenum : 5
         * location :
         * media_pic :
         * media_type : 0
         * media_url :
         * message : 机动战士高达解体系列③
         <a class="feed-link-tag" href="/t/高达模型">#高达模型#</a> <a class="feed-link-tag" href="/t/二次元">#二次元#</a>
         * message_cover :
         * message_keywords :
         * message_length : 24
         * message_status : 100
         * message_title :
         * pic : http://image.coolapk.com/picture/2020/0312/12/525542_6577_793@900x1200.jpg
         * question_answer_num : 0
         * question_follow_num : 0
         * rank_score : 285631
         * recent_hot_reply_ids :
         * recent_reply_ids : 118365537,118366926,118368137
         * recommend : 0
         * related_dyh_ids : 4240
         * relatednum : 0
         * replynum : 4
         * reportnum : 0
         * source_id :
         * status : 1
         * tags : #高达模型#,#二次元#
         * tid : 0
         * tinfo :
         * tpic :
         * ttitle :
         * turl :
         * type : 8
         * uid : 525542
         * user_tags :
         * username : Deepjob汉界
         * favnum : 2
         * issummary : 0
         * is_html_article : 0
         * is_hidden : 0
         * is_anonymous : 0
         * id : 17206567
         * fromid : 2
         * forwardnum : 0
         * fid : 0
         * extra_type : 0
         * extra_status : 0
         * dyh_id : 0
         * dateline : 1583986585
         * comment_block_num : 0
         * block_status : 0
         * index_name : feed
         * _queryTotal : 5882
         * _queryViewTotal : 5000
         * _querySearchTime : 0.0686
         * fetchType : base
         * entityId : 17206567
         * avatarFetchType : batch
         * userAvatar : http://avatar.coolapk.com/data/000/52/55/42_avatar_middle.jpg?1582218050
         * entityTemplate : feed
         * entityType : feed
         * url : /picture/17206567
         * feedType : picture
         * feedTypeName : 酷图
         * turlTarget :
         * info : 酷图
         * infoHtml : 酷图
         * picArr : ["http://image.coolapk.com/picture/2020/0312/12/525542_6577_793@900x1200.jpg","http://image.coolapk.com/picture/2020/0312/12/525542_6579_1763@923x1200.jpg","http://image.coolapk.com/picture/2020/0312/12/525542_6580_5137@923x1200.jpg","http://image.coolapk.com/picture/2020/0312/12/525542_6582_0464@1080x770.jpg","http://image.coolapk.com/picture/2020/0312/12/525542_6583_3782@923x1200.jpg","http://image.coolapk.com/picture/2020/0312/12/525542_6584_8463@923x1200.jpg"]
         * relateddata : []
         * media_info :
         * sourceFeed : null
         * forwardSourceType :
         * shareUrl : https://www.coolapk.com/picture/17206567?shareKey=MjgxYmM5NDRjMjYxNWU2OWJmYjY~
         * title : Deepjob汉界的酷图
         * extra_fromApi : /v6/picture/list?tag=%E4%BA%8C%E6%AC%A1%E5%85%83&type=hot&page=1
         * userInfo : {"uid":525542,"username":"Deepjob汉界","admintype":0,"groupid":0,"usergroupid":105,"level":5,"status":1,"usernamestatus":0,"avatarstatus":1582218050,"avatar_cover_status":1582217741,"regdate":1454551626,"logintime":1583987570,"fetchType":"base","entityType":"user","entityId":525542,"displayUsername":"Deepjob汉界","url":"/u/525542","userAvatar":"http://avatar.coolapk.com/data/000/52/55/42_avatar_middle.jpg?1582218050","userSmallAvatar":"http://avatar.coolapk.com/data/000/52/55/42_avatar_small.jpg?1582218050","userBigAvatar":"http://avatar.coolapk.com/data/000/52/55/42_avatar_big.jpg?1582218050","cover":"http://avatar.coolapk.com/cover/15/82/21/525542_1582217741.jpg","verify_status":0,"verify_icon":"","verify_label":"","verify_title":""}
         * replyRows : []
         * replyRowsCount : 0
         * replyRowsMore : 0
         * recentLikeList : ["周向虎","弃坑大魔王江雪","矮兵","冷冷的狗粮","离丶人"]
         */

        @com.google.gson.annotations.SerializedName("device_title")
        private String deviceTitle;
        @com.google.gson.annotations.SerializedName("dyh_name")
        private String dyhName;
        @com.google.gson.annotations.SerializedName("extra_info")
        private String extraInfo;
        @com.google.gson.annotations.SerializedName("extra_key")
        private String extraKey;
        @com.google.gson.annotations.SerializedName("extra_pic")
        private String extraPic;
        @com.google.gson.annotations.SerializedName("extra_title")
        private String extraTitle;
        @com.google.gson.annotations.SerializedName("extra_url")
        private String extraUrl;
        @com.google.gson.annotations.SerializedName("forwardid")
        private String forwardid;
        @com.google.gson.annotations.SerializedName("fromname")
        private String fromname;
        @com.google.gson.annotations.SerializedName("istag")
        private String istag;
        @com.google.gson.annotations.SerializedName("label")
        private String label;
        @com.google.gson.annotations.SerializedName("lastupdate")
        private String lastupdate;
        @com.google.gson.annotations.SerializedName("likenum")
        private String likenum;
        @com.google.gson.annotations.SerializedName("location")
        private String location;
        @com.google.gson.annotations.SerializedName("media_pic")
        private String mediaPic;
        @com.google.gson.annotations.SerializedName("media_type")
        private String mediaType;
        @com.google.gson.annotations.SerializedName("media_url")
        private String mediaUrl;
        @com.google.gson.annotations.SerializedName("message")
        private String message;
        @com.google.gson.annotations.SerializedName("message_cover")
        private String messageCover;
        @com.google.gson.annotations.SerializedName("message_keywords")
        private String messageKeywords;
        @com.google.gson.annotations.SerializedName("message_length")
        private String messageLength;
        @com.google.gson.annotations.SerializedName("message_status")
        private String messageStatus;
        @com.google.gson.annotations.SerializedName("message_title")
        private String messageTitle;
        @com.google.gson.annotations.SerializedName("pic")
        private String pic;
        @com.google.gson.annotations.SerializedName("question_answer_num")
        private String questionAnswerNum;
        @com.google.gson.annotations.SerializedName("question_follow_num")
        private String questionFollowNum;
        @com.google.gson.annotations.SerializedName("rank_score")
        private String rankScore;
        @com.google.gson.annotations.SerializedName("recent_hot_reply_ids")
        private String recentHotReplyIds;
        @com.google.gson.annotations.SerializedName("recent_reply_ids")
        private String recentReplyIds;
        @com.google.gson.annotations.SerializedName("recommend")
        private String recommend;
        @com.google.gson.annotations.SerializedName("related_dyh_ids")
        private String relatedDyhIds;
        @com.google.gson.annotations.SerializedName("relatednum")
        private String relatednum;
        @com.google.gson.annotations.SerializedName("replynum")
        private String replynum;
        @com.google.gson.annotations.SerializedName("reportnum")
        private String reportnum;
        @com.google.gson.annotations.SerializedName("source_id")
        private String sourceId;
        @com.google.gson.annotations.SerializedName("status")
        private String status;
        @com.google.gson.annotations.SerializedName("tags")
        private String tags;
        @com.google.gson.annotations.SerializedName("tid")
        private String tid;
        @com.google.gson.annotations.SerializedName("tinfo")
        private String tinfo;
        @com.google.gson.annotations.SerializedName("tpic")
        private String tpic;
        @com.google.gson.annotations.SerializedName("ttitle")
        private String ttitle;
        @com.google.gson.annotations.SerializedName("turl")
        private String turl;
        @com.google.gson.annotations.SerializedName("type")
        private String type;
        @com.google.gson.annotations.SerializedName("uid")
        private String uid;
        @com.google.gson.annotations.SerializedName("user_tags")
        private String userTags;
        @com.google.gson.annotations.SerializedName("username")
        private String username;
        @com.google.gson.annotations.SerializedName("favnum")
        private String favnum;
        @com.google.gson.annotations.SerializedName("issummary")
        private String issummary;
        @com.google.gson.annotations.SerializedName("is_html_article")
        private String isHtmlArticle;
        @com.google.gson.annotations.SerializedName("is_hidden")
        private String isHidden;
        @com.google.gson.annotations.SerializedName("is_anonymous")
        private String isAnonymous;
        @com.google.gson.annotations.SerializedName("id")
        private String id;
        @com.google.gson.annotations.SerializedName("fromid")
        private String fromid;
        @com.google.gson.annotations.SerializedName("forwardnum")
        private String forwardnum;
        @com.google.gson.annotations.SerializedName("fid")
        private String fid;
        @com.google.gson.annotations.SerializedName("extra_type")
        private String extraType;
        @com.google.gson.annotations.SerializedName("extra_status")
        private String extraStatus;
        @com.google.gson.annotations.SerializedName("dyh_id")
        private String dyhId;
        @com.google.gson.annotations.SerializedName("dateline")
        private String dateline;
        @com.google.gson.annotations.SerializedName("comment_block_num")
        private String commentBlockNum;
        @com.google.gson.annotations.SerializedName("block_status")
        private String blockStatus;
        @com.google.gson.annotations.SerializedName("index_name")
        private String indexName;
        @com.google.gson.annotations.SerializedName("_queryTotal")
        private int queryTotal;
        @com.google.gson.annotations.SerializedName("_queryViewTotal")
        private int queryViewTotal;
        @com.google.gson.annotations.SerializedName("_querySearchTime")
        private double querySearchTime;
        @com.google.gson.annotations.SerializedName("fetchType")
        private String fetchType;
        @com.google.gson.annotations.SerializedName("entityId")
        private String entityId;
        @com.google.gson.annotations.SerializedName("avatarFetchType")
        private String avatarFetchType;
        @com.google.gson.annotations.SerializedName("userAvatar")
        private String userAvatar;
        @com.google.gson.annotations.SerializedName("entityTemplate")
        private String entityTemplate;
        @com.google.gson.annotations.SerializedName("entityType")
        private String entityType;
        @com.google.gson.annotations.SerializedName("url")
        private String url;
        @com.google.gson.annotations.SerializedName("feedType")
        private String feedType;
        @com.google.gson.annotations.SerializedName("feedTypeName")
        private String feedTypeName;
        @com.google.gson.annotations.SerializedName("turlTarget")
        private String turlTarget;
        @com.google.gson.annotations.SerializedName("info")
        private String info;
        @com.google.gson.annotations.SerializedName("infoHtml")
        private String infoHtml;
        @com.google.gson.annotations.SerializedName("media_info")
        private String mediaInfo;
        @com.google.gson.annotations.SerializedName("sourceFeed")
        private Object sourceFeed;
        @com.google.gson.annotations.SerializedName("forwardSourceType")
        private String forwardSourceType;
        @com.google.gson.annotations.SerializedName("shareUrl")
        private String shareUrl;
        @com.google.gson.annotations.SerializedName("title")
        private String title;
        @com.google.gson.annotations.SerializedName("extra_fromApi")
        private String extraFromApi;
        @com.google.gson.annotations.SerializedName("userInfo")
        private UserInfoBean userInfo;
        @com.google.gson.annotations.SerializedName("replyRowsCount")
        private int replyRowsCount;
        @com.google.gson.annotations.SerializedName("replyRowsMore")
        private int replyRowsMore;
        @com.google.gson.annotations.SerializedName("picArr")
        private List<String> picArr;
        @com.google.gson.annotations.SerializedName("relateddata")
        private List<?> relateddata;
        @com.google.gson.annotations.SerializedName("replyRows")
        private List<?> replyRows;
        @com.google.gson.annotations.SerializedName("recentLikeList")
        private List<String> recentLikeList;

        public String getDeviceTitle() {
            return deviceTitle;
        }

        public void setDeviceTitle(String deviceTitle) {
            this.deviceTitle = deviceTitle;
        }

        public String getDyhName() {
            return dyhName;
        }

        public void setDyhName(String dyhName) {
            this.dyhName = dyhName;
        }

        public String getExtraInfo() {
            return extraInfo;
        }

        public void setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
        }

        public String getExtraKey() {
            return extraKey;
        }

        public void setExtraKey(String extraKey) {
            this.extraKey = extraKey;
        }

        public String getExtraPic() {
            return extraPic;
        }

        public void setExtraPic(String extraPic) {
            this.extraPic = extraPic;
        }

        public String getExtraTitle() {
            return extraTitle;
        }

        public void setExtraTitle(String extraTitle) {
            this.extraTitle = extraTitle;
        }

        public String getExtraUrl() {
            return extraUrl;
        }

        public void setExtraUrl(String extraUrl) {
            this.extraUrl = extraUrl;
        }

        public String getForwardid() {
            return forwardid;
        }

        public void setForwardid(String forwardid) {
            this.forwardid = forwardid;
        }

        public String getFromname() {
            return fromname;
        }

        public void setFromname(String fromname) {
            this.fromname = fromname;
        }

        public String getIstag() {
            return istag;
        }

        public void setIstag(String istag) {
            this.istag = istag;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getLastupdate() {
            return lastupdate;
        }

        public void setLastupdate(String lastupdate) {
            this.lastupdate = lastupdate;
        }

        public String getLikenum() {
            return likenum;
        }

        public void setLikenum(String likenum) {
            this.likenum = likenum;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getMediaPic() {
            return mediaPic;
        }

        public void setMediaPic(String mediaPic) {
            this.mediaPic = mediaPic;
        }

        public String getMediaType() {
            return mediaType;
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public String getMediaUrl() {
            return mediaUrl;
        }

        public void setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getMessageCover() {
            return messageCover;
        }

        public void setMessageCover(String messageCover) {
            this.messageCover = messageCover;
        }

        public String getMessageKeywords() {
            return messageKeywords;
        }

        public void setMessageKeywords(String messageKeywords) {
            this.messageKeywords = messageKeywords;
        }

        public String getMessageLength() {
            return messageLength;
        }

        public void setMessageLength(String messageLength) {
            this.messageLength = messageLength;
        }

        public String getMessageStatus() {
            return messageStatus;
        }

        public void setMessageStatus(String messageStatus) {
            this.messageStatus = messageStatus;
        }

        public String getMessageTitle() {
            return messageTitle;
        }

        public void setMessageTitle(String messageTitle) {
            this.messageTitle = messageTitle;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getQuestionAnswerNum() {
            return questionAnswerNum;
        }

        public void setQuestionAnswerNum(String questionAnswerNum) {
            this.questionAnswerNum = questionAnswerNum;
        }

        public String getQuestionFollowNum() {
            return questionFollowNum;
        }

        public void setQuestionFollowNum(String questionFollowNum) {
            this.questionFollowNum = questionFollowNum;
        }

        public String getRankScore() {
            return rankScore;
        }

        public void setRankScore(String rankScore) {
            this.rankScore = rankScore;
        }

        public String getRecentHotReplyIds() {
            return recentHotReplyIds;
        }

        public void setRecentHotReplyIds(String recentHotReplyIds) {
            this.recentHotReplyIds = recentHotReplyIds;
        }

        public String getRecentReplyIds() {
            return recentReplyIds;
        }

        public void setRecentReplyIds(String recentReplyIds) {
            this.recentReplyIds = recentReplyIds;
        }

        public String getRecommend() {
            return recommend;
        }

        public void setRecommend(String recommend) {
            this.recommend = recommend;
        }

        public String getRelatedDyhIds() {
            return relatedDyhIds;
        }

        public void setRelatedDyhIds(String relatedDyhIds) {
            this.relatedDyhIds = relatedDyhIds;
        }

        public String getRelatednum() {
            return relatednum;
        }

        public void setRelatednum(String relatednum) {
            this.relatednum = relatednum;
        }

        public String getReplynum() {
            return replynum;
        }

        public void setReplynum(String replynum) {
            this.replynum = replynum;
        }

        public String getReportnum() {
            return reportnum;
        }

        public void setReportnum(String reportnum) {
            this.reportnum = reportnum;
        }

        public String getSourceId() {
            return sourceId;
        }

        public void setSourceId(String sourceId) {
            this.sourceId = sourceId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getTid() {
            return tid;
        }

        public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTinfo() {
            return tinfo;
        }

        public void setTinfo(String tinfo) {
            this.tinfo = tinfo;
        }

        public String getTpic() {
            return tpic;
        }

        public void setTpic(String tpic) {
            this.tpic = tpic;
        }

        public String getTtitle() {
            return ttitle;
        }

        public void setTtitle(String ttitle) {
            this.ttitle = ttitle;
        }

        public String getTurl() {
            return turl;
        }

        public void setTurl(String turl) {
            this.turl = turl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUserTags() {
            return userTags;
        }

        public void setUserTags(String userTags) {
            this.userTags = userTags;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getFavnum() {
            return favnum;
        }

        public void setFavnum(String favnum) {
            this.favnum = favnum;
        }

        public String getIssummary() {
            return issummary;
        }

        public void setIssummary(String issummary) {
            this.issummary = issummary;
        }

        public String getIsHtmlArticle() {
            return isHtmlArticle;
        }

        public void setIsHtmlArticle(String isHtmlArticle) {
            this.isHtmlArticle = isHtmlArticle;
        }

        public String getIsHidden() {
            return isHidden;
        }

        public void setIsHidden(String isHidden) {
            this.isHidden = isHidden;
        }

        public String getIsAnonymous() {
            return isAnonymous;
        }

        public void setIsAnonymous(String isAnonymous) {
            this.isAnonymous = isAnonymous;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFromid() {
            return fromid;
        }

        public void setFromid(String fromid) {
            this.fromid = fromid;
        }

        public String getForwardnum() {
            return forwardnum;
        }

        public void setForwardnum(String forwardnum) {
            this.forwardnum = forwardnum;
        }

        public String getFid() {
            return fid;
        }

        public void setFid(String fid) {
            this.fid = fid;
        }

        public String getExtraType() {
            return extraType;
        }

        public void setExtraType(String extraType) {
            this.extraType = extraType;
        }

        public String getExtraStatus() {
            return extraStatus;
        }

        public void setExtraStatus(String extraStatus) {
            this.extraStatus = extraStatus;
        }

        public String getDyhId() {
            return dyhId;
        }

        public void setDyhId(String dyhId) {
            this.dyhId = dyhId;
        }

        public String getDateline() {
            return dateline;
        }

        public void setDateline(String dateline) {
            this.dateline = dateline;
        }

        public String getCommentBlockNum() {
            return commentBlockNum;
        }

        public void setCommentBlockNum(String commentBlockNum) {
            this.commentBlockNum = commentBlockNum;
        }

        public String getBlockStatus() {
            return blockStatus;
        }

        public void setBlockStatus(String blockStatus) {
            this.blockStatus = blockStatus;
        }

        public String getIndexName() {
            return indexName;
        }

        public void setIndexName(String indexName) {
            this.indexName = indexName;
        }

        public int getQueryTotal() {
            return queryTotal;
        }

        public void setQueryTotal(int queryTotal) {
            this.queryTotal = queryTotal;
        }

        public int getQueryViewTotal() {
            return queryViewTotal;
        }

        public void setQueryViewTotal(int queryViewTotal) {
            this.queryViewTotal = queryViewTotal;
        }

        public double getQuerySearchTime() {
            return querySearchTime;
        }

        public void setQuerySearchTime(double querySearchTime) {
            this.querySearchTime = querySearchTime;
        }

        public String getFetchType() {
            return fetchType;
        }

        public void setFetchType(String fetchType) {
            this.fetchType = fetchType;
        }

        public String getEntityId() {
            return entityId;
        }

        public void setEntityId(String entityId) {
            this.entityId = entityId;
        }

        public String getAvatarFetchType() {
            return avatarFetchType;
        }

        public void setAvatarFetchType(String avatarFetchType) {
            this.avatarFetchType = avatarFetchType;
        }

        public String getUserAvatar() {
            return userAvatar;
        }

        public void setUserAvatar(String userAvatar) {
            this.userAvatar = userAvatar;
        }

        public String getEntityTemplate() {
            return entityTemplate;
        }

        public void setEntityTemplate(String entityTemplate) {
            this.entityTemplate = entityTemplate;
        }

        public String getEntityType() {
            return entityType;
        }

        public void setEntityType(String entityType) {
            this.entityType = entityType;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getFeedType() {
            return feedType;
        }

        public void setFeedType(String feedType) {
            this.feedType = feedType;
        }

        public String getFeedTypeName() {
            return feedTypeName;
        }

        public void setFeedTypeName(String feedTypeName) {
            this.feedTypeName = feedTypeName;
        }

        public String getTurlTarget() {
            return turlTarget;
        }

        public void setTurlTarget(String turlTarget) {
            this.turlTarget = turlTarget;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getInfoHtml() {
            return infoHtml;
        }

        public void setInfoHtml(String infoHtml) {
            this.infoHtml = infoHtml;
        }

        public String getMediaInfo() {
            return mediaInfo;
        }

        public void setMediaInfo(String mediaInfo) {
            this.mediaInfo = mediaInfo;
        }

        public Object getSourceFeed() {
            return sourceFeed;
        }

        public void setSourceFeed(Object sourceFeed) {
            this.sourceFeed = sourceFeed;
        }

        public String getForwardSourceType() {
            return forwardSourceType;
        }

        public void setForwardSourceType(String forwardSourceType) {
            this.forwardSourceType = forwardSourceType;
        }

        public String getShareUrl() {
            return shareUrl;
        }

        public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getExtraFromApi() {
            return extraFromApi;
        }

        public void setExtraFromApi(String extraFromApi) {
            this.extraFromApi = extraFromApi;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public int getReplyRowsCount() {
            return replyRowsCount;
        }

        public void setReplyRowsCount(int replyRowsCount) {
            this.replyRowsCount = replyRowsCount;
        }

        public int getReplyRowsMore() {
            return replyRowsMore;
        }

        public void setReplyRowsMore(int replyRowsMore) {
            this.replyRowsMore = replyRowsMore;
        }

        public List<String> getPicArr() {
            return picArr;
        }

        public void setPicArr(List<String> picArr) {
            this.picArr = picArr;
        }

        public List<?> getRelateddata() {
            return relateddata;
        }

        public void setRelateddata(List<?> relateddata) {
            this.relateddata = relateddata;
        }

        public List<?> getReplyRows() {
            return replyRows;
        }

        public void setReplyRows(List<?> replyRows) {
            this.replyRows = replyRows;
        }

        public List<String> getRecentLikeList() {
            return recentLikeList;
        }

        public void setRecentLikeList(List<String> recentLikeList) {
            this.recentLikeList = recentLikeList;
        }

        public static class UserInfoBean {
            /**
             * uid : 525542
             * username : Deepjob汉界
             * admintype : 0
             * groupid : 0
             * usergroupid : 105
             * level : 5
             * status : 1
             * usernamestatus : 0
             * avatarstatus : 1582218050
             * avatar_cover_status : 1582217741
             * regdate : 1454551626
             * logintime : 1583987570
             * fetchType : base
             * entityType : user
             * entityId : 525542
             * displayUsername : Deepjob汉界
             * url : /u/525542
             * userAvatar : http://avatar.coolapk.com/data/000/52/55/42_avatar_middle.jpg?1582218050
             * userSmallAvatar : http://avatar.coolapk.com/data/000/52/55/42_avatar_small.jpg?1582218050
             * userBigAvatar : http://avatar.coolapk.com/data/000/52/55/42_avatar_big.jpg?1582218050
             * cover : http://avatar.coolapk.com/cover/15/82/21/525542_1582217741.jpg
             * verify_status : 0
             * verify_icon :
             * verify_label :
             * verify_title :
             */

            @com.google.gson.annotations.SerializedName("uid")
            private int uid;
            @com.google.gson.annotations.SerializedName("username")
            private String username;
            @com.google.gson.annotations.SerializedName("admintype")
            private int admintype;
            @com.google.gson.annotations.SerializedName("groupid")
            private int groupid;
            @com.google.gson.annotations.SerializedName("usergroupid")
            private int usergroupid;
            @com.google.gson.annotations.SerializedName("level")
            private int level;
            @com.google.gson.annotations.SerializedName("status")
            private int status;
            @com.google.gson.annotations.SerializedName("usernamestatus")
            private int usernamestatus;
            @com.google.gson.annotations.SerializedName("avatarstatus")
            private int avatarstatus;
            @com.google.gson.annotations.SerializedName("avatar_cover_status")
            private int avatarCoverStatus;
            @com.google.gson.annotations.SerializedName("regdate")
            private int regdate;
            @com.google.gson.annotations.SerializedName("logintime")
            private int logintime;
            @com.google.gson.annotations.SerializedName("fetchType")
            private String fetchType;
            @com.google.gson.annotations.SerializedName("entityType")
            private String entityType;
            @com.google.gson.annotations.SerializedName("entityId")
            private int entityId;
            @com.google.gson.annotations.SerializedName("displayUsername")
            private String displayUsername;
            @com.google.gson.annotations.SerializedName("url")
            private String url;
            @com.google.gson.annotations.SerializedName("userAvatar")
            private String userAvatar;
            @com.google.gson.annotations.SerializedName("userSmallAvatar")
            private String userSmallAvatar;
            @com.google.gson.annotations.SerializedName("userBigAvatar")
            private String userBigAvatar;
            @com.google.gson.annotations.SerializedName("cover")
            private String cover;
            @com.google.gson.annotations.SerializedName("verify_status")
            private int verifyStatus;
            @com.google.gson.annotations.SerializedName("verify_icon")
            private String verifyIcon;
            @com.google.gson.annotations.SerializedName("verify_label")
            private String verifyLabel;
            @com.google.gson.annotations.SerializedName("verify_title")
            private String verifyTitle;

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public int getAdmintype() {
                return admintype;
            }

            public void setAdmintype(int admintype) {
                this.admintype = admintype;
            }

            public int getGroupid() {
                return groupid;
            }

            public void setGroupid(int groupid) {
                this.groupid = groupid;
            }

            public int getUsergroupid() {
                return usergroupid;
            }

            public void setUsergroupid(int usergroupid) {
                this.usergroupid = usergroupid;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getUsernamestatus() {
                return usernamestatus;
            }

            public void setUsernamestatus(int usernamestatus) {
                this.usernamestatus = usernamestatus;
            }

            public int getAvatarstatus() {
                return avatarstatus;
            }

            public void setAvatarstatus(int avatarstatus) {
                this.avatarstatus = avatarstatus;
            }

            public int getAvatarCoverStatus() {
                return avatarCoverStatus;
            }

            public void setAvatarCoverStatus(int avatarCoverStatus) {
                this.avatarCoverStatus = avatarCoverStatus;
            }

            public int getRegdate() {
                return regdate;
            }

            public void setRegdate(int regdate) {
                this.regdate = regdate;
            }

            public int getLogintime() {
                return logintime;
            }

            public void setLogintime(int logintime) {
                this.logintime = logintime;
            }

            public String getFetchType() {
                return fetchType;
            }

            public void setFetchType(String fetchType) {
                this.fetchType = fetchType;
            }

            public String getEntityType() {
                return entityType;
            }

            public void setEntityType(String entityType) {
                this.entityType = entityType;
            }

            public int getEntityId() {
                return entityId;
            }

            public void setEntityId(int entityId) {
                this.entityId = entityId;
            }

            public String getDisplayUsername() {
                return displayUsername;
            }

            public void setDisplayUsername(String displayUsername) {
                this.displayUsername = displayUsername;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUserAvatar() {
                return userAvatar;
            }

            public void setUserAvatar(String userAvatar) {
                this.userAvatar = userAvatar;
            }

            public String getUserSmallAvatar() {
                return userSmallAvatar;
            }

            public void setUserSmallAvatar(String userSmallAvatar) {
                this.userSmallAvatar = userSmallAvatar;
            }

            public String getUserBigAvatar() {
                return userBigAvatar;
            }

            public void setUserBigAvatar(String userBigAvatar) {
                this.userBigAvatar = userBigAvatar;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getVerifyStatus() {
                return verifyStatus;
            }

            public void setVerifyStatus(int verifyStatus) {
                this.verifyStatus = verifyStatus;
            }

            public String getVerifyIcon() {
                return verifyIcon;
            }

            public void setVerifyIcon(String verifyIcon) {
                this.verifyIcon = verifyIcon;
            }

            public String getVerifyLabel() {
                return verifyLabel;
            }

            public void setVerifyLabel(String verifyLabel) {
                this.verifyLabel = verifyLabel;
            }

            public String getVerifyTitle() {
                return verifyTitle;
            }

            public void setVerifyTitle(String verifyTitle) {
                this.verifyTitle = verifyTitle;
            }
        }
    }
}
