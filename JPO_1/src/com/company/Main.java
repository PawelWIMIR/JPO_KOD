package com.company;
import javafx.scene.control.Tab;

public class Main {


    public static void main(String[] args) {

        //1

        Punkt punkt1 = new Punkt();

        //2
        Punkt punkt2 = new Punkt( 5);

        //3
        System.out.println("Masa punktu 1 =  "+punkt1.zwracanieMasy());
        System.out.println("Główny moment dla punktu 1 =  "+punkt1.GlownyMomentBezwladnosci());
        System.out.println("Moment bezwładności liczony względem osi dla punktu1 =  "+punkt1.MomentBezwladnosciLiczonySteinerem(3));
        System.out.println("Opis punktu 1 :  " + punkt1.Opis());
        System.out.println("Masa punktu 2 =  " + punkt2.zwracanieMasy());
        System.out.println("Główny moment dla punktu 2 =  "+punkt2.GlownyMomentBezwladnosci());
        System.out.println("Główny moment dla punktu 2 =  "+punkt2.MomentBezwladnosciLiczonySteinerem(3));
        System.out.println("Opis punktu 2 : " + punkt2.Opis());

        //4
        punkt1.zmienianieMasy(3.5F);

        //5
        System.out.println("Masa punktu 1 =  "+punkt1.zwracanieMasy());
        System.out.println("Główny moment dla punktu 1 =  "+punkt1.GlownyMomentBezwladnosci());
        System.out.println("Moment bezwładności licozny względem osi dla punktu 1 =  "+punkt1.MomentBezwladnosciLiczonySteinerem(2));
        System.out.println("Opis punktu 1 : " +punkt1.Opis());

        //6
        int NumOfObj = 3; //liczba obiektów w tablicy

        Punkt[] punkt = new Punkt[NumOfObj]; //  stoworzona tablica obiektów

        for ( int i = 0; i<punkt.length ; i++)
        {
            punkt[i] = new Punkt(i+5); //zmiana masy
        }

        //7

        int licznik = 0; // iterowanie obiektów

        for (Punkt obj : punkt)
        {
            System.out.println("Masa obiektu o numerze =  "+ licznik + " to: " + obj.zwracanieMasy());
            System.out.println("Opis dla obiektu numer : " + licznik + " to: "+obj.Opis());
            System.out.println("Główny moment bezwładności dla obiektu numer = " + licznik +" to: " + obj.GlownyMomentBezwladnosci());
            System.out.println("Moment bezwładności liczony względem osi dla obiektu numer =  " + licznik +" to: " + obj.MomentBezwladnosciLiczonySteinerem(2));


            licznik++;


        }

    }
}
