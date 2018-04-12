package com.company;
import javax.swing.*;

//main class
public class SpringApplet extends JApplet{

    public void init() {

        //1
        Vector2D vector1 = new Vector2D(5f,3f);
        Vector2D vector2 = new Vector2D(4f,6f);
        //2
        Vector2D suma = vector1.VectorSumowanie(vector2);
        Vector2D odjecie= vector1.VectorOdejmowanie(vector2);
        //3
        Vector2D znormalizowany1 = vector1.VectorZnormalizownay();
        Vector2D znormalizowany2 = vector2.VectorZnormalizownay();
        //4
        float length1 = vector1.VectorDlugosc();
        float length2 = vector2.VectorDlugosc();
        //5
        Vector2D przemnozenie = vector1.VectorMnozenie(5f);
        //6
        System.out.println("vector1 wspolrzedne (X: "+vector1.posX+", Y: "+vector1.posY+")");
        System.out.println("vector2 wspolrzedne (X: "+vector2.posX+", Y: "+vector2.posY+")");
        System.out.println("sumowanie wspolrzednych (X: "+suma.posX+", Y: "+suma.posY+")");
        System.out.println("odejmowanie wspolrzednych (X: "+odjecie.posX+", Y: "+odjecie.posY+")");
        System.out.println("znormalizowany wektor1 (X: "+znormalizowany1.posX+", Y: "+znormalizowany1.posY+")");
        System.out.println("znormalizowany wektor2 (X: "+znormalizowany2.posX+", Y: "+znormalizowany2.posY+")");
        System.out.println("wymnozenie wektora1 przez liczbe (X: "+przemnozenie.posX+", Y: "+przemnozenie.posY+")");
        System.out.println("dlugosc1: "+vector1.VectorDlugosc());
        System.out.println("dlugosc: "+vector2.VectorDlugosc());


    }

    public void paint() {
    }

}
