package com.men.boyclothesclub.Group3.bin;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public class Group_Header_bin {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * kind : 1
     * name : 风格
     * items : [{"classify_id":1,"classify_name":"休闲","classify_icon":"http://im01.nanyibang.com/icons/2016/03/07/xiuxian_match.png"},{"classify_id":2,"classify_name":"商务","classify_icon":"http://im01.nanyibang.com/icons/2016/03/07/shangwu_match.png"},{"classify_id":3,"classify_name":"运动","classify_icon":"http://im01.nanyibang.com/icons/2016/03/07/yundong_match.png"},{"classify_id":4,"classify_name":"简约","classify_icon":"http://im01.nanyibang.com/icons/2016/03/07/jianyue_match.png"},{"classify_id":5,"classify_name":"复古","classify_icon":"http://im01.nanyibang.com/icons/2016/03/07/fugu_match.png"},{"classify_id":6,"classify_name":"英伦","classify_icon":"http://im01.nanyibang.com/icons/2016/03/07/yinglun_match.png"},{"classify_id":7,"classify_name":"日韩","classify_icon":"http://im01.nanyibang.com/cateimg/2016/03/10/rihan.png"},{"classify_id":8,"classify_name":"欧美","classify_icon":"http://im01.nanyibang.com/icons/2016/03/07/oumei_match.png"}]
     */

    private List<DataBean> data;

    public static Group_Header_bin objectFromData(String str) {

        return new Gson().fromJson(str, Group_Header_bin.class);
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
        private int kind;
        private String name;
        /**
         * classify_id : 1
         * classify_name : 休闲
         * classify_icon : http://im01.nanyibang.com/icons/2016/03/07/xiuxian_match.png
         */

        private List<ItemsBean> items;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getKind() {
            return kind;
        }

        public void setKind(int kind) {
            this.kind = kind;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            private int classify_id;
            private String classify_name;
            private String classify_icon;

            public static ItemsBean objectFromData(String str) {

                return new Gson().fromJson(str, ItemsBean.class);
            }

            public int getClassify_id() {
                return classify_id;
            }

            public void setClassify_id(int classify_id) {
                this.classify_id = classify_id;
            }

            public String getClassify_name() {
                return classify_name;
            }

            public void setClassify_name(String classify_name) {
                this.classify_name = classify_name;
            }

            public String getClassify_icon() {
                return classify_icon;
            }

            public void setClassify_icon(String classify_icon) {
                this.classify_icon = classify_icon;
            }
        }
    }
}
