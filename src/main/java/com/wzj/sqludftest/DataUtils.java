package com.wzj.sqludftest;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataUtils extends UDF{

    public static String evaluate(String sdate,String pattern){

        String formatDate = sdate;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            formatDate =sdf.format(sdf.parse(sdate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formatDate;
    }

}
