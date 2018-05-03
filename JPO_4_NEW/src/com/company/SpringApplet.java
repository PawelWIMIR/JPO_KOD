package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import javax.swing.JPanel;

public class SpringApplet extends JApplet implements MouseMotionListener, MouseListener, ActionListener {

    private static final long serialVersionUID = 1L;
    private SimEngine simE;
    private SimTask simT;
    private Timer czas;

    private boolean MYSZ_STATE;
    private int x;
    private int y;

    private TextField mass, wspolczynnikK, wspolczynnikC, G, Lpoczatkowe;
    private Button reset;

    @Override
    public void mouseMoved(MouseEvent arg0) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e){

    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();

        if((x>=(int) simE.polozenieMasy.x-25 && x<=(int) simE.polozenieMasy.x+25)&&(y>=(int) simE.polozenieMasy.y && y<=(int) simE.polozenieMasy.y+100))

        {
            czas.cancel();
            simE.reset();
            MYSZ_STATE = true;
        }

        e.consume();
    }

    public void mouseReleased(MouseEvent e)
    {
        if(MYSZ_STATE == true)
        {
            simT = new SimTask(simE,this, 0.01);
            czas = new Timer();
            czas.scheduleAtFixedRate(simT, 0, 1);
            MYSZ_STATE = false;
        }
        e.consume();
    }

    public void mouseDragged(MouseEvent arg0) {

        if (MYSZ_STATE == true) {
            simE.polozenieMasy.y = arg0.getY();
            repaint();
        }

        arg0.consume();
    }

        @Override
        public void init()
        {
            this.setSize(600,600);

            simE = new SimEngine (2,0.2,0.1,200,10,100,100,0);
            simT = new SimTask(simE,this,0.01);
            czas = new Timer();
            czas.scheduleAtFixedRate(simT, 0, 1);
            MYSZ_STATE = false;
            addMouseListener(this);
            addMouseListener(this);
            reset = new Button("RESET");
            reset.addActionListener(this);
            add(reset);
            mass = new TextField("1",4);
            wspolczynnikK=new TextField("2",4);
            wspolczynnikC=new TextField("3",4);
            Lpoczatkowe=new TextField("4",4);
            G=new TextField("5",4);

            add(mass);
            add(wspolczynnikK);
            add(wspolczynnikC);
            add(Lpoczatkowe);
            add(G);
        }

        @Override public void paint(Graphics gDC)

        {   gDC.setColor(Color.ORANGE);
            gDC.fillRect(0,0,600,600);

            gDC.setColor(Color.black);
            gDC.drawLine((int) simE.showxPunkt() + 200, (int) simE.showyPunkt(), (int) simE.polozenieMasy.x + 200, (int) simE.polozenieMasy.y);


            gDC.setColor(Color.blue);
            gDC.fillRect(((int) simE.polozenieMasy.x + 100), (int) simE.polozenieMasy.y,200, 100);

            mass.setBounds(200,500,20,20);
            wspolczynnikK.setBounds(240,500,20,20);
            wspolczynnikC.setBounds(280,500,20,20);
            Lpoczatkowe.setBounds(320,500,20,20);
            G.setBounds(360,500,20,20);
            reset.setBounds(200,540,180,40);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == reset)
            {
                czas.cancel();
                double masa=Double.parseDouble(mass.getText());
                double sprezytsc=Double.parseDouble(wspolczynnikK.getText());
                double tlumienie=Double.parseDouble(wspolczynnikC.getText());
                double l=Double.parseDouble(Lpoczatkowe.getText());
                double g=Double.parseDouble(G.getText());
                simE=new SimEngine(masa, sprezytsc, tlumienie,l,g, 100,20,0);
                simT=new SimTask(simE,this, 0.01);
                czas=new Timer();
                czas.scheduleAtFixedRate(simT, 0, 1);
                repaint();
            }
        }

    }