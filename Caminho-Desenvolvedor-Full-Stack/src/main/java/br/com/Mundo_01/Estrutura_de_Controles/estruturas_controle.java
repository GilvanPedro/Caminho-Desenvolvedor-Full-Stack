package br.com.Mundo_01.Estrutura_de_Controles;

public class estruturas_controle {

    public static void main(String[] args) {
        
        // 1. IF / ELSE
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        // 2. IF / ELSE IF / ELSE
        double nota = 7.5;

        if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
        
        // 3. IF COM OPERADORES LÓGICOS
        int idadeUsuario = 20;
        boolean possuiCarteira = true;

        if (idadeUsuario >= 18 && possuiCarteira) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }
        
        // 4. SWITCH TRADICIONAL
        int opcao = 2;

        switch (opcao) {

            case 1:
                System.out.println("Você escolheu CADASTRAR.");
                break;

            case 2:
                System.out.println("Você escolheu CONSULTAR.");
                break;

            case 3:
                System.out.println("Você escolheu EXCLUIR.");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        // 5. SWITCH COM STRING
        String dia = "segunda";

        switch (dia) {

            case "segunda":
                System.out.println("Começo da semana.");
                break;

            case "sexta":
                System.out.println("Sextou!");
                break;

            case "sábado":
            case "domingo":
                System.out.println("Fim de semana.");
                break;

            default:
                System.out.println("Dia normal.");
                break;
        }
        
        // 6. SWITCH EXPRESSION
        int codigo = 2;

        String mensagem = switch (codigo) {

            case 1 -> "Produto encontrado.";
            case 2 -> "Produto cadastrado.";
            case 3 -> "Produto excluído.";
            default -> "Código inválido.";

        };

        System.out.println(mensagem);
        
        // 7. SWITCH EXPRESSION RETORNANDO VALORES
        int mes = 4;

        String nomeMes = switch (mes) {

            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês inválido";

        };

        System.out.println("Mês: " + nomeMes);

        // 8. FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("FOR: " + i);
        }

        // 9. FOR CONTANDO DE 10 ATÉ 1
        for (int i = 10; i >= 1; i--) {
            System.out.println("Contagem: " + i);
        }

        // 10. FOR PERCORRENDO UM ARRAY
        String[] nomes = {
                "João",
                "Maria",
                "Pedro",
                "Ana"
        };

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
        }

        // 11. FOR-EACH
        for (String nome : nomes) {
            System.out.println("FOR-EACH: " + nome);
        }

        // 12. WHILE
        int contador = 0;

        while (contador < 5) {

            System.out.println("WHILE: " + contador);

            contador++;
        }

        // 13. WHILE COM UMA CONDIÇÃO
        int numero = 10;

        while (numero > 0) {

            System.out.println("Número: " + numero);

            numero--;
        }

        // 14. DO-WHILE
        int valor = 0;

        do {

            System.out.println("DO-WHILE: " + valor);

            valor++;

        } while (valor < 5);

        // 15. DIFERENÇA ENTRE WHILE E DO-WHILE
        int numeroWhile = 10;

        while (numeroWhile < 5) {
            System.out.println("Isso não será executado.");
        }

        int numeroDoWhile = 10;

        do {
            System.out.println("DO-WHILE executou pelo menos uma vez.");
        } while (numeroDoWhile < 5);

        // 16. BREAK
        // Interrompe o loop
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println("BREAK: " + i);
        }

        // 17. CONTINUE
        // Pula a execução atual e continua o loop

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println("CONTINUE: " + i);
        }

        // 18. IF DENTRO DE UM FOR
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " é par.");
            } else {
                System.out.println(i + " é ímpar.");
            }
        }

        // 19. SWITCH DENTRO DE UM LOOP
        for (int i = 1; i <= 3; i++) {

            switch (i) {

                case 1:
                    System.out.println("Primeira execução.");
                    break;

                case 2:
                    System.out.println("Segunda execução.");
                    break;

                case 3:
                    System.out.println("Terceira execução.");
                    break;
            }
        }

        // 20. EXEMPLO MAIS PRÓXIMO DE UM PROGRAMA REAL
        int saldo = 100;
        int opcaoMenu = 2;

        switch (opcaoMenu) {

            case 1:

                System.out.println("Saldo atual: R$ " + saldo);

                break;

            case 2:

                int valorSaque = 50;

                if (valorSaque <= saldo) {

                    saldo -= valorSaque;

                    System.out.println("Saque realizado.");
                    System.out.println("Novo saldo: R$ " + saldo);

                } else {

                    System.out.println("Saldo insuficiente.");
                }

                break;

            case 3:

                System.out.println("Saindo...");

                break;

            default:

                System.out.println("Opção inválida.");
        }
    }
}
