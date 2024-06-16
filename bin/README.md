# Sistema Bancário

Este é um projeto de um sistema bancário simples em Java, onde é possível criar clientes, cadastrar seus endereços e criar contas correntes ou contas poupanças para os clientes.

## Funcionalidades

O sistema bancário possui as seguintes funcionalidades:

- Criar um cliente, informando seu nome e idade.
- Cadastrar o endereço de um cliente, informando a rua, número, cidade, estado e CEP.
- Escolher o tipo de conta a ser criada (conta corrente ou conta poupança) para um cliente.
- Para a conta corrente:
  - Realizar depósito.
  - Realizar saque.
  - Imprimir informações da conta.
  - Imprimir extrato.
- Para a conta poupança:
  - Realizar depósito.
  - Realizar saque.
  - Imprimir informações da conta.
  - Imprimir extrato.

## Conceitos utilizados
O projeto utiliza os seguintes conceitos:

+ Polimorfismo: O polimorfismo é utilizado na criação das contas correntes e contas poupanças. Ambos os tipos de conta são subclasses da classe abstrata Conta, permitindo que as operações comuns, como depósito e saque, possam ser realizadas de forma polimórfica, tratando as contas correntes e contas poupanças de forma genérica.
+ Encapsulamento: O encapsulamento é utilizado nas classes Cliente, Endereco, Conta, ContaCorrente e ContaPoupanca. Os atributos dessas classes são declarados como privados e são acessados por meio de métodos getters e setters. Isso garante que os dados sejam protegidos e que o acesso a eles seja feito de forma controlada.
+ Herança: A herança é utilizada nas classes ContaCorrente e ContaPoupanca, que são subclasses da classe abstrata Conta. Essa hierarquia de classes permite reutilizar o código comum entre as contas, enquanto adiciona comportamentos específicos a cada tipo de conta.
Métodos abstratos: A classe abstrata Conta contém métodos abstratos, como depositar e sacar, que são implementados nas classes filhas ContaCorrente e ContaPoupanca. Isso permite que cada tipo de conta tenha sua própria implementação desses métodos, adaptada às suas regras específicas.
Override de métodos: Nas classes ContaCorrente e ContaPoupanca, os métodos imprimirInformacoes e imprimirExtrato são sobrescritos (override) para exibir as informações específicas de cada tipo de conta. Isso demonstra o uso do polimorfismo, onde o comportamento de um método é determinado em tempo de execução com base no tipo do objeto.
+ Composição: A classe Cliente possui uma composição com a classe Endereco, onde um cliente possui um endereço associado a ele. Isso permite que os dados do cliente e do endereço sejam agrupados e acessados de forma conveniente.

## Utilização de Anotações
O projeto também utiliza a anotação @Param para fornecer informações adicionais aos parâmetros de métodos. Essa anotação pode ser útil para documentar a finalidade, restrições ou outras informações relevantes sobre um determinado parâmetro.

## Como executar o projeto

Para executar o projeto, siga as instruções abaixo:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
2. Faça o download ou clone o repositório para o seu ambiente de desenvolvimento.
3. Abra o projeto em sua IDE de preferência.
4. Compile e execute o arquivo `Program.java` para rodar o programa.

## Contribuição

Se você deseja contribuir para o projeto, sinta-se à vontade para fazer um fork deste repositório e enviar suas melhorias através de pull requests. Ficaremos felizes em receber contribuições!

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

Espero que isso seja útil! Se você tiver mais perguntas, sinta-se à vontade para perguntar.