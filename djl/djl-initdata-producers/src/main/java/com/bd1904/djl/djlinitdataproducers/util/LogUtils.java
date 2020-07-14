package com.bd1904.djl.djlinitdataproducers.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author sulitao
 * @create 2019-11-07  14:18
 */
public class LogUtils {

    //上限
    private static final int MAX_SIZE = 1000;
    /**
     * 返回日志的
     * 上限 返回1000条日志
     * @return
     */
    public static List<String> getLogs(){
        ArrayList<String>  list = new ArrayList<>(1000);
        String[] liulanqi = {"360se","360极速","360极速","360极速","360极速","360极速","360极速","360极速","360极速","360极速","谷歌","谷歌","谷歌","谷歌","猎豹","qq","IE","火狐","猎豹"};
        String[] xt = {"win10","win7","win10","win7","win10","win7","win10","win7","win10","win7","win10","win10","win10","win10","win10","win10","win10","win10","win10","win10","win10","win7","win10","win7","win8","winxp","win8","mac"};
        String[] city={"北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","北京市","天津市","上海市","重庆市","河北省","山西省","辽宁省","吉林省","黑龙江省","江苏省","江苏省","江苏省","江苏省","江苏省","江苏省","江苏省",
                "浙江省","安徽省","福建省","江西省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","河南省","湖北省","湖南省","广东省","海南省",
                "四川省","贵州省","云南省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","山东省","陕西省","甘肃省","青海省","台湾省","内蒙古自治区","广西壮族自治区","西藏自治区","宁夏回族自治区"
                ,"新疆维吾尔自治区","香港特别行政区","澳门特别行政区"};
        //来源页面
        String[] urlr =
                {"https://www.zhihu.com/question/28428426?sort=created",
                        "http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com","http://www.baidu.com",
                        " http://www.google.cn",
                        " http://image.baidu.com",
                        "http://search.cn.yahoo.com",
                        "http://gh.duowan.com","http://gh.duowan.com","http://gh.duowan.com","http://gh.duowan.com","http://gh.duowan.com",
                        "http://www.66net.net",
                        "http://www.brcn.net",
                        " http://www.daqi.com"," http://www.daqi.com"," http://www.daqi.com"," http://www.daqi.com"," http://www.daqi.com"," http://www.daqi.com",
                        "http://iask.com",
                        "http://www.netservers.cn",
                        "http://so.mop.com","http://so.mop.com","http://so.mop.com","http://so.mop.com","http://so.mop.com",
                        " http://www.douzhao.com",
                        " http://search.tom.com",
                        " 其他方式"};
        //当前页面
        String[] url =
                {"http://www.tiantiandy.net/wind/dispbbs.asp",
                        "http://www.tiantiandy.net/wind/index.asp",
                        "http://www.tiantiandy.net/wind/savepost.asp",
                        "http://www.tiantiandy.net/wind/login.asp",
                        "http://www.tiantiandy.net/wind/post.asp",
                        "http://www.tiantiandy.net/wind/nn_petcenter.asp",
                        "http://www.tiantiandy.net/wind/nn_petrisk.asp",
                        "http://www.tiantiandy.net/wind/nn_petpknpc_nr.asp",
                        "http://www.tiantiandy.net/wind/nn_petcenter.asp",
                        "http://www.tiantiandy.net/wind/nn_petrisk.asp",
                        "http://www.tiantiandy.net/wind/nn_petpknpc_nr.asp",
                        "http://www.tiantiandy.net/wind/nn_petcenter.asp",
                        "http://www.tiantiandy.net/wind/nn_petrisk.asp",
                        "http://www.tiantiandy.net/wind/nn_petpknpc_nr.asp",
                        "http://www.tiantiandy.net/wind/nn_petcenter.asp",
                        "http://www.tiantiandy.net/wind/nn_petrisk.asp",
                        "http://www.tiantiandy.net/wind/nn_petpknpc_nr.asp",
                        "http://www.tiantiandy.net/wind/nn_petcenter.asp",
                        "http://www.tiantiandy.net/wind/nn_petrisk.asp",
                        "http://www.tiantiandy.net/wind/nn_petpknpc_nr.asp",
                        "http://www.tiantiandy.net/wind/reg.asp",
                        "http://www.tiantiandy.net/wind/nn_petmypet.asp",
                        "http://www.tiantiandy.net/wind/nn_petitemmarket.asp",
                        "http://www.tiantiandy.net/wind/nn_pettopall.asp",
                        "http://www.tiantiandy.net/wind/nn_petitemmarket.asp",
                        "http://www.tiantiandy.net/wind/nn_pettopall.asp",
                        "http://www.tiantiandy.net/wind/nn_petitemmarket.asp",
                        "http://www.tiantiandy.net/wind/nn_pettopall.asp",
                        "http://www.tiantiandy.net/wind/nn_petitemmarket.asp",
                        "http://www.tiantiandy.net/wind/nn_pettopall.asp",
                        "http://www.tiantiandy.net/wind/nn_petitemmarket.asp",
                        "http://www.tiantiandy.net/wind/nn_pettopall.asp",
                        "http://www.tiantiandy.net/wind/nn_petitemmarket.asp",
                        "http://www.tiantiandy.net/wind/nn_pettopall.asp",
                        "http://www.tiantiandy.net/wind/nn_petitemmarket.asp",
                        "http://www.tiantiandy.net/wind/nn_pettopall.asp",
                        "http://www.tiantiandy.net/wind/nn_petitemmarket.asp",
                        "http://www.tiantiandy.net/wind/nn_pettopall.asp",
                        "http://www.tiantiandy.net/wind/fileshow.asp",
                        "http://www.tiantiandy.net/wind/nn_petmonpk.asp",
                        "http://www.tiantiandy.net/wind//passport.asp"};
        //分辨率
        String[] fbl = {"1280*800","1280*800","1366*768","1366*768","1920*1080","1920*1080","1920*1080","1920*1080","1920*1080","1440*900","1680*1050","1680*1050","1680*1050","2048*1536"};
        //停留时间
        int[] times = {1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,23,8,15,60,45,33,21,15,32,14,17,65,73,45,87,44,85,33,13,17,8,6,33,13,17,8,6,32,14,17,65,73,45,87,44,85,33,13,17,8,6,32,14,17,65,73,45,87,44,85,33,13,17,8,6};

        //时间直接随机
//		String[] ips={}
//
        Random rd= new Random();
        //ip地址生成
        String[] ips = IpUtils.getIps(MAX_SIZE/10);

        for (int i = 0; i < MAX_SIZE; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(liulanqi[rd.nextInt(liulanqi.length)]);
            sb.append("-");
            sb.append(xt[rd.nextInt(xt.length)]);
            sb.append("-");
            sb.append(city[rd.nextInt(city.length)]);
            sb.append("-");
            sb.append(urlr[rd.nextInt(urlr.length)]);
            sb.append("-");
            sb.append(url[rd.nextInt(url.length)]);
            sb.append("-");
            sb.append(fbl[rd.nextInt(fbl.length)]);
            sb.append("-");
            sb.append(times[rd.nextInt(times.length)]);
            sb.append("-");
            sb.append(ips[i]);
            sb.append("-");
            //访问日期随机
            sb.append(DateUtils.randomDate());
            sb.append("\r\n");
            list.add(sb.toString());//将日志存放在list集合中
        }
        return list;
    }
}
