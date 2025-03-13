package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // A condição valorParcela >= 1000;

        double valueCar = 30000;
        double valueInstallment;

        for (int i = 1; i < valueCar; i++) {
            valueInstallment = valueCar / i;
            if (valueInstallment < 1000) {
                break;
            }
            System.out.println("Parcela " + i + ", R$ " + valueInstallment);
        }

    }
}
