package model;

import java.util.ArrayList;
import java.util.List;


/*
 * Classe que simula o Banco de Dados
 * Aqui reside todas as ArrayList das classes que vamos utlizar 
 */
public abstract class Dados {
    
    private static final ArrayList<Administracao> admins = new ArrayList<>();
    private static final ArrayList<Cliente> clientes = new ArrayList<>();
    private static final ArrayList<Filme> filmes = new ArrayList<>();
    private static final ArrayList<Localidade> localidades = new ArrayList<>();
    private static final ArrayList<Cinema> cinemas = new ArrayList<>();
    private static final ArrayList<Sessao> sessoes = new ArrayList<>();
    private static final ArrayList<Alimento> alimentos = new ArrayList<>();
    private static final ArrayList<Pagamento> pagamentos = new ArrayList<>();
    
    /*
        Construtor para que não seja possível herdar a classe
        ou instanciar
    */

    private Dados() {
    }

    /*
     * Neste método é onde estão instanciados os dados pré cadastrados
     * de todas as classes
     * Deve ser instanciada dentro da classe Login para que tudo possa funcionar 
     */
    public static void iniciar() {

        Cliente cliente = new Cliente("wesley", "23/10/2001", "25450", "arroz@gmail.com", "wesley");
        clientes.add(cliente);

        Administracao admin = new Administracao("admin", "admin");
        admins.add(admin);

        Filme filme = new Filme("Guerra", "120min", "Brabo demais", "Ação, Aventura", "Sim", "Brad Pitt | Agostinha Carrara", "Tarantino");
        filmes.add(filme);
    }

    public static List<Administracao> getAdmin() {
        return admins;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static List<Filme> getFilmes() {
        return filmes;
    }

    public static List<Localidade> getLocalidades() {
        return localidades;
    }

    public static List<Cinema> getCinemas() {
        return cinemas;
    }

    public static List<Sessao> getSessoes() {
        return sessoes;
    }

    public static List<Alimento> getAlimentos() {
        return alimentos;
    }

    public static List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    /*
     * 
     * Método retorna um objeto do tipo Cliente para o caso
     * da função encontrar dentro do banco de dados na classe
     * Dados o cliente cadastrado.
     * 
     */
    public static Cliente selecionarPorNomeESenha(Cliente cliente) {
        for (Cliente clienteLista : Dados.clientes) {
            if (nomeESenhaIguais(clienteLista, cliente)) {
                return clienteLista;
            }
        }
        return null;
    }
    
    /*
     * Método onde recebe dois parâmetros Objeto do tipo Cliente.
     * Nesse método, é para equiparar o nome e senha que fora usados
     * para o cadastro.
     * 
     */
    private static boolean nomeESenhaIguais(Cliente cliente, Cliente clienteProcura) {
        return cliente.getNome().equals(clienteProcura.getNome()) && cliente.getSenha().equals(clienteProcura.getSenha());
    }

    public static List<Cliente> selecionaTudo() {
        return Dados.getClientes();
    }
}
