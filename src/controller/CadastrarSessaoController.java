package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Dados;
import model.Sala;
import model.Sessao;
import view.CadastrarSessao;
import view.Menu;

/**
 * Classe controller responsável por toda a lógica da classe CadastrarSessoa
 * 
 * @author Wesley Lira Carvalho 
 */
public class CadastrarSessaoController {
    
    private final CadastrarSessao view;
    private Sala salaEscolhida;
    private CadastrarSalaController telaSala;

    /**
     * Responsável pela inicialização da view
     * 
     * @param view A tela de CadastrarSessão
     */
    public CadastrarSessaoController(CadastrarSessao view) {
        this.view = view;
    }

    /**
     * Pega os dados inseridos e os cadastra dentro de uma
     * arrayList de sessões
     */
    public void CadastrarSessao() {
        String data = view.getDataSessaoField().getText();
        String horario = view.getHorarioSessaoField().getText();

        Dados.getSessoes().add(new Sessao(data, horario));
    }

    /**
     * Gera uma ação dependendo de qual botão foi clicado
     * 
     * Os casos podem ser:
     *      (1) -> botão Confirmar: cadastrar as informações inseridas
     * em uma arraylist, e retorna com uma mensagem confirmando o cadastro
     * e te redirecionado para a tela de Menu.
     * 
     *      (2) -> botão Voltar: retorar ao Menu.
     * 
     *      (3) -> último item significa buscar a sala escolhida que foi
     * selecionada dentro de uma comboBox
     * 
     * @param botao Botão na tela de View no formato Object
     */
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
     * A comboBox é sempre atualizada com um novo modelo
     * cada vez que uma Sala nova é cadastrada
     * @return Novo modelo da comboBox atualizada
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
     * Busca dentro de uma array de Salas cadastradas aquela
     * que queremos especificamente para que possamos buscar
     * o seu nome/dados
     * 
     * @param num Parâmetro para procurar a sala pelo seu número
     * @return Retorna o número da Sala cadastrada ou apenas retorna null caso
     * não ache
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
     * @return o modelo que foi digitado no cadastro de sessão
     */
    public Sessao obterModeloSessao() {
        String data = view.getDataSessaoField().getText();
        String horario = view.getHorarioSessaoField().getText();

        return new Sessao(data, horario);
    }
}
