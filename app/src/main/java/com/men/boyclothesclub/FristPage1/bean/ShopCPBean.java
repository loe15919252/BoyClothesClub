package com.men.boyclothesclub.FristPage1.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/27.
 */
public class ShopCPBean {
    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * campaignKind : {"campain_name":"潮品","campain_icon":"","campain_icon2":"","campain_color":"","show_price":false}
     * itemDetail : [{"_id":364559,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1NoqrMpXXXXbFaXXXXXXXXXXX_!!2-item_pic.png","title":"香港代购 夏款余文乐彭于晏MDNS同款男女问号短袖海魂条纹t恤潮牌","coupon_price":"213.00","price":"710.00","saveCount":154,"isv_code":"0_2_chaopin_24","icon_type":1,"description":"海魂条纹短袖t恤"},{"_id":364558,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1tCJwLFXXXXXVXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016夏潮流时尚男士短袖T恤青少年圆领学生迷彩色迷彩服印花潮牌","coupon_price":"108.00","price":"258.00","saveCount":93,"isv_code":"0_2_chaopin_24","icon_type":1,"description":"迷彩印花潮流T恤"},{"_id":364555,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1V86oMXXXXXcEXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016夏天新款纯棉上衣男T宽松短袖t恤日系004潮牌个性五分袖潮TEE","coupon_price":"119.00","price":"129.00","saveCount":189,"isv_code":"0_2_chaopin_24","icon_type":1,"description":"日系潮牌个性五分袖T恤"},{"_id":364554,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1b46lLVXXXXXlaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"ELGINBOY男士破洞牛仔裤个性复古做旧涂层潮牌乞丐修身小脚裤男","coupon_price":"148.00","price":"199.00","saveCount":107,"isv_code":"0_2_chaopin_24","icon_type":1,"description":"个性复古做旧潮牌乞丐裤"},{"_id":364549,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1fmvgHFXXXXbOXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季透气布鞋板鞋一脚蹬懒人鞋无鞋带拼色帆布鞋男耐磨个性潮人款","coupon_price":"59.00","price":"198.00","saveCount":101,"isv_code":"0_2_chaopin_24","icon_type":1,"description":"夏季一脚蹬拼色帆布鞋"},{"_id":364539,"pic_url":"http://img.taobaocdn.com/bao/uploaded/i7/TB1J4A3LFXXXXXSXFXXYXGcGpXX_M2.SS2","title":"BM－Star大码潮牌男装 夏季时尚个性短袖男T恤大号胖子上衣服男潮","coupon_price":"69.00","price":"199.00","saveCount":89,"isv_code":"0_2_chaopin_24","icon_type":1,"description":"潮牌个性短袖体恤"},{"_id":364536,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/12558847/TB2ZHXykXXXXXawXFXXXXXXXXXX_!!12558847.jpg_450x10000q75.jpg","title":"春夏新款日系雪花水洗小脚哈伦裤潮男士拼皮个性萝卜牛仔七分裤","coupon_price":"168.00","price":"168.00","saveCount":101,"isv_code":"0_2_chaopin_24","icon_type":1,"description":"男士拼皮个性七分裤"},{"_id":364513,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1g2gWFFXXXXbZXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"JINIWU2015强悍登场高帮镂空简约牛皮手工爆欧美街头罗马鱼嘴凉靴","coupon_price":"379.00","price":"379.00","saveCount":116,"isv_code":"0_2_chaopin_24","icon_type":1,"description":"欧美街头罗马鱼嘴凉靴"},{"_id":364332,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1sNL5IpXXXXbbXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"欧洲站兄弟装t恤英国潮牌颓废暗黑元素骷髅街头涂鸦短袖t恤潮男装","coupon_price":"68.00","price":"199.00","saveCount":55,"isv_code":"0_2_chaopin_24","icon_type":2,"description":"街头涂鸦短袖t恤"},{"_id":364331,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB15E0XKXXXXXcmXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"sakun韩国潮牌 男款彩色短袖T恤 炫酷涂鸦","coupon_price":"309.00","price":"558.00","saveCount":146,"isv_code":"0_2_chaopin_24","icon_type":2,"description":"炫酷涂鸦彩色短袖T恤"},{"_id":364327,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1VGRKLFXXXXXfXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"原单潮男短袖圆领2016春夏季满版不规则图案印花青少年T恤日系风","coupon_price":"98.00","price":"258.00","saveCount":183,"isv_code":"0_2_chaopin_24","icon_type":2,"description":"不规则图案印花T恤"},{"_id":364321,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1Nh1LMXXXXXasXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季日系补丁拼接纯棉休闲裤男复古潮流个性九分裤修身小脚哈伦裤","coupon_price":"118.00","price":"238.00","saveCount":142,"isv_code":"0_2_chaopin_24","icon_type":2,"description":"夏季日系拼接休闲裤"},{"_id":364320,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1nudnFVXXXXbTXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"甲壳虫麻底鞋夏季拼色浅口低帮潮流帆布鞋男懒人透气平底渔夫鞋子","coupon_price":"89.00","price":"278.00","saveCount":111,"isv_code":"0_2_chaopin_24","icon_type":2,"description":"夏季拼色低帮潮流帆布鞋"},{"_id":364319,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1KSqgJFXXXXXYXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"sakun韩国潮牌 男款短袖T恤 涂鸦潮搭","coupon_price":"268.00","price":"478.00","saveCount":194,"isv_code":"0_2_chaopin_24","icon_type":2,"description":"涂鸦男款短袖T恤"},{"_id":345357,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1Lk_MHFXXXXcWaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"HIPANDA 你好熊猫 设计潮牌 男款 水洗破洞牛仔裤街头你好熊猫","coupon_price":"558.00","price":"798.00","saveCount":0,"isv_code":"0_2_chaopin_24","icon_type":2,"description":"水洗破洞牛仔裤"},{"_id":364302,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/854505612/TB27RHblVXXXXb7XXXXXXXXXXXX_!!854505612.jpg_450x10000q75.jpg","title":"新款复古男鞋真皮休闲鞋男士英伦板鞋擦色做旧皮鞋男潮鞋运动板鞋","coupon_price":"159.00","price":"386.00","saveCount":149,"isv_code":"0_2_chaopin_24","icon_type":2,"description":"擦色做旧休闲板鞋"},{"_id":363909,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/1716103330/TB2BIvsopXXXXboXpXXXXXXXXXX_!!1716103330.jpg_450x10000q75.jpg","title":"MPstudios/16ss 定制 重磅推荐 这是一件夏天能穿的风衣外套","coupon_price":"158.00","price":"258.00","saveCount":129,"isv_code":"0_2_chaopin_24","description":"夏季潮流薄款风衣"},{"_id":363901,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1xnz7HFXXXXcAapXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"THETHING设计潮牌2016夏季新品TEE 放松个性印花纯棉短袖T恤男","coupon_price":"119.00","price":"208.00","saveCount":118,"isv_code":"0_2_chaopin_24","description":"个性印花纯棉短袖T恤"},{"_id":363891,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/508749780/TB2I9M8oVXXXXXOXFXXXXXXXXXX_!!508749780.jpg_450x10000q75.jpg","title":"原创夏季男装拼色九分运动裤撞色9分哈伦裤日系潮男个性青年裤子","coupon_price":"118.00","price":"268.00","saveCount":145,"isv_code":"0_2_chaopin_24","description":"原创夏季男装拼色九分运动裤"},{"_id":363890,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1NxyiIVXXXXaeXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季新款男士凉鞋潮流时尚真皮露趾罗马凉鞋男韩版透气英伦潮鞋男","coupon_price":"178.00","price":"398.00","saveCount":147,"isv_code":"0_2_chaopin_24","description":"潮流时尚真皮露趾罗马凉鞋"}]
     */

    private DataBean data;

    public static ShopCPBean objectFromData(String str) {

        return new Gson().fromJson(str, ShopCPBean.class);
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
         * campain_name : 潮品
         * campain_icon :
         * campain_icon2 :
         * campain_color :
         * show_price : false
         */

        private CampaignKindBean campaignKind;
        /**
         * _id : 364559
         * pic_url : http://img03.taobaocdn.com/bao/uploaded/i3/TB1NoqrMpXXXXbFaXXXXXXXXXXX_!!2-item_pic.png
         * title : 香港代购 夏款余文乐彭于晏MDNS同款男女问号短袖海魂条纹t恤潮牌
         * coupon_price : 213.00
         * price : 710.00
         * saveCount : 154
         * isv_code : 0_2_chaopin_24
         * icon_type : 1
         * description : 海魂条纹短袖t恤
         */

        private List<ItemDetailBean> itemDetail;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public CampaignKindBean getCampaignKind() {
            return campaignKind;
        }

        public void setCampaignKind(CampaignKindBean campaignKind) {
            this.campaignKind = campaignKind;
        }

        public List<ItemDetailBean> getItemDetail() {
            return itemDetail;
        }

        public void setItemDetail(List<ItemDetailBean> itemDetail) {
            this.itemDetail = itemDetail;
        }

        public static class CampaignKindBean {
            private String campain_name;
            private String campain_icon;
            private String campain_icon2;
            private String campain_color;
            private boolean show_price;

            public static CampaignKindBean objectFromData(String str) {

                return new Gson().fromJson(str, CampaignKindBean.class);
            }

            public String getCampain_name() {
                return campain_name;
            }

            public void setCampain_name(String campain_name) {
                this.campain_name = campain_name;
            }

            public String getCampain_icon() {
                return campain_icon;
            }

            public void setCampain_icon(String campain_icon) {
                this.campain_icon = campain_icon;
            }

            public String getCampain_icon2() {
                return campain_icon2;
            }

            public void setCampain_icon2(String campain_icon2) {
                this.campain_icon2 = campain_icon2;
            }

            public String getCampain_color() {
                return campain_color;
            }

            public void setCampain_color(String campain_color) {
                this.campain_color = campain_color;
            }

            public boolean isShow_price() {
                return show_price;
            }

            public void setShow_price(boolean show_price) {
                this.show_price = show_price;
            }
        }

        public static class ItemDetailBean {
            private int _id;
            private String pic_url;
            private String title;
            private String coupon_price;
            private String price;
            private int saveCount;
            private String isv_code;
            private int icon_type;
            private String description;

            public static ItemDetailBean objectFromData(String str) {

                return new Gson().fromJson(str, ItemDetailBean.class);
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

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getSaveCount() {
                return saveCount;
            }

            public void setSaveCount(int saveCount) {
                this.saveCount = saveCount;
            }

            public String getIsv_code() {
                return isv_code;
            }

            public void setIsv_code(String isv_code) {
                this.isv_code = isv_code;
            }

            public int getIcon_type() {
                return icon_type;
            }

            public void setIcon_type(int icon_type) {
                this.icon_type = icon_type;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }
}
