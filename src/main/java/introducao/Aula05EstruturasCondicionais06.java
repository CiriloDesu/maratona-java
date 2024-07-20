package introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Usando switch: dado osvalores 1 a 7, imprima se é dia últi ou final de semana
        //considerando 1 como domingo
        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("útil");
                break;
            default:
                System.out.println("inválida");
        }

    }
}
