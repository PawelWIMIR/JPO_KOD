package com.company;

public class SimEngine
{
    private double masa;   //masa
    private double sprezystosc;   //wspolczynnik sprezystosci
    private double tlumienie;   //wspolczynnik tlumienia
    private double dlugosc;  //dlugosc swodobna sprezyny
    private double xMasy; //połozenie masy
    private double yMasy;
    private double xPunkt;  //polozenie punktu zawieszenia
    private double yPunkt;
    private double skladowaVX; //predkosc
    private double skladowaVY;
    private double G; //przyspiesznie grawitacyjne
    public double ay;
    public double t;
    public double temp;

    Vector2D polozenieMasy; //wektor okreslajacy polozenie masy
    Vector2D polozeniePunkt;//wektor okreslajacy polozenie zawieszenia

    public void getM(double podajMase) //akcesory
    {
        masa = podajMase;
    }

    public void getSprezystosc(double podajSprezystosc) {
        sprezystosc = podajSprezystosc;
    }
    public void getTlumienie(double podajTlumienie) {
        tlumienie = podajTlumienie;
    }
    public void getdlugosc(double podajdlugosc) {dlugosc = podajdlugosc; }
    public void getxMasy(double podajxMasy) {
        xMasy = podajxMasy;
    }
    public void getyMasy(double podajyMasy) {
        yMasy = podajyMasy;
    }
    public void getxPunkt(double podajxPunkt) {
        xPunkt = podajxPunkt;
    }
    public void getyPunkt(double podajyPunkt) {
        yPunkt = podajyPunkt;
    }
    public void getyV(double podajyV) {
        skladowaVY = podajyV;
    }
    public void getG(double podajG) {
        G = podajG;
    }
    public double showxPunkt() {
        return polozenieMasy.x;
    }
    public double showyPunkt() {
        return polozeniePunkt.y;
    }
    public double showxMasy() {
        return polozenieMasy.x;
    }

    public double showyMasy() {
        System.out.println(polozenieMasy.y);
        return polozenieMasy.y;
    }

    public SimEngine(double m1, double k1, double c1, double L1, double g1, double xMasy1, double yMasy1, double yPunkt1) {
        masa= m1;
        sprezystosc = k1;
        tlumienie = c1;
        dlugosc = L1;
        skladowaVX = 0;
        skladowaVY = 0;
        G = g1;
        ay = 0;
        xMasy = xMasy1;
        yMasy = yMasy1;
        xPunkt = xMasy1;  // zawieszenie ich w jednej linii
        yPunkt = yPunkt1;
        t = 0;
        polozenieMasy = new Vector2D(xMasy1, yMasy1);
        polozeniePunkt = new Vector2D(xMasy1, yPunkt1);
    }

    // metoda umozliwiajaca obliczenie przebiegu symulacji

    public void przebieg(double krok) {
        t = krok;
        ay = (masa* G - sprezystosc * polozenieMasy.y - tlumienie * skladowaVY) / masa;
        skladowaVY = skladowaVY + ay * t;
        temp = temp + skladowaVY * t + ay * t * t / 2;
        polozenieMasy.y = (int) temp;
    }

    public void reset()
    {
        skladowaVY = 0;
    }
}











