package Bryly;
public class Kula  extends Punkt
{
    protected float promien;
    //konstruktor domyślny
    public Kula() {
        //przypisanie stalej wartosci z Superklasy
        super();
        //przypisanie stalych wartosci promienia
        this.promien = 1f;
        this.masa = 1f;
    }
    //konstruktor z parametrami
    public Kula( float masa, float promien)
    {
        if(masa > 0) {
            this.masa = masa;
        }
        else {
            this.masa = 1;
        }

        if(promien > 0) {
            this.promien = masa;
        }
        else {
            this.promien = 1;
        }
    }
    //settery
    public  void zmianaPromienia(float promien) {
        this.promien = promien;
    }
    //gettery
    public float zwrocPromien() {
        return  this.promien;
    }
    //przeciazana metoda liczaca glowny moment bezwladnosci
    public  float GlownyMomentBezwladnosci() {
        float moment = 2f/5f*masa*promien*promien;
        return moment;
    }
    //przeciazana metoda liczaca  moment bezwladnosci względem osi rownoleglej
    public float MomentBezwladnosciSteiner(float odleglosc) {
        return GlownyMomentBezwladnosci() + masa*odleglosc*odleglosc;
    }
    public void Opis() {
        System.out.println("Kula");
    }
}

