package com.men.boyclothesclub.Group3.bin;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/24.
 */
public class Group_bin {
    // TODO: 2016/5/24   搭配瀑布流中的数据bin

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * collocation_id : 5049
     * big_image : http://im01.nanyibang.com/match/2016/05/24/1464059474_19113.jpg
     * info : 夏季简约风穿搭
     * collocation_type : 短袖T恤+休闲裤+休闲鞋
     * width : 581
     * height : 976
     */

    private List<DataBean> data;

    public static Group_bin objectFromData(String str) {

        return new Gson().fromJson(str, Group_bin.class);
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
        private int collocation_id;
        private String big_image;
        private String info;
        private String collocation_type;
        private int width;
        private int height;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getCollocation_id() {
            return collocation_id;
        }

        public void setCollocation_id(int collocation_id) {
            this.collocation_id = collocation_id;
        }

        public String getBig_image() {
            return big_image;
        }

        public void setBig_image(String big_image) {
            this.big_image = big_image;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getCollocation_type() {
            return collocation_type;
        }

        public void setCollocation_type(String collocation_type) {
            this.collocation_type = collocation_type;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }
}
