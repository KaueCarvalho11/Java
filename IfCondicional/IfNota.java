package IfCondicional;

public class IfNota {
    public static void main(String[] args) {
        double nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
