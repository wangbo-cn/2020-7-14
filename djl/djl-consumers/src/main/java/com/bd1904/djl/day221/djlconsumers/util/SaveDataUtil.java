package com.bd1904.djl.day221.djlconsumers.util;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

public class SaveDataUtil {
    private static  PrintWriter printWriter = null;

    private  static File file = null;
    private static String getDate(){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(calendar.get(Calendar.YEAR)).append("-").
                append(calendar.get(Calendar.MONTH) + 1).append("-").
                append(calendar.get(Calendar.DAY_OF_MONTH));
        return stringBuffer.toString();
    }
    private static String getDateName(){

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("e;/aaa").append(getDate()).append(".log");
        return stringBuffer.toString() ;
    }
    static {
        try {
            file=new File(getDateName());
            printWriter =  new PrintWriter(new FileWriter(getDateName()));
            System.out.println(getDateName());
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
    public static void saveLog(String message)throws Exception{

        if(!file.getName().contains(getDate())){
            file = new File(getDateName());
            printWriter = new PrintWriter( new FileWriter( file));
        }
        printWriter.print(message);
        printWriter.flush();

    }
}
