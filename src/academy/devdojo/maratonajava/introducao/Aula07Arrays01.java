package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] age = new int[3];
        System.out.println(age); // faz referencia a um objeto e por isso retorna um endereço
        System.out.println(age[0]); // valor padrão de int [] é 0
        age[0] = 21;
        age[1] = 15;
        age[2] = 30;
        System.out.println(age[1]);
        // System.out.println(idades[3]); // gera exceção em tempo de execução: Array index out of bounds (Array fora do limite)

    }
}
