import model.Dados;
import view.Login;

/**
 * Essa é a main responsável por chama a tela de Login e os dados pré-cadastrados, da qual
 * logo se comunica com as outras telas do programa.
 * 
 * @author Wesley Lira Carvalho
 * @version 2.0
 */
public class Main {
    
    public static void main(String[] args) {
        
        new Login().setVisible(true);
        Dados.iniciar();
    }
}
