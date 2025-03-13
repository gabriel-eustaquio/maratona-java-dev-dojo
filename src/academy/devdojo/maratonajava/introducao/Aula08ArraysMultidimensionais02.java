package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][]; // Valor padrão de uma variavel de referencia é nulo

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num); // NullPointerException : um Array de tres posições que não tem absolutamente nada
            }
        }

        // Inicialização
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        // Inicialização já atribuindo valor
        int[] array = {1, 2};
        arrayInt[0] = array;
        arrayInt[2] = new int[]{33, 34, 37, 29, 23, 20};

        // Inicialização de uma forma diferente:
        int[][] arrayInt2 = {{11, 2}, {4, 5, 2}, {3, 1}};

    }
}
