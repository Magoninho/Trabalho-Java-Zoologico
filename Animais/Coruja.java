package com.mago.zoologico.Animais;

public class Coruja extends Animal implements Voador {

    public Coruja(String nome, int idade, char genero) {
        super(nome, idade, genero);
    }

    @Override
    public void fazerBarulho() {

    }

    @Override
    public void voar() {

    }
}
