package com.icoom.utils;

import java.util.Random;

public class KeyUtil {
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number  = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }

//    public static void main(String[] args){
//        System.out.println(getUniqueKey());
//    }
}
