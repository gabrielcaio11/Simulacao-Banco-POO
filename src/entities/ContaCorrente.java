package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe ContaCorrente representa uma conta corrente bancária.
 */
public class ContaCorrente extends Conta {
	private List<String> operacoes;

	private double limiteChequeEspecial;

	/**
	 * Construtor da classe ContaCorrente.
	 *
	 * @param cliente              o cliente associado à conta
	 * @param limiteChequeEspecial o limite do cheque especial da conta
	 */
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.limiteChequeEspecial = 500.0f;
		this.operacoes = new ArrayList<>();
	}

	/**
	 * Realiza o saque de um determinado valor da conta.
	 *
	 * @param valor o valor a ser sacado
	 */
	@Override
	public void sacar(double valor) {
		if (valor <= saldo + limiteChequeEspecial) {
			saldo -= valor;
			operacoes.add("Saque de R$" + valor + "\n");
			System.out.println("Saque de R$" + valor + " realizado com sucesso");
		} else {
			System.out.println("Saque nao foi realizado");
		}
	}

	/**
	 * Realiza o depósito de um determinado valor na conta.
	 *
	 * @param valor o valor a ser depositado
	 */
	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			operacoes.add("Deposito de R$" + valor + "\n");
			System.out.println("Deposito de R$" + valor + " realizado com sucesso");
		}else {
            System.out.println("Depósito não foi realizado. Valor inválido.");
        }
	}

	/**
	 * Realiza a transferência de um determinado valor da conta atual para outra
	 * conta.
	 *
	 * @param valor        o valor a ser transferido
	 * @param contaDestino a conta de destino da transferência
	 */
	/**
	 * Obtém o limite do cheque especial da conta corrente.
	 *
	 * @return o limite do cheque especial
	 */
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	/**
	 * Define o limite do cheque especial da conta corrente.
	 *
	 * @param limiteChequeEspecial o limite do cheque especial
	 */
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	/**
	 * Imprime as informações básicas da conta corrente, incluindo o limite do
	 * cheque especial.
	 */
	@Override
	public void imprimirInformacoes() {
		System.out.println("Informações da Conta Corrente:");
		super.imprimirInformacoes();
		System.out.println("Limite do Cheque Especial: " + limiteChequeEspecial);
	}

	/**
	 * Imprime todas as operações realizadas na conta corrente.
	 */
	@Override
	public void imprimirExtrato() {
		System.out.println("Operações da Conta Corrente:");
		for (String operacao : operacoes) {
			System.out.println(operacao);
		}
	}

}