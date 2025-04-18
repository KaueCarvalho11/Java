package CurtoCircuito;

class Operador {
    public static void main(String[] args) {
        int d = 0, n = 10;

        if (d != 0 && (n % d) == 0) {
            System.out.println("Mensagem não exibida");
        }

        boolean a = true, b = false;

        if (a != false || b == true) {
            System.out.println("Mensagem exibida");
        }

        System.out.println("Programa encerrado");
    }
}