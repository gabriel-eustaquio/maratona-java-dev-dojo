package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        new Estudante(); // Eu não conseguiria acessar esse objeto pois não tem uma variavel de referencia
        // Por isso eu crio com variavel de referencia
        Estudante estudante = new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        // Quando tenho uma variavel do tipo referencia recebem valores padrões caso nao seja inicializado
    }
}
