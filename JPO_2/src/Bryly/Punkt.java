package Bryly;

public class Punkt
{
    protected float masa;

    //konstruktor domyślny
    public Punkt()
    {
        //przypisanie wartości domyślnej do masy
        this.masa = 1f;
    }
    //konstruktor z parametrami
    public  Punkt(float masa)
    {
        // kontrola wartości
        if(masa > 0)
        {
            this.masa = masa;
        }

        else
        {
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
    //metoda zwracająca masę punktu
    public void Opis()
    {
        System.out.println("Punkt Materialny");
    }

    //metoda, która pozwala zmienić masę punktu
    public void zmienianieMasy(float mass)
    {
        this.masa = mass;
    }
    //metoda, która pozwala zwrócić masę punktu
    public float zwracanieMasy()
    {
        return this.masa;
    }

}





