package javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carregando de um arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões arquivos");
    }
}
