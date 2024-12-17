package javacore.Uregex.test;

import java.util.Scanner;

public class ScanTest02 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",\\s*"); // Handle spaces after commas

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int: " + i);
            } else {
                System.out.println("String: " + scanner.next());
            }
        }

    }
}
