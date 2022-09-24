package dsa.polimorfisme;

import dsa.polimorfisme.GestorFiguras;

public abstract class Figura implements Comparable<Figura> {
    public abstract double area();
    //@Overrride
    public int compareTo(Figura o) {
        return Double.compare(this.area(), o.area());
    }
}