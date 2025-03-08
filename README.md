# LPOO

## Table of contents

- [Sintaxe da Linguagem e Controle de Fluxo](#1)
- [Classes e Objetos](#2)
- [Atributos](#3)
- [Métodos](#4)
- [Encapsulamento e Acoplamento](#5)


<a name="1">
<h1>Sintaxe da Linguagem e Controle de Fluxo</h1>
</a>

## Qual a diferença entre JRE e JDK?
O JDK é um kit de desenvolvimento completo para criar aplicações Java, enquanto o JRE
é apenas o ambiente necessário para executar essas aplicações.

## O que Bytecode Java?
O Bytecode Java é um código intermediário gerado pelo compilador Java a partir
do código fonte. Ele é como uma "linguagem de máquina" para a Java Virtual Machine
(JVM), que é responsável por executar os programas Java.

## O que é a JVM e quais suas principais funcionalidades?
A Java Virtual Machine (JVM), ou Máquina Virtual Java, é um componente
fundamental da plataforma Java. Ela é responsável por executar os programas Java,
permitindo que sejam executados em diferentes sistemas operacionais sem a
necessidade de recompilação. <br>
O processo de compilação Java transforma o código-fonte em bytecode,
um formato intermediário que a Máquina Virtual Java (JVM) pode ler e executar.

## Qual a convenção para definição do nome de uma classe e para o nome de uma variável?

<h3>Nomes de classes</h3>
A convenção mais comum para nomes de classes é o PascalCase.
<br>Exemplos: MinhaClasse, Cliente, Produto, SistemaDeVendas.
<br>Nomes de classes geralmente são substantivos que representam
objetos ou conceitos no seu programa.

<h3>Nomes de variáveis</h3>
A convenção mais comum para nomes de variáveis é o camelCase.
<br>Exemplos: nomeDoCliente, idade, precoDoProduto, quantidadeDeVendas.
<br>Nomes de constantes (valores que não mudam) geralmente são em
letras maiúsculas, com palavras separadas por sublinhados.
Exemplo: VALOR_MAXIMO, TAXA_DE_JUROS.

## Qual os valores padrão na inicialização dos elementos de um array?
Os valores padrão na inicialização dos elementos de um array seguem as mesmas
regras dos atributos individuais, variando de acordo com o tipo de dado dos
elementos e a linguagem de programação.
PS: Citado na última questão de Classes e Objetos.


<a name="2">
<h1>Classes e Objetos</h1>
</a>

## Qual a diferença entre o Paradigma Procedural e o Paradigma Orientado a Objetos?
A diferença entre o paradigma procedural e o orientado a objetos está na 
organização do código e dos dados. No paradigma procedural, o foco está nas 
funções, que executam tarefas sequenciais, com dados separados e passados entre 
elas. É mais adequado para projetos menores e simples, com estrutura linear.<br>
<br>Já no paradigma orientado a objetos, o foco está nos objetos, que combinam 
dados e funções, promovendo encapsulamento, herança e polimorfismo. Isso torna o 
código mais organizado, reutilizável e extensível, ideal para projetos complexos.<br> 
<br>Em resumo, o procedural se concentra em "como" as coisas são feitas, enquanto o orientado a objetos se concentra em "o que" as coisas são, oferecendo mais recursos para projetos grandes e complexos.

## O que é abstração no contexto da análise orientada a objetos?
A abstração é um processo que simplifica a complexidade do mundo real, focando 
apenas nas características e comportamentos essenciais de um objeto. Isso significa 
criar modelos que representam apenas os aspectos relevantes, ignorando detalhes 
irrelevantes. <br>
<br>Primeiro, identificam-se os objetos do sistema e, em seguida, selecionam-se 
as características e comportamentos relevantes. Com base nisso, criam-se modelos 
simplificados. A abstração ajuda a lidar com sistemas complexos, tornando-os mais 
fáceis de entender e manter, além de promover a reutilização de código e facilitar 
a comunicação entre os envolvidos. <br>
<br> Por exemplo, ao analisar um sistema de biblioteca, um livro pode ser 
abstraído pelas suas características essenciais, como título, autor e ISBN, 
ignorando detalhes como o número de páginas, a menos que sejam relevantes 
para o sistema.

## O que é coesão no contexto da análise orientada a objetos?
Coesão refere-se ao quão bem os elementos dentro de uma classe se relacionam e 
focam em um único propósito. Classes com alta coesão têm responsabilidades bem 
definidas e relacionadas, o que as torna mais fáceis de entender, manter e 
reutilizar. <br> 
<br>Por outro lado, classes com baixa coesão têm responsabilidades 
díspares, tornando-as mais complexas e propensas a erros. A coesão é importante 
porque melhora a legibilidade e a manutenibilidade do código, promove a 
reutilização de código e reduz a complexidade do sistema. <br>
<br> Em resumo, buscar alta coesão em suas classes ajuda a criar sistemas mais 
organizados, modulares e fáceis de manter.


<a name="3">
<h1>Atributos</h1>
</a>

## Qual a convenção para definição do nome de um atributo?
Nomes devem ser descritivos, refletindo o propósito do atributo, e a maioria das
linguagens usa <b>camel case</b>, onde a primeira palavra inicia com minúscula e as 
subsequentes com maiúscula. <br>
Evitam-se abreviaturas excessivas, priorizando a legibilidade. A consistência na 
nomenclatura é crucial para facilitar a manutenção do código. <br> 
Linguagens como Java e C# adotam camel case, enquanto 
Python utiliza snake_case, com palavras separadas por sublinhados. 
Seguir essas convenções resulta em código mais organizado e compreensível.

## Qual os valores padrão na inicialização de atributos?
Output padrão de cada tipo quando não inicializado.
```
//Initial default when not initialized
//byte, short, int, long, float e double = 0
// char '\u0000'
//boolean = false
// String = null
```

<a name="4">
<h1>Métodos</h1>
</a>

## Qual a convenção para definição do nome de um método?
Nomes devem ser descritivos, indicando claramente a ação do método, e geralmente 
começam com um verbo. A maioria das linguagens usa camel case, com a primeira 
palavra em minúscula e as subsequentes em maiúscula. Evitam-se abreviaturas 
excessivas, priorizando a legibilidade. <br>
<br> A consistência na nomenclatura é crucial para facilitar a manutenção do 
código. Linguagens como Java e C# adotam camel case, com métodos "getters" e 
"setters" seguindo padrões específicos, enquanto Python utiliza snake_case, com 
palavras separadas por sublinhados. 
Seguir essas convenções resulta em código mais organizado e compreensível.


<a name="5">
<h1>Encapsulamento e Acoplamento</h1>
</a>

## Quais é o objetivo e vantagens de realizar o encapsulamento?
O <b>encapsulamento</b>, tem como objetivo principal proteger os dados de um objeto, 
ocultando os detalhes internos de implementação e expondo apenas uma interface 
pública controlada. 
<br>Isso é alcançado combinando dados (atributos) e métodos (funções) que operam 
sobre esses dados em uma única unidade, a classe, e restringindo o acesso 
direto aos atributos por meio de modificadores de acesso, como "private".

As vantagens do encapsulamento são diversas:

- <b>Proteção dos dados: </b> Ao restringir o acesso direto aos atributos, evita-se que eles sejam modificados de forma inadequada, garantindo a integridade e a consistência dos dados do objeto.

- <b>Ocultação da complexidade:</b> O encapsulamento permite esconder os detalhes internos de implementação de um objeto, tornando-o mais fácil de usar e entender. Os usuários do objeto interagem apenas com a interface pública, sem precisar se preocupar com os detalhes internos.
- <b>Manutenibilidade:</b> Ao isolar os dados e os métodos em uma única unidade, o encapsulamento facilita a manutenção do código. As alterações na implementação interna de um objeto não afetam outras partes do sistema, desde que a interface pública permaneça a mesma.
- <b>Reusabilidade:</b> Objetos encapsulados podem ser facilmente reutilizados em diferentes partes do sistema ou em outros sistemas, pois eles são unidades independentes e autocontidas.
- <b>Flexibilidade:</b> O encapsulamento permite modificar a implementação interna de um objeto sem afetar o código que o utiliza, desde que a interface pública permaneça a mesma. Isso torna o código mais flexível e adaptável a mudanças.
Redução de acoplamento: O encapsulamento diminui a dependência entre diferentes partes do sistema, pois os objetos interagem apenas por meio de suas interfaces públicas. Isso torna o código mais modular e fácil de testar.

## Que visibilidade damos a um membro da classe (atributo ou método) quando usamos o modificador public? E o modificador private?
A visibilidade de um membro da classe, seja atributo ou método, determina onde 
esse membro pode ser acessado no código. Os modificadores <b>public</b> e 
<b>private</b>
definem diferentes níveis de visibilidade:

### Modificador public:

- Visibilidade:
Quando um membro da classe é declarado como public, ele pode ser acessado de qualquer lugar do código, tanto dentro da própria classe quanto fora dela.
Isso significa que outras classes, objetos e até mesmo código externo ao projeto podem acessar e modificar membros public.
- Uso:
Membros public são geralmente usados para definir a interface pública da classe, ou seja, os métodos e atributos que outras partes do código podem usar para interagir com a classe.
É importante usar public com cautela, pois expor muitos membros pode comprometer a integridade dos dados e tornar o código mais difícil de manter.

### Modificador private:

- Visibilidade:
Quando um membro da classe é declarado como private, ele só pode ser acessado dentro da própria classe.
Outras classes, objetos e código externo não podem acessar ou modificar membros private.
- Uso:
Membros private são geralmente usados para ocultar detalhes de implementação interna da classe e proteger os dados.
Isso garante que os dados da classe só possam ser modificados por meio dos métodos da própria classe, o que ajuda a manter a consistência e a integridade dos dados.

<br>Em resumo:

<b>public:</b> Acesso livre de qualquer parte do código.<br>
<b>private:</b> Acesso restrito apenas à própria classe.

## Qual a função da palavra reservada this?

Em Java, a palavra reservada <b>this</b> desempenha um papel fundamental na programação 
orientada a objetos, permitindo que um objeto se referencie a si mesmo. 
Distinguindo variáveis de instância de variáveis locais, por exemplo:

Quando um método ou construtor tem um parâmetro com o mesmo nome de uma variável 
de instância (atributo), this é usado para distinguir entre eles.
<b>this.variavelDeInstancia</b> refere-se à variável de instância, enquanto <b>
variavelLocal</b> refere-se à variável local.

## Como podemos definir acoplamento no contexto da Programação Orientada a Objetos?

Em POO, acoplamento refere-se ao grau de dependência 
entre duas classes ou módulos. Quanto maior a dependência, mais acopladas elas estão.

### Tipos de Acoplamento:

<b>Acoplamento forte:</b> Classes altamente dependentes umas das outras. Alterações em 
uma classe podem exigir modificações em outras, dificultando a manutenção e o 
reaproveitamento de código.

<b>Acoplamento fraco:</b> Classes com baixa dependência. Alterações em uma classe têm 
menor impacto em outras, facilitando a manutenção e o reaproveitamento de código.
### Impactos do Acoplamento:

<b>Manutenção:</b> Acoplamento forte dificulta a manutenção, pois mudanças em uma classe 
podem gerar efeitos colaterais em outras.

<b>Reusabilidade:</b> Classes fortemente acopladas são menos reutilizáveis, pois dependem 
de outras classes específicas para funcionar.

<b>Testabilidade</b> Acoplamento forte dificulta a criação de testes unitários 
isolados para cada classe.

Utilizar técnicas como injeção de dependência e interfaces para reduzir o 
acoplamento entre classes. <b>Buscar o acoplamento fraco</b> é fundamental para criar sistemas 
mais flexíveis, manuteníveis e reutilizáveis.
