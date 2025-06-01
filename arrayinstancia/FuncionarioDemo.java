package arrayinstancia;

public class FuncionarioDemo {
    public static void main(String[]args){

    Funcionario equipe[] = new Funcionario[5];

    for(int i = 0; i < equipe.length; i++){
        System.out.print(equipe[i] + "\t");
    }
    System.out.print("\n");

    equipe[2] = new Funcionario("Kauê", 123, 20);

    for(int i = 0; i < equipe.length; i++){
        System.out.print(equipe[i] + "\t");
    }
 }
}
