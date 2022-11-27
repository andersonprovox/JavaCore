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
- 