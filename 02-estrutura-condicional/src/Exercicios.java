import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicios exercicios = new Exercicios();

        System.out.println("Exercício 01\n" +
                "Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");
        exercicios.Exercicio1(sc);
        System.out.println("\n\n");

        System.out.println("Exercício 02\n" +
                "Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.");
        exercicios.Exercicio2(sc);
        System.out.println("\n\n");

        System.out.println("""
                        Exercício 03
                        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. 
                        Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
                        """);
        exercicios.Exercicio3(sc);
        System.out.println("\n\n");

        System.out.println("""
                        Exercício 04
                        Leia a hora inicial e a hora final de um jogo. 
                        A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
                        """);
        exercicios.Exercicio4(sc);
        System.out.println("\n\n");

        System.out.println("Exercício 05\n" +
                "Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.");
        exercicios.Exercicio5(sc);
        System.out.println("\n\n");

        System.out.println("""
                        Exercício 06
                        Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
                        Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
                        """);
        exercicios.Exercicio6(sc);
        System.out.println("\n\n");

        System.out.println("""
                        Exercício 07
                        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
                        A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
                        Se o ponto estiver na origem, escreva a mensagem “Origem”.
                        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
                        """);
        exercicios.Exercicio7(sc);
        System.out.println("\n\n");

        System.out.println("""
                        Exercício 08
                        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. 
                        A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
                        Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
                        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. 
                        No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
                        """);
        exercicios.Exercicio8(sc);

        sc.close();
    }

    public void Exercicio1(Scanner sc) {
        System.out.println("Digite o número:");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }

    public void Exercicio2(Scanner sc) {
        System.out.println("Digite o número:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }

    public void Exercicio3(Scanner sc) {
        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }
    }

    public void Exercicio4(Scanner sc) {
        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaFinal >= horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        // Verificando se a duração é mínima de 1 hora e máxima de 24 horas
        if (duracao == 0) {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }

    public void Exercicio5(Scanner sc) {
        System.out.print("Digite o código:");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade:");
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);
    }

    public void Exercicio6(Scanner sc) {
        System.out.println("Digite um valor:");
        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }
    }

    public void Exercicio7(Scanner sc) {
        System.out.println("Digite o primeiro número:");
        double x = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }

    public void Exercicio8(Scanner sc) {
        System.out.println("Digite o salario:");
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
