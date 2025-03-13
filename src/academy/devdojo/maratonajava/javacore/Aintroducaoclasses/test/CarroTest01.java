package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Hb20";
        carro1.ano = 2022;
        carro1.modelo = "Hatch";

        Carro carro2 = new Carro();
        carro2.nome = "Yaris";
        carro2.ano = 2025;
        carro2.modelo = "Hatch";

        System.out.println("Primeiro carro: " + carro1.nome + " " + carro1.ano + " " + carro1.modelo);
        System.out.println("Segundo carro: " + carro2.nome + " " + carro2.ano + " " + carro2.modelo);
    }
}
