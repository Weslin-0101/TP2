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
import model.Sala;
import model.Sessao;

public class VisualizarFilmesController {
    
    private VisualizarFilmes view;
    private Filme filmeEscolhido;
    private Sala salaEscolhido;
    private Sessao sessaoEscolhido;
    private CadastrarFilmeController telaFilme;
    private CadastrarSalaController telaSala;
    private CadastrarSessaoController telaSessao;

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
            salaEscolhido = buscarSalaEscolhida(view.getSalaComboBox().getSelectedItem().toString());
            sessaoEscolhido = buscarSessaoEscolhida(view.getSalaComboBox().getSelectedItem().toString());

            Filme modeloTela = telaFilme.pegarModelo();
            Sala modeloSala = telaSala.obterModelo(); 
            Sessao modeloSessao = telaSessao.obterModeloSessao();
        }
    }


    /**
     * Método para que possa atualizar o ComboBox
     * @return um comboBox atualizado com a seleção de filmes
     */
    public DefaultComboBoxModel<String> atualizarCaixaFilmes() {
        return new DefaultComboBoxModel<>(arraysFilmes());
    }

    /**
     * Retorna um novo Array de filmes
     * @return
     */
    public String[] arraysFilmes() {
        List<String> modelo = new ArrayList<>();

        for (Filme filme : Dados.getFilmes()) {
            modelo.add(filme.getTitulo());
        }

        return  modelo.toArray(new String[0]);
    }

    /**
     * Nesse método ele busca pelo filme que foi selecionado
     * no ComboBox e imprime as informações dele
     * @param name
     * @return null caso não encontre nada
     */
    public Filme buscarFilmeEscolhido(String name) {
        for (Filme filmeAgora : Dados.getFilmes()) {
            if (filmeAgora.getTitulo().equals(name)) {
                return filmeAgora;
            }
        }

        return null;
    }

    /**
     * Daqui em diante são apenas métodos idênticos
     * porém para classes diferentes. A lógica é a mesma
     * para todos
     * @return um item novo para o ComboBox
     */
    public DefaultComboBoxModel<String> atualizarSala() {
        return new DefaultComboBoxModel<>(arraysSala());
    }

    public String[] arraysSala() {
        List<String> modelo = new ArrayList<>();

        for (Sala sala : Dados.getSalas()) {
            modelo.add(Integer.toString(sala.getNumeroDaSala()));
        }

        return modelo.toArray(new String[0]);
    }

    public Sala buscarSalaEscolhida(String num) {
        for (Sala salaAgora : Dados.getSalas()) {
            if (Integer.toString(salaAgora.getNumeroDaSala()).equals(num)) {
                return salaAgora;
            }
        }

        return null;
    }

    public DefaultComboBoxModel<String> atualizarSessao() {
        return new DefaultComboBoxModel<>(arraysSessao());
    }

    public String[] arraysSessao() {
        List<String> modelo = new ArrayList<>();

        for (Sessao sessao : Dados.getSessoes()) {
            modelo.add(sessao.getHorario());
        }

        return modelo.toArray(new String[0]);
    }

    public Sessao buscarSessaoEscolhida(String horario) {
        for (Sessao sessaoAgora : Dados.getSessoes()) {
            if (sessaoAgora.getHorario().equals(horario)) {
                return sessaoAgora;
            }
        }

        return null;
    } 
}
