package conversao;

class GalToLit {
    public static void main(String[] args){
        int galoes = 10;
        double litros = 3.7854;
        double total_litros = galoes * litros;

        System.out.println("Quantidade de galões: " + galoes);
        System.out.println("Quantidade de litros por galão: " + litros + "l");
        System.out.println(galoes + " galões são " + total_litros + " litros");
    }
}