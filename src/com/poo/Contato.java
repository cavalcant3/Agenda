package com.poo;

public class Contato {
    private String nome;
    private int numero;
    private int id;


    public Contato(String nome, int numero, int id) {
        this.nome = nome;
        this.numero = numero;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
