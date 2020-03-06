package com.icoom.utils;

public class MathUtil {
    private static final Double Morey_Range = 0.01;
    //比较2个金额是否相等
    public static Boolean equals(Double d1,Double d2){
       Double result =  Math.abs(d1-d2);
       if (result < Morey_Range){
           return true;
       }
       return false;
    }
}
