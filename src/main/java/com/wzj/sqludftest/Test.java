package com.wzj.sqludftest;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {
    public static void main(String[] args) {

        DataUtils du = new DataUtils();
        String a = "2015-2-3";
        String b = "yyyy-MM-dd";



        String evaluate = du.evaluate(a, b);
        System.out.println(evaluate);
    }
}
