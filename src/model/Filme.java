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

    // Criando uma lista e arraylist para que possamos completar os nossos métodos
    List<Filme> filmes = new ArrayList<>();
    
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

    public void cadastrar(Filme f) {
        if (!filmes.contains(f)) {
            filmes.add(f);
        } else {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }
    }

    // Busca será feita a partir do título, genero, atores, diretor e no caso se está em cartaz
    public void buscar(String titulo, String genero, String atores, String diretor, String cartaz) {
        boolean found = false;
        for (Filme value : filmes) {
            Filme f = value;
            if ((f.getTitulo().equals(titulo)) && (f.getGenero().equals(genero))
                && (f.getAtores().equals(atores)) && (f.getDiretor().equals(diretor))
                && (f.getEmCartaz().equals(cartaz))) {
                
                System.out.println(f);
                found = true;
            }
        }

        if (!found) {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }
    }

    // Necessário pensar em uma forma de editar
    public void editar(){

    }

    public void deletar(Filme f) {
        filmes.remove(f);
    }

    // Método para confirmar a seleção do filme
    public boolean confirmarFilmes(String confirm) { 
        
        return (confirm.equals("Sim"));
    }
}
