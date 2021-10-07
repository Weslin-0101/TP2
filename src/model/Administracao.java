package model;

/**
 * Classe que armazena as informações do Admin.
 * Essa mesma classe herda os atributos e métodos da classe
 * @see Pessoa
 * 
 * @author Wesley Lira Carvalho
 */
public class Administracao extends Pessoa{

    /**
     * Construtor default
     */
    public Administracao() {}

    /**
     * Gerar um novo Admim
     * 
     * @param nome  nome do admin
     * @param data  data de nascimento
     * @param cpf   cpf do admin
     * @param email email para o cadastro
     * @param senha senha se logar como admin
     */
    public Administracao(String nome, String data, String cpf, String email, String senha) {
        super(nome, data, cpf, email, senha);
    }

    /**
     * Nesse construtor, é para gerar o Admin somente
     * com os dados de nome e senha
     * 
     * @param nome nome ou username usado para se logar
     * @param senha senha ou password usado para se logar
     */
    public Administracao(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public void buscar(String name) {
        // null
    }

    @Override
    public void cadastrar(Pessoa p) {
        // null
    }

    @Override
    public void deletar(Pessoa p) {
        // null
    }

    @Override
    public void editar() {
        // null
    }
    
    
}
