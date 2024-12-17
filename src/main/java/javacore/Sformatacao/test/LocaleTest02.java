package javacore.Sformatacao.test;

import javacore.Gassociacao.dominio.Local;

import java.util.Locale;

import static java.util.Locale.getISOCountries;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountrie = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage+ " ");
        }
        System.out.println();
        for (String s : isoCountrie) {
            System.out.println(s+ " ");
        }

    }
}
