import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        Exercicios exercicios = new Exercicios();

        System.out.println("Exercício 01\n" +
                "Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa");
//        exercicios.Exercicio1();

        System.out.println("Exercício 02\n" +
                "Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais.");
//        exercicios.Exercicio2();

        System.out.println("Exercício 03\n" +
                "Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");
//        exercicios.Exercicio3();

        System.out.println("Exercício 04\n" +
                "azer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por " +
                "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas " +
                "decimais.");
//        exercicios.Exercicio4();

        System.out.println("Exercício 05\n" +
                "Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o " +
                "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");
//        exercicios.Exercicio5();

        System.out.println("Exercício 06\n" +
                "Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: \n" +
                "a) a área do triângulo retângulo que tem A por base e C por altura. \n" +
                "b) a área do círculo de raio C. (pi = 3.14159) \n" +
                "c) a área do trapézio que tem A e B por bases e C por altura. \n" +
                "d) a área do quadrado que tem lado B. \n" +
                "e) a área do retângulo que tem lados A e B.");
        exercicios.Exercicio6();
    }

    public void Exercicio1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();

        int num = n1 + n2;

        System.out.println("SOMA = " + num);

        sc.close();
    }

    public void Exercicio2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo:");
        double raio = sc.nextInt();

        double area = 3.14159 * Math.pow(raio, 2);

        String areaFormatada = String.format("%.4f", area);

        System.out.println("A=" + areaFormatada);

        sc.close();
    }

    public void Exercicio3() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int B = sc.nextInt();
        System.out.println("Digite o valor de C:");
        int C = sc.nextInt();
        System.out.println("Digite o valor de D:");
        int D = sc.nextInt();

        int diferenca = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }

    public void Exercicio4() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário:");
        int numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor que recebe por hora:");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }

    public void Exercicio5() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código, número de peças e valor unitário da peça 1:");
        int codigoPeca1 = sc.nextInt();
        int numeroPecas1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        System.out.println("Digite o código, número de peças e valor unitário da peça 2:");
        int codigoPeca2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double valorTotal = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }

    public void Exercicio6() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double A = sc.nextDouble();

        System.out.println("Digite o valor de B:");
        double B = sc.nextDouble();

        System.out.println("Digite o valor de C:");
        double C = sc.nextDouble();

        double areaTriangulo = (A * C) / 2.0;

        double pi = 3.14159;
        double areaCirculo = pi * Math.pow(C, 2);

        double areaTrapezio = ((A + B) * C) / 2.0;

        double areaQuadrado = Math.pow(B, 2);

        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();
    }
}