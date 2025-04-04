package iniciando;

/*
Nome da classe principal deve coincidir com o nome do arquivo que contém o programa
Importante para que nome do arquivo fonte coincida com o nome do arquivo.class
*/
class Example { 
    //Todo código deve residir dentro de classes 
    
    /* 
    Programa Java começa com uma chamada a main
    Linha na qual o programa começará a ser executado
    */
    public static void main(String[] args) {
        System.out.println("Hello, World"); 
    }
}

/*
Compilador: Javac

Comando para compilar: javac package/nome-arquivo.java

Compilação irá gerar versão em bytecode do programa: classe.class
 */

/*
Interpretador: Java

comando para executar: java package.classe

Dessa forma, especificando o nome da classe que deseja que o interpretador execute
*/

class Segundo {
    public static void main(String[] args) {
        System.out.println("Olá, mundo"); 
    }
}