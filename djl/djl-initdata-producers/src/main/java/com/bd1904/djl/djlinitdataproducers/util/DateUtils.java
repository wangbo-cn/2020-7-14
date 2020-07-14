package com.bd1904.djl.djlinitdataproducers.util;

import java.util.Random;

public class DateUtils {
	

public static String randomDate(){
        Random rd=new Random();
        int year=2018;  //生成[2000,2017]的整数；年
        
        int month=rd.nextInt(5)+8;   //生成[8,12]的整数；月
        
        int Day=rd.nextInt(30)+1;       //生成[1,30)的整数；日
        int a =rd.nextInt(20);
        int hour=0;
        //一下代码用于控制各个时间段生成的概率
        if (a==1) {
        	hour=rd.nextInt(7);
		}else if (a==2) {
			hour=rd.nextInt(3)+7;
		}else if (a==3) {
			hour=rd.nextInt(3)+7;
		}else if (a==4) {
			hour=rd.nextInt(3)+11;
		}else if (a==5) {
			hour=rd.nextInt(3)+11;
		}else if (a==6) {
			hour=rd.nextInt(4)+14;
		}else if (a==7) {
			hour=rd.nextInt(4)+14;
		}else if (a==8) {
			hour=rd.nextInt(4)+14;
		}else if (a==9) {
			hour=rd.nextInt(4)+14;
		}else{
			hour=rd.nextInt(7)+18;
			
		}
              //生成[0,23)的整数；小时
       
        int minute=rd.nextInt(60);   //生成分钟
        
        int second=rd.nextInt(60);   //秒
      return year+" "+month+" "+Day+"  "+hour+":"+minute+":"+second;
    } 
	
	public static void main(String[] args) {
		
		System.out.println(randomDate());
	}
}

