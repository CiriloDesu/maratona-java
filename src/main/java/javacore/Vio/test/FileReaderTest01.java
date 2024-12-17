package javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)){
//            System.out.println(fr.read());
//            char[] in = new char[30];
//            fr.read(in);
//            for (char c : in){
//                System.out.println(c);
            int i;
            while ((i= fr.read()) != -1){
                System.out.println((char)1);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
