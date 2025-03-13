package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        byte age = 15;
        boolean isAuthorizedCnh = age >= 18;
        if (isAuthorizedCnh) {
            System.out.println("Autorizado para tirar a CNH");
        } else {
            System.out.println("Não autorizado tirar CNH");
        }

        // Opção utilizando ! sem o else
        // Diferença do else para o if com !: é que o if sempre irá verificar
        if(!isAuthorizedCnh) { // ele inverte o valor do booleano
            System.out.println("Não autorizado tirar CNH");
        }

    }
}
