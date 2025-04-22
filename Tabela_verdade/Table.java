package Tabela_verdade;

public class Table {
    public static void main(String[]args){
        boolean p = false, q = false;

        System.out.println("p \t q \t p & q \t p|q \t p ^ q \t !p");
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) );

        p = true; q = false;
        System.out.println( p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) );

        p = false; q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) );

        p = true; q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) );
    }
}
