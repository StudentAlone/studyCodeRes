package com.laoyin.test.others;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Others {
    // ZonedDateTimeDemo
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj.minusDays(1));

//        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
//        System.out.println(zny);
    }
}
