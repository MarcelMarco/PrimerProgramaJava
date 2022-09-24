package dsa.polimorfisme;

import java.util.Arrays;

import dsa.polimorfisme.Figura;
import dsa.polimorfisme.Quadrat;
import dsa.polimorfisme.Cercle;
import dsa.polimorfisme.Rectangle;
import dsa.polimorfisme.Triangle;

public class GestorFiguras {

    public static double suma (Figura[] v) { //Funcion retorna el sumatorio total de areas de la array
        double sum = 0;
        for (Figura f:v) {
            sum = sum + f.area(); //Supongo que un sum+= f.area sirve, ala i++
        }
        return sum;
    }
    public static void sort(Figura[] v){ //Ordena en orden ascendente elementos comparables mutuamente(natural ordering)
        Arrays.sort(v);
    }

    public static void print(Figura[] v){
        for (Figura f:v){   //Por cada figura "f" dentro de v
            System.out.println(f.getClass().getSimpleName() + " " + f.area());
        }
    }
    public static void main(String[] args) {
        Figura[] v = new Figura[4];  //Array de figuras  de long fija
        Figura  r = new Rectangle(5,3);  //Definimos un rectangulo con lados 5 y 3, la clase se encarga de construirlo
        v[0] = r;
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Triangle(3,4);

        for (int i=0;i<v.length;i++){
            System.out.println("El area de la figura "+i+" és : "+v[i].area());
        }

        double res = suma(v);
        System.out.println("suma: "+res);
        print(v);
        //System.out.println(v[0].getClass().getSimpleName()); //Imprimir si es rect, circulo etc
        sort(v);
        System.out.println("\nAhora la lista ordenada");
        print(v);
        //System.out.println(v[0].area());
    }
}
