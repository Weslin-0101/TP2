package controller;

import view.Menu;
import view.CadastrarPagamento;
import view.VisualizarFilmes;

import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;

import model.Dados;
import model.Filme;

public class VisualizarFilmesController {
    
    private VisualizarFilmes view;
    private Filme filmeEscolhido;
    private CadastrarFilmeController telaFilme;

    public VisualizarFilmesController(VisualizarFilmes view) {
        this.view = view;
    }

    public void executarBotao(ActionEvent e) {
        Object botao = e.getSource();

        if (botao == view.getVoltarBtn()) {
            new Menu().setVisible(true);
            this.view.dispose();
        } else if (botao == view.getSeguirAdianteBtn()) {
            new CadastrarPagamento().setVisible(true);
            this.view.dispose();
        } 
        
        else {
            filmeEscolhido = buscarFilmeEscolhido(view.getSelecionarFilmeComboBox().getSelectedItem().toString());

            Filme modeloTela = telaFilme.pegarModelo();
        }
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

    public Filme buscarFilmeEscolhido(String name) {
        for (Filme filmeAgora : Dados.getFilmes()) {
            if (filmeAgora.getTitulo().equals(name)) {
                return filmeAgora;
            }
        }

        return null;
    }
}
