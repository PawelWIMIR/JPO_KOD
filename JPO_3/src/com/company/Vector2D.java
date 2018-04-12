package com.company;

import static java.lang.Math.sqrt;
public class Vector2D {
    //1
    //vector współrzędne
    public float posX;
    public float posY;
    //2
    //default konstrutkor
    public Vector2D()
    {
        this.posX = 0f;
        this.posY = 0f;

    }
    //konstruktor z parametrami
    public Vector2D(float posX, float posY)
    {
        this.posX = posX;
        this.posY = posY;
    }
    //3
    public Vector2D VectorSumowanie(Vector2D v)
    {

        Vector2D vektor = new Vector2D(this.posX + v.posX, this.posY+v.posY);
        return vektor;
    }
    //4
    public Vector2D VectorOdejmowanie(Vector2D v)
    {
        Vector2D vektor = new Vector2D(this.posX-v.posX, this.posY-v.posY);
        return vektor;
    }
    //5
    public Vector2D VectorMnozenie (float x)
    {
        Vector2D vector = new Vector2D(this.posX * x, this.posY * x);
        return vector;
    }
    //6
    public float VectorDlugosc()
    {
        return (float)sqrt(this.posX*this.posX + this.posY*this.posY);
    }
    //7
    public Vector2D VectorZnormalizownay()
    {
        Vector2D vector = new Vector2D(this.posX/VectorDlugosc(), this.posY/VectorDlugosc());
        return vector;
    }
}

