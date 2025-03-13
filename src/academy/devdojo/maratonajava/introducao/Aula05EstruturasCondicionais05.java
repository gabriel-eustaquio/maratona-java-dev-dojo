package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte day = 5;
        /*
        if (day == 1) {
            System.out.println("Domingo");
        } else if (day == 2) {
            System.out.println("Segunda");
        } else if (day == 3) {
            System.out.println("Terça-feira");
        } else if (day == 4) {
            System.out.println("Quarta-feira");
        } else if (day == 5) {
            System.out.println("Quinta-feira");
        } else if (day == 6) {
            System.out.println("Sexta-feira");
        } else if (day == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Dia invalido");
        }
        */

        // Switch de forma mais simples
        // char, int, byte, short, enum, String
        switch (day) {
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }

        char gender = 'm';

        switch (gender) {
            case 'm': {
                System.out.println("Masculino");
                break;
            }
            case 'f': {
                System.out.println("Feminino");
                break;
            }
            default:
                System.out.println("Genero não reconhecido");
                break;
        }
    }
}
