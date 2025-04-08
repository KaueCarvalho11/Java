package conversao;

class GalToLitTable {
    public static void main(String[] args) {
        int galao =  1;
        double litros = 3.7854;
        int counter = 0;

        for(galao = 1; galao <= 100; galao++){
            System.out.println(galao + " galões tem " + galao*litros + " litros");

            counter++;
            if (counter == 10) {
                System.out.println("");
                counter = 0;
            }
        }
    }
}
