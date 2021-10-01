package controller;

import model.Dados;
import model.Sessao;
import view.CadastrarSessao;
import view.Menu;

public class CadastrarSessaoController {
    
    private final CadastrarSessao view;

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
        } else {
            this.view.dispose();
            new Menu().setVisible(true);
        }
    }
}
