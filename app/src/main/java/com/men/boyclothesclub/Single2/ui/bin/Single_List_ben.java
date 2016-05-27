package com.men.boyclothesclub.Single2.ui.bin;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/27.
 */
public class Single_List_ben {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * item_id : 364571
     * _id : 364571
     * pic_url : http://img04.taobaocdn.com/bao/uploaded/i4/TB17nnjJFXXXXaeXFXXXXXXXXXX_!!0-item_pic.jpg
     * title : MWAMI莫畏2016夏季男士纯棉条纹短袖T恤时尚修身圆领海魂衫t恤
     * coupon_price : 139.00
     * num_iid : 529103219264
     * open_iid : AAFa_kWCABuH20zjANq35oll
     * productType : 1
     * isv_code : 0_2_tuiBig_24
     */

    private List<DataBean> data;

    public static Single_List_ben objectFromData(String str) {

        return new Gson().fromJson(str, Single_List_ben.class);
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
        private int item_id;
        private int _id;
        private String pic_url;
        private String title;
        private String coupon_price;
        private String num_iid;
        private String open_iid;
        private int productType;
        private String isv_code;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getItem_id() {
            return item_id;
        }

        public void setItem_id(int item_id) {
            this.item_id = item_id;
        }

        public int get_id() {
            return _id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCoupon_price() {
            return coupon_price;
        }

        public void setCoupon_price(String coupon_price) {
            this.coupon_price = coupon_price;
        }

        public String getNum_iid() {
            return num_iid;
        }

        public void setNum_iid(String num_iid) {
            this.num_iid = num_iid;
        }

        public String getOpen_iid() {
            return open_iid;
        }

        public void setOpen_iid(String open_iid) {
            this.open_iid = open_iid;
        }

        public int getProductType() {
            return productType;
        }

        public void setProductType(int productType) {
            this.productType = productType;
        }

        public String getIsv_code() {
            return isv_code;
        }

        public void setIsv_code(String isv_code) {
            this.isv_code = isv_code;
        }
    }
}
