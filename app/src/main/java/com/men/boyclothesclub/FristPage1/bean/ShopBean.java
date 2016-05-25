package com.men.boyclothesclub.FristPage1.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public class ShopBean {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * theme_id : 187
     * type : 6
     * theme_name : 潮品专区-特色
     * theme_image : http://im01.nanyibang.com/icons/2016/02/26/chaopin_tese.png
     * theme_desc :
     * theme_link : nanyibang://page/FashionItem
     * allow_share : 0
     */

    private List<DataBean> data;

    public static ShopBean objectFromData(String str) {

        return new Gson().fromJson(str, ShopBean.class);
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
        private int theme_id;
        private String type;
        private String theme_name;
        private String theme_image;
        private String theme_desc;
        private String theme_link;
        private int allow_share;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getTheme_id() {
            return theme_id;
        }

        public void setTheme_id(int theme_id) {
            this.theme_id = theme_id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTheme_name() {
            return theme_name;
        }

        public void setTheme_name(String theme_name) {
            this.theme_name = theme_name;
        }

        public String getTheme_image() {
            return theme_image;
        }

        public void setTheme_image(String theme_image) {
            this.theme_image = theme_image;
        }

        public String getTheme_desc() {
            return theme_desc;
        }

        public void setTheme_desc(String theme_desc) {
            this.theme_desc = theme_desc;
        }

        public String getTheme_link() {
            return theme_link;
        }

        public void setTheme_link(String theme_link) {
            this.theme_link = theme_link;
        }

        public int getAllow_share() {
            return allow_share;
        }

        public void setAllow_share(int allow_share) {
            this.allow_share = allow_share;
        }
    }
}
