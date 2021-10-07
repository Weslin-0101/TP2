package model;

/**
 * CLasse que armazena as informações de um Cliente.
 * Essa mesma classe herda os atributos e métodos da classe
 * @see Pessoa
 * 
 * @author Wesley Lira Carvalho
 */
public class Cliente extends Pessoa {
    
    /**
     * Construtor para gerar um novo Cliente
     * 
     * @param nome nome do Cliente
     * @param data data de aniversário do Cliente
     * @param cpf cpf do Cliente
     * @param email email do Cliente
     * @param senha senha do Cliente
     */
    public Cliente(String nome, String data, String cpf, String email, String senha) {
        super(nome, data, cpf, email, senha);
    }

    /**
     * Construtor responsável para o caso do usuário se logar
     * como um cliente na view Login
     * @see Login 
     * @param nome
     * @param senha
     */
    public Cliente(String nome, String senha) {
        super(nome, senha);
    }

    /**
     * Construtor default
     */
    public Cliente() {
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

    /**
     * Método responsável para printar as informações do Cliente
     * caso seja selecionado
     */
    @Override
    public String toString() {
        return "Cliente: " 
            + getNome() + "\n"
            + "\n"
            + "Data de nascimento: " 
            + getDataDeNascimento() + "\n"
            + "\n"
            + "CPF: " 
            + getCpf() + "\n"
            + "\n" 
            + "Email: " 
            + getEmail() + "\n"
            + "\n" 
            + "Senha:" 
            + getSenha() + "\n"
            + "\n";
    }
}
