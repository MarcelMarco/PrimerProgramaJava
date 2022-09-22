package dsa.polimorfisme;

import dsa.polimorfisme.Figura;

public class Triangle extends Figura {
    private double base, altura;
    public Triangle(double b, double a){
        super();
        this.base = b;
        this.altura = a;
    }
    public double area(){
        return ((this.base * this.altura) / 2);
    }
}
