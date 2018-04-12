package com.company;
import javax.swing.*;
import java.awt.*;
//main class
public class SpringApplet extends JApplet{


    public static void main(String[] args) {
        //1
        Vector2D vector1 = new Vector2D(4f,6f);
        Vector2D vector2 = new Vector2D(3f,2f);
        //2
        Vector2D sum = vector1.VectorSum(vector2);
        Vector2D subs= vector1.VectorSubtraction(vector2);
        //3
        Vector2D normalized1 = vector1.VectorNormalized();
        Vector2D normalized2 = vector2.VectorNormalized();
        //4
        float length1 = vector1.VectorLength();
        float length2 = vector2.VectorLength();
        //5
        Vector2D multiplication1 = vector1.VectorMultiplication(6f);
        //6
        System.out.println("vector1 coordinates (X: "+vector1.posX+", Y: "+vector1.posY+")");
        System.out.println("vector2 coordinates (X: "+vector2.posX+", Y: "+vector2.posY+")");
        System.out.println("sum coordinates (X: "+sum.posX+", Y: "+sum.posY+")");
        System.out.println("subs coordinates (X: "+subs.posX+", Y: "+subs.posY+")");
        System.out.println("normalized1 coordinates (X: "+normalized1.posX+", Y: "+normalized1.posY+")");
        System.out.println("normalized2 coordinates (X: "+normalized2.posX+", Y: "+normalized2.posY+")");
        System.out.println("multiplication1 coordinates (X: "+multiplication1.posX+", Y: "+multiplication1.posY+")");
        System.out.println("length1: "+vector1.VectorLength());
        System.out.println("length2: "+vector2.VectorLength());

    }
}
