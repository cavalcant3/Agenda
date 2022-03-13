package com.poo;

public class Main {

    public static void main(String[] args) {
        /*Enunciado: Criar um sistema de Agenda Telefônica. O projeto devo possuir no mínimo 3 classes:
Contato (Código, Nome e Telefone); Agenda (aceitar no máximo 10 registros); Principal
(main com o menu de opções – ver métodos da classe Agenda).
A classe Agenda deve possuir 6 métodos:
1 - listarTodos();
2 - inserirContato(contato); //não deve aceitar telefones repetidos
3 - editarContato(telefone, contato);
4 - apagarContato(telefone);
5 - apagarTodos();
6 - imprimirMemoria(); //imprimir mensagem: 2/10*/
        Agenda c1 = new Agenda();
        Contato contato1 = new Contato();
        Contato contato2= new Contato();

        contato1.setId(1);
        contato1.setNome("matheus");
        contato1.setNumero(9663);

        c1.registrarContato(contato1);
      //  c1.registrarContato(contato2);

        //c1.apagarTodos();
        c1.apagarTelefone(0); // -- apagando por index do array list


        System.out.println("Quantidade de contatos: "+c1.quantContatos() + "/10");
        c1.listarContatos();

    }
}
