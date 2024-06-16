package entities;

/**
 * A classe Endereco representa um endereço físico, contendo informações como
 * rua, número, cidade, estado e CEP.
 */
public class Endereco {
	private String rua;
	private String numero;
	private String cidade;
	private String estado;
	private String cep;

	/**
	 * Construtor da classe Endereco.
	 *
	 * @param rua    a rua do endereço
	 * @param numero o número do endereço
	 * @param cidade a cidade do endereço
	 * @param estado o estado do endereço
	 * @param cep    o CEP (Código de Endereçamento Postal) do endereço
	 */
	public Endereco(String rua, String numero, String cidade, String estado, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	/**
	 * Obtém a rua do endereço.
	 *
	 * @return a rua do endereço
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Define a rua do endereço.
	 *
	 * @param rua a rua do endereço
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * Obtém o número do endereço.
	 *
	 * @return o número do endereço
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Define o número do endereço.
	 *
	 * @param numero o número do endereço
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Obtém a cidade do endereço.
	 *
	 * @return a cidade do endereço
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * Define a cidade do endereço.
	 *
	 * @param cidade a cidade do endereço
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Obtém o estado do endereço.
	 *
	 * @return o estado do endereço
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Define o estado do endereço.
	 *
	 * @param estado o estado do endereço
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Obtém o CEP (Código de Endereçamento Postal) do endereço.
	 *
	 * @return o CEP do endereço
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Define o CEP (Código de Endereçamento Postal) do endereço.
	 *
	 * @param cep o CEP do endereço
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Retorna uma representação em forma de string do objeto Endereco.
	 *
	 * @return uma string representando o endereço no formato "Endereco{rua='...',
	 *         numero=..., cidade='...', estado='...', cep='...'}"
	 */
	@Override
	public String toString() {
		return "Endereco{" + "rua='" + rua + '\'' + ", numero=" + numero + ", cidade='" + cidade + '\'' + ", estado='"
				+ estado + '\'' + ", cep='" + cep + '\'' + '}';
	}
}
