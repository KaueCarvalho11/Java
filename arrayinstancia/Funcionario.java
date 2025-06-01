package arrayinstancia;

public class Funcionario{
    private String nome;
    private int codigo;
    private int idade;

    public Funcionario(String nome, int codigo, int idade){
        this.nome = nome;
        this.codigo = codigo;
        this.idade =  idade;
    }

    public String toString(){
        return " nome = " +  nome + " codigo = " + codigo + " idade = " + idade;
    }
}