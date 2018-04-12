package com.company;

import static java.lang.Math.sqrt;

public class Vector2D {
    //1
    //vector coordinates
    public float posX;
    public float posY;
    //2
    //default constructor
    public Vector2D()
    {
        this.posX = 0f;
        this.posY = 0f;

    }
    //constructor with parameters
    public Vector2D(float posX, float posY)
    {
        this.posX = posX;
        this.posY = posY;
    }
    //3
    public Vector2D VectorSum(Vector2D v)
    {

        Vector2D vektor = new Vector2D(this.posX + v.posX, this.posY+v.posY);
        return vektor;
    }
    //4
    public Vector2D VectorSubtraction(Vector2D v)
    {
        Vector2D vektor = new Vector2D(this.posX-v.posX, this.posY-v.posY);
        return vektor;
    }
    //5
    public Vector2D VectorMultiplication (float x)
    {
        Vector2D vector = new Vector2D(this.posX * x, this.posY * x);
        return vector;
    }
    //6
    public float VectorLength()
    {
        return (float)sqrt(this.posX*this.posX + this.posY*this.posY);
    }
    //7
    public Vector2D VectorNormalized()
    {
        Vector2D vector = new Vector2D(this.posX/VectorLength(), this.posY/VectorLength());
        return vector;
    }
}

