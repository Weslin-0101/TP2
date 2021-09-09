package controller;

import java.util.ArrayList;
import java.util.List;

import model.Filme;

public class FilmeController {
    
    List<Filme> filmes = new ArrayList<>();

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
