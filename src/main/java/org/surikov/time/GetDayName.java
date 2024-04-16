package org.surikov.time;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Component
public class GetDayName {


    LocalDate localDate;
    Locale locale;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getTime() {
        DayOfWeek day = localDate.getDayOfWeek();
        return day.getDisplayName(TextStyle.FULL, locale);
    }
}
