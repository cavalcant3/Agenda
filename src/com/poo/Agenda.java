package com.poo;

import java.util.ArrayList;

public class Agenda {
  private  ArrayList<Contato> registros = new ArrayList<Contato>();

  //private Contato contato;


    public ArrayList<Contato> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Contato> registros) {
        this.registros = registros;
    }

    public void registrarContato(Contato contato) {
        registros.add(contato);

    }

    public int  quantContatos() {
        int quantidade = registros.size();


    return quantidade;
    }

}
