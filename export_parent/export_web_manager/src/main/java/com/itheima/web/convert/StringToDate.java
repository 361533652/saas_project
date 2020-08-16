package com.itheima.web.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Create by Tong Day on 2020/8/16
 */
@Component
public class StringToDate implements Converter<String, Date> {
    /**
     * 支持的日期转换格式（可添加）
     */
    private static String[] dateFormats = {
            "yyyy-MM-dd",
            "yyyy/MM/dd",
            "yyyy年MM月dd日",
            "yyyy MM dd",
            "yyyyMMdd"
    };

    @Override
    public Date convert(String s) {
        if (!StringUtils.isEmpty(s)) {
            for (String dateFormat : dateFormats) {
                try {
                    //模拟其他代码块
                    //int a = 5 / 0;
                    return new SimpleDateFormat(dateFormat).parse(s);
                } catch (ParseException ignored) {
                    //忽略解析错误异常
                } catch (Exception e) {
                    //抓其他异常
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
