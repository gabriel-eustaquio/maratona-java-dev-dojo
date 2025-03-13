package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte day = 3;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Não é dia útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
