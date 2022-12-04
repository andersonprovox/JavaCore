# Java Insider Core
Arquivos, anotações e exercícios propostos pela plataforma Java Insider da Softblue, neste módulo sobre Java.

## Início
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

