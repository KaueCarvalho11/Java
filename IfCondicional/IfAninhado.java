package IfCondicional;

public class IfAninhado {
    public static void main(String[] args) {
        int idade = 17;
        boolean carteira = false;

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
            if (carteira) {
                System.out.println("Você pode dirigir");
            }else{
                System.out.println("Mas, você não pode dirigir, tire sua carteira");
            }
        } else{
            System.out.println("Você é menor de idade, portanto, não pode dirigir");
        }
    }
}
