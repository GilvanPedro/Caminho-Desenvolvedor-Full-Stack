# Mundo 1 — A Vila Inicial (Fundamentos de Java)

**Trilha:** Java puro, sem Spring, sem banco, sem web.
**XP do mundo:** +60 XP
**Boss Fight:** A Calculadora do Aprendiz — *Muito fácil*
**Status:** Concluído

> Objetivo do mundo: sair sabendo o vocabulário puro da linguagem Java — variáveis, decisões, repetições, texto e coleções simples — antes de misturar qualquer framework.

[Voltar ao README principal](README.md)

---

## Índice

- [1.1 — Sintaxe Básica](#11--sintaxe-básica)
- [1.2 — Estruturas de Controle](#12--estruturas-de-controle)
- [1.3 — Strings e Arrays](#13--strings-e-arrays)
- [Loot Secreto](#-loot-secreto)
- [Boss Fight 1 — A Calculadora do Aprendiz](#️-boss-fight-1--a-calculadora-do-aprendiz)
- [Pontos de atenção para revisão futura](#-pontos-de-atenção-para-revisão-futura)

---

## 1.1 — Sintaxe Básica

Arquivo: [`Sintaxe_Basica/sintaxe_basica.java`](Sintaxe_Basica/sintaxe_basica.java)

O alfabeto da linguagem: sem isso, nada mais faz sentido.

**O que foi praticado:**

| Tema | O que significa | Onde aparece no código |
|---|---|---|
| Variáveis e tipos primitivos | Declarar e guardar números, textos e booleanos na memória | `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean` |
| `String` não é primitivo | É uma classe do Java, não um tipo primitivo | variável `nome` |
| Tipos Wrapper | Versão "objeto" de cada primitivo, usada em coleções | `Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Character`, `Boolean` |
| Autoboxing / Unboxing | Conversão automática entre primitivo ↔ wrapper | `numeroPrimitivo → numeroWrapper` e `valorWrapper → valorPrimitivo` |
| Wrapper aceitando `null` | Diferente do primitivo, que nunca pode ser `null` | `Integer numeroNulo = null;` |
| `final` | Impede que o valor de uma variável seja alterado depois | `final double PI = 3.14159;` |
| `var` | Deixa o Java inferir o tipo automaticamente | `var nomeVar`, `var idadeVar`, etc. |
| Operadores lógicos | `&&` (E), `\|\|` (OU) | blocos de `if` combinando `ativoVar` e `trabalha` |
| Operadores relacionais | `==`, `<=`, `>=`, `<`, `>` | comparações entre `idadeVar` e `salarioVar` |
| Operadores matemáticos | `+`, `-`, `*`, `/` | cálculo de `total` |

**Resumo pessoal:** primeiro contato com o "vocabulário" do Java — como guardar dado, como o Java trata primitivo vs. objeto, e as ferramentas básicas de comparação e conta.

---

## 1.2 — Estruturas de Controle

Arquivo: [`Estrutura_de_Controles/estruturas_controle.java`](Estrutura_de_Controles/estruturas_controle.java)

É o que dá "decisão" e "repetição" ao código.

**O que foi praticado:**

- **Decisão**
    - `if` / `else` simples (maioridade)
    - `if` / `else if` / `else` em cadeia (faixas de nota)
    - `if` com operadores lógicos combinados (`idade >= 18 && possuiCarteira`)
- **`switch` tradicional**
    - Com `int` (menu de opções) e com `String` (dias da semana)
    - `case` "empilhado" sem `break` para agrupar valores (`"sábado"` e `"domingo"` caem no mesmo bloco)
    - Uso do `break` para não "vazar" para o próximo `case`
- **`switch` expression (Java moderno)**
    - Sintaxe com `->`, sem `break`, retornando valor direto para uma variável (`mensagem`, `nomeMes`)
- **Repetição**
    - `for` clássico (contando pra frente e pra trás)
    - `for` percorrendo um array pelo índice
    - `for-each` percorrendo um array
    - `while` (com contador e com condição de parada)
    - `do-while` (executa pelo menos uma vez, mesmo com condição falsa)
- **Controle de fluxo dentro de loops**
    - `break` para interromper o loop
    - `continue` para pular uma iteração
    - `if` dentro de `for` (par/ímpar)
    - `switch` dentro de um `for`
- **Exemplo aplicado:** simulação de menu de banco (consultar saldo / sacar / sair) combinando `switch` + `if` de validação de saldo.

**Resumo pessoal:** entender a diferença entre `while` e `do-while` (o segundo sempre roda uma vez), e a diferença entre `switch` tradicional (precisa de `break`) e `switch` expression (mais seguro, sem risco de vazamento de case).

---

## 1.3 — Strings e Arrays

Arquivo: [`Strings_e_Arrays/string_arrays.java`](Strings_e_Arrays/string_arrays.java)

Como guardar e manipular várias informações de uma vez, sem banco de dados ainda.

**Manipulação de Strings praticada:**

| Método / recurso | Para que serve |
|---|---|
| `+` e `.concat()` | Concatenar textos |
| `.length()` | Descobrir o tamanho da String |
| `.charAt(i)` | Acessar um caractere específico |
| `.substring(ini, fim)` / `.substring(ini)` | Cortar um pedaço da String |
| `.equals()` / `.equalsIgnoreCase()` | Comparar conteúdo (com e sem diferenciar maiúsculas) |
| `.contains()` | Verificar se contém um trecho |
| `.startsWith()` / `.endsWith()` | Verificar início/fim do texto |
| `.toUpperCase()` / `.toLowerCase()` | Converter caixa do texto |
| `.trim()` | Remover espaços das pontas |
| `.replace()` | Substituir um trecho por outro |
| `String.format()` | Formatar texto com placeholders (`%s`, `%d`) |

**Arrays praticados:**

- Criar array vazio com tamanho fixo (`new int[5]`) e preencher posição a posição
- Criar array já preenchido (`int[] valores = {10, 20, 30, 40, 50}`)
- Ler tamanho (`.length`), alterar posição, criar array de `String`
- Percorrer com `for` indexado e com `for-each`
- **Algoritmos clássicos sobre array**, todos feitos "na mão" (sem Streams ainda — isso só vem no Mundo 4):
    - Buscar se um valor existe (`encontrado`)
    - Encontrar a posição de um valor (`posicao`)
    - Somar todos os valores
    - Calcular média (com *cast* para `double`, senão a divisão trunca)
    - Encontrar maior e menor valor
- **Iteração sobre String** (String também pode ser percorrida por índice com `charAt`):
    - Percorrer caractere a caractere
    - Buscar a posição de um caractere específico
    - Contar quantas vezes um caractere aparece
    - Verificar se uma String contém *apenas* dígitos (`Character.isDigit`)

**Resumo pessoal:** essa fase é a base de qualquer algoritmo que "processa uma lista" — os mesmos padrões (percorrer, comparar, acumular) vão se repetir com Collections no Mundo 3 e com Streams no Mundo 4.

---

## Loot Secreto

**Switch expressions:** o Java moderno permite escrever `switch` como uma expressão que retorna valor direto (com `->`), sem precisar de `break` em cada linha. É mais curto e evita um bug clássico: esquecer o `break` e "vazar" para o próximo caso sem querer.

---

## Boss Fight 1 — A Calculadora do Aprendiz

**Dificuldade:** Muito fácil
Arquivo: [`Boss_Fight/calculadora.java`](Boss_Fight/calculadora.java)

**Missão:** criar um programa de console com um menu de operações simples.

- [x] Montar um menu (usando `switch`) com 4 operações matemáticas (soma, subtração, multiplicação, divisão)
- [x] Usar um `while` para o menu voltar a aparecer até o usuário escolher "sair"
- [x] Guardar o histórico das contas realizadas em um `Array` e exibi-lo ao final

**Como foi resolvido:**

- `Scanner` lê a opção do menu e os dois números digitados.
- Um `while (opcao != 5)` mantém o menu ativo até o usuário escolher sair.
- Um `switch` executa a operação escolhida (`+`, `-`, `*`, `/`) e monta uma `String` com a conta feita.
- **Proteção contra divisão por zero:** antes de dividir, verifica se `numero2 == 0` e usa `continue` para voltar ao menu sem quebrar o programa.
- **Histórico com Array puro:** como array tem tamanho fixo, a cada nova conta é criado um **novo array** com uma posição a mais, o conteúdo antigo é copiado para ele, e o array antigo é substituído — a forma manual de "crescer" uma lista antes de conhecer `ArrayList` (que só vem no Mundo 3).
- Ao sair (`opcao == 5`), todo o histórico acumulado é exibido numerado.

> **Nota para revisão:** o enunciado original pedia guardar apenas as **últimas 5** contas — a versão atual guarda o histórico completo, sem limite. Se for revisar este Boss Fight futuramente, vale ajustar para manter só os 5 registros mais recentes (dá pra treinar de novo a lógica de "array de tamanho fixo" descartando o mais antigo). Pontos de atenção para revisão futura

Coisas que valem uma segunda passada de olho antes de avançar em dificuldade:

- Diferença entre `switch` tradicional (precisa `break`) e `switch` expression (`->`, sem `break`).
- Por que Wrapper aceita `null` e primitivo não — e o risco de `NullPointerException` ao fazer *unboxing* de um Wrapper nulo.
- `while` roda zero ou mais vezes; `do-while` roda uma ou mais vezes.
- Por que é preciso fazer `(double) total / notas.length` para calcular média sem truncar o resultado.
- Lógica de "recriar o array maior" usada na Calculadora — é o motivo pelo qual, mais pra frente, `ArrayList` existe.

---

*Parte da trilha [Full Stack Quest — 4ª Edição](Full_Stack_Quest_4a_Edicao_Detalhada.pdf).*