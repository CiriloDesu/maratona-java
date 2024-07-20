package introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //dado o valor de um carro, descobra em quantas vezes ele pode ser parcelado
        //condição valorParcela >= 1000

        int valorCarro = 30000;
        for (int parcela = 1; parcela <= 30000; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println("parcela" + parcela+ "R$" + valorParcela);
            } else {
                break;
            }
        }
    }
}
