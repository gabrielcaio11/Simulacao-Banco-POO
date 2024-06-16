package entities;

/**
 * A classe abstrata Conta é uma classe base para diferentes tipos de contas
 * bancárias, fornecendo funcionalidades comuns como saque, depósito,
 * transferência e informações básicas da conta.
 */
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1981;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	/**
	 * Construtor da classe Conta.
	 *
	 * @param cliente o cliente associado à conta
	 */
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	
	/**
	 * Obtém o número da agência da conta.
	 *
	 * @return o número da agência
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Obtém o número da conta.
	 *
	 * @return o número da conta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Obtém o saldo atual da conta.
	 *
	 * @return o saldo atual
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método protegido para imprimir informações básicas da conta. Será
	 * implementado nas classes filhas para exibir informações específicas da conta.
	 */
	protected void imprimirInformacoes() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
}