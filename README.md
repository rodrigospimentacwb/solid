# S.o.l.i.d.

Os cinco princípios da programação orientada a objetos e design de código - Robert C. Martin (Uncle Bob)

* [S]ingle Responsibility Principle (Princípio da Responsabilidade Única)

* [O]pen/Closed Principle (Princípio do Aberto/Fechado)

* [L]iskov Substitution Principle (Princípio da Substituição de Liskov)

* [I]nterface Segregation Principle (Princípio da Segregação de Interfaces)

* [D]ependency Inversion Principle (Princípio da Inversão de Dependências)

1. SRP - Princípio da reponsabilidade única

```Uma classe deve tratar apenas as tarefas de sua reponsabilidade, evitando tratar reponsabilidades de outras classes dentro dela. Quanto mais bem definido for o que sua classe faz, mais coesa ela é.```

2. OCP - Princípio do Aberto/Fechado

```Entidades de software(classes, módulos, funções, etc.) devem estar abertas para ampliação, mas fechadas para modificação. Para isso utiliza-se de herança, interface e composição, fechando uma classe para modificações e caso outras regras surjam, vão sendo implementados novas classes.```

Exemplo: 

-Pacote OCP/Antes: Vemos na classe 'Venda' dois metodos de calculo para desconto de pagamento, sendo eles no cartão de débito ou crédito. Se fosse necessário adicionar mais métodos de pagamentos como dinheiro e PIX, a classe teria que ser modificada adicionado mais dois novos metodos de pagamento. 

-Pacote OCP/Depois: Aplicando do aberto/fechado criamos uma interface e classes de regras, podendo ser criadas novas conforme a regra de negocio, e deixando o método 'calculaDesconto()' da classe venda fechado para modificações.

3. LSP - Princípio da Substituição de Liskov

```A utilização de herença deve ser utilizada de forma contextualizada, evitando repassar atributos/metodos para outras classes que não utilizam os mesmos```

4. ISP - Princípio da Segregação de Interfaces

```Criar interfaces mais exutas para facilitar a mnutenção e evolução, evitando classes "gordas" causando acoplamentos prejudiciais às regras de negócio. Atentar-se também para evitar a criação exagerada de interfaces criadas de forma indevida```

5. DIP - Princípio da Inversão de Dependências

```Depender de abastrações de não de classes concretas, pois as abstrações mudaram menos, facilitando a mudança de comportamento em futuras evoluções do código.```

Referências: 

[Princípios S.O.L.I.D: o que são e porque projetos devem utilizá-los (Mari Azevedo)](https://mari-azevedo.medium.com/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299)(24/06/2021 21:35)

Código Limpo: Habilidades Práticas do Agile Software (Robert C. Martin, 2011)

Alura — Cursos Online de Tecnologia — SOLID com Java: Orientação a Objetos com Java
