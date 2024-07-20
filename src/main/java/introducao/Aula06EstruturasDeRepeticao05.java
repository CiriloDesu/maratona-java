package introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //dado o valor de um carro, descobra em quantas vezes ele pode ser parcelado
        //condição valorParcela >= 1000

        double valorCarro = 30000;
        for (int parcela = (int)valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela <1000){
                continue;
            }
            System.out.println("parcela"+ parcela +"parcela" +valorParcela);
        }
    }
}
