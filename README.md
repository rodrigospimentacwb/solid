# S.o.l.i.d.

Os cinco princípios da programação orientada a objetos e design de código - Robert C. Martin (Uncle Bob)

* [S]ingle Responsibility Principle (Princípio da Responsabilidade Única)

* [O]pen/Closed Principle (Princípio do Aberto/Fechado)

* [L]iskov Substitution Principle (Princípio da Substituição de Liskov)

* [I]nterface Segregation Principle (Princípio da Segregação de Interfaces)

* [D]ependency Inversion Principle (Princípio da Inversão de Dependências)

## 1. SRP - Princípio da reponsabilidade única

```Uma classe deve tratar apenas as tarefas de sua reponsabilidade, evitando tratar reponsabilidades de outras classes dentro dela. Quanto mais bem definido for o que sua classe faz, mais coesa ela é.```

Exemplo:

-Pacote SRP/Antes: A classe 'Produto' tem um método de salvar, tendo que preparar a comunicação com o banco, e salvar o produto. Esta responsabilidade não é da classe Produto, além disso, se desejar persistir outros objetos, terá que replicar o código de salvar para as demais classes.

-Pacote SRP/Depois: Foram geradas novas classes com suas devidas responsabilidades: 'ConnectionDAO' (Responsável pela comunicação com o banco), 'ProdutoDAO'(Utilizar a ConnectionDAO para salvar produto) e a 'ProdutoDAO'(Apenas de manter os dados do produto)

## 2. OCP - Princípio do Aberto/Fechado

```Entidades de software(classes, módulos, funções, etc.) devem estar abertas para ampliação, mas fechadas para modificação. Para isso utiliza-se de herança, interface e composição, fechando uma classe para modificações e caso outras regras surjam, vão sendo implementados novas classes.```

Exemplo: 

-Pacote OCP/Antes: Vemos na classe 'Venda' dois metodos de calculo para desconto de pagamento, sendo eles no cartão de débito ou crédito. Se fosse necessário adicionar mais métodos de pagamentos como dinheiro e PIX, a classe teria que ser modificada adicionado mais dois novos metodos de pagamento. 

-Pacote OCP/Depois: Aplicando do aberto/fechado criamos uma interface e classes de regras, podendo ser criadas novas conforme a regra de negocio, e deixando o método 'calculaDesconto()' da classe venda fechado para modificações.

Obs: Neste caso foi utilizado também o padrão de projeto STRATEGY.

## 3. LSP - Princípio da Substituição de Liskov

```A utilização de herença deve ser utilizada de forma contextualizada, evitando repassar atributos/metodos para outras classes que não utilizam os mesmos```

-Pacote LSP/Antes: Classe 'ContaCorrenteComum' tem um método rende que faz sentido em outras classes que tenham rendimento, mas na classe 'ContaSalario'(com herança) não, pois ela não possui esta regra. É incorreto tmabém utilizar um lançamento de Exception neste caso.

-Pacote LSP/Depois: Criado classe 'GerenciadorDeContas' que é chamada nas classes 'ContaSalario' e 'ContaCorrenteComum', sendo usado apenas os métodos que fazem parte da regra de negócio da classe.

## 4. ISP - Princípio da Segregação de Interfaces

```Criar interfaces mais exutas para facilitar a mnutenção e evolução, evitando classes "gordas" causando acoplamentos prejudiciais às regras de negócio. Atentar-se também para evitar a criação exagerada de interfaces criadas de forma indevida```

-Pacote ISP/Antes: As classes 'Desenvolvedor' e 'Vendedor' extendem da classe abstrata 'Funcionario' sendo obrigadas a implementar os metodos 'getSalario' e 'getComissao', mas desenvolvedor não tem comissão.

-Pacote ISP/Depois: Para corrigir o problema são criadas duas interfaces 'Comissionavel'(getComissao) e 'Convencional'(getSalario), onde a classe 'Funcionario' implementa 'Convencional', pois só possui salário, e a classe 'Vendedor' extende de 'Funcionario' e implementa 'Comissionavel', agora tendo 'getSalario' e 'getComissao'. Isso auxilia a não termos classes "gordas" com acoplamentos incorretos que prejudicam a regra de negócio. Também é importante não exagerar na criação de interfaces para não criar classes indevidas. 

## 5. DIP - Princípio da Inversão de Dependências

```Depender de abastrações de não de classes concretas, pois as abstrações mudaram menos, facilitando a mudança de comportamento em futuras evoluções do código.```

No exemplo de DIP, podemos fazer referência ao exemplo Do OCP onde começamos a depender da Interface 'RegraDeDesconto' e não mais da implementação da classe 'Venda', dependendo de uma abstração e não de uma implementação. 

## Referências: 

[Princípios S.O.L.I.D: o que são e porque projetos devem utilizá-los (Mari Azevedo)](https://mari-azevedo.medium.com/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299)(24/06/2021 21:35)

Código Limpo: Habilidades Práticas do Agile Software (Robert C. Martin, 2011)

Alura — Cursos Online de Tecnologia — SOLID com Java: Orientação a Objetos com Java
