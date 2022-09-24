package dsa.polimorfisme;

import dsa.polimorfisme.Figura;

public class Cercle extends Figura {
    private double radio;
    public Cercle(double r){
        super();
        this.radio = r;
    }
    public double area(){
        return Math.PI * this.radio * this.radio;
    }
}
