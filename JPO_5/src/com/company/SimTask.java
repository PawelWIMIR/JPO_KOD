package com.company;
import java.util.TimerTask;



public class SimTask extends TimerTask
{
private static final long serialVersionUID=1L;
private SimEngine poleklasy1; // przechowywanie obiektu klasy SimEngine
private SpringApplet poleklasy2; // przechowywanie obiekty klasy SpringApplet
private double czas; // przechowywanie odstepu

    // przypisanie klas
public SimTask(SimEngine pole1, SpringApplet pole2, double odstep)
   {
        this.poleklasy1=pole1;
        this.poleklasy2=pole2;
        this.czas=odstep;
   }

public void run()
   {
        poleklasy1.przebieg(czas);   //uruchomienie obliczenia kroku
        poleklasy2.repaint();
   }
}
