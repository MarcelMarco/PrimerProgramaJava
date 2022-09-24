package dsa.polimorfisme;

import dsa.polimorfisme.Figura;

public class Rectangle extends Figura {
    private double lado1, lado2;
    public Rectangle(double l1, double l2){
        super();
        this.lado1 = l1;
        this.lado2 = l2;
    }

    public double area(){
        return this.lado1 * this.lado2;
    }
}