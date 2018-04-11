package com.company;
import Bryly.*;
public class Main {

    public static void main(String[] args){

        //1
        Walec walec = new Walec(3f,4f,7f);
        Pret pret = new Pret(5f, 4f);
        Kula kula = new Kula(2f,7f);

        //2
        System.out.println("Podpunkt 2");
        System.out.println();
        walec.Opis();
        System.out.println("Masa walca = "+ walec.zwracanieMasy());
        System.out.println("Promien walca =  " + walec.zwrocPromien());
        System.out.println("Wysokość walca =  " + walec.zwrocWysokosc());
        System.out.println("Główny moment walca = "+ walec.GlownyMomentBezwladnosci());
        System.out.println("Moment wzledem osi przesuniętej o 4 dla walca =  " + walec.MomentBezwladnosciSteiner(4f));

        System.out.println();
        pret.Opis();
        System.out.println("Masa pręta =  " + pret.zwracanieMasy());
        System.out.println("Długość pręta =  "+ pret.zwrocDlugosc());
        System.out.println("Główny moment pręta =  "+ pret.GlownyMomentBezwladnosci());
        System.out.println("Moment wzledem osi przesuniętej o 4 dla preta =  " + pret.MomentBezwladnosciSteiner(4f));

        System.out.println();
        kula.Opis();
        System.out.println("Masa kuli =  "+ kula.zwracanieMasy());
        System.out.println("Promień kuli =  "+ kula.zwrocPromien());
        System.out.println("Główny moment kuli =  "+ kula.GlownyMomentBezwladnosci());
        System.out.println("Moment wzledem osi przesuniętej o 4 dla kuli =  " + kula.MomentBezwladnosciSteiner(4f));
        //3

        Punkt[] tablica = new Punkt[3];
        tablica[0] = new Walec(3f,4f,5f);
        tablica[1] = new Pret(4f,2f);
        tablica[2] = new Kula(4f,6f);
        int counter = 0;

        // 4 i 5
        System.out.println();
        System.out.println("Podpunkt 4 i 5");
        System.out.println();
        for (Punkt p: tablica)
        {
            System.out.println();
            System.out.println("Obiekt nr. " + counter);
            System.out.println();
            p.Opis();
            System.out.println();
            System.out.println("Masa obiektu o numerze:  "+ counter+ " to: "+ p.zwracanieMasy());
            //sprawdzanie typów obietków
            if(p.getClass().getTypeName() == "Bryly.Walec")
            {
                System.out.println("Promień obiektu o numerze: " + counter + " =  " + ((Walec)p).zwrocPromien());
                System.out.println("Wysokość obiektu o numerze: " + counter + " =  " + ((Walec)p).zwrocWysokosc());
            }
            else if(p.getClass().getTypeName() == "Bryly.Pret")
            {
                System.out.println("Promień obiektu o numerze: " + counter + " = " + ((Pret)p).zwrocDlugosc());
            }
            else if(p.getClass().getTypeName() == "Bryly.Kula")
            {
                System.out.println("Promień obiektu o numerze: " + counter + " = " + ((Kula)p).zwrocPromien());
            }
            System.out.println("Główny moment obiektu o numerze: "+ counter+ " to: "+ p.GlownyMomentBezwladnosci());
            System.out.println("Moment wzledem osi przesuniętej o 2 dla obiektu o numerze: "+ counter+ " to: " + p.MomentBezwladnosciLiczonySteinerem(2f));
            counter++;
        }



    }
}
