package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        double resultDivision = (double) n1 / n2;

        System.out.println(n2 - n1);
        System.out.println("Valor " + n2 + n1);
        System.out.println(n2 + n1 + "Valor " + n2 + n1);
        System.out.println(result);
        System.out.println(resultDivision);


        // Operadores relacionais
        // %, >, <, >=, <=, ==, !=
        int rest = 21 % 2;
        System.out.println(rest);

        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println("Dez é maior que 20 ? " + isTenGreaterThanTwenty);

        // Operadores logicos
        // && (AND) || (OR) ! (NOT)
        byte age = 35;
        float salary = 3500F;
        boolean isInsideLaw = age >= 30 && salary >= 4612F;
        System.out.println("Está dentro da lei ? " + isInsideLaw);

        double totalValueCurrentAccount = 200D;
        double totalValueSavingsAccount = 10000D;
        float valuePlaystationFive = 5000F;
        boolean isPlaystationFivePurchasable = totalValueCurrentAccount > valuePlaystationFive || totalValueSavingsAccount > valuePlaystationFive;
        System.out.println("Playstation 5 é compravel ? " + isPlaystationFivePurchasable);

        // Operadores de atribuição
        // = += -= *= /= %=
        double bonus = 1800D; // 1800
        bonus += 1000D; // 2800
        bonus -= 1000D; // 1800
        System.out.println(bonus);

        // Operadores unarios
        // ++ --
        int count = 0;
        count += 1; // count = count + 1;
        count++;
        count--;
        // existe diferença entre usar count++ e ++count;
        System.out.println(count);

        int aux = 0;
        System.out.println("++ Unario antes (aux): " + ++aux); // primeiro incremente e depois execute o que tiver que executar // imprime: 1
        System.out.println("Unario depois (aux) ++: " + aux++); // primeiro execute e depois incremente // imprime: 0
        System.out.println("Resultado do unario depois (aux): " + aux);
    }
}
