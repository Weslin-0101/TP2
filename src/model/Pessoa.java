package model;

import java.util.List;
import java.util.ArrayList;

public abstract class Pessoa {
    
    private String nome;
    private String dataDeNascimento;
    private String cpf;
    private String email;
    private String senha;

    List<Pessoa> pessoas = new ArrayList<>();
    
    protected Pessoa(String nome, String dataDeNascimento, String cpf, String email, String senha) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    protected Pessoa(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

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
        if (!pessoas.contains(p)) {
            pessoas.add(p);
        } else {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }
    }

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
    }

    public void editar () {

    }

    public void deletar(Pessoa p) {
        pessoas.remove(p);
    }
}
