package javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private String tipoRelatorio;
    private int valor;

    TipoCliente(int valor, String tipoRelatorio){
        this.valor = valor;
        this.tipoRelatorio = tipoRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getTipoRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;

    }
    public String getTipoRelatorio() {
        return tipoRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
