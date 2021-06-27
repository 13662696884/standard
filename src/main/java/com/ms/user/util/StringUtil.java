package com.ms.user.util;

/**
 * @author Marvin
 * @Description: data util
 * @date 2021/6/25
 */
public class StringUtil {

    public static String getRandomNumber(){
        int random = ((int)((Math.random()*9+1)*100000));
        return String.valueOf(random);
    }
}
