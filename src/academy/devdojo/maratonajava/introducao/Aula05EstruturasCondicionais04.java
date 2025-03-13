package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {

    public static void main(String[] args) {
        double salary = 70000.0D;
        double tax;
        double taxFirst = 9.70D / 100.0D;
        double taxSecond = 37.35D / 100.0D;
        double taxThird = 49.50D / 100.0D;

        if (salary <= 34712) {
            tax = salary * taxFirst;
        } else if (salary >= 34713 && salary <= 68507) {
            tax = salary * taxSecond;
        } else {
            tax = salary * taxThird;
        }

        System.out.println(tax);

    }

}
