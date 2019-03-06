package com.alex;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class Thirdparty {
    public static void main(String[] args) {
        String name="john mugo";

        System.out.println(StringUtils.isBlank(name));
        System.out.println(StringUtils.capitalize(name));
        System.out.println(StringUtils.difference("kenya","kenya"));
        System.out.println(StringUtils.swapCase(name));
        System.out.println(StringUtils.abbreviate(name,4));

        System.out.println(RandomStringUtils.random(5));

        System.out.println(RandomStringUtils.randomAlphabetic(5));
    }
}
