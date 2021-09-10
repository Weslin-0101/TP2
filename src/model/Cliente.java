package model;

import java.util.Date;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    private String estado;
    private String cidade;

    private ArrayList<Cliente> clientes;
    
    public Cliente(Integer id, String nome, String data, String cpf, String email, String senha,
            String estado, String cidade) {
        super(id, nome, data, cpf, email, senha);
        this.estado = estado;
        this.cidade = cidade;
        this.clientes = new ArrayList<>();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void buscar(String name) {
        boolean found = false;
        for (Pessoa value : pessoas) {
            Pessoa p = value;
            if (p.getNome().equals(name)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }

        super.buscar(name);
    }

    @Override
    public void cadastrar(Pessoa p) {
        if (!pessoas.contains(p)) {
            pessoas.add(p);
        } else {
            System.out.println("=============================");
            System.out.println("AVISO: Usuário já cadastrado!!");
            System.out.println("=============================");
        }

        super.cadastrar(p);
    }

    @Override
    public void deletar(Pessoa p) {
        pessoas.remove(p);

        super.deletar(p);
    }

    @Override
    public void editar() {
        
        super.editar();
    }

    
}
