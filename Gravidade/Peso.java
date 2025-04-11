package Gravidade;

class peso {
    public static void main(String[] args) {
        double Massa = 75.200;
        double GravidadeTerra = 9.8;
        double GravidadeLua = (GravidadeTerra / 100) * 17;

        System.out.println("Minha massa: " + Massa + "kg");
        System.out.println("Meu peso na terra: " + Massa * GravidadeTerra + "N");
        System.out.println("Meu peso na lua: " + Massa * GravidadeLua + "N");
    }
}
