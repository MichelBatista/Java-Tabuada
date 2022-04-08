package com.company;

import java.util.Scanner;

/*
        Para criar uma calculadora voce vai precisar receber tres informaçoes pelo console sao os dois numeros que pariticparao
        da operaçao e também a operaçao que sera realizada
        voce vai receber o primeiro numero depois vai receber qual é a operação e por ultimo o segundo numero

        para os numeros que voce vai receber pelo console poder utilizar a mesma funcionalidade uqe
        ja utilizamos aqui no curso - o *Scanner* para receberp a operaçao voce poder receber tamém um numero que vai indicar a mesma por exemplo
        o numero 1 sera a diçao o 2 subtraçao o 3 multiplocaçao e o 4 divisao

        com esse tres vlaores - os dois numeros e qual sera a operaçao - voce pode utilziar uma esturtura de descição para só realizar a operaçao que o usuario escolheu
*/
public class Exercicio01 {
    public static void main(String[] args) {
        byte repetirPrograma = 1;
        while (repetirPrograma != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("=================================================");
            System.out.print("Informe o primeiro numero: ");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("Qual operação deseja?\n(-) - Menos\n(+) - Mais\n(*) - Multiplcaçao\n(/) - Divisao: ");
            char operaçaoEscolhida = scanner.next().charAt(0);
            boolean operaçaoValida = operaçaoEscolhida == '-' || operaçaoEscolhida == '+' || operaçaoEscolhida == '*' || operaçaoEscolhida == '/';
            if (!operaçaoValida) {
                limparTela();
                System.out.println("Digite uma operaçao valida: \n");
            } else {
                System.out.print("Informe o segundo numero: ");
                double segundoNumero = scanner.nextDouble();
                System.out.println("=================================================");
                boolean operaçaoEscolhidaForAdiçao = operaçaoEscolhida == '+';
                boolean operaçaoEscolhidaForSubtração = operaçaoEscolhida == '-';
                boolean operaçaoEscolhidaForMultiplicação = operaçaoEscolhida == '*';
                if (operaçaoEscolhidaForAdiçao) {
                    adicao(primeiroNumero, segundoNumero);
                } else if (operaçaoEscolhidaForSubtração) {
                    subtraçao(primeiroNumero, segundoNumero);
                } else if (operaçaoEscolhidaForMultiplicação) {
                    multiplicaçao(primeiroNumero, segundoNumero);
                } else {
                    divisao(primeiroNumero, segundoNumero);
                }
                System.out.print("\nDeseja continuar? [1] - Sim Ou [0] - Não: ");
                repetirPrograma = scanner.nextByte();
                if (repetirPrograma == 1) {
                    limparTela();
                }
            }
            scanner.close();
        }
    }

    static void adicao(double x, double y) {
        System.out.println("(+) Adição =  " + x + " + " + y + " = " + (x + y));
    }

    static void subtraçao(double x, double y) {
        System.out.println("(-) Subtração =  " + x + " - " + y + " = " + (x - y));
    }

    static void multiplicaçao(double x, double y) {
        System.out.println("(*) Multiplicação =  " + x + " * " + y + " = " + (x * y));
    }

    static void divisao(double x, double y) {
        System.out.println("(/) Divisão =  " + x + " / " + y + " = " + (x / y));
    }

    static void limparTela() {
        for (int i = 0; i < 100; ++i)
            System.out.println();
    }
}