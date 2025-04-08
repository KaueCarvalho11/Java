package IfCondicional;

class IfDemo {
    public static void main(String[] args) {
        int a = 2, b = 3, c;

        if (a < b) {
            System.out.println(a + " é menor que " + b);
        }

        if (a == b) {
            System.out.println("Essa mensagem não será exibida");
        }

        c = a - b;

        if (c >= 0) {
            System.out.println(c + "não é negativo");
        }

        if (c < 0) {
            System.out.println(c + " é negativo");
        }

        c = b - a;

        if (c >= 1) {
            System.out.println(c + " é positivo");
        }

        if (c < 1) {
            System.out.println(c + " é negativo");
        }
    }
}