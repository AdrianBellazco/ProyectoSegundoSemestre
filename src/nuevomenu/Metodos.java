package nuevomenu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class Metodos extends Canvas{
    

    static int ancho=430, alto=300;
        
    static double []ejeX = new double[ancho];
    static double []ejeY = new double[ancho];
    static double []ejeX1 = new double[ancho];
    static double []ejeY1 = new double[ancho];
    
    int m1=0,m2=0,m3=0,m4=0,longitud1=0,longitud2=0,ejex=0, ejey=0; 
    
    //Funcion alcance horizontal
    static double f(double h, double g){
        double y;
        y = Math.sqrt((2*h)/g);
        return y;
    }
    //Funcion velocidad
    static double f1(double h, double g){
        double y;
        y =Math.sqrt(2 * g * h);
        return y;
    }
    
    //Funcion tiempo 
    static double f2(double t, double d, double v){
        double y;
        y = d + (v * t);
        return y;
    }
    
    @Override
        public void paint(Graphics g){
            
        m1=Integer.parseInt(Fisica.xmax.getText());
        m2=Integer.parseInt(Fisica.xmin.getText()); 
        m3=Integer.parseInt(Fisica.ymax.getText()); 
        m4=Integer.parseInt(Fisica.ymin.getText()); 
        
        ejex = (m1)+(m2);
        ejey = (m3)+(m4);
        
        longitud1 = (int) ancho/(Math.abs(m1)+Math.abs(m2));
        longitud2 = (int) alto/(Math.abs(m3)+Math.abs(m4));
        
        g.setColor(Color.BLUE);
        g.fillRoundRect(0, 0, ancho, alto,  5, 5);
        g.setColor(Color.WHITE);
        g.fillRoundRect(2, 2, ancho-4, alto-4, 3, 3);
        
        double h1=Double.parseDouble(Fisica.altura1.getText());
        int altura2 = (int)h1;
        
        g.setColor(Color.red);
        g.fillRect(2, alto-altura2, 30, altura2);
        //JOptionPane.showMessageDialog(null, h1);
        
        g.setColor(Color.CYAN);
        g.fillOval(10, alto-altura2-20, 15, 15);
        
        double h2=Double.parseDouble(Fisica.distancia_canasta1.getText());
        int distancia = (int)h2;
        
        g.setColor(Color.BLACK);
        g.fillRect(distancia, 268, 30, 30);
        

        String opcionSeleccionada = (String) Fisica.gravedad1.getSelectedItem();
        if(opcionSeleccionada != null) {
            if ("Mercurio".equals(opcionSeleccionada)) {
                
                for (int x = 1; x < 457; x++) {
                    
                    g.setColor(Color.BLACK);
                    g.drawLine((int)ejeX[x], (int)ejeY[x], (int)ejeX[x+1], (int)ejeY[x+1]);
                    //g.fillOval(10, alto-altura2-20, (int)ejeX[x+1], (int)ejeY[x+1]);
                    
                    g.setColor(Color.BLUE);
                    g.drawLine((int)ejeX1[x], (int)ejeY1[x], (int)ejeX1[x+1], (int)ejeY1[x+1]);
                    //JOptionPane.showMessageDialog(null, "fuck");
                
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
}