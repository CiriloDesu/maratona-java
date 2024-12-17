package javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "it");
        Locale localeSwiss = new Locale("it", "ch");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwiss);
        System.out.println("Italia "+ df1.format(calendar.getTime()));
        System.out.println("Suíça "+ df2.format(calendar.getTime()));
    }
}
