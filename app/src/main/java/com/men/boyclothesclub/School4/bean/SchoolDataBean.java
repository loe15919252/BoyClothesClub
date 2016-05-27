package com.men.boyclothesclub.School4.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by TRDA on 2016/5/27.
 */
public class SchoolDataBean {


    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * dress_school_id : 409
     * title : 这个夏天还有什么能比人字拖更让我随心所欲
     * info : 这个夏天还有什么能比人字拖更让我随心所欲
     * image : http://im01.nanyibang.com/school/2016/05/24/SCHOOL7573966.jpg
     * clickCount : 870
     * link : http://www.nanyibang.com/utils/webpage_jump.php?module_type=school&school_id=409
     */

    private List<DataBean> data;

    public static SchoolDataBean objectFromData(String str) {

        return new Gson().fromJson(str, SchoolDataBean.class);
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class UserBean {
        private String member_type;
        private String login_status;
        private String login_status_msg;

        public static UserBean objectFromData(String str) {

            return new Gson().fromJson(str, UserBean.class);
        }

        public String getMember_type() {
            return member_type;
        }

        public void setMember_type(String member_type) {
            this.member_type = member_type;
        }

        public String getLogin_status() {
            return login_status;
        }

        public void setLogin_status(String login_status) {
            this.login_status = login_status;
        }

        public String getLogin_status_msg() {
            return login_status_msg;
        }

        public void setLogin_status_msg(String login_status_msg) {
            this.login_status_msg = login_status_msg;
        }
    }

    public static class DataBean {
        private int dress_school_id;
        private String title;
        private String info;
        private String image;
        private int clickCount;
        private String link;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getDress_school_id() {
            return dress_school_id;
        }

        public void setDress_school_id(int dress_school_id) {
            this.dress_school_id = dress_school_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getClickCount() {
            return clickCount;
        }

        public void setClickCount(int clickCount) {
            this.clickCount = clickCount;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }
    }
}
