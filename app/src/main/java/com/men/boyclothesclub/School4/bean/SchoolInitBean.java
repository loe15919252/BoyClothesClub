package com.men.boyclothesclub.School4.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by TRDA on 2016/5/27.
 */
public class SchoolInitBean  {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * kind_id : 6
     * title : 最热
     */

    private List<DataBean> data;

    public static SchoolInitBean objectFromData(String str) {

        return new Gson().fromJson(str, SchoolInitBean.class);
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
        private int kind_id;
        private String title;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getKind_id() {
            return kind_id;
        }

        public void setKind_id(int kind_id) {
            this.kind_id = kind_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
