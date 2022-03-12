package com.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> registros = new ArrayList<Contato>();


    public void registrarContato(Contato contato) {
        registros.add(contato);

    }

    public int quantContatos() {
        int quantidade = registros.size();


        return quantidade;
    }

    public void listarContatos() {
        for (int i = 0; i < registros.size(); i++) {
            System.out.println("Cod.: " + registros.get(i).getId());
            System.out.println("Nome: " + registros.get(i).getNome());
            System.out.println("Telefone: " + registros.get(i).getNumero());

        }


    }

    public void apagarTodos() {
        registros.clear();
    }

    public void apagarTelefone(int id) {
        registros.remove(id);
    }

}
