package controller;

import java.util.List;
import java.util.ArrayList;

import model.Sala;

public class SalaController {
    
    private ArrayList<Sala> salas;

    public SalaController() {
        this.salas = new ArrayList<>();
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void criarSala(Sala sala) {
        if (!salas.contains(sala)) {
            salas.add(sala);
        } else {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }
    }

    public void buscar(Integer num) {
        boolean found = false;
        
        for (Sala valor : salas) {
            Sala info = valor;
            if (info.getNumeroDaSala().equals(num)) {
                System.out.println(info);
                found = true;
            }
        }

        if (!found) {
            System.out.println("=============================");
            System.out.println("Não foi possível encontrar a sala");
            System.out.println("=============================");
        }
    }

    public boolean selecionarSala(boolean seleciona) {
        
        boolean valida = true;
        return (seleciona == valida);
    }

    public boolean selecionarTecnologia(boolean selecionar) {

        boolean verificar = true;
        return (selecionar == verificar);
    }

    public boolean confirmarSala(boolean confirma) {
        
        boolean valida = true;
        return (confirma == valida);
    }
}
