package com.men.boyclothesclub.FristPage1.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public class FristBean {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserBean user;
    /**
     * campaignKind : {"campain_name":"精选","campain_icon":"","campain_icon2":"","campain_color":"","show_price":true}
     * itemDetail : [{"_id":363950,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB19e8TJFXXXXccaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"JackJones杰克琼斯纯棉圆领进口复古印花男装短袖T恤C|216201065","coupon_price":"174.30","price":"249.00","saveCount":149,"isv_code":"0_2_jingxuan_24"},{"_id":249534,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1epvGJFXXXXXNXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"集云情侣夏装原创中国风幸会久仰文字兄弟装短袖纯棉大码男T恤潮","coupon_price":"89.00","price":"299.00","saveCount":23,"isv_code":"0_2_jingxuan_24"},{"_id":354146,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1x3_MLFXXXXaRXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"GXG男装 夏季热卖 男士时尚黑白色圆领短袖T恤#52244476","coupon_price":"159.00","price":"398.00","saveCount":173,"isv_code":"0_2_jingxuan_24"},{"_id":356365,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1JpEBJVXXXXcYXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Levi's李维斯男士Logo印花白色圆领短袖T恤17783-0197","coupon_price":"199.00","price":"199.00","saveCount":95,"isv_code":"0_2_jingxuan_24"},{"_id":340691,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1EeflJVXXXXbAaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"【宋仲基同款】马克华菲短袖T恤 男装韩版纯棉印花短t半袖打底衫W","coupon_price":"158.00","price":"295.00","saveCount":78,"isv_code":"0_2_jingxuan_24"},{"_id":251445,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB11UjFHpXXXXa0XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"英迈尼2016夏季男装针织亚麻短袖T恤冰丝 圆领半袖修身衣服体恤衫","coupon_price":"119.00","price":"408.00","saveCount":138,"isv_code":"0_2_jingxuan_24"},{"_id":340683,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1D9s4LpXXXXXhaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Simwood男装2016春夏新品休闲条纹短袖t恤修身男士做旧撞色短袖衫","coupon_price":"78.00","price":"78.00","saveCount":84,"isv_code":"0_2_jingxuan_24"},{"_id":363930,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1fTtqHVXXXXb8aXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"PINLI品立 2016夏季新品时尚男装 修身圆领短袖T恤男打底衫折T121","coupon_price":"99.00","price":"358.00","saveCount":172,"isv_code":"0_2_jingxuan_24"},{"_id":363475,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1Rya8JFXXXXagXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"abx2016夏季新款韩版短袖t恤男修身v领 男士纯色潮流半袖打底衫潮","coupon_price":"99.90","price":"149.00","saveCount":111,"isv_code":"0_2_jingxuan_24"},{"_id":247946,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1750oMpXXXXaIXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"[包邮]酷衣购 男士短袖T恤 彩棉纯色圆领 男t恤 夏季上衣VT-5201","coupon_price":"58.00","price":"228.00","saveCount":173,"isv_code":"0_2_jingxuan_24"},{"_id":260047,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1cWI6JFXXXXXYXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春夏九分裤男薄款休闲裤ALT韩版修身9分小脚裤子","coupon_price":"139.00","price":"359.00","saveCount":186,"isv_code":"0_2_jingxuan_24"},{"_id":254508,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/T19hlFFlNXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"清仓 viishow纯棉背心 男 夏宽肩运动潮男背心欧美潮流圆领汗背心","coupon_price":"99.00","price":"199.00","saveCount":4,"isv_code":"0_2_jingxuan_24"},{"_id":356415,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1rv2OJVXXXXaWXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"MW莫畏男装 夏季热卖 男士圆领多色可选短袖T 青年短袖t恤男 百搭","coupon_price":"59.00","price":"79.00","saveCount":198,"isv_code":"0_2_jingxuan_24"},{"_id":263787,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1H8UdHpXXXXXrXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男士英伦9分裤 修身休闲裤 小脚九分裤男潮牌","coupon_price":"139.00","price":"258.00","saveCount":120,"isv_code":"0_2_jingxuan_24"},{"_id":353691,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1B7Z_LXXXXXamXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"PINLI品立 2016夏季新品时尚男装休闲宽松九分裤男裤潮9分裤 K104","coupon_price":"249.00","price":"498.00","saveCount":141,"isv_code":"0_2_jingxuan_24"},{"_id":359707,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1bHaSJFXXXXXxXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Simwood2016夏季新款男士纯色棉麻休闲裤男卡其色修身小脚九分裤","coupon_price":"148.00","price":"148.00","saveCount":104,"isv_code":"0_2_jingxuan_24"},{"_id":363440,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1lwrsJVXXXXbfXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"NE2016夏季新品圆领纯色男圆领短袖T恤 英伦舒适简约百搭修身体恤","coupon_price":"119.00","price":"119.00","saveCount":56,"isv_code":"0_2_jingxuan_24"},{"_id":363487,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB10si1MXXXXXccXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"拓路者 夏季浅灰色短袖衬衫男纯棉 青年修身衬衣方领牛津纺寸衫潮","coupon_price":"109.00","price":"209.00","saveCount":188,"isv_code":"0_2_jingxuan_24"},{"_id":286045,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1ZkPxKpXXXXbNXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"KAMA 卡玛 夏季新款男装 牛仔拼接细条纹短袖衬衫男 2215808","coupon_price":"115.00","price":"265.00","saveCount":140,"isv_code":"0_2_jingxuan_24"},{"_id":363432,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1rKavJVXXXXc3XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季男士短袖t恤棉小翻领修身青年条纹半袖polo衫上衣服男装潮款","coupon_price":"68.00","price":"128.00","saveCount":127,"isv_code":"0_2_jingxuan_24"},{"_id":359718,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1P2CLMXXXXXb1XVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男装 2016夏季新品   男士修身款黑色纯棉圆领短袖T恤男#62844014","coupon_price":"149.00","price":"369.00","saveCount":194,"isv_code":"0_2_jingxuan_24"},{"_id":363425,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB10iUGJXXXXXanXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"英爵伦 夏季男式潮牌 修身圆领 莫代尔棉 印花短袖t恤半截袖体恤","coupon_price":"68.00","price":"135.00","saveCount":89,"isv_code":"0_2_jingxuan_24"},{"_id":363420,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1xB.FJXXXXXafXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季新款男士T恤体恤时尚潮流个性黑色纯棉印花圆领修身短袖t恤男","coupon_price":"89.00","price":"299.00","saveCount":105,"isv_code":"0_2_jingxuan_24"},{"_id":353856,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1qDv9MXXXXXXraXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"NE伯爵卓尔2016夏季新品圆领印花男短袖T恤 个性图案潮牌体恤英伦","coupon_price":"129.00","price":"129.00","saveCount":55,"isv_code":"0_2_jingxuan_24"},{"_id":363408,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1SHOYLVXXXXcFXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"马克华菲短袖t恤青年男装韩版修身纯棉舒适男士短T2016夏季新品","coupon_price":"158.00","price":"255.00","saveCount":108,"isv_code":"0_2_jingxuan_24"},{"_id":354576,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB14RIUIXXXXXaHXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Dickies情侣款春夏新品男经典简约短袖polo衫162M30EC19","coupon_price":"229.00","price":"359.00","saveCount":93,"isv_code":"0_2_jingxuan_24"},{"_id":363934,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1mJgTJVXXXXaoXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016夏季新品时尚男装 修身圆领短袖T恤男打底衫潮","coupon_price":"135.00","price":"318.00","saveCount":64,"isv_code":"0_2_jingxuan_24"},{"_id":354032,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1twCLLVXXXXadXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"英爵伦 男式时尚潮牌 修身圆领个性印花短袖 莫代尔T恤图案半截袖","coupon_price":"68.00","price":"135.00","saveCount":80,"isv_code":"0_2_jingxuan_24"},{"_id":363190,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1pvg1JpXXXXafapXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"优默 夏装男士丝光简约条纹棉质男装短袖t恤修身翻领polo衫保罗潮","coupon_price":"79.00","price":"128.00","saveCount":155,"isv_code":"0_2_jingxuan_24"},{"_id":363517,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1va__LFXXXXX6XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"佐仕顿夏季新款式韩版格子短袖衬衫男士修身青年纯棉商务休闲衬衣","coupon_price":"138.00","price":"728.00","saveCount":198,"isv_code":"0_2_jingxuan_24"},{"_id":352810,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1KE0lMpXXXXb6XpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"alt阿恩蓝拓男士短袖t恤 2016夏季新款韩版印花修身青年休闲体恤","coupon_price":"89.00","price":"179.00","saveCount":101,"isv_code":"0_2_jingxuan_24"},{"_id":339132,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1TXjiLXXXXXX4XpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Simwood男装2016春夏新品男士修身短袖t恤复古做旧印花圆领短T恤","coupon_price":"78.00","price":"78.00","saveCount":65,"isv_code":"0_2_jingxuan_24"},{"_id":349754,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB12jqfJVXXXXcwXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"佐丹奴t恤衫 男装夏季纯棉汗衫轻磨毛海魂衫条纹短袖T恤01026214","coupon_price":"119.00","price":"150.00","saveCount":143,"isv_code":"0_2_jingxuan_24"},{"_id":363196,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB182pKLVXXXXXRaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男士夏美国队长速干健身短袖运动t恤蜘蛛侠弹力敢死队黑色紧身衣","coupon_price":"50.00","price":"138.00","saveCount":156,"isv_code":"0_2_jingxuan_24"},{"_id":363513,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1wSg7JpXXXXcPXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"[包邮]酷衣购 男士短袖衬衫 韩版修身休闲尖领男装衬衣 夏季1813","coupon_price":"128.00","price":"198.00","saveCount":131,"isv_code":"0_2_jingxuan_24"},{"_id":362486,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1FN5gMXXXXXbGapXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"马克华菲短袖T恤男 2016夏新品棉圆领透气绣标短袖上衣男式","coupon_price":"148.00","price":"295.00","saveCount":128,"isv_code":"0_2_jingxuan_24"},{"_id":362918,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1VkHxJVXXXXXJXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"A21男装白色时尚印花修身型圆领短袖T恤 2016夏装半袖潮男撞色T","coupon_price":"65.00","price":"169.00","saveCount":115,"isv_code":"0_2_jingxuan_24"},{"_id":58827,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/T1QsV7FEXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季男士短袖T恤 纯色V领男款 夏天修身男装 夏装青春半袖纯棉潮","coupon_price":"48.00","price":"168.00","saveCount":168,"isv_code":"0_2_jingxuan_24"},{"_id":245477,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1FrmDKVXXXXbmXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"太平鸟短袖T恤白色t恤衫个性图案圆领韩版B1DA42410","coupon_price":"139.00","price":"298.00","saveCount":156,"isv_code":"0_2_jingxuan_24"},{"_id":363442,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1DClUMXXXXXXfXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016夏季新款半袖时尚潮牌字母烫印圆领短袖T恤亚麻上衣男","coupon_price":"149.00","price":"275.00","saveCount":95,"isv_code":"0_2_jingxuan_24"},{"_id":360821,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1kdCcMFXXXXaQXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"KOJO短袖T恤 男 夏季新款圆领半袖黑色印花上衣男装休闲衣服体恤","coupon_price":"68.00","price":"118.00","saveCount":130,"isv_code":"0_2_jingxuan_24"},{"_id":359366,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1rA8WMXXXXXa0XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Lilbetter长款男士短袖T恤 拉链装饰潮牌白色体恤高街纯棉男汗衫","coupon_price":"99.00","price":"99.00","saveCount":119,"isv_code":"0_2_jingxuan_24"},{"_id":349313,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1WDPTKpXXXXaLXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"THETHING潮牌短袖t恤男纯棉t恤男半袖印花T恤衫圆领情侣夏大爆炸","coupon_price":"99.00","price":"208.00","saveCount":112,"isv_code":"0_2_jingxuan_24"},{"_id":360117,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB110l9LpXXXXXqXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"HIPANDA 你好熊猫 设计潮牌 2015新款 男款 反战印花 T恤","coupon_price":"214.40","price":"268.00","saveCount":183,"isv_code":"0_2_jingxuan_24"},{"_id":274643,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1w0n6HFXXXXaMXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"letstee潮牌夏新品乔丹 JORDAN男短袖T恤潮字母印花纯棉圆领大码","coupon_price":"119.00","price":"199.00","saveCount":94,"isv_code":"0_2_jingxuan_24"},{"_id":363423,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1mwvkJVXXXXadaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"GXG男装  2016夏季新款   修身款时尚黑色圆领短袖T恤#62844041","coupon_price":"159.00","price":"369.00","saveCount":181,"isv_code":"0_2_jingxuan_24"},{"_id":358469,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1nAEiLFXXXXa0XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季男士短袖t恤 圆领青年潮流日系复古紧身3d印花半袖粉色体恤","coupon_price":"59.00","price":"259.00","saveCount":145,"isv_code":"0_2_jingxuan_24"},{"_id":354022,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1Z_CcMXXXXXakXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"英爵伦 莫代尔棉 时尚潮牌修身印花图案圆领短袖T恤 青年半截袖衫","coupon_price":"68.00","price":"135.00","saveCount":195,"isv_code":"0_2_jingxuan_24"},{"_id":360811,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1ER9IJVXXXXaxXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"马克华菲男士亚麻棉麻裤子男 休闲裤 修身韩版直筒运动裤夏季薄款","coupon_price":"268.00","price":"495.00","saveCount":83,"isv_code":"0_2_jingxuan_24"},{"_id":352104,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB17ID.MXXXXXcwXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"LilbetterPOLO衫男 纯色假两件男士短袖日系修身简约保罗衫男士","coupon_price":"99.00","price":"99.00","saveCount":191,"isv_code":"0_2_jingxuan_24"},{"_id":358457,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB16wBMMXXXXXXWXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"马克华菲短袖T恤男装韩版修身男士条纹圆领印花短T2016夏装新品W","coupon_price":"178.00","price":"295.00","saveCount":183,"isv_code":"0_2_jingxuan_24"},{"_id":238472,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1DTHfLVXXXXXTXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Heilan Home/海澜之家2016夏季热卖男装纯色POLO衫休闲短袖T恤","coupon_price":"128.00","price":"128.00","saveCount":65,"isv_code":"0_2_jingxuan_24"},{"_id":278536,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1dbJmMXXXXXXtXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"GXG男装 夏季热卖 男士时尚白色休闲舒适T恤#52244260","coupon_price":"169.00","price":"368.00","saveCount":132,"isv_code":"0_2_jingxuan_24"},{"_id":353850,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1BuG2MXXXXXadXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"NE伯爵卓尔2016夏季新品圆领纯色男短袖T恤 英伦舒适简约百搭体恤","coupon_price":"119.00","price":"119.00","saveCount":113,"isv_code":"0_2_jingxuan_24"},{"_id":358439,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1.zdfJVXXXXX8XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"GENANX短袖t恤男圆领青年潮男半袖夏季宽松印花五分袖空气层卫衣","coupon_price":"188.00","price":"658.00","saveCount":135,"isv_code":"0_2_jingxuan_24"},{"_id":358438,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1lHusLVXXXXboaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"布衣传说原创男装 夏季新款男士修身薄圆领印花潮款短袖T恤打底衫","coupon_price":"69.00","price":"69.00","saveCount":88,"isv_code":"0_2_jingxuan_24"},{"_id":356475,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1b75FJVXXXXazaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Egou易构2016夏季新款男士T恤修身衬衫领时尚T恤男5023711-1","coupon_price":"79.00","price":"299.00","saveCount":131,"isv_code":"0_2_jingxuan_24"},{"_id":342276,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1_TE6JpXXXXcPXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"满减包邮5折SELECTED思莱德纯棉修身商务长袖男衬衫T|416205015","coupon_price":"249.50","price":"499.00","saveCount":78,"isv_code":"0_2_jingxuan_24"},{"_id":346378,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1K9RJMXXXXXcdXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"PINLI品立英绅2016夏季新品男装修身五分袖衬衣中袖衬衫潮C099","coupon_price":"199.00","price":"398.00","saveCount":190,"isv_code":"0_2_jingxuan_24"},{"_id":248282,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1Qk0DJFXXXXXXXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季男士短袖t恤男装韩版修身圆领字母印花体恤打底衫半袖衣服潮","coupon_price":"49.00","price":"168.00","saveCount":78,"isv_code":"0_2_jingxuan_24"},{"_id":356374,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1TOmLMpXXXXX2XVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"SWJEANS七匹狼休闲衬衫男翻领条纹修身格子布短袖白衬衣都市时尚","coupon_price":"249.00","price":"459.00","saveCount":65,"isv_code":"0_2_jingxuan_24"},{"_id":356813,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB135rCMpXXXXakXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"卡宾夏季休闲男士短袖T恤 圆领纯棉条纹修身男t恤衫B/3162132061","coupon_price":"159.00","price":"399.00","saveCount":76,"isv_code":"0_2_jingxuan_24"},{"_id":349696,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1aN9VLFXXXXbKXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016新款春夏季纯色棉半袖男装打底衫男士短袖t恤男圆领修身T恤","coupon_price":"19.90","price":"99.00","saveCount":154,"isv_code":"0_2_jingxuan_24"},{"_id":358440,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1OV_HLVXXXXbtaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"纯棉加大码男士短袖T恤夏季薄款加肥加大胖子肥佬特大号体恤男潮","coupon_price":"88.00","price":"198.00","saveCount":122,"isv_code":"0_2_jingxuan_24"},{"_id":356816,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1O1VjLVXXXXcYXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"PANMAX潮牌大码男装 胖子男士短袖纯色上衣宽松大码男翻领POLO衫","coupon_price":"159.00","price":"159.00","saveCount":178,"isv_code":"0_2_jingxuan_24"},{"_id":244481,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1gznyHpXXXXXAXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏装新款潮牌韩版修身竖条纹男士短袖衬衫七分袖衬衣7分中袖寸衫","coupon_price":"88.00","price":"398.00","saveCount":163,"isv_code":"0_2_jingxuan_24"},{"_id":356375,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1DoKRJVXXXXcIXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"SWJEANS七匹狼短袖T恤男士条纹圆领2016青年修身纯棉t学生潮流短t","coupon_price":"149.00","price":"229.00","saveCount":172,"isv_code":"0_2_jingxuan_24"},{"_id":346192,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB19eJKJFXXXXXoXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"NE伯爵卓尔2016夏季新品立领男polo衫 短袖英伦风男T恤舒适保罗衫","coupon_price":"139.00","price":"139.00","saveCount":148,"isv_code":"0_2_jingxuan_24"},{"_id":352523,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1RQnhMXXXXXXSaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Simwood2016夏季新品欧美男士弹力牛仔九分裤潮男休闲牛仔裤子男","coupon_price":"128.00","price":"128.00","saveCount":173,"isv_code":"0_2_jingxuan_24"},{"_id":356338,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1fa0cMFXXXXchXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"抹茶故事2016夏季新品 潮流短袖T恤男修身印花半袖 男士打底体恤","coupon_price":"99.00","price":"100.00","saveCount":145,"isv_code":"0_2_jingxuan_24"},{"_id":238379,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1IWAnLXXXXXcFaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"与狼共舞男士短袖T恤 多彩翻领纯棉POLO衫潮韩版休闲2016夏装新款","coupon_price":"149.00","price":"299.00","saveCount":140,"isv_code":"0_2_jingxuan_24"},{"_id":349414,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1ZHYbLVXXXXanXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"IPJW夏季印花休闲男装纯棉白色短袖T恤男圆领修身韩版时尚体恤潮","coupon_price":"89.00","price":"159.00","saveCount":102,"isv_code":"0_2_jingxuan_24"},{"_id":258224,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1ZMesJVXXXXbPXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"UOOHE夏季男士休闲裤九分 潮男束脚裤 韩版修身针织小脚哈伦裤男","coupon_price":"148.00","price":"376.00","saveCount":145,"isv_code":"0_2_jingxuan_24"},{"_id":348984,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1ewsrLVXXXXbKXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Simwood2016夏装新款欧美简约男士圆领短袖T恤潮男印花字母T恤男","coupon_price":"78.00","price":"78.00","saveCount":109,"isv_code":"0_2_jingxuan_24"},{"_id":340964,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1fuQ0LVXXXXcxaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"钜惠满减包邮5折SELECTED思莱德纯棉印花男士短袖T恤C|416201065","coupon_price":"99.50","price":"199.00","saveCount":83,"isv_code":"0_2_jingxuan_24"},{"_id":347035,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1It39LFXXXXaOXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春夏季薄款9分裤黑色青年九分裤男士韩版修身小脚休闲裤潮男裤子","coupon_price":"99.90","price":"198.00","saveCount":190,"isv_code":"0_2_jingxuan_24"},{"_id":348389,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB12QOOLVXXXXXWapXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春夏季新款男鞋 乐福鞋真皮休闲皮鞋软面皮青年潮男鞋子板鞋","coupon_price":"258.00","price":"328.00","saveCount":203,"isv_code":"0_2_jingxuan_24"},{"_id":241934,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1NkZjIpXXXXcjXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"jogger pants慢跑九分裤男束脚裤 男春夏潮牌束腿休闲收脚裤","coupon_price":"178.00","price":"398.00","saveCount":201,"isv_code":"0_2_jingxuan_24"},{"_id":186321,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1vlyvJVXXXXaZXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Onitsuka Tiger 鬼冢虎 休闲鞋 TOKUTEN 男鞋 板鞋 潮鞋 D3B2L-A","coupon_price":"418.00","price":"598.00","saveCount":133,"isv_code":"0_2_jingxuan_24"},{"_id":349764,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1fEFmJFXXXXbVXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"夏季男士短袖T恤印花圆领修身纯棉潮流韩版男装夏装t半袖体恤衣服","coupon_price":"89.00","price":"129.00","saveCount":212,"isv_code":"0_2_jingxuan_24"},{"_id":345148,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1SzlkLpXXXXcUXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"太平鸟男装 修身时尚中腰小脚裤男黑色男士休闲裤男B2GB52102","coupon_price":"259.00","price":"468.00","saveCount":119,"isv_code":"0_2_jingxuan_24"},{"_id":238387,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1KEJQHFXXXXbdXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"NE夏季修身男短袖T恤英伦青年潮流V领上衣韩版常规纯色简约打底衫","coupon_price":"99.00","price":"238.00","saveCount":82,"isv_code":"0_2_jingxuan_24"},{"_id":355552,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1fSVfMpXXXXbGaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Simwood男装2016夏装新款男士九分裤微弹纯色修身休闲裤9分潮男裤","coupon_price":"138.00","price":"138.00","saveCount":99,"isv_code":"0_2_jingxuan_24"},{"_id":349933,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1w7jUMXXXXXcFXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"NE伯爵卓尔2016夏季新品 潮牌英伦风男短袖衬衫 时尚休闲百搭衬衣","coupon_price":"139.00","price":"139.00","saveCount":128,"isv_code":"0_2_jingxuan_24"},{"_id":349763,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1C4DQLVXXXXXGaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"马克华菲POLO衫男士装韩版翻领修身拼接短袖t恤男 2016夏装新品W","coupon_price":"158.00","price":"295.00","saveCount":174,"isv_code":"0_2_jingxuan_24"},{"_id":349919,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1qa5ZLFXXXXadXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"PINLI品立 2016夏季新品时尚男装 修身圆领短袖T恤男打底衫潮3095","coupon_price":"159.00","price":"318.00","saveCount":137,"isv_code":"0_2_jingxuan_24"},{"_id":354416,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1QyKiJVXXXXcIXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"jm快乐玛丽男鞋2016夏季休闲条纹懒人帆布鞋渔夫鞋麻底布鞋57188M","coupon_price":"209.00","price":"299.00","saveCount":122,"isv_code":"0_2_jingxuan_24"},{"_id":349582,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB17Pv8LFXXXXcGXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"UO轻熟男装2016春装新款修身黑色七分袖小西装男士薄款休闲西服潮","coupon_price":"279.00","price":"699.00","saveCount":83,"isv_code":"0_2_jingxuan_24"},{"_id":349902,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1NuPqJVXXXXX_XVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"三弦男装 男士休闲T恤 2016夏装新款简约V领韩版运动修身短袖T恤","coupon_price":"109.00","price":"229.00","saveCount":113,"isv_code":"0_2_jingxuan_24"},{"_id":349421,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB19taBLVXXXXcrXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"DUSTY潮牌夏季纯棉男装花鸟元素创意动物印花高街学院风短袖T恤","coupon_price":"119.00","price":"199.00","saveCount":141,"isv_code":"0_2_jingxuan_24"},{"_id":262087,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1WDOVMpXXXXbpXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"花花公子 2016春季男修身拼接短袖T恤男 时尚设计兔头印花logo","coupon_price":"119.00","price":"239.00","saveCount":105,"isv_code":"0_2_jingxuan_24"},{"_id":349420,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB17_4BJFXXXXaKXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"马克华菲短袖T恤男 2016夏装新款时尚纯棉字母印花圆领半袖t恤潮","coupon_price":"148.00","price":"255.00","saveCount":115,"isv_code":"0_2_jingxuan_24"},{"_id":349628,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1RULjMXXXXXbPXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"素劲2016春新款 男士短袖圆领T恤 中国风男装上衣 品质T恤 1692","coupon_price":"108.00","price":"180.00","saveCount":147,"isv_code":"0_2_jingxuan_24"},{"_id":286815,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1qN6qHFXXXXc4XpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"THETHING潮牌夏装个性短袖t恤男圆领印花T恤纯棉断鱼图案Tee","coupon_price":"139.00","price":"208.00","saveCount":158,"isv_code":"0_2_jingxuan_24"},{"_id":349410,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1hH8uLFXXXXcXXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"太平鸟男装 夏季新款男士圆领短袖tee白色纯棉印花T恤男B2DA52603","coupon_price":"169.00","price":"298.00","saveCount":132,"isv_code":"0_2_jingxuan_24"},{"_id":349426,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1lIsZLFXXXXXUXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"布衣传说原创男装 男士修身弹力松紧腰际舒适休闲裤潮男款小脚裤","coupon_price":"119.00","price":"119.00","saveCount":104,"isv_code":"0_2_jingxuan_24"},{"_id":348399,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1HrNkJFXXXXcVXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春新款七匹狼男鞋 男士透气休闲帆布鞋 一脚蹬懒人鞋板鞋布鞋","coupon_price":"195.00","price":"537.00","saveCount":112,"isv_code":"0_2_jingxuan_24"},{"_id":349427,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1UqPHLVXXXXXnXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"板鞋男韩版潮休闲鞋 夏季新款男鞋英伦系带青年时尚小白鞋男真皮","coupon_price":"298.00","price":"598.00","saveCount":150,"isv_code":"0_2_jingxuan_24"},{"_id":345265,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1DHBdLFXXXXbsXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"【现货】TRENDIANO新2016男潮纯棉字母狗狗圆领短袖T恤3HC102414E","coupon_price":"169.00","price":"339.00","saveCount":197,"isv_code":"0_2_jingxuan_24"},{"_id":239154,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1Oc3KJXXXXXbfXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Simwood男装衬衫 2016春夏季新款男士纯棉欧美风修身衬衫男衬衣","coupon_price":"108.00","price":"298.00","saveCount":133,"isv_code":"0_2_jingxuan_24"}]
     */

    private DataBean data;

    public static FristBean objectFromData(String str) {

        return new Gson().fromJson(str, FristBean.class);
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
         * campain_name : 精选
         * campain_icon :
         * campain_icon2 :
         * campain_color :
         * show_price : true
         */

        private CampaignKindBean campaignKind;
        /**
         * _id : 363950
         * pic_url : http://img04.taobaocdn.com/bao/uploaded/i4/TB19e8TJFXXXXccaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg
         * title : JackJones杰克琼斯纯棉圆领进口复古印花男装短袖T恤C|216201065
         * coupon_price : 174.30
         * price : 249.00
         * saveCount : 149
         * isv_code : 0_2_jingxuan_24
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
        }
    }
}
