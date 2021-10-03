package model;


public class Cliente extends Pessoa {


    
    public Cliente(String nome, String data, String cpf, String email, String senha) {
        super(nome, data, cpf, email, senha);
    }

    public Cliente(String nome, String senha) {
        super(nome, senha);
    }

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

    @Override
    public String toString() {
        return "Cliente: " + getNome() + "\n" + "Data de nascimento: " + getDataDeNascimento() + "\n"
        + "CPF: " + getCpf() + "\n" + "Email: " + getEmail() + "\n" + "Senha:" + getSenha() + "\n";
    }
}
