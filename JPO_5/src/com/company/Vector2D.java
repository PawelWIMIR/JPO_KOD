package com.company;

public class Vector2D {
    public double x; // współrzędne wektora, publiczne
    public double y;

    public Vector2D() {
        //Konstruktor domyślny
        x = 0;
        y = 0;
    }
    //możemy nadać dowolne wartości polom klasy, konstruktor domyślny

    public Vector2D(double x1, double y1) {
        x = x1;
        y = y1;
    }
    
}