package com.hyr.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author h'y'r
 * #Description CommonUtil
 * #Date: 2022/10/6 20:50
 */
public class CommonUtil {
    public static String createDate(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(new Date());
    }
}
