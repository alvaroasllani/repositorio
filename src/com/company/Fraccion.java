package com.company;

class Fraccion {
    int numerador;
    int denominador;

    public Fraccion (int num, int den) {
        numerador = num;
        denominador = den;
    }

    public Fraccion sumar(Fraccion a) {
        int cont = (a.numerador * this.denominador) + (a.denominador * this.numerador);
        int cont2 = (this.denominador * a.denominador);
        Fraccion fraccion1 = new Fraccion(cont, cont2);
        return fraccion1;
    }

    public Fraccion restar(Fraccion a) {
        int cont = (a.numerador * this.denominador) - (a.denominador * this.numerador);
        int cont2 = (this.denominador * a.denominador);
        Fraccion fraccion2 = new Fraccion(cont, cont2);
        return fraccion2;
    }

    public Fraccion multiplicar(Fraccion a) {
        int cont = (this.numerador * a.numerador);
        int cont2 = (this.denominador * a.denominador);
        Fraccion fraccion3 = new Fraccion(cont, cont2);
        return fraccion3;
    }

    public Fraccion dividir(Fraccion a) {
        int cont = (a.numerador * this.denominador);
        int cont2 = (this.denominador * a.numerador);
        Fraccion fraccion4 = new Fraccion(cont, cont2);
        return fraccion4;
    }
    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }
}




