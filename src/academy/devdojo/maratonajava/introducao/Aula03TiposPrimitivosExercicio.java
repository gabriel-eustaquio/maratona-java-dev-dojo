package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Gabriel";
        String address = "Rua baleares 75, casa";
        double salary = 20000.53D;
        String dateReceiveSalary = "29/01/2025";
        String message = "Eu " + name + ", morando no endereço " + address + ",";
        String messageContinuation = "confirmo que recebi o salário de " + salary + ", na data " + dateReceiveSalary;

        System.out.println("Eu " + name + ", morando no endereço " + address + ",");
        System.out.println("confirmo que recebi o salário de " + salary + ", na data " + dateReceiveSalary);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(message + messageContinuation);
    }
}
