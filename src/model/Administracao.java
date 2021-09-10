package model;

import java.util.Date;

public class Administracao extends Pessoa{

    public Administracao(Integer id, String nome, String data, String cpf, String email, String senha) {
        super(id, nome, data, cpf, email, senha);
    }

    @Override
    public void buscar(String name) {
        boolean found = false;
        for (Pessoa value : pessoas) {
            Pessoa p = value;
            if (p.getNome().equals(name)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }

        super.buscar(name);
    }

    @Override
    public void cadastrar(Pessoa p) {
        if (!pessoas.contains(p)) {
            pessoas.add(p);
        } else {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }

        super.cadastrar(p);
    }

    @Override
    public void deletar(Pessoa p) {
        pessoas.remove(p);

        super.deletar(p);
    }

    @Override
    public void editar() {
        
        super.editar();
    }
    
    
}
