package variaveis;

class Example3 {
    public static void main(String[] args) {
        int inteiro = 10;
        double flutuante = 10.0;

        System.out.println("Inteiro = " + inteiro);
        System.out.println("Flutuante = " + flutuante);
        System.err.println();

        inteiro = inteiro / 4;
        flutuante = flutuante / 4;

        System.out.println("inteiro / 4 = " + inteiro);
        System.out.println("Flutuante / 4 = " + flutuante);
    }
}