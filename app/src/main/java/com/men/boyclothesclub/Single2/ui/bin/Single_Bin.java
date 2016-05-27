package com.men.boyclothesclub.Single2.ui.bin;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/24.
 */
public class Single_Bin  {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * classID : 2
     * name : 上衣
     * categories : [{"name":"风衣","cate_id":27,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/fengyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"皮衣","cate_id":105,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/piyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":6,"attributeName":"牛皮"},{"attributeID":8,"attributeName":"PU"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"毛衣","cate_id":52,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/maoyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"夹克","cate_id":28,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/jiake_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"西服","cate_id":23,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/xizhuang_cateB.png","filter":[{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"牛仔外套","cate_id":132,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/niuzai_cateB.png","filter":[{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"针织衫","cate_id":25,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/zhenzhi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"棒球服","cate_id":135,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/bangqiu_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"卫衣","cate_id":24,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/weiyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":14,"attributeName":"太空棉"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"长袖衬衫","cate_id":22,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/changchen_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"长袖T恤","cate_id":66,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/changt_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"POLO","cate_id":101,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/polo_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"保暖内衣","cate_id":53,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/neiyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"背心","cate_id":26,"cateimg":"http://im01.nanyibang.com/cateimg/2016/05/13/beixin.png","filter":[{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"短袖T恤","cate_id":70,"cateimg":"http://im01.nanyibang.com/cateimg/2016/03/11/shortt.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"短袖衬衫","cate_id":75,"cateimg":"http://im01.nanyibang.com/cateimg/2016/03/10/duanchen.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]}]
     */

    private List<DataBean> data;

    public static Single_Bin objectFromData(String str) {

        return new Gson().fromJson(str, Single_Bin.class);
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
        private int classID;
        private String name;
        /**
         * name : 风衣
         * cate_id : 27
         * cateimg : http://im01.nanyibang.com/cateimg/2016/01/29/fengyi_cateB.png
         * filter : [{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]
         */

        private List<CategoriesBean> categories;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getClassID() {
            return classID;
        }

        public void setClassID(int classID) {
            this.classID = classID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<CategoriesBean> getCategories() {
            return categories;
        }

        public void setCategories(List<CategoriesBean> categories) {
            this.categories = categories;
        }

        public static class CategoriesBean {
            private String name;
            private int cate_id;
            private String cateimg;
            /**
             * name : 材质
             * type : material
             * items : [{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}]
             * code : 1
             */

            private List<FilterBean> filter;

            public static CategoriesBean objectFromData(String str) {

                return new Gson().fromJson(str, CategoriesBean.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCate_id() {
                return cate_id;
            }

            public void setCate_id(int cate_id) {
                this.cate_id = cate_id;
            }

            public String getCateimg() {
                return cateimg;
            }

            public void setCateimg(String cateimg) {
                this.cateimg = cateimg;
            }

            public List<FilterBean> getFilter() {
                return filter;
            }

            public void setFilter(List<FilterBean> filter) {
                this.filter = filter;
            }

            public static class FilterBean {
                private String name;
                private String type;
                private int code;
                /**
                 * attributeID : 2
                 * attributeName : 棉
                 */

                private List<ItemsBean> items;

                public static FilterBean objectFromData(String str) {

                    return new Gson().fromJson(str, FilterBean.class);
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getCode() {
                    return code;
                }

                public void setCode(int code) {
                    this.code = code;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ItemsBean {
                    private int attributeID;
                    private String attributeName;

                    public static ItemsBean objectFromData(String str) {

                        return new Gson().fromJson(str, ItemsBean.class);
                    }

                    public int getAttributeID() {
                        return attributeID;
                    }

                    public void setAttributeID(int attributeID) {
                        this.attributeID = attributeID;
                    }

                    public String getAttributeName() {
                        return attributeName;
                    }

                    public void setAttributeName(String attributeName) {
                        this.attributeName = attributeName;
                    }
                }
            }
        }
    }
}
