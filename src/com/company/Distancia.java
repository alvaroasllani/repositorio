package com.company;

public class Distancia {
    int puntox;
    int puntoy;


    public Distancia(int puntox, int puntoy) {
        puntox = puntox;
        puntoy = puntoy;

    }

    public double distancia(int puntox, int puntoy) {
        double cont1 = this.puntox - puntox;
        double cont2 = this.puntoy - puntoy;
        double cont = Math.sqrt(Math.pow(cont1, 2) + Math.pow(cont2, 2));
        return cont;
    }



}


