package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor. Por exemplo 50

        byte valueMax = 50;
        byte valueClosed = 25;
        for (byte i = 0; i <= valueMax; i++) {
            System.out.println(i);
            if (i == valueClosed) break;
        }


    }
}
