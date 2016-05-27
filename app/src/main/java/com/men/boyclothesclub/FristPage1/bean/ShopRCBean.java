package com.men.boyclothesclub.FristPage1.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/27.
 */
public class ShopRCBean {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * kind_id : 1
     * kind_icon : http://im01.nanyibang.com/icons/daily_ToothpasteToothbrush.png
     * kind_name : 牙膏&牙刷
     */

    private List<DataBean> data;

    public static ShopRCBean objectFromData(String str) {

        return new Gson().fromJson(str, ShopRCBean.class);
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
        private String kind_icon;
        private String kind_name;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getKind_id() {
            return kind_id;
        }

        public void setKind_id(int kind_id) {
            this.kind_id = kind_id;
        }

        public String getKind_icon() {
            return kind_icon;
        }

        public void setKind_icon(String kind_icon) {
            this.kind_icon = kind_icon;
        }

        public String getKind_name() {
            return kind_name;
        }

        public void setKind_name(String kind_name) {
            this.kind_name = kind_name;
        }
    }
}
