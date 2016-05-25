package com.men.boyclothesclub.FristPage1.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public class OtherBean {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    private DataBean data;

    public static OtherBean objectFromData(String str) {

        return new Gson().fromJson(str, OtherBean.class);
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
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
        /**
         * theme_id : 17
         * theme_desc : 男人就是要干净利落的酷
         * collocation_id : 5079
         * big_image : http://im01.nanyibang.com/match/2016/05/25/1464143600_58723.jpg
         * width : 678
         * height : 1017
         * info : 夏季简约风穿搭
         * tags : [{"tagId":19,"tagName":"百搭"},{"tagId":29,"tagName":"约会"},{"tagId":2,"tagName":"休闲"},{"tagId":4,"tagName":"简约"}]
         * singleItems : [{"item_id":363744,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1tKjLJVXXXXcLXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","coupon_price":"109.00"},{"item_id":358467,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1S7fjJVXXXXcAXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","coupon_price":"159.00"},{"item_id":363203,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1WvbjLVXXXXbFXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","coupon_price":"269.00"}]
         */

        private List<MatchBean> match;
        /**
         * dress_school_id : 411
         * title : 想搞定妹子？这些方法真的有用！
         * info : 想搞定妹子？这些方法真的有用！
         * image : http://im01.nanyibang.com/school/2016/05/24/SCHOOL81802296.jpg
         * clickCount : 684
         * link : http://www.nanyibang.com/utils/webpage_jump.php?module_type=school&school_id=411
         */

        private List<SchoolBean> school;
        /**
         * brandId : 8625
         * brandIcon : http://im01.nanyibang.com/brand/2016/05/17/ror.jpg
         * brandName : ROR
         */

        private List<BrandBean> brand;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public List<MatchBean> getMatch() {
            return match;
        }

        public void setMatch(List<MatchBean> match) {
            this.match = match;
        }

        public List<SchoolBean> getSchool() {
            return school;
        }

        public void setSchool(List<SchoolBean> school) {
            this.school = school;
        }

        public List<BrandBean> getBrand() {
            return brand;
        }

        public void setBrand(List<BrandBean> brand) {
            this.brand = brand;
        }

        public static class MatchBean {
            private int theme_id;
            private String theme_desc;
            private int collocation_id;
            private String big_image;
            private int width;
            private int height;
            private String info;
            /**
             * tagId : 19
             * tagName : 百搭
             */

            private List<TagsBean> tags;
            /**
             * item_id : 363744
             * pic_url : http://img04.taobaocdn.com/bao/uploaded/i4/TB1tKjLJVXXXXcLXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg
             * coupon_price : 109.00
             */

            private List<SingleItemsBean> singleItems;

            public static MatchBean objectFromData(String str) {

                return new Gson().fromJson(str, MatchBean.class);
            }

            public int getTheme_id() {
                return theme_id;
            }

            public void setTheme_id(int theme_id) {
                this.theme_id = theme_id;
            }

            public String getTheme_desc() {
                return theme_desc;
            }

            public void setTheme_desc(String theme_desc) {
                this.theme_desc = theme_desc;
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

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public List<SingleItemsBean> getSingleItems() {
                return singleItems;
            }

            public void setSingleItems(List<SingleItemsBean> singleItems) {
                this.singleItems = singleItems;
            }

            public static class TagsBean {
                private int tagId;
                private String tagName;

                public static TagsBean objectFromData(String str) {

                    return new Gson().fromJson(str, TagsBean.class);
                }

                public int getTagId() {
                    return tagId;
                }

                public void setTagId(int tagId) {
                    this.tagId = tagId;
                }

                public String getTagName() {
                    return tagName;
                }

                public void setTagName(String tagName) {
                    this.tagName = tagName;
                }
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

        public static class SchoolBean {
            private int dress_school_id;
            private String title;
            private String info;
            private String image;
            private int clickCount;
            private String link;

            public static SchoolBean objectFromData(String str) {

                return new Gson().fromJson(str, SchoolBean.class);
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

        public static class BrandBean {
            private int brandId;
            private String brandIcon;
            private String brandName;

            public static BrandBean objectFromData(String str) {

                return new Gson().fromJson(str, BrandBean.class);
            }

            public int getBrandId() {
                return brandId;
            }

            public void setBrandId(int brandId) {
                this.brandId = brandId;
            }

            public String getBrandIcon() {
                return brandIcon;
            }

            public void setBrandIcon(String brandIcon) {
                this.brandIcon = brandIcon;
            }

            public String getBrandName() {
                return brandName;
            }

            public void setBrandName(String brandName) {
                this.brandName = brandName;
            }
        }
    }
}
