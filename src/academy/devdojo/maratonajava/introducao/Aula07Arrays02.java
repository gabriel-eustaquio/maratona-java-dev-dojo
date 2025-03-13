package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        char [] characters = new char [2];
        System.out.println(characters[1]);

        float [] salarys = new float [3];
        salarys[0] = 3.5F;
        System.out.println(salarys[1]);

        String [] names = new String [3];
        names[0] = "Gabriel";
        names[1] = "Kaua";
        names[2] = "Pato";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        names = new String[3]; // Após fazer isso, o Array de objetos perde a referencia em cima
        // Passou a ter valor padrão como null pois é um Array de String;
        // Posso recuperar a referencia ? Não posso, é limpado pelo proprio Java pelo Garbage Collector
        System.out.println(names[0]);



    }
}
