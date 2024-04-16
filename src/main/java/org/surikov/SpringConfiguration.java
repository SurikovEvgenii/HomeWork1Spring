package org.surikov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.surikov.time.GetDayName;
import java.time.LocalDate;
import java.util.Locale;

@Configuration
@ComponentScan("org.surikov")
public class SpringConfiguration {
    @Bean
    public GetDayName getDayNameEnglish(){
        GetDayName getDayName = new GetDayName();
        getDayName.setLocalDate(LocalDate.now());
        getDayName.setLocale(Locale.ENGLISH);
        return getDayName;
    }

    @Bean
    public GetDayName getDayNameGerman(){
        GetDayName getDayName = new GetDayName();
        getDayName.setLocalDate(LocalDate.now());
        getDayName.setLocale(Locale.GERMAN);
        return getDayName;
    }
    @Bean
    public GetDayName getDayNameItalian(){
        GetDayName getDayName = new GetDayName();
        getDayName.setLocalDate(LocalDate.now());
        getDayName.setLocale(Locale.ITALIAN);
        return getDayName;
    }
}
