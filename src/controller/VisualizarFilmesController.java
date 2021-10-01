package controller;

import view.VisualizarFilmes;

import java.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import java.util.List;

import model.Dados;
import model.Filme;

public class VisualizarFilmesController {
    
    private VisualizarFilmes view;

    public VisualizarFilmesController(VisualizarFilmes view) {
        this.view = view;
    }


    public DefaultComboBoxModel<Object> atualizarCaixaFilmes() {
        return new DefaultComboBoxModel<>(arraysFilmes());
    }

    public Object[] arraysFilmes() {
        List<String> modelo = new ArrayList<>();

        for (Filme filme : Dados.getFilmes()) {
            modelo.add(filme.getTitulo());
        }

        return modelo.toArray();
    }
}
