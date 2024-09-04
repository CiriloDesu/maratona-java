package javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ddentro do array ");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Indexoutbouds");
        } catch (IllegalArgumentException e){
            System.out.println("IlligalArg");
        } catch (ArithmeticException e){
            System.out.println("Arithmetic");
        }catch (RuntimeException e) {
            System.out.println("excessão genérica");
        }

        try {
            talvezLanceException();
        } catch (SQLException | IOException e){

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}