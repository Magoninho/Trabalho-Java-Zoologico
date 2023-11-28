package com.mago.zoologico;

import java.util.ArrayList;

import com.mago.zoologico.Animais.Animal;

public abstract class Jaula {
    private ArrayList<Animal> animais;

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public abstract void limpar();
    public abstract void realizarManutencao();
}
