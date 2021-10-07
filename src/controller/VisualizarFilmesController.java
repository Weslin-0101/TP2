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

/**
 * Classe controller que contém toda a lógica por trás da classe VisualizarFilmes
 * 
 * @author Wesley Lira Carvalho
 */
public class VisualizarFilmesController {
    
    private VisualizarFilmes view;
    private Filme filmeEscolhido;
    private Sala salaEscolhido;
    private Sessao sessaoEscolhido;
    private CadastrarFilmeController telaFilme;
    private CadastrarSalaController telaSala;
    private CadastrarSessaoController telaSessao;

    /**
     * Responsável pela inicialização da view.
     * 
     * @param view A tela de Visualizar Filmes
     */
    public VisualizarFilmesController(VisualizarFilmes view) {
        this.view = view;
    }

    /**
     * Gera uma ação de acordo com qual botão foi clicado.
     * 
     * O método tem os seguintes casos:
     *      (1) -> botão Voltar: retorna para a tela de Menu.
     *      (2) -> botão Seguir Adiante: leva para a tela de
     * Pagamento para cadastrar o método de pagamento
     * 
     * O método ainda implementa para que busque as informações do
     * filme, sala e sessão selecionada para dentro da comboBox.
     * 
     * @param e Parâmetro em ActionEvent para capturar o evento
     * quando ocorre um clique do mouse
     */
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
     * Método para que possa atualizar o ComboBox sempre
     * quando um novo Filme é cadastrado
     * 
     * @return um comboBox atualizado com a seleção de filmes
     */
    public DefaultComboBoxModel<String> atualizarCaixaFilmes() {
        return new DefaultComboBoxModel<>(arraysFilmes());
    }

    /**
     * Retorna um novo Array de filmes sempre quando um
     * Filme é cadastrado
     * 
     * @return modelo da array atualizada com os filmes
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
     * 
     * @param name Nome do filme
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
     * Atualiza sempre a ComboBox com as Salas cadastradas
     * 
     * @return Modelo novo da comboBox de Sala completamente
     * atualizada com novos items quando são cadastrados
     */
    public DefaultComboBoxModel<String> atualizarSala() {
        return new DefaultComboBoxModel<>(arraysSala());
    }

    /**
     * Cria sempre um array de Salas, isso toda vez que 
     * uma nova sala é cadastrada!
     * 
     * @return Modelo da array atualizada com a lista
     * de Salas novas cadastradas.
     */
    public String[] arraysSala() {
        List<String> modelo = new ArrayList<>();

        for (Sala sala : Dados.getSalas()) {
            modelo.add(Integer.toString(sala.getNumeroDaSala()));
        }

        return modelo.toArray(new String[0]);
    }

    /**
     * Procura dentro da array de Salas cadastradas pelo número da sala;
     * 
     * @param num da sala do qual estamos procurando dentro da array.
     * @return os dados da sala cadastrar ou então null para caso não
     * encontrar a sala.
     */
    public Sala buscarSalaEscolhida(String num) {
        for (Sala salaAgora : Dados.getSalas()) {
            if (Integer.toString(salaAgora.getNumeroDaSala()).equals(num)) {
                return salaAgora;
            }
        }

        return null;
    }

    /**
     * Sempre que uma nova sessão for cadastrada, ela atualiza
     * as informações na ComboBox.
     * 
     * @return um novo modelo da ComboBox levando como parâmentro
     * a função arraysSessao.
     */
    public DefaultComboBoxModel<String> atualizarSessao() {
        return new DefaultComboBoxModel<>(arraysSessao());
    }

    /**
     * Sempre vai criar uma nova array de sessão toda vez que
     * uma nova sessão for cadastrada.
     * 
     * @return um modelo da array no formato String atualizada.
     */
    public String[] arraysSessao() {
        List<String> modelo = new ArrayList<>();

        for (Sessao sessao : Dados.getSessoes()) {
            modelo.add(sessao.getHorario());
        }

        return modelo.toArray(new String[0]);
    }

    /**
     * Faz uma busca pelo array de sessões cadastradas para
     * procurar a sessão específica que foi selecionada
     * dentro da ComboBox.
     * 
     * @param horario é o parâmetro específico para procurar
     * a sessão dentro da array.
     * @return os dados da sessão, mais especificamente o horário
     * da sessão, mas isso para caso encontrar, caso contrário
     * ela retorna null.
     */
    public Sessao buscarSessaoEscolhida(String horario) {
        for (Sessao sessaoAgora : Dados.getSessoes()) {
            if (sessaoAgora.getHorario().equals(horario)) {
                return sessaoAgora;
            }
        }

        return null;
    } 
}
