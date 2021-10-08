package model;

/**
 * Classe abstrata para que possa ser herdada pelas classes Cliente e Administração
 * @see Cliente
 * @see Administracao
 * @author Wesley Lira Carvalho
 */
public abstract class Pessoa {
    
    private String nome;
    private String dataDeNascimento;
    private String cpf;
    private String email;
    private String senha;
    
    /**
     * Construtor para armazenas as informações do tipo Pessoa.
     * Construtor protected para que possa ser herdado pelas classes que
     * extendem ela
     * 
     * @param nome nome da Pessoa
     * @param dataDeNascimento data de nascimento da Pessoa
     * @param cpf cpf da Pessoa
     * @param email email da Pessoa
     * @param senha senha da Pessoa
     */
    protected Pessoa(String nome, String dataDeNascimento, String cpf, String email, String senha) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    /**
     * Construtor protected para que possa ser herdado e que
     * armazene as informações do tipo pessoa
     * @param nome nome da Pessoa
     * @param senha senha da Pessoa
     */
    protected Pessoa(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    /**
     * Construtor default
     */
    protected Pessoa() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrar(Pessoa p) {
        // Null
    }

    public void buscar(String name) {
        // Null
    }

    public void editar () {
        // Null
    }

    public void deletar(Pessoa p) {
        // Null
    }
}
