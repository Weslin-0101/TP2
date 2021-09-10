package model;

import java.util.List;
import java.util.ArrayList;

public class Filme {
    
    // Atributos
    private String titulo;
    private String duracao;
    private String sinopse;
    private String genero;
    private String emCartaz;
    private String atores;
    private String diretor;
    
    public Filme(String titulo, String duracao, String sinopse, String genero, String emCartaz, String atores,
            String diretor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.genero = genero;
        this.emCartaz = emCartaz;
        this.atores = atores;
        this.diretor = diretor;
    }

    // Getters e Settes dos atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmCartaz() {
        return emCartaz;
    }

    public void setEmCartaz(String emCartaz) {
        this.emCartaz = emCartaz;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() +" | " + " Sinopse: " + getSinopse() +" | " + " Gênero: " + getGenero()
            + " | " + " Duração: " + getDuracao() + " | "+" Atores: " + getAtores() + " | " + " Diretor: " + getDiretor()
            +" | " + " Está em cartaz: " + getEmCartaz()+ "\n";
    }
}
