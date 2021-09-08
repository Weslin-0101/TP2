package model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Pessoa {
    
    private Integer id;
    private String nome;
    private Date dataDeNascimento;
    private String cpf;
    private String email;
    private String senha;

    List<Pessoa> pessoas = new ArrayList<>();
    
    protected Pessoa(Integer id, String nome, Date dataDeNascimento, String cpf, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
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
