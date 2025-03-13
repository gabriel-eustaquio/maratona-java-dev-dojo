package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] numbers2 = new int[]{2,3,4};

        /*
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        */

        // Foreach
        for (int num : numbers2) {
            System.out.println(num);
        }
        // A variavel local num é linkada as posições do Array 0, 1, 2 ... porém não exporta o index
        // int num = numbers2[0];
        // System.out.println(num);
        // int num = numbers2[1];
        // System.out.println(num);
    }
}
