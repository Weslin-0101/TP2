package testes;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.DefaultComboBoxModel;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import model.Cliente;
import model.Dados;
import model.Filme;
import view.CadastrarPagamento;
import view.Login;

class Teste {
	
	/**
	 * Testa o método para o cadastro de clientes.
	 * 
	 * O método vai buscar em Dados o cliente cadastrado.
	 * 
	 * Dados são pré-cadastrados.
	 */
	@Test
	void testCadastrarCliente() {
		boolean cliente2;
		
		cliente2 = Dados.getClientes().add(new Cliente("Eduarda", "13/10/2001", "1245785221", "dudu@gmail.com", "duarda"));
		
		Assert.assertTrue(cliente2);
	}
	
	/**
	 * Testa o método para o cadastro de filmes.
	 * 
	 * O método vai buscar em Dados os filmes cadastrados.
	 * 
	 * Dados são pré-cadastrados.
	 */
	@Test
	void testCadastrarFilme() {
		boolean filme1;
		boolean filme2;
		
		filme1 = Dados.getFilmes().add(new Filme("Zubilandia", "1h35min", "Muito bom", "Ação, Aventura", "Sim", "Cleber", "Andrew"));
		filme2 = Dados.getFilmes().add(new Filme("Todo mundo odeia o Chris", "2h", "PERFEITO", "Comédia", "Não", "Chris Rock | Ryan Gosling", "Jack Snyder"));		
		
		Assert.assertTrue(filme1);
		Assert.assertTrue(filme2);
	}
	
	/**
	 * Testa o método para a validação de cliente/admin.
	 * 
	 * O método compara os digitos que foram inseridos dentro das labels
	 * da tela de Login com os dados que são registrados no banco de Dados.
	 * 
	 * Dados são pré-cadastrados.
	 */
	@Test
	void testValidarLogin() {
		
		Login tela = new Login();
		
		String name = "Joao";
		String senha = "joao";
		
		tela.getUsername().setText(name);
		tela.getPassword().setText(senha);
		
		assertNotNull(tela.getController().obterModelo());
	}
	
	/**
	 * Testa o método de atualizarClientes da classe CadastrarPagamentoController.
	 * 
	 * O método primeiramente vai em busca nos Dados todos os clientes cadastrados, assim
	 * ele retorna um ComboBoxModel atualizado com a lista de clientes cadastrados com
	 * os seus nomes.
	 * 
	 * Dados são pré-cadastrados.
	 */
	@Test
	void testLerClientesCadastrados() {
		Dados.getClientes().add(new Cliente("Joao", "14/10/2001", "1245785221", "juju@gmail.com", "joao"));
		
		CadastrarPagamento tela = new CadastrarPagamento();
		
		DefaultComboBoxModel<String> lista = tela.getController().atualizarClientes();
		
		assertFalse(lista.getSize() == 0);
		
		
	}
	

}
