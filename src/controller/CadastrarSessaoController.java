package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Dados;
import model.Sala;
import model.Sessao;
import view.CadastrarSessao;
import view.Menu;

public class CadastrarSessaoController {
    
    private final CadastrarSessao view;
    private Sala salaEscolhida;
    private CadastrarSalaController telaSala;

    public CadastrarSessaoController(CadastrarSessao view) {
        this.view = view;
    }

    public void CadastrarSessao() {
        String data = view.getDataSessaoField().getText();
        String horario = view.getHorarioSessaoField().getText();

        Dados.getSessoes().add(new Sessao(data, horario));
    }

    public void executarBotao(Object botao) {

        if (botao == view.getConfirmarSessaoBtn()) {
            CadastrarSessao();
            view.mostrarMensagemConfirmando("Cadastro finalizado com sucesso!");
            this.view.dispose();
            new Menu().setVisible(true);
        } else if (botao == view.getVoltarSessaoBtn()){
            this.view.dispose();
            new Menu().setVisible(true);
        } else {
            salaEscolhida = buscarSalaEscolhida(view.getSalaComboBox().getSelectedItem().toString());

            Sala modeloSala = telaSala.obterModelo();
        }
    }

    /**
     * É usado para preencher o comboBox
     * @return as salas no comboBox
     */
    public DefaultComboBoxModel<String> atualizarSala() {
        return new DefaultComboBoxModel<>(arraysSala());
    }
    
    /**
     * Sempre vai gerar uma Array de String
     * para adicionar as novas salas que foram
     * cadastradas
     * @return modelo de uma array como string
     */
    public String[] arraysSala() {
        List<String> modelo = new ArrayList<>();

        for (Sala sala : Dados.getSalas()) {
            modelo.add(Integer.toString(sala.getNumeroDaSala()));
        }

        return modelo.toArray(new String[0]);
    }

    /**
     * Método para buscar a sala que foi cadastrada
     * @param num
     * @return
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
     * Buscar o modelo da sessão que foi digitada
     * na view de cadastro
     * @return o modelo que foi digitado no cadrastro de sessão
     */
    public Sessao obterModeloSessao() {
        String data = view.getDataSessaoField().getText();
        String horario = view.getHorarioSessaoField().getText();

        return new Sessao(data, horario);
    }
}
