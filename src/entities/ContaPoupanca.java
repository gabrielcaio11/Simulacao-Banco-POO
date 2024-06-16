package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe ContaPoupanca representa uma conta poupança bancária.
 */
public class ContaPoupanca extends Conta {
	private List<String> operacoes;
	private double taxaRendimento;

	/**
	 * Construtor da classe ContaPoupanca.
	 *
	 * @param cliente o cliente associado à conta
	 *
	 */
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.taxaRendimento = 0.1f;
		this.operacoes = new ArrayList<>();
	}

	/**
	 * Realiza o saque de um determinado valor da conta poupança.
	 *
	 * @param valor o valor a ser sacado
	 */
	@Override
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			operacoes.add("Saque de R$" + valor);
			System.out.println("Saque de R$" + valor + " realizado com sucesso");
		} else {
			System.out.println("Saque não foi realizado. Saldo insuficiente.");
		}
	}

	/**
	 * Realiza o depósito de um determinado valor na conta poupança.
	 *
	 * @param valor o valor a ser depositado
	 */
	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			operacoes.add("Depósito de R$" + valor);
			System.out.println("Depósito de R$" + valor + " realizado com sucesso");
		} else {
			System.out.println("Depósito não foi realizado. Valor inválido.");
		}
	}

	/**
	 * Obtém a taxa de rendimento da conta poupança.
	 *
	 * @return a taxa de rendimento
	 */
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	/**
	 * Define a taxa de rendimento da conta poupança.
	 *
	 * @param taxaRendimento a taxa de rendimento
	 */
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	/**
	 * Imprime as informações básicas da conta poupança, incluindo a taxa de
	 * rendimento.
	 */
	@Override
	public void imprimirInformacoes() {
		System.out.println("Informações da Conta Poupança:");
		super.imprimirInformacoes();
		System.out.println("Taxa de Rendimento: " + taxaRendimento);
	}

	/**
	 * Imprime todas as operações realizadas na conta poupança.
	 */
	@Override
	public void imprimirExtrato() {
		System.out.println("Operações da Conta Poupança:");
		for (String operacao : operacoes) {
			System.out.println(operacao);
		}
	}
}