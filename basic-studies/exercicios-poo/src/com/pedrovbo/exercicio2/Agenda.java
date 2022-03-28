package com.pedrovbo.exercicio2;

import com.pedrovbo.exercicio1.Pessoa;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Agenda {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    // private Iterator<Pessoa> itr = pessoas.iterator();

    //Pessoa[] pessoas = new Pessoa[10];
    int cadastros = 0;

    public void armazenaPessoas(String nome, int idade, float altura) throws ParseException {
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void removePessoa(String nome) {
        nome = nome.toUpperCase();
        //TODO: tentar implementar foreach
        for (Iterator iterator = this.pessoas.iterator(); iterator.hasNext(); ) {
            Pessoa p = (Pessoa) iterator.next();
            if (p.getNome().toUpperCase().contentEquals(nome)) {
                iterator.remove();
            }
        }
    }

    public int buscaPessoa(String nome) {
        nome = nome.toUpperCase();
        int index = 0;
        for (Iterator iterator = this.pessoas.iterator(); iterator.hasNext(); ) {
            Pessoa p = (Pessoa) iterator.next();
            if (p.getNome().toUpperCase().contentEquals(nome)) {
                index = this.pessoas.indexOf(p);
            }
        }
        return index;

    }

    public void imprimeAgenda() {
        StringBuilder agenda = new StringBuilder();
        agenda.append("Agenda: \n");
        for (Pessoa i : this.pessoas
        ) {
            agenda.append("Nome: ").append(i.getNome())
                    .append("Altura: ").append(i.getAltura())
                    .append("Data de Nascimento: ").append(i.getDataNascimento())
                    .append("\n\n");
        }
        System.out.println(agenda);
    }

    public void imprimePessoa(int index) {
        Iterator iterator = this.pessoas.iterator();
        for (Pessoa i : pessoas
        ) {

        }
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "pessoas=" + pessoas +
                '}';
    }
}