package javacore.Minterfaces.dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission() {
        System.out.println("Fazendo checkagem de permissões");
    }

    public static void retrieeMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}
