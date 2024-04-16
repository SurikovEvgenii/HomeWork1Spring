package org.surikov;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.surikov.time.GetDayName;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetDayName getDayName = context.getBean("getTime", GetDayName.class);
        System.out.println("Today is:");
        System.out.println("ENGLISH: " + getDayName.getTime(LocalDate.now(), Locale.ENGLISH));
        System.out.println("ITALIAN: " + getDayName.getTime(LocalDate.now(), Locale.ITALIAN));
        System.out.println("GERMAN: " + getDayName.getTime(LocalDate.now(), Locale.GERMAN));
    }
}
