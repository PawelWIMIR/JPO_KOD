package com.company;

public class Punkt
{
    protected float masa;

    //konstruktor domyślny
    public Punkt()
    {
        //przypisanie wartości domyślnej do masy
        this.masa = 1;
    }
    //konstruktor z parametrami
    public  Punkt(float masa)
    {
        // kontrola wartości
        if (masa > 0) {
            this.masa = masa;
        }
        else {
            this.masa = 1;
        }
    }
    //Główny moment bezwładności
    public float GlownyMomentBezwladnosci()
    {
        return 0;
    }
    //Moment bezwładności ze Steinera
    public  float MomentBezwladnosciLiczonySteinerem(float odl)
    {
        return GlownyMomentBezwladnosci() + masa*odl*odl;
    }
    //metoda zwaracająca masę punktu
    public String Opis()
    {
        return "Punkt materialny";
    }
    //metoda, która pozwalaja zmienić masę punktu
    public void zmienianieMasy(float mass)
    {
        this.masa = masa;
    }
    //metoda pozwalająca zwrócić masę punktu
    public float zwracanieMasy()
    {
        return this.masa;
    }
}





