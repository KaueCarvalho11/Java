package Booleano;

public class Boo {
    public static void main(String[] args) {
        boolean a = false;

        System.out.println("a é " + a);

        a = true;

        System.out.println("a é " + a);

        if (a) {
            System.out.println("Mensagem exibida");
        }

        a = false;

        if (a) {
            System.out.println("Mensagem não exibida");
        }

       System.out.println("10 > 9 é " + (10 > 9));
    }
}
