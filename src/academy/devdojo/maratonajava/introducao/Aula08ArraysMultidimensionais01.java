package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 Meses
        // 31, 28, 31, 30 dias
        // Quero linkar os dois Arrays

        int[][] daysOfMonth = new int[12][1];
        daysOfMonth[0][0] = 31;
        daysOfMonth[1][0] = 28;
        daysOfMonth[2][0] = 31;
        daysOfMonth[3][0] = 30;
        daysOfMonth[4][0] = 31;
        daysOfMonth[5][0] = 30;
        daysOfMonth[6][0] = 31;
        daysOfMonth[7][0] = 31;
        daysOfMonth[8][0] = 30;
        daysOfMonth[9][0] = 31;
        daysOfMonth[10][0] = 30;
        daysOfMonth[11][0] = 31;

        for (int i = 0; i < daysOfMonth.length; i++) {
            for (int j = 0; j < daysOfMonth[i].length; j++) {
                System.out.println(daysOfMonth[i][j]);
            }
        }

        // Foreach
        for (int[] arrBase : daysOfMonth) { // No diagrama é um Array de 12 posições armazenando endereço por isso uso []
            for (int num : arrBase) { // Aqui armazena os valores int
                System.out.println(num);
            }
        }
        // Reassistir aula caso tenha dúvida

    }
}
