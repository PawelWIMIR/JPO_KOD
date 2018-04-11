package Bryly;
public class Pret extends  Punkt
{
    protected float dlugosc;
    //konstruktor domyślny
    public Pret() {

        //przypisuje stala wartosc z Superklasy
        super();
        //przypisuje stale wartosci dlugosci
        this.dlugosc = 4f;
    }
    //konstruktor z parametrami
    public Pret( float masa, float dlugosc)
    {  // kontrola wartosci, jesli bedzie minusowo przypisuje odgornie 1
        if(masa > 0) {
            this.masa = masa;
        }
        else {
            masa = 1;
        }
          if(dlugosc > 0) {
            this.dlugosc = dlugosc;
        }
           else {
            this.dlugosc = 1;
        }
    }
    //settery
    public void zmianaDlugosci (float dlugosc)
    {
        this.dlugosc = dlugosc;
    }
    //gettery
    public float zwrocDlugosc()
    {
        return  this.dlugosc;
    }
    //przeciazana metoda liczaca glowny moment bezwladnosci
    public float GlownyMomentBezwladnosci()
    {
        return 1f/12f*masa*dlugosc*dlugosc;
    }
    //przeciazana metoda liczaca  moment bezwladnosci względem osi rownoleglej
    public float MomentBezwladnosciSteiner(float odl)
    {
        return GlownyMomentBezwladnosci() + masa*odl*odl;
    }
    public void Opis()
    {
        System.out.println("Pret");
    }
}

