package com.men.boyclothesclub.FristPage1.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/27.
 */
public class MatchBean {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * collocation_id : 5149
     * saveCount : 187
     * big_image : http://im02.nanyibang.com/match/2016/05/26/1464229476_56315.jpg?_upt=1f4cd91b1464316558
     * width : 752
     * height : 1111
     * info : 简约欧美街头范
     * singleItems : [{"item_id":364282,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1lQZuJFXXXXXLaXXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg","coupon_price":"98.90"},{"item_id":364290,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1NFaFJVXXXXcOXpXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg","coupon_price":"148.90"},{"item_id":364291,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1z6sXMXXXXXX8XpXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg","coupon_price":"118.00"}]
     */

    private List<DataBean> data;

    public static MatchBean objectFromData(String str) {

        return new Gson().fromJson(str, MatchBean.class);
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
        private int saveCount;
        private String big_image;
        private int width;
        private int height;
        private String info;
        /**
         * item_id : 364282
         * pic_url : http://img02.taobaocdn.com/bao/uploaded/i2/TB1lQZuJFXXXXXLaXXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg
         * coupon_price : 98.90
         */

        private List<SingleItemsBean> singleItems;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getCollocation_id() {
            return collocation_id;
        }

        public void setCollocation_id(int collocation_id) {
            this.collocation_id = collocation_id;
        }

        public int getSaveCount() {
            return saveCount;
        }

        public void setSaveCount(int saveCount) {
            this.saveCount = saveCount;
        }

        public String getBig_image() {
            return big_image;
        }

         public void setBig_image(String big_image) {
            this.big_image = big_image;
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

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public List<SingleItemsBean> getSingleItems() {
            return singleItems;
        }

        public void setSingleItems(List<SingleItemsBean> singleItems) {
            this.singleItems = singleItems;
        }

        public static class SingleItemsBean {
            private int item_id;
            private String pic_url;
            private String coupon_price;

            public static SingleItemsBean objectFromData(String str) {

                return new Gson().fromJson(str, SingleItemsBean.class);
            }

            public int getItem_id() {
                return item_id;
            }

            public void setItem_id(int item_id) {
                this.item_id = item_id;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getCoupon_price() {
                return coupon_price;
            }

            public void setCoupon_price(String coupon_price) {
                this.coupon_price = coupon_price;
            }
        }
    }
}
