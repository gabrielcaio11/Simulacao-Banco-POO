package entities;

/**
 * A classe Cliente representa um cliente de um banco, contendo informações como nome, idade e endereço.
 */
public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;

    /**
     * Construtor da classe Cliente.
     *
     * @param nome     o nome do cliente
     * @param idade    a idade do cliente
     * @param endereco o endereço do cliente
     */
    public Cliente(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    /**
     * Obtém o nome do cliente.
     *
     * @return o nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome o nome do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a idade do cliente.
     *
     * @return a idade do cliente
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do cliente.
     *
     * @param idade a idade do cliente
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtém o endereço do cliente.
     *
     * @return o endereço do cliente
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     *
     * @param endereco o endereço do cliente
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna uma representação em forma de string do objeto Cliente.
     *
     * @return uma string representando o cliente no formato "Cliente{nome='...', idade=..., endereco=...}"
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco=" + endereco +
                '}';
    }
}