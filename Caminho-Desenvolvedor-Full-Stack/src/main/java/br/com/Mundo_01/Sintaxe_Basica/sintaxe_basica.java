package br.com.Mundo_01.Sintaxe_Basica;

public class sintaxe_basica {

    public class Main {

        public static void main(String[] args) {

            // byte
            byte idade = 18;
            // short
            short ano = 2026;
            // int
            int quantidade = 100;
            // long
            long populacao = 8_000_000_000L;
            // float
            float altura = 1.75f;
            // double
            double salario = 2500.50;
            // char
            char inicial = 'G';
            // boolean
            boolean ativo = true;

            // String NÃO é um tipo primitivo.
            // É uma classe do Java.

            String nome = "Gilvan";

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Ano: " + ano);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("População: " + populacao);
            System.out.println("Altura: " + altura);
            System.out.println("Salário: " + salario);
            System.out.println("Inicial: " + inicial);
            System.out.println("Ativo: " + ativo);


            // ALTERANDO VALORES
            idade = 19;
            quantidade = 150;
            salario = 3000.00;
            ativo = false;

            System.out.println("\nDepois das alterações:");

            System.out.println("Idade: " + idade);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Salário: " + salario);
            System.out.println("Ativo: " + ativo);

            // Cada tipo primitivo possui uma classe Wrapper:
            Byte idadeWrapper = 19;
            Short anoWrapper = 2026;
            Integer quantidadeWrapper = 150;
            Long populacaoWrapper = 8_000_000_000L;
            Float alturaWrapper = 1.75f;
            Double salarioWrapper = 3000.00;
            Character inicialWrapper = 'G';
            Boolean ativoWrapper = true;

            // EXIBINDO OS WRAPPERS
            System.out.println("\nWrappers:");

            System.out.println("Byte: " + idadeWrapper);
            System.out.println("Short: " + anoWrapper);
            System.out.println("Integer: " + quantidadeWrapper);
            System.out.println("Long: " + populacaoWrapper);
            System.out.println("Float: " + alturaWrapper);
            System.out.println("Double: " + salarioWrapper);
            System.out.println("Character: " + inicialWrapper);
            System.out.println("Boolean: " + ativoWrapper);

            // AUTOBOXING
            // O Java converte automaticamente um primitivo para seu Wrapper.
            int numeroPrimitivo = 100;

            Integer numeroWrapper = numeroPrimitivo;

            // UNBOXING
            // O Java também pode converter automaticamente um Wrapper para seu tipo primitivo.
            Integer valorWrapper = 200;

            int valorPrimitivo = valorWrapper;

            System.out.println("\nConversões automáticas:");

            System.out.println("Primitivo: " + numeroPrimitivo);
            System.out.println("Wrapper: " + numeroWrapper);

            System.out.println("Wrapper: " + valorWrapper);
            System.out.println("Primitivo: " + valorPrimitivo);

            // Wrappers podem receber null.
            Integer numeroNulo = null;

            System.out.println("\nWrapper com null: " + numeroNulo);

            // Primitivos NÃO podem receber null.
            // int numero = null; // ERRO

            // final impede que o valor seja alterado.

            final double PI = 3.14159;

            System.out.println("\nConstante PI: " + PI);

            // PI = 3.14; // ERRO

            // var permite que o Java descubra o tipo
            // automaticamente.
            var nomeVar = "Gilvan";
            var idadeVar = 18;
            var salarioVar = 2500.50;
            var ativoVar = true;
            var trabalha = false;

            System.out.println("\nVariáveis usando var:");

            System.out.println(nomeVar);
            System.out.println(idadeVar);
            System.out.println(salarioVar);
            System.out.println(ativoVar);

            // OPERADORES LÓGICOS

            // && garante que duas condições precisem ser compridas para algo acontecer
            if(ativoVar && trabalha){
                System.out.println("trabala e está ativo");
            }

            // || necessita que apenas uma condição seja comprida
            if(trabalha || ativoVar){
                System.out.println("tabalha ou está ativo");
            }

            // == compara dois itens e retorna verdadeiro ou falso, dependendo se os dois resultam na mesma coisa
            if(idadeVar == salarioVar){
                System.out.println("idade é igual ao salário");
            }

            // <= compara 2 itens para verificar se o da esquerda  é menor ou igaul ao da direita
            if(idadeVar <= salarioVar){
                System.out.println("idade é menor ou igual ao salário");
            }

            // >= compara 2 itens para verificar se o da esquerda  é maior ou igaul ao da direita
            if(idadeVar >= salarioVar){
                System.out.println("idade é maior ou igual ao salário");
            }

            // < compara 2 itens para verificar se o da esquerda  é menor que o da direita
            if(idadeVar < salarioVar){
                System.out.println("idade é menor que o salário");
            }

            // > compara 2 itens para verificar se o da esquerda  é maior que o da direita
            if(idadeVar > salarioVar){
                System.out.println("idade é maior que o salário");
            }

            // OPERADORES MATEMÁRICOS
            var total = 0.0;

            // soma
            total = idadeVar + salarioVar;

            // subtração
            total = idadeVar -  salarioVar;

            // divisão
            total = salarioVar / idadeVar;

            // multiplicação
            total = salarioVar * idadeVar;
        }
    }
}
