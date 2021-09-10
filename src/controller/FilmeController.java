package controller;

import java.util.ArrayList;
import java.util.List;
import utils.Sc;

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
    public void buscar(String procura) {
        boolean found = false;

        System.out.println("Digite o nome do filme/gênero/ator/diretor ou se está em cartaz: ");
        procura = Sc.nextLine();

        for (Filme value : filmes) {
            Filme f = value;
            if ((f.getTitulo().equals(procura)) && (f.getGenero().equals(procura))
                && (f.getAtores().equals(procura)) && (f.getDiretor().equals(procura))
                && (f.getEmCartaz().equals(procura))) {
                
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
