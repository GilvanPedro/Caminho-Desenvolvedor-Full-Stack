package br.com.Mundo_01.Strings_e_Arrays;

public class string_arrays {

    public static void main(String[] args) {

        // Manipulação de Strings

        String nome = "Gilvan";
        String sobrenome = "Pedro";

        // Concatenação
        String nomeCompleto = nome + " " + sobrenome;

        System.out.println(nomeCompleto);

        // Concatenação com concat()
        String mensagem = "Olá, ".concat(nome);

        System.out.println(mensagem);


        // Tamanho da String
        String texto = "Java";

        int tamanho = texto.length();

        System.out.println("Tamanho: " + tamanho);


        // Acessando caracteres
        char primeiroCaractere = texto.charAt(0);

        System.out.println("Primeiro caractere: " + primeiroCaractere);


        // Cortando uma String
        String palavra = "Programacao";

        String parte = palavra.substring(0, 7);

        System.out.println(parte);


        // Substring a partir de uma posição
        String restante = palavra.substring(7);

        System.out.println(restante);


        // Comparando Strings
        String texto1 = "Java";
        String texto2 = "Java";

        if (texto1.equals(texto2)) {
            System.out.println("Os textos são iguais.");
        } else {
            System.out.println("Os textos são diferentes.");
        }


        // Ignorando maiúsculas e minúsculas
        String senha1 = "JAVA";
        String senha2 = "java";

        if (senha1.equalsIgnoreCase(senha2)) {
            System.out.println("As Strings são iguais.");
        }


        // Verificando se contém um texto
        String frase = "Estou estudando Java.";

        if (frase.contains("Java")) {
            System.out.println("A frase contém Java.");
        }


        // Verificando início e fim
        if (frase.startsWith("Estou")) {
            System.out.println("A frase começa com Estou.");
        }

        if (frase.endsWith("Java.")) {
            System.out.println("A frase termina com Java.");
        }


        // Convertendo maiúsculas e minúsculas
        String nomeUsuario = "Gilvan";

        System.out.println(nomeUsuario.toUpperCase());
        System.out.println(nomeUsuario.toLowerCase());


        // Removendo espaços
        String textoComEspacos = "   Java   ";

        System.out.println(textoComEspacos.trim());


        // Substituindo caracteres
        String linguagem = "Java";

        String novaLinguagem = linguagem.replace("Java", "Python");

        System.out.println(novaLinguagem);


        // Formatando Strings
        String usuario = "Gilvan";
        int idade = 18;

        String resultado = String.format(
                "Nome: %s | Idade: %d",
                usuario,
                idade
        );

        System.out.println(resultado);


        // Arrays

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);


        // Criando array já preenchido
        int[] valores = {
                10,
                20,
                30,
                40,
                50
        };

        System.out.println(valores[3]);


        // Tamanho do array
        System.out.println("Quantidade de posições: " + valores.length);


        // Alterando uma posição
        valores[0] = 100;

        System.out.println(valores[0]);


        // Array de Strings
        String[] nomes = {
                "João",
                "Maria",
                "Pedro",
                "Ana"
        };

        System.out.println(nomes[0]);
        System.out.println(nomes[2]);


        // Percorrendo um array com for
        for (int i = 0; i < nomes.length; i++) {

            System.out.println(nomes[i]);
        }


        // Percorrendo um array com for-each
        for (String nomeArray : nomes) {

            System.out.println(nomeArray);
        }


        // Buscando um valor no array
        int[] numerosBusca = {
                10,
                20,
                30,
                40,
                50
        };

        int procurado = 30;
        boolean encontrado = false;

        for (int numero : numerosBusca) {

            if (numero == procurado) {

                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado.");
        } else {
            System.out.println("Número não encontrado.");
        }


        // Encontrando a posição de um valor
        int[] numerosPosicao = {
                5,
                10,
                15,
                20,
                25
        };

        int numeroProcurado = 20;
        int posicao = -1;

        for (int i = 0; i < numerosPosicao.length; i++) {

            if (numerosPosicao[i] == numeroProcurado) {

                posicao = i;
                break;
            }
        }

        System.out.println("Posição encontrada: " + posicao);


        // Somando valores de um array
        int[] numerosSoma = {
                10,
                20,
                30,
                40,
                50
        };

        int soma = 0;

        for (int numero : numerosSoma) {

            soma += numero;
        }

        System.out.println("Soma: " + soma);


        // Calculando a média
        int[] notas = {
                7,
                8,
                9,
                10
        };

        int total = 0;

        for (int nota : notas) {

            total += nota;
        }

        double media = (double) total / notas.length;

        System.out.println("Média: " + media);


        // Encontrando o maior valor
        int[] numerosMaior = {
                15,
                8,
                32,
                10,
                25
        };

        int maior = numerosMaior[0];

        for (int numero : numerosMaior) {

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior valor: " + maior);


        // Encontrando o menor valor
        int[] numerosMenor = {
                15,
                8,
                32,
                10,
                25
        };

        int menor = numerosMenor[0];

        for (int numero : numerosMenor) {

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Menor valor: " + menor);


        // Iterando sobre uma String
        String palavraIteracao = "Java";

        for (int i = 0; i < palavraIteracao.length(); i++) {

            char caractere = palavraIteracao.charAt(i);

            System.out.println(caractere);
        }


        // Buscando um caractere em uma String
        String palavraBusca = "Programacao";

        char caractereProcurado = 'a';

        for (int i = 0; i < palavraBusca.length(); i++) {

            if (palavraBusca.charAt(i) == caractereProcurado) {

                System.out.println(
                        "Caractere encontrado na posição: " + i
                );
            }
        }


        // Contando ocorrências de um caractere
        String textoContagem = "banana";

        char caractere = 'a';
        int contador = 0;

        for (int i = 0; i < textoContagem.length(); i++) {

            if (textoContagem.charAt(i) == caractere) {

                contador++;
            }
        }

        System.out.println(
                "Quantidade de ocorrências: " + contador
        );


        // Verificando se uma String contém apenas números
        String numeroTexto = "123456";
        boolean somenteNumeros = true;

        for (int i = 0; i < numeroTexto.length(); i++) {

            char c = numeroTexto.charAt(i);

            if (!Character.isDigit(c)) {

                somenteNumeros = false;
                break;
            }
        }

        if (somenteNumeros) {
            System.out.println("A String contém apenas números.");
        } else {
            System.out.println("A String contém outros caracteres.");
        }
    }
}
