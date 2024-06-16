package application;

import java.util.Scanner;

import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Endereco;

public class Program {

	public static void main(String[] args) {

		Cliente cliente = lerCliente();

		System.out.println("Informações do cliente:");
		System.out.println(cliente);

		System.out.println("Informações do endereço:");
		System.out.println(cliente.getEndereco().toString());

		escolherTipoConta(cliente);
	}

	public static Cliente lerCliente() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do cliente:");
		String nome = scanner.nextLine();

		System.out.println("Digite a idade do cliente:");
		int idade = scanner.nextInt();

		Endereco endereco = lerEndereco();

		Cliente cliente = new Cliente(nome, idade, endereco);
		System.out.println(cliente.getClass());

		return cliente;
	}

	public static Endereco lerEndereco() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a rua do endereço:");
		String rua = scanner.nextLine();

		System.out.println("Digite o número do endereço:");
		String numero = scanner.nextLine();

		System.out.println("Digite a cidade do endereço:");
		String cidade = scanner.nextLine();

		System.out.println("Digite o estado do endereço:");
		String estado = scanner.nextLine();

		System.out.println("Digite o CEP do endereço:");
		String cep = scanner.nextLine();

		Endereco endereco = new Endereco(rua, numero, cidade, estado, cep);
		System.out.println(endereco.getClass());

		return endereco;
	}

	public static void escolherTipoConta(Cliente cliente) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Deseja criar uma conta corrente (C) ou uma conta poupança (P)?");
		String opcao = scanner.nextLine();

		if (opcao.equalsIgnoreCase("C")) {
			ContaCorrente contaCorrente = new ContaCorrente(cliente);
			System.out.println("Conta corrente criada com sucesso!");
			menuContaCorrente(contaCorrente);
		} else if (opcao.equalsIgnoreCase("P")) {
			ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
			System.out.println("Conta poupança criada com sucesso!");
			menuContaPoupanca(contaPoupanca);
		} else {
			System.out.println("Opção inválida!");

		}
	}

	public static void menuContaPoupanca(ContaPoupanca contaPoupanca) {
		Scanner scanner = new Scanner(System.in);
		boolean executar = true;

		while (executar) {
			System.out.println("MENU CONTA POUPANÇA");
			System.out.println("Escolha uma opção: ");
			System.out.println("1. Realizar Depósito");
			System.out.println("2. Realizar Saque");
			System.out.println("3. Imprimir Informações da Conta");
			System.out.println("4. Imprimir Extrato");
			System.out.println("5. Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do Scanner

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor do depósito: ");
				double valorDeposito = scanner.nextDouble();
				contaPoupanca.depositar(valorDeposito);
				break;
			case 2:
				System.out.print("Digite o valor do saque: ");
				double valorSaque = scanner.nextDouble();
				contaPoupanca.sacar(valorSaque);
				break;
			case 3:
				contaPoupanca.imprimirInformacoes();
				break;
			case 4:
				contaPoupanca.imprimirExtrato();
				break;
			case 5:
				executar = false;
				break;
			default:
				System.out.println("Opção inválida! Digite novamente.");
				break;
			}
		}
	}

	public static void menuContaCorrente(ContaCorrente contaCorrente) {
		Scanner scanner = new Scanner(System.in);
		boolean executar = true;

		while (executar) {
			System.out.println("MENU CONTA CORRENTE");
			System.out.println("Escolha uma opção: ");
			System.out.println("1. Realizar Depósito");
			System.out.println("2. Realizar Saque");
			System.out.println("3. Imprimir Informações da Conta");
			System.out.println("4. Imprimir Extrato");
			System.out.println("5. Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do Scanner

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor do depósito: ");
				double valorDeposito = scanner.nextDouble();
				contaCorrente.depositar(valorDeposito);
				break;
			case 2:
				System.out.print("Digite o valor do saque: ");
				double valorSaque = scanner.nextDouble();
				contaCorrente.sacar(valorSaque);
				break;
			case 3:
				contaCorrente.imprimirInformacoes();
				break;
			case 4:
				contaCorrente.imprimirExtrato();
				break;
			case 5:
				executar = false;
				break;
			default:
				System.out.println("Opção inválida! Digite novamente.");
				break;
			}
		}
	}
}
