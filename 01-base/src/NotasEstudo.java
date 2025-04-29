/*
    AULA PRÁTICA SOBRE VARIAVEIS
    - VARIAVEIS SÃO CONTAINERS DE DADOS
    - TIPOS PRIMITIVOS SÃO PROVIDOS PELA LINGUAGEM
*/
public class NotasEstudo {
    public static void main(String[] args) {
        variaveis();
        System.out.println("---");
        operadores();
        System.out.println("---");
    }

    public static void variaveis() {
        // CARACTERES OU CHARACTERS
        char primeiraLetraDoNome = 'A';
        char primeiraLetraASCII = 65;
        System.out.println("primeiraLetraDoNome = " + primeiraLetraDoNome);
        System.out.println("primeiraLetraASCII = " + primeiraLetraASCII);

        // INTEIROS OU INTEGERS
        byte nota = 10; // -128 a 127
        short itensComprados = 2; // -32768 a 32767
        int quantidadeEstoque = 23366; // -2_147_483_648 a 2_147_483_647
        long numeroMuitoGrande = 4543456456L; // 19 digitos

        // DECIMAIS OU DECIMALS
        float peso = 1.5f; // 6 - 7 casas decimais
        double salario = 3.700; // ~ 15 casas decimais

        // BOOLEANOS OU BOOLEANS
        boolean verdadeiro = true;
        boolean falso = false;
    }

    public static void operadores() {
        int n1 = 1;
        int n2 = 1;
        int soma = n1 + n2;
        System.out.println("A soma é " + soma);
        int n3 = 5;
        int n4 = 2;
        int sub = n3 - n4;
        System.out.println("A sub é " + sub);
        int mult = n3 * n4;
        System.out.println("A mult é " + mult);
        int n5 = 10;
        int div = n5 / n4;
        System.out.println("A div é " + div);
        int mod = n5 % n4;
        System.out.println("A mod é " + mod);
        int cont = 1;
        cont++;
        System.out.println("A cont é " + cont);
        cont--;
        System.out.println("A cont é " + cont);
    }
}
