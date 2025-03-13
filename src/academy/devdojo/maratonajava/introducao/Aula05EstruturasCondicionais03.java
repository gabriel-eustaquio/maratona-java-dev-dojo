package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000;
        double salary = 7000;
        String messageGive = "Eu vou doar 500 para o DevDojo";
        String messageDontGive = "Ainda não tenho condições, mas vou ter!";
        String result;
        String result02 = salary > 5000 ? messageGive : messageDontGive;

        if (salary > 5000) {
            result = messageGive;
        } else {
            result = messageDontGive;
        }

        System.out.println(result);
        System.out.println(result02);
    }
}
