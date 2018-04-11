package Bryly;
public class Walec extends Punkt
{
    protected float wysokosc;
    protected float promien;
    //konstruktor domyślny
    public Walec() {
        //przypisanie stalej wartosci z Superklasy
        super();
        //przypisanie stalych wartosci dla wysokosci i promienia
        this.wysokosc = 5f;
        this.promien = 5f;
    }
    //konstruktor z parametrami
    public Walec( float masa, float wysokosc, float promien)
    {
        // kontrola wartosci, jesli bedzie minusowo przypisuje odgornie 1;
        if(masa > 0) {
            this.masa = masa;
        }
        else {
            masa = 1;
        }

        if(wysokosc > 0) {
            this.wysokosc = wysokosc;
        }
        else {
            this.wysokosc = 1;
        }

        if(promien > 0) {
            this.promien = promien;
        }
        else {
            this.promien = 1;
        }

    }
    //settery
    public void zmianaWysokosci (float wysokosc)
    {
        this.wysokosc = wysokosc;
    }
    public  void zmianaPromienia(float promien)
    {
        this.promien = promien;
    }
    //gettery
    public float zwrocWysokosc()
    {
        return  this.wysokosc;
    }
    public float zwrocPromien()
    {
        return  this.promien;
    }
    //przeciazana metoda liczaca glowny moment bezwladnosci
    public float GlownyMomentBezwladnosci()
    {
        return masa*3f*promien*promien + 1f/12f*masa*wysokosc*wysokosc;
    }
    //przeciazana metoda liczaca  moment bezwladnosci względem osi rownoleglej
    public float MomentBezwladnosciSteiner(float odleglosc)
    {
        return GlownyMomentBezwladnosci() + masa*odleglosc*odleglosc;
    }
    public void Opis()
    {
        System.out.println("Walec");
    }
}

