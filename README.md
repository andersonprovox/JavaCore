# Java Insider Core
Arquivos, anotações e exercícios propostos pela plataforma Java Insider da Softblue, neste módulo sobre Java.

## Índice
1. [Início](#Início)
2. [Execução e Compilação](#execução-e-compilação)
3. Benefícios da JVM
4. Variáveis no Java
5. Tipo String
6. Operadores do Java
7. Estruturas de seleção
8. Estruturas de repetição

## Início <a name="Início"></a>
- em 1992 a Sun microsystems buscava inovações tecnológicas
- criou um interpretador para trabalhar com aparelhos eletrônicos como:
  - Tvs
  - Video cassetes
  - aparelhos de TV a cabo
- Esta ideia não funcionou e o projeto foi pra gaveta por um tempo.
- Com a difusão da internet a Sun concentrou seus esforços na internet
- Queria colocar suas aplicações para rodar nos browsers
- Na época os browsers só renderizavam HTML
- para dar mais dinâmica aos navegadores criaram os Applets
- Hoje em dia os applets caíram em desuso
- Firmou-se como tecnologia de desenvolvimento de aplicações no lado servidor (Back-end)
- 2009 a Oracle comprou a Sun e passou a cuidar do desenvolvimento da linguagem Java

### Ramificações do Java
- Java SE
  - Base do Java
  - Ambiente de execução e bibliotecas comuns
- Java EE
  - Aplicações coorporativas e internet

### Motivos para adotar Java
- Linguagem madura, estável e segura
- Extensa lista de bibliotecas gratuitas
- Grande comunidade de desenvolvedores
- Extensa documentação

### Onde usar?
- Sistemas de médio e grande porte
- backend de qualquer tipo de aplicação

## Execução e compilação
- Linguagem interpretada é a qual o computador vai linha a linha interpretando o código
- Linguagem Compilada é linguagem que é transformada em algo mais próximo da linguagem de máquina para processamento no computador
- O Java gera em sua compilação um arquivo .class que é o bytecode, este é uma linguagem intermediária e não uma linguagem de máquina diretamente como faz o C por exemplo
- Quem fica responsável pela execução do bytecode é a JVM (Java Virtual Machine)
- a JVM se comunica com o Sistema operacional e faz a aplicação rodar
- O Java é uma linguagem mista:
  - essa alegação vem da compilação e interpretação que acontece dentro do ambiente da linguagem
  - o Javac **compila** o código java em bytecode
  - a JVM **interpreta** esse bytecode para executar a aplicação
- JDK kit de ferramentas do desenvolvedor

## Benefícios da JVM
- Possui Garbage Collector a memória que foi alocada após o uso automaticamente vai desalocar o espaço alocado.
- Performance detecta códigos muito usados e mantém esses na memória(Princípio de JIT)
- segurança faz checagem da aplicação durante a execução, como acesso de aplicações externas ao programa executado.

## Variáveis no Java
- Java é uma linguagem fortemente tipada, então:
  - Ao inicializar uma variável tem que declarar o seu tipo
  - Uma vez atribuido um tipo não vai aceitar nenhum valor de outro tipo
- Possui tipos primitivos e classes
- variáveis não podem ser usadas se não forem inicializadas
- No Java valores booleanos não podem ter representação numérica, como por exemplo podemos ver no JS
### Tipos primitivos
|Tipo|Tamanho(Bits)| Mínimo            | Máximo                              | Exemplo |
|----|-------------|-------------------|-------------------------------------|---------|
 |byte|8| -2<sup>7</sup>    | 2<sup>7</sup>-1                     | 85      |
|short|16| -2<sup>15</sup>   | 2<sup>15</sup>-1                    | 25_000  |
|int|32| -2<sup>31</sup>   | 2<sup>31</sup>-1                    |250_000_000|
|long|64| -2<sup>63</sup>   | 2<sup>63</sup>-1                    |100_000_000_000_000|
|float|32| -2<sup>-149</sup> | (2-2<sup>-23</sup>)-2<sup>127</sup> |1.923f|
|double|64|-2<sup>-1074</sup>|(2-2<sup>-52</sup>)-2<sup>1023</sup>|3.547389473289|
|char|16|0|2<sup>16</sup>-1|'a'|
|boolean|1|-|-|false|

- char tem representação numérica
- essa representação tem relação com a tabela ASCII

### características do tipo Char
- Por mais que você atribua uma letra à variável tipo Char, ele armazena um número.
- Este número tem relação com a tabela ASCII.
- Pode manipular números para encontrar os caracteres da tabela, mas não force nada menor que zero, pois vai apresentar caracteres não conhecidos.

```java
public class CharType {
    public static void main(String[] args) {
        char c1 = 'A';
        System.out.println(c1);//A

        int i1 = c1;
        System.out.println(i1);//65

        char c2 = 'A' + 2;
        System.out.println(c2);//C

        char c3 = 48;
        System.out.println(c3);//1

        char c4 = (char) -10;
        System.out.println(c4);//caractere não reconhecível
    }
}
```


### Regras para nome de variáveis
**O que não pode ser usado na nomeação de variávels:**
- números iniciando o nome da variável,  `int 9abc`.
- Usar caracteres especiais exceto ($ e _), `int xp#o`.
- usar nomes reservados da linguagem, `class, package`, etc.

### Covenções do Java para variáveis
- Variáveis são Case Sensitive
- Começam sempre com letra minúscula. ex: `house`
- Constantes são escritas sempre em maúscula. ex: `HOUSE`
- Palavras compostas são escritas em camel Case. ex: `numberOfYears`

### declarando variáveis do tipo var
- a partir do Java 10 podemos definir variável com a palavra reservada var. ex `var a = 10;`
- por mais que seja parecido com JS não se comporta da mesma forma
- no Java quando se usa 'var' é atribuído a JVM que determine o tipo da variável de acordo com o valor atribuído
- uma vez que foi atribuído o valor de tipo para a variável, está não vai mais aceitar outros valores (como é comum no JS)
- é uma fomar de simplificar a inicialização de uma variável
- também não é possível criar uma variável com 'var' e não atribuir um valor no momento da sua criação `var c;`, apresenta erro por falta de uma atribuição incial de valor

### Casting implícito
Quando um valor pode ser armazenado numa variável de um valor com capacidade de limite de valor de um tipo maior
- uma variável `int` pode ser atribuída dentro de uma variável `long`.

### Cast explícito
Quando determinamos qual o tipo um dado vai se tornar pelo uso de métodos que farão conversão de tipo de dados em para uma variável.
```java
public class ExplicitCasting {
  public static void main(String[] args) {
    double d = 240.56;
    int i = (int) d;

    System.out.println(d);//240.56
    System.out.println(i);//240
  }
}
```
É um modo de deixar na responsabilidade do desenvolvedor e este deve ter cuidado para não errar e comprometer o dado.
Um exemplo e pegar o dado de uma variável com tipo maior do que a variável que vai receber o dado, como pegar o dado de um tipo long e adicionar a um int

## Tipo String
O Tipo String é uma classe, é uma cadeia de caracteres.
Materialização de Strings são de objetos do Java, portanto, isso faz com que ela tenha métodos:
 - toLowerCase()
 - toUpperCase()
 - e outros

As Strings no Java são sempre delimitadas em aspas duplas, nunca confundir com as aspas simples do tipo primito char. No JS isso não faz tanta diferença, mas aqui faz, fique atento.
```java
public class Strings {
    public static void main(String[] args) {
        String s = "abc";
        String y = "FFF";
        String z = s + y;
        z = z.toUpperCase();//perfeitamente possível reatribuir uma string para a sua variável

        System.out.println(z);
    }
}
```
### Text Blocks
Nova função nas versões recentes do Java que permite uma configuração para blocos de textos sem o uso de determinados caracteres de escape como por exemplo o `\n`.
```java
public class TextBlocks {
    public static void main(String[] args) {
        // antes dos text blocks era assim que se pulava linha ou identação
        System.out.println("Olá,\n  tudo\n    bem");

        //com text block
        String s = """
                Olá,
                    tudo
                        bem
             """;

        System.out.println(s);
    }
}
```
Algumas regras para o text block:
- Assim que definir as 3 aspas duplas não pode colocar o texto na mesma linha
- As aspas no final determinam a margem inicial à esquerda, o Intellij exibe uma linha que torna a identificação dela linha de forma visual.

### Input de dados
Exemplo mostrando um input de dados pelo terminal:
```java
public class KeyboardInput {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Texto 1: ");
        String info1 = scanner.nextLine();

        System.out.print("Texto 2: ");
        String info2 = scanner.nextLine();

        System.out.println(info1 + info2);
    }
}
```

## Operadores do Java

### Aritméticos
|Simbolo|Descrição|Exemplo|
|-------|---------|-------|
| + |soma|a + b|
| - |subtração| a - b|
| * | Multiplicação| a * b|
| / | Divisão | a / b|
| % | Módulo ( Resto da divisão)| a % b|

Fazer um divisão com o numerador for menor que o divisor ele gera um número double, se estiver lidando com números inteiros
será exibido o número zero.
Para conseguir a divisão usando double é necessário um Casting Explicito:
```java
public class OperadoresDivisao {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        double c = (double) b / a;
        System.out.println(c);
    }
}
```
- Veja que o Java vai dar o resultado com o tipo mais abrangente.
- Dois int vão dar resultado int.
- Com o casting explicito em um dos int para double ou nos dois será possível obter o resultado double corretamente.

### relacionais
| Símbolo | Descrição | Exemplo |
|---------|-----------|--------|
| ==      | igual     | a == b |
| !=      | Diferente | a != b |
| '>'      | Maior que | a > b  |
| < | Menor que | a < b|
| '>=' | Maior ou igual | a >= b|
| <=| Menor ou igual| a<= b|

### Lógicos
| Símbolo | Descrição | Exemplo |
|------|---------|-------|
| &&   | E(and)  | a && b |
|        | Ou (or)| a  b|
| !    | not     | !a    |
```java
public class OperatorLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);//and
        System.out.println(a || b);//or
        System.out.println( !a);//not
    }
}
```

Essas operações acontecem de acordo com a tabela verdade.
Para executar uma validação com operações lógicos deve será obedecida a ordem de importância(da esq. para a dir.):
- `! -> && -> ||`
- not -> and -> or
### de Atribuição

Os mais comuns de encontrar:

|Símbolo|Descrição|Exemplo|
|-------|---------|-------|
| =     |Atribui valor|a = 1|
| += |Soma e atribui| a+= 5|
| -= | Subtrai e atribui| a -= 5|
| *= | Multiplica e atribui| a *= 5|
| /= | Divide e atribui | a/= 2|
| ++ | Incrementa | a++, ++a|
|--| decrementa | a--, --a|

### detalhes sobre incremento e decremento
Quando usamos o pós incremento `a++`, na linha ele vai usar o valor atual do a e depois vai incrementar.
```java
class main {
    public static void main (String[] args) {
      int a = 2;
      int b = 3 + a++; // 2 + 5
      
      b = 3 + ++a; //3 + 3
      
      int c = 1;
      c++;
      
      ++c; //Os dois terão o mesmo comportamento
    }
}
    
```
Quando usandos o pré incremento `++a` primeiro vai incrementar o a e depois seguir com as demais operações que houverem na linha.

**OBS:** Isso vale para o decremento também.

O pré ou pós incremento só terá o mesmo comportamento de incrementar ou decrementar valor se a variável recebendo esse tipo de operação estiver em uma linha isolada.

## Estruturas de seleção
Estruturas que pode executar certas instruções de acordo com o atendimento de condições estabelecidas no código.

como acontece com o `if()` que uma condição deve ser verdadeira para que os código pertencente a este bloco possa executar. Caso seja falso não será executado e vai mandar a parte subsequente do código para continuar a execução do programa. 
Pode conter a instrução `else`, quando a condição do `if()`
não for satisfeita ele sempre será executado. Possível também usar `else if` para testar várias
condições previstas dentro da aplicação.

Veja o arquivo `IfElse.java`, para uma demonstração usando várias condições.

### switch
permite somente tipos primivos(byte, shor, char e int) de dados e enums e Strings.

Somente atua em casos de igualdade.

```java
public class Switch {

  public static void main(String[] args) {
    int month = 3;
    int days;

    switch (month) {
      case 1:
        days = 31;
        break;
      case 2:
        days = 28;
        break;
      case 3:
        days = 31;
        break;
      case 4:
        days = 30;
        break;
      default:
        days = 0;
        System.out.println("Inválido");
    }

    System.out.println(days + "dias");
  }

}
```

### Switch Expressions
Permite a atribuição do valor de um switch em uma variável.
- Expressão se torna mais resumida para escrever e ler
- permite usar blocos dentro de case e retornar um valor usando o yield
- O yield pode ser usado somente quando houver um bloco de código atribuido a um case
- blocos são definidos com `{}`
- switch expressions usam `->` para atribuição de valor
- Opção atribuída no Java 14

```java
public class SwitchExpressions {
    public static void main(String[] args) {
        int month = 5;
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("Inválido");
                yield 0;
            }
        };

        System.out.println(days + " dias");
    }
}
```
### Escopo de variáveis
O Java mantém as variáveis dentro do seu escopo de forma estrita, ou seja, a variável definida dentro 
de um bloco de código só será utilizável dentro daquele bloco.
por exemplo, no caso abaixo a variável criada dentro do bloco do if não será visível forma dele.
```java
public class varScope {
    public static void main(String[] args) {
        int a = 20;
        
        if (a == 20) {
            int b = 10;
        }
        
        System.ou.println(b);
    }
}
```
A variável b não será impressa e a IDE caso use uma irá apontar um erro.

### Operadores ternários
Operadores que podem ser usados quando temos de fazer uso de alguma estrutura de descisão, mas o retorno de valores pode 
ser um ou outro. como por exemplo sim ou não, isso faz com que o código fique menos e legível.

```java
public class TernaryIf {
    public static void main(String[] args) {
        int age = 18;
        String text = age >= 18 ? "Maior de idade": "Menor de idade";

        System.out.println(text);
    }
}
```
A estrutura segue a seguinte lógica:
`condição_para_validação ? "resposta_se_verdadeiro: "Resposta_se_falso"`.

## Estrutura de repetição
Estrutura que repete uma determinada operação ou bloco de código até alcançar uma condição estipulada.

### while e do...while
Estruturas de repetição que vão executar trechos de código enquanto uma condição for verdadeira.
No while so será executado o trecho de código se a condição for satisfeita, com o do... while uma vez 
o código será executado e depois terá a verificação de  uma condição se é verdadeira.
mais exemplo no arquivo `RepeatWhileDoWhile.java`.

### For
Também é uma estrutura de repetição, mas é estipulação uma condição na qual
será executado um trecho de código enquanto a condição for verdadeira.
útil para cenários com um número pré-definido de execuções. Muito utilizado para facilitar a vida com coleções(collections)

**Alguns usos incomuns para o for**
- Podemos atribuir valores para mais de uma variável no for, mas não pode iniciar as variáveis nele;
- Podemos incrementar e decrementar mais de uma variável dentro do for
- Os incrementos podem ser outras expressões fora os tradicionais
- as 3 seções do for não são obrigatórias
```java
public class RepeatForOtherUsages {
    public static void main(String[] args) {
        int i, j;
        for ( i = 0, j = 9; i < 10 ; i++, j--) {
            System.out.println(i + " " + j);
        }

        System.out.println("---------------------");
        
        for (int x = 1; x < 100 ; x*= 2) {
            System.out.println(x);
        }


        System.out.println("------------------------");
        
        int y = 0;
        for (; y < 10; ) {
            System.out.println(y);
            y++;
        }
    }
}
```
### Usando break no for
Podemos usar para interromper a execução mediante uma condição:
```java
public class RepeatBreak {
    public static void main(String[] args) {
        int i = 0;
        
        while(i < 200) {
            System.out.println(i);
            i++;
            
            if(i == 100) {
              break;  
            }
        }
        System.out.println("FIM");
    }
}
```

### continue no for
Para forçar a execução do for e pular alguma instrução após uma condição dentro do laço.
```java
public class RepeatCotinue {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);//quando a condição for verdadeira vai pular essa impressão
        }

        System.out.println("FIM");
    }
}
```
### Loops aninhados
Basicamente é colocar uma estrutura de repetição dentro da outra.

Quando se lida com vários loops aninhados podemos ter problemas para conseguir
manipular a entrada e saída nesses blocos de código, para faciliar temos as **labels**.

Labels: dão nomes para as estruturas de repetição.
```java
public class InnerLoops {
    public static void main(String[] args) {
        outer://modo de como nomear labels, aqui o for abaixo da label recebe o nome de outer
        for (int i = 1; i <= 10; i++) {
            inner:
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    break outer;// este break vai fazer interromper a execução do innner e do outer
                    //se fosse usado um break comum sem a label seria interrompido apenas a execução do for interno
                    //para ficar mais claro aconteceria com o for abaixo da label inner.
                }
                System.out.println(i + j);
            }
        }
        System.out.println("FIM");
    }
}
```
## Debug e documentação
### Inserindo comentários
Quando há algo a ser realizado podemos usar o `TODO` en un trcho do código para que seja revisto posterioremente.

Podemos usar o `FIXME` para caso algo esteja para ser corrigido e precisa voltar depois essa marcação auxilia muito quando usamos uma IDE, Intellij, Eclipse etc.

Podemos entender que o `FIXME` é para arrumar algo e o `TODO` é para inserir algo que está faltando, essas marcações são mais para orientação visual do desenvolvedor.

### Consultar o Javadoc

Forma de documentar tudo que faz parte do seu projeto Java.

[javadoc](https://docs.oracle.com)

É possível verificar documentos de funções e classes do Java e os itens de uma versão do Java específica também.

também possível encontrar o Javadoc dentro da sua IDE, no Intellij clique 2x no shift e 
selecione no canto superior direito _project and libraries_.

### Exportando o javadoc do projeto
Javadoc auxilia na documentação para uso posterior seja do desenvolvedor ou de outras pessoas.

```java
/**
 * Isso é o modo de definir um javadoc
 * 
 * @author ANDERSON FONSECA
 * @version 1.0
 * @since 1.0
 */
```

Marcações usadas no Javadoc auxliam na organização das informações, seja versão, autor e outras, começam com `@`;

Essa documentação do Javadoc pode ser exportada para HTML.
O próprio java faz isso, no intellij o caminho é `Tools -> generate JavaDoc`.

`@Deprecated` algo que está na linguagem, mas não deve ser mais usado.

Quando a IDE mostrar isso é que aquela função por questões de atualização e de engenharia, não deve mais ser mais usada
e mostra uma alternativa. Quando se usa essa notação, diz ao usuário que aquela funcionalidade não estará disponível para uso
então começa a dizer ao desenvolvedor que deve mudar e usar algo mais e apropriado para manter a segurança da aplicação.

**Warnings:** são avisos de coisas que podem ser melhoradas e que merecem a sua atenção.

`@SuppressWarnings`: suprime warnings do código para o compilador mostrar na IDE.
## Exercícios
Aqui está a lista de exercícios resolvidos durante o módulo.
- ExExpression.java
- ExMediaAluno.java
- ExTemperatureConversion.java
- ExCalculateXValues.java
- ExValorMulta.java
- ExDiaSemana.java
- ExEvenSum.java
- ExAverageWithInput.java
- ExGeradorTabuada.java
