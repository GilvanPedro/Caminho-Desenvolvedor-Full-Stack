package br.com.Mundo_01.Boss_Fight;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] historico = new String[0];

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                System.out.print("Digite o primeiro número: ");
                double numero1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double numero2 = scanner.nextDouble();

                double resultado = 0;
                String conta = "";

                switch (opcao) {

                    case 1:
                        resultado = numero1 + numero2;
                        conta = numero1 + " + " + numero2 + " = " + resultado;
                        break;

                    case 2:
                        resultado = numero1 - numero2;
                        conta = numero1 + " - " + numero2 + " = " + resultado;
                        break;

                    case 3:
                        resultado = numero1 * numero2;
                        conta = numero1 + " * " + numero2 + " = " + resultado;
                        break;

                    case 4:

                        if (numero2 == 0) {
                            System.out.println("Não é possível dividir por zero.");
                            continue;
                        }

                        resultado = numero1 / numero2;
                        conta = numero1 + " / " + numero2 + " = " + resultado;
                        break;
                }

                System.out.println("Resultado: " + resultado);

                // Cria um novo array com uma posição a mais
                String[] novoHistorico = new String[historico.length + 1];

                // Copia o histórico antigo para o novo array
                for (int i = 0; i < historico.length; i++) {
                    novoHistorico[i] = historico[i];
                }

                // Adiciona a nova conta na última posição
                novoHistorico[historico.length] = conta;

                // Substitui o array antigo pelo novo
                historico = novoHistorico;

            } else if (opcao != 5) {

                System.out.println("Opção inválida.");
            }
        }

        // Exibe todo o histórico
        System.out.println("\n=== HISTÓRICO COMPLETO ===");

        if (historico.length == 0) {

            System.out.println("Nenhuma conta foi realizada.");

        } else {

            for (int i = 0; i < historico.length; i++) {

                System.out.println((i + 1) + " - " + historico[i]);
            }
        }

        System.out.println("\nPrograma encerrado.");
    }
}