package com.mago.zoologico;

import java.util.ArrayList;

public class Visita {
    protected ArrayList<Visitante> visitantes;

    public Visita() {
        this.visitantes = new ArrayList<Visitante>();
    }

    public void adicionarVisitante(Visitante visitante) {
        this.visitantes.add(visitante);
    }

    public void removerVisitante(Visitante visitante) {
        this.visitantes.remove(visitante);
    }

    public ArrayList<Visitante> getVisitantes() {
        return this.visitantes;
    }
}
