package variaveis;

class Example2 {
    public static void main(String[] args) {
        int var1;
        int var2;

        var1 = 1024;
        var2 = var1 / 2;

        System.out.println("var1 = " + var1);
        System.out.print("var2 = var1 / 2 = ");
        System.out.print(var2);
    }
}

class InnerExample2 {
    public static void main(String[] args) {
        int var3 = 10;
        int var4 = 20;
        System.out.println("var3 e var4: " + var3 + " e " + var4);
    }
}