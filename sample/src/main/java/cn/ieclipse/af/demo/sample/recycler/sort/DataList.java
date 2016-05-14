/*
 * Copyright 2014-2016 QuickAF
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.af.demo.sample.recycler.sort;

/**
 * 类/接口描述
 *
 * @author wangjian
 * @date 2016/5/9 .
 */
public class DataList {
    public static String tempData = "{\"lipro\":[{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":12,\"status\":0,"
        + "\"title\":\"中铁青秀城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":13,\"status\":0,"
        + "\"title\":\"雍福龙庭\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":25,\"status\":0,"
        + "\"title\":\"高科荣境二期\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":26,\"status\":0,"
        + "\"title\":\"金隅紫京府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":27,\"status\":0,"
        + "\"title\":\"电建海赋尚城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":30,\"status\":0,"
        + "\"title\":\"万裕龙庭水岸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":28,\"status\":0,"
        + "\"title\":\"北江锦城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":32,\"status\":0,"
        + "\"title\":\"华府国际\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":33,\"status\":0,"
        + "\"title\":\"华润国际社区\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":35,\"status\":0,"
        + "\"title\":\"金盛田阳光青城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":36,\"status\":0,"
        + "\"title\":\"明发香山郡\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":38,\"status\":0,"
        + "\"title\":\"明发云庭\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":233,\"status\":0,"
        + "\"title\":\"升龙公园道\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":39,\"status\":0,"
        + "\"title\":\"融侨观邸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":40,\"status\":0,"
        + "\"title\":\"万科璞悦山\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":41,\"status\":0,"
        + "\"title\":\"雅居乐滨江国际\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":43,\"status\":0,"
        + "\"title\":\"中海万锦熙岸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":45,\"status\":0,"
        + "\"title\":\"新城玖珑湖\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":46,\"status\":0,"
        + "\"title\":\"涟城二期\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":47,\"status\":0,"
        + "\"title\":\"五矿崇文金城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":48,\"status\":0,"
        + "\"title\":\"星叶瑜憬湾\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":49,\"status\":0,"
        + "\"title\":\"银城一方山\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":50,\"status\":0,"
        + "\"title\":\"金地湖城艺境\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":51,\"status\":0,"
        + "\"title\":\"颐和府邸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":52,\"status\":0,"
        + "\"title\":\"升龙天汇\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":53,\"status\":0,"
        + "\"title\":\"海峡城第三街区\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":54,\"status\":0,"
        + "\"title\":\"东方兰园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":55,\"status\":0,"
        + "\"title\":\"星叶羊山湖花园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":56,\"status\":0,"
        + "\"title\":\"正荣润峯\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":57,\"status\":0,"
        + "\"title\":\"翠屏诚园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":58,\"status\":0,"
        + "\"title\":\"新城香悦澜山\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":59,\"status\":0,"
        + "\"title\":\"爱涛尚逸华府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":60,\"status\":0,"
        + "\"title\":\"保利中央公园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":61,\"status\":0,"
        + "\"title\":\"中天铭廷\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":63,\"status\":0,"
        + "\"title\":\"银城蓝溪郡\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":64,\"status\":0,"
        + "\"title\":\"仁恒江湾城第四期\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":68,\"status\":0,"
        + "\"title\":\"星叶枫情水岸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":69,\"status\":0,"
        + "\"title\":\"朗诗玲珑屿\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":70,\"status\":0,"
        + "\"title\":\"奥克斯钟山府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":71,\"status\":0,"
        + "\"title\":\"天泽苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":72,\"status\":0,"
        + "\"title\":\"朗诗青春街区\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":73,\"status\":0,"
        + "\"title\":\"翠屏城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":74,\"status\":0,"
        + "\"title\":\"万达茂御湖世家\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":76,\"status\":0,"
        + "\"title\":\"弘阳上院\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":77,\"status\":0,"
        + "\"title\":\"招商依云郡\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":80,\"status\":0,"
        + "\"title\":\"招商方山里花园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":82,\"status\":0,"
        + "\"title\":\"骋望云邸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":83,\"status\":0,"
        + "\"title\":\"高科荣域\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":85,\"status\":0,"
        + "\"title\":\"佳兆业城市广场\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":86,\"status\":0,"
        + "\"title\":\"艾菲国际\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":237,\"status\":0,"
        + "\"title\":\"中交锦蘭荟\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":87,\"status\":0,"
        + "\"title\":\"威尼斯水城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":88,\"status\":0,"
        + "\"title\":\"新城香溢紫郡\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":91,\"status\":0,"
        + "\"title\":\"启迪方洲\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":93,\"status\":0,"
        + "\"title\":\"银亿东城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":96,\"status\":0,"
        + "\"title\":\"麒麟山庄\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":97,\"status\":0,"
        + "\"title\":\"弘阳旭日上城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":98,\"status\":0,"
        + "\"title\":\"和昌湾景\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":99,\"status\":0,"
        + "\"title\":\"中海国际社区\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":100,\"status\":0,"
        + "\"title\":\"世纪城金域华府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":101,\"status\":0,"
        + "\"title\":\"中粮鸿云\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":103,\"status\":0,"
        + "\"title\":\"中南世纪雅苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":304,\"status\":0,"
        + "\"title\":\"中国铁建原香颂\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":105,\"status\":0,"
        + "\"title\":\"紫金华府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":112,\"status\":0,"
        + "\"title\":\"世茂君望墅\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":115,\"status\":0,"
        + "\"title\":\"复地御钟山\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":117,\"status\":0,"
        + "\"title\":\"金泉泰来苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":120,\"status\":0,"
        + "\"title\":\"苏宁环球天润城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":124,\"status\":0,"
        + "\"title\":\"江月府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":128,\"status\":0,"
        + "\"title\":\"朗诗未来街区\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":130,\"status\":0,"
        + "\"title\":\"大华锦绣华城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":131,\"status\":0,"
        + "\"title\":\"山水云房\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":132,\"status\":0,"
        + "\"title\":\"招商1872\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":146,\"status\":0,"
        + "\"title\":\"亚泰山语湖\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":147,\"status\":0,"
        + "\"title\":\"新城花漾紫郡\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":244,\"status\":0,"
        + "\"title\":\"金地浅山艺境\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":148,\"status\":0,"
        + "\"title\":\"旭辉银城白马澜山\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":231,\"status\":0,"
        + "\"title\":\"同曦阳光新城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":149,\"status\":0,"
        + "\"title\":\"赞城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":151,\"status\":0,"
        + "\"title\":\"招商兰溪谷\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":215,\"status\":0,"
        + "\"title\":\"万科新都荟\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":152,\"status\":0,"
        + "\"title\":\"弘阳时光里\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":154,\"status\":0,"
        + "\"title\":\"绿地悦峰公馆\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":155,\"status\":0,"
        + "\"title\":\"荣里\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":157,\"status\":0,"
        + "\"title\":\"金城丽景\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":158,\"status\":0,"
        + "\"title\":\"保利西江月\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":221,\"status\":0,"
        + "\"title\":\"德基世贸一号\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":161,\"status\":0,"
        + "\"title\":\"北岸新城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":162,\"status\":0,"
        + "\"title\":\"金地格林格林\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":163,\"status\":0,"
        + "\"title\":\"正荣润江城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":165,\"status\":0,"
        + "\"title\":\"紫金上品苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":169,\"status\":0,"
        + "\"title\":\"德水香林\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":172,\"status\":0,"
        + "\"title\":\"龙湖春江紫宸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":173,\"status\":0,"
        + "\"title\":\"世茂外滩新城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":174,\"status\":0,"
        + "\"title\":\"恒盛金陵湾\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":175,\"status\":0,"
        + "\"title\":\"朗诗未来家\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":176,\"status\":0,"
        + "\"title\":\"浦泰和天下\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":177,\"status\":0,"
        + "\"title\":\"绿地国际花都\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":178,\"status\":0,"
        + "\"title\":\"杏林北苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":179,\"status\":0,"
        + "\"title\":\"碧湖天辰\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":180,\"status\":0,"
        + "\"title\":\"恒信珑湖国际\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":181,\"status\":0,"
        + "\"title\":\"牧龙湖壹号\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":182,\"status\":0,"
        + "\"title\":\"新理想家\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":183,\"status\":0,"
        + "\"title\":\"金浦御龙湾\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":185,\"status\":0,"
        + "\"title\":\"复地宴南都\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":186,\"status\":0,"
        + "\"title\":\"保利堂悦\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":190,\"status\":0,"
        + "\"title\":\"江岸景城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":191,\"status\":0,"
        + "\"title\":\"阳光帝景\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":192,\"status\":0,"
        + "\"title\":\"恒辉假日广场\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":194,\"status\":0,"
        + "\"title\":\"美麟香漫山\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":195,\"status\":0,"
        + "\"title\":\"万科尚都荟\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":196,\"status\":0,"
        + "\"title\":\"万科九都荟\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":211,\"status\":0,"
        + "\"title\":\"爱涛尚书云邸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":198,\"status\":0,"
        + "\"title\":\"金浦翡翠谷\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":199,\"status\":0,"
        + "\"title\":\"德盈YOUNG\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":200,\"status\":0,"
        + "\"title\":\"善水湾\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":201,\"status\":0,"
        + "\"title\":\"长发都市诸公\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":202,\"status\":0,"
        + "\"title\":\"凤凰美地\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":203,\"status\":0,"
        + "\"title\":\"恒大华府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":204,\"status\":0,"
        + "\"title\":\"琥珀森林\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":205,\"status\":0,"
        + "\"title\":\"莱蒙水榭阳光\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":206,\"status\":0,"
        + "\"title\":\"亚东观樾\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":207,\"status\":0,"
        + "\"title\":\"恒大翡翠华庭\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":208,\"status\":0,"
        + "\"title\":\"通宇林景熙园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":209,\"status\":0,"
        + "\"title\":\"宋都南郡国际\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":210,\"status\":0,"
        + "\"title\":\"富力尚悦居\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":212,\"status\":0,"
        + "\"title\":\"招商雍和府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":213,\"status\":0,"
        + "\"title\":\"骏景华庭\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":214,\"status\":0,"
        + "\"title\":\"武夷名仕园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":217,\"status\":0,"
        + "\"title\":\"五矿晏山居\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":223,\"status\":0,"
        + "\"title\":\"滟紫台\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":218,\"status\":0,"
        + "\"title\":\"世茂招商语山\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":219,\"status\":0,"
        + "\"title\":\"宏图上水云锦\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":220,\"status\":0,"
        + "\"title\":\"苏宁滨江壹号\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":222,\"status\":0,"
        + "\"title\":\"雨润国际广场\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":224,\"status\":0,"
        + "\"title\":\"金基尚书里\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":225,\"status\":0,"
        + "\"title\":\"金陵雅颂居\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":226,\"status\":0,"
        + "\"title\":\"中垠紫金观邸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":227,\"status\":0,"
        + "\"title\":\"大发融悦\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":228,\"status\":0,"
        + "\"title\":\"中航金城1号\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":229,\"status\":0,"
        + "\"title\":\"蓝天华门国际花园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":232,\"status\":0,"
        + "\"title\":\"仁恒绿洲新岛\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":243,\"status\":0,"
        + "\"title\":\"金鼎湾如院\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":234,\"status\":0,"
        + "\"title\":\"东方万汇城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":235,\"status\":0,"
        + "\"title\":\"华润幸福里\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":236,\"status\":0,"
        + "\"title\":\"中南锦苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":238,\"status\":0,"
        + "\"title\":\"金轮津桥华府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":239,\"status\":0,"
        + "\"title\":\"远洋绿地雲峰公馆\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":240,\"status\":0,"
        + "\"title\":\"旭辉九著\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":241,\"status\":0,"
        + "\"title\":\"万科翡翠公园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":242,\"status\":0,"
        + "\"title\":\"保利朗诗蔚蓝\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":317,\"status\":0,"
        + "\"title\":\"东方曼园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":250,\"status\":0,"
        + "\"title\":\"中航樾公馆\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":251,\"status\":0,"
        + "\"title\":\"亚泰梧桐世家\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":254,\"status\":0,"
        + "\"title\":\"电建洺悦府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":255,\"status\":0,"
        + "\"title\":\"明发浦泰梦幻家\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":256,\"status\":0,"
        + "\"title\":\"紫金江景苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":257,\"status\":0,"
        + "\"title\":\"南京碧桂园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":258,\"status\":0,"
        + "\"title\":\"首创立方\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":259,\"status\":0,"
        + "\"title\":\"禹洲吉庆里\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":260,\"status\":0,"
        + "\"title\":\"梅龙湖无界\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":261,\"status\":0,"
        + "\"title\":\"骋望骊都\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":262,\"status\":0,"
        + "\"title\":\"世茂梦享家\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":263,\"status\":0,"
        + "\"title\":\"深业滨江半岛\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":264,\"status\":0,"
        + "\"title\":\"证大大拇指广场\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":265,\"status\":0,"
        + "\"title\":\"银城一方山·浅山墅\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":266,\"status\":0,"
        + "\"title\":\"苏宁钟山朝阳府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":267,\"status\":0,"
        + "\"title\":\"中海御山府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":268,\"status\":0,"
        + "\"title\":\"中航樾广场\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":269,\"status\":0,"
        + "\"title\":\"远洋国际中心\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":270,\"status\":0,"
        + "\"title\":\"弘阳爱上城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":271,\"status\":0,"
        + "\"title\":\"观山悦\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":272,\"status\":0,"
        + "\"title\":\"学府瑞苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":273,\"status\":0,"
        + "\"title\":\"明发江湾新城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":274,\"status\":0,"
        + "\"title\":\"鲁能公馆\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":275,\"status\":0,"
        + "\"title\":\"朗诗熙华府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":276,\"status\":0,"
        + "\"title\":\"京门府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":277,\"status\":0,"
        + "\"title\":\"斯亚首府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":278,\"status\":0,"
        + "\"title\":\"菲呢克斯国际公寓\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":279,\"status\":0,"
        + "\"title\":\"赞成领尚公寓\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":280,\"status\":0,"
        + "\"title\":\"雅居乐藏龙御景\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":281,\"status\":0,"
        + "\"title\":\"景枫凤凰台\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":282,\"status\":0,"
        + "\"title\":\"边城V时代广场\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":283,\"status\":0,"
        + "\"title\":\"中冶盛世滨江\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":284,\"status\":0,"
        + "\"title\":\"明发珠江国际\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":285,\"status\":0,"
        + "\"title\":\"泰达青筑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":286,\"status\":0,"
        + "\"title\":\"立德美林谷\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":287,\"status\":0,"
        + "\"title\":\"威尼斯水城十八街区\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":288,\"status\":0,"
        + "\"title\":\"荣盛锦绣观邸\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":289,\"status\":0,"
        + "\"title\":\"碧景山庄\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":290,\"status\":0,"
        + "\"title\":\"荣盛花语城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":291,\"status\":0,"
        + "\"title\":\"龙海骏景\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":292,\"status\":0,"
        + "\"title\":\"骋望怡峰\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":293,\"status\":0,"
        + "\"title\":\"紫晶未来城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":294,\"status\":0,"
        + "\"title\":\"冠城大通蓝郡\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":295,\"status\":0,"
        + "\"title\":\"香地美舍\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":296,\"status\":0,"
        + "\"title\":\"御珑湾\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":297,\"status\":0,"
        + "\"title\":\"荣鼎幸福城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":298,\"status\":0,"
        + "\"title\":\"石林中心城\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":299,\"status\":0,"
        + "\"title\":\"香缇郡\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":300,\"status\":0,"
        + "\"title\":\"东骏华府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":301,\"status\":0,"
        + "\"title\":\"华城名府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":302,\"status\":0,"
        + "\"title\":\"骋望七里楠花园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":303,\"status\":0,"
        + "\"title\":\"荣盛鹭岛荣府\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":305,\"status\":0,"
        + "\"title\":\"中宏万家广场\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":306,\"status\":0,"
        + "\"title\":\"奕淳绿园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":310,\"status\":0,"
        + "\"title\":\"福源名居\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":307,\"status\":0,"
        + "\"title\":\"红太阳国际财智广场\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":308,\"status\":0,"
        + "\"title\":\"高淳碧桂园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":314,\"status\":0,"
        + "\"title\":\"双富嘉园\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":315,\"status\":0,"
        + "\"title\":\"景湖名都\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":316,\"status\":0,"
        + "\"title\":\"湖滨一品苑\"},{\"developerTelephone\":\"\",\"filing\":\"\",\"id\":319,\"status\":0,"
        + "\"title\":\"苏宁雅居\"},{\"developerTelephone\":\"\",\"filing\":\"12\",\"id\":320,\"status\":0,"
        + "\"title\":\"高淳雅居乐花园\"}],\"time\":\"1462780561337\"}";
}