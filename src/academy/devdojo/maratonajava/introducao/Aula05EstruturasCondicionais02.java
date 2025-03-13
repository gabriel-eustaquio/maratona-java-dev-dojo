package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 categoria infatil
        // age >= 15 && age < 18 categoria juvenil
        // age >= 18 categoria adulto

        byte age = 45;
        String category;

        if(age < 15) {
            category = "Categoria infantil";
        } else if (age >= 15 && age < 18) {
            category = "Categoria juvenil";
        } else { // age >= 18 (o compilador entende)
            category = "Categoria adulto";
        }

        System.out.println(category);
    }
}
