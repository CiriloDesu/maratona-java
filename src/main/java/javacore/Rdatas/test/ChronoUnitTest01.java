package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
    }
}
