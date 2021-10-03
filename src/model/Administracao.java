package model;


public class Administracao extends Pessoa{

    public Administracao(String nome, String data, String cpf, String email, String senha) {
        super(nome, data, cpf, email, senha);
    }

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
