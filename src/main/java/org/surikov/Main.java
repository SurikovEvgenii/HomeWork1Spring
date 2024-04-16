package org.surikov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.surikov.time.GetDayName;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        GetDayName getDayNameEnglish = context.getBean("getDayNameEnglish", GetDayName.class);
        GetDayName getDayNameGerman = context.getBean("getDayNameGerman", GetDayName.class);
        GetDayName getDayNameItalian = context.getBean("getDayNameItalian", GetDayName.class);
        System.out.println("Today is:");
        System.out.println("ENGLISH: " + getDayNameEnglish.getTime());
        System.out.println("ITALIAN: " + getDayNameGerman.getTime());
        System.out.println("GERMAN: " + getDayNameItalian.getTime());
        context.close();
    }
}
