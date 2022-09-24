package dsa.polimorfisme;

import java.util.Arrays;

import dsa.polimorfisme.Figura;
import dsa.polimorfisme.Quadrat;
import dsa.polimorfisme.Cercle;
import dsa.polimorfisme.Rectangle;
import dsa.polimorfisme.Triangle;

public class GestorFiguras {
    public static void main(String[] args) {
        Figura[] v = new Figura[4];
        Figura  r = new Rectangle(5,3);
        v[0] = r;
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Triangle(3,4);

        for (int i=0;i<v.length;i++){
            System.out.println("El area de la figura "+i+" és : "+v[i].area());
        }

        //double res = suma(v);
        //System.out.println("suma: "+res);
        //print(v);
        //sort(v);
        //print(v);
        //System.out.println(v[0].area());
    }
}
