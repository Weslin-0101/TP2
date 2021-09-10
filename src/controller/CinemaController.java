package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cinema;
import model.Localidade;

public class CinemaController {
    
    private ArrayList<Cinema> cinemas;
    private ArrayList<Localidade> localidades;

    public CinemaController() {
        this.cinemas = new ArrayList<>();
        this.localidades = new ArrayList<>();
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public List<Localidade> getLocalidades() {
        return localidades;
    }

    public void cadastrar(Cinema cinema) {
        if (!cinemas.contains(cinema)) {
            cinemas.add(cinema);
        } else {
            System.out.println("=============================");
            System.out.println("Cinema já existente!");
            System.out.println("=============================");
        }
    }

    public void buscar(String nome, String localidade) {
        boolean found = false;
        
        for (Localidade valor : localidades) {
            Localidade local = valor;
            if ((local.getCinema().getNome().equals(nome) || (local.getendereco().equals(localidade)))) {
                System.out.println(local);
                found = true;
            }
        }

        if (!found) {
            System.out.println("=============================");
            System.out.println("Localidade não encontrada!");
            System.out.println("=============================");
        }
    }

    public void editar() {}

    public void deletar(Cinema cinema) {
        cinemas.remove(cinema);
    }
}
