package controller;

import java.util.List;
import java.util.ArrayList;

import model.Localidade;

// Classe controller da localidade
public class LocalidadeController {
    
    private List<Localidade> localidades = new ArrayList<>();

    public List<Localidade> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidade> localidades) {
        this.localidades = localidades;
    }

    public void cadastrar(Localidade localidade) {
        if (!localidades.contains(localidade)) {
            localidades.add(localidade);
        } else {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }
    }

    public void buscar(String endereco) {
        boolean found = false;
        for (Localidade valor : localidades) {
            Localidade local = valor;
            if (local.getendereco().equals(endereco)) {
                System.out.println(local);
                found = true;
            }
        }

        if (!found) {
            System.out.println("=============================");
            System.out.println("Localidade do cinema não encontrado");
            System.out.println("=============================");
        }
    }

    // Desenvolver método depois
    public void editar() {}

    public void deletar(Localidade localidade) {
        localidades.remove(localidade);
    }
}
