package nuevomenu;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static nuevomenu.Metodos.alto;
import static nuevomenu.Metodos.ancho;


public class Fisica extends JFrame{
    
    Metodos grafica = new Metodos();
    
        public static JTextField altura1 = new JTextField("100");
        public static JTextField distancia_canasta1 = new JTextField("100");
        public static JTextField peso_balon1 = new JTextField("");
        public static JTextField fuerzaN = new JTextField("");
        public static JTextField velocidadV = new JTextField("");
        public static JComboBox<String> gravedad1 = new JComboBox();
        public static JTextField xmax = new JTextField("10");
        public static JTextField xmin = new JTextField("10");
        public static JTextField ymax = new JTextField("10");
        public static JTextField ymin = new JTextField("10");
        
        Container C = getContentPane();
        
        int m1=0,m2=0,m3=0,m4=0,longitud1=0,longitud2=0,ejex=0, ejey=0;
        public static double h=100;
                
    private final MenuPrincipal em;
    
    JButton volver, buscar2, informacion;
    JPanel buscar, tema1;
    
    
    public Fisica(MenuPrincipal em){
        
        super("Juego de Fisica");
        this.em = em;
        setSize(900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color ( 198, 197, 235));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        
        altura1.setBounds(180, 8, 150, 40);
        distancia_canasta1.setBounds(180, 68, 150, 40);
        peso_balon1.setBounds(180, 125, 150, 40);
        fuerzaN.setBounds(180, 188, 150, 40);
        velocidadV.setBounds(180, 260, 150, 40);
        String[] planetas = {"Mercurio", "Venus", "La Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"};
        gravedad1 = new JComboBox<>(planetas);
        gravedad1.setBounds(180, 325, 100, 40);
        
        BotonVolver();
        panelinformacion();
        juego();
        juegoInformacion();
      
        add(volver);
    }
    
        public void Buscar(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/start.png"));
   
        buscar2 = new MiBoton();
        buscar2.setIcon(icono);
        buscar2.setBounds(140, 365, 70, 60);
        
        buscar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buscar2.setContentAreaFilled(false);
        buscar2.setBorderPainted(false);
        buscar2.setFocusPainted(false);
        buscar2.setVisible(true);
        
        buscar2.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            double h1=Double.parseDouble(altura1.getText());
            
                m1=Integer.parseInt(xmax.getText());
                m2=Integer.parseInt(xmin.getText()); 
                m3=Integer.parseInt(ymax.getText()); 
                m4=Integer.parseInt(ymin.getText());
                
                longitud1 = (int) ancho/(Math.abs(10)+Math.abs(-10));
                longitud2 = (int) alto/(Math.abs(10)+Math.abs(-10));
                
                double p=(longitud2*(1.0/alto));
                double w=(1.0/longitud1);
                
                String opcionSeleccionada = (String) gravedad1.getSelectedItem();
                
                if ("Mercurio".equals(opcionSeleccionada)) {
                    //JOptionPane.showMessageDialog(null, opcionSeleccionada);
                    double g = 3.7;
                    double v = Metodos.f1(h1, g);
                    for (int x = 0; x < 459; x++) {
                        double y = alto-Metodos.f(h1,g);
                        Metodos.ejeX[x]=x+30;
                        Metodos.ejeY[x]=y;
                        grafica.repaint();
                    }
                    //grafica.repaint();
                    
                }
                 
                /*if ("Venus".equals(opcionSeleccionada)) {
                    double g = 8.87;
                    for (int x = 0; x < 459; x++) {
                        double y = alto-Metodos.f(h,g);
                        Metodos.ejeX[x]=x+30;
                        Metodos.ejeY[x]=y;
                    }
                    grafica.repaint();
                }
                
                if ("La Tierra".equals(opcionSeleccionada)) {
                    double g = 9.81;
                    for (int x = 0; x < 459; x++) {
                        double y = alto-Metodos.f(h,g);
                        Metodos.ejeX[x]=x+30;
                        Metodos.ejeY[x]=y;
                    }
                    grafica.repaint();
                }
                
                if ("Marte".equals(opcionSeleccionada)) {
                    double g = 3.71;
                    for (int x = 0; x < 459; x++) {
                        double y = alto-Metodos.f(h,g);
                        Metodos.ejeX[x]=x+30;
                        Metodos.ejeY[x]=y;
                    }
                    grafica.repaint();
                }
                
                if ("Júpiter".equals(opcionSeleccionada)) {
                    double g = 24.79;
                    for (int x = 0; x < 459; x++) {
                        double y = alto-Metodos.f(h,g);
                        Metodos.ejeX[x]=x+30;
                        Metodos.ejeY[x]=y;
                    }
                    grafica.repaint();
                }
                
                if ("Saturno".equals(opcionSeleccionada)) {
                    double g = 10.44;
                    for (int x = 0; x < 459; x++) {
                        double y = alto-Metodos.f(h,g);
                        Metodos.ejeX[x]=x+30;
                        Metodos.ejeY[x]=y;
                    }
                    grafica.repaint();
                }
                
                if ("Urano".equals(opcionSeleccionada)) {
                    double g = 8.87;
                    for (int x = 0; x < 459; x++) {
                        double y = alto-Metodos.f(h,g);
                        Metodos.ejeX[x]=x+30;
                        Metodos.ejeY[x]=y;
                    }
                    grafica.repaint();
                }
                
                if ("Neptuno".equals(opcionSeleccionada)) {
                    double g = 11.15;
                    for (int x = 0; x < 459; x++) {
                        double y = alto-Metodos.f(h,g);
                        Metodos.ejeX[x]=x+30;
                        Metodos.ejeY[x]=y;
                    }
                    grafica.repaint();
                }*/
            }
          
        });
        
      setVisible(true);
       
      buscar.add(buscar2);
    }
        
        public void panelinformacion(){
            
        JLabel altura, distancia_canasta,peso_balon, fuerza_ejercida, velocidad_viento, gravedad;
        
        altura = new JLabel("Altura (m)");
        altura.setBounds(20, 20, 100, 20);
        altura.setFont(new Font("Agency FB", Font.BOLD | Font.PLAIN, 22)); 
      
        distancia_canasta = new JLabel("<html>Distancia de<br> la canasta (m)<html>");
        distancia_canasta.setBounds(20, 60, 200, 50);
        distancia_canasta.setFont(new Font("Agency FB", Font.BOLD | Font.PLAIN, 22)); 
        
        peso_balon = new JLabel("Peso del balon (kg)");
        peso_balon.setBounds(20, 117, 200, 50);
        peso_balon.setFont(new Font("Agency FB", Font.BOLD | Font.PLAIN, 22));
         
        fuerza_ejercida = new JLabel("<html>Fuerza de tiro<br> (newton)<html>");
        fuerza_ejercida.setBounds(20, 180, 200, 50);
        fuerza_ejercida.setFont(new Font("Agency FB", Font.BOLD | Font.PLAIN, 22));
        
        velocidad_viento = new JLabel("<html>Velocidad del viendo<br>(m/s)<html>");
        velocidad_viento.setBounds(20, 260, 200, 50);
        velocidad_viento.setFont(new Font("Agency FB", Font.BOLD | Font.PLAIN, 22));
        
        gravedad = new JLabel("Gravedad");
        gravedad.setBounds(20, 320, 200, 50);
        gravedad.setFont(new Font("Agency FB", Font.BOLD | Font.PLAIN, 22));
                
       
        buscar = new JPanel();
        buscar.setBackground(new Color ( 185, 184, 245));  
        buscar.setBounds(20, 100, 350, 420);
        buscar.setLayout(null);
        Buscar();
        
        add(buscar);
        buscar.add(altura);
        buscar.add(distancia_canasta);
        buscar.add(peso_balon);
        buscar.add(fuerza_ejercida);
        buscar.add(velocidad_viento);
        buscar.add(gravedad);
        
        buscar.add(altura1);
        buscar.add(distancia_canasta1);
        buscar.add(peso_balon1);
        buscar.add(fuerzaN);
        buscar.add(velocidadV);
        buscar.add(gravedad1);
        
    }
    
        public void juego(){
        tema1 = new JPanel();
        JLabel titulo = new JLabel("Encestar la pelota :D");
        grafica.setBounds(10, 50, Metodos.ancho, Metodos.alto);
        tema1.add(grafica);
     
        tema1.setBackground(new Color ( 185, 184, 245));  
        tema1.setBounds(400, 28, 450, 350);
        tema1.setLayout(null);
        info();
        repaint();
        tema1.setVisible(true);
        
        add(tema1);
        }
        
        public void juegoInformacion(){
        tema1 = new JPanel();
        JLabel titulo = new JLabel("Resultado final");
        titulo.setBounds(5, 0, 200, 20);
        tema1.add(titulo);
     
        tema1.setBackground(new Color ( 185, 184, 245));  
        tema1.setBounds(400, 400, 450, 120);
        tema1.setLayout(null);
        tema1.setVisible(true);
        
        add(tema1);
        }
    
        public void BotonVolver(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/volver.png"));
   
        volver = new MiBoton();
        volver.setIcon(icono);
        volver.setBounds(0, 0, 99, 99);
        
        volver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        volver.setContentAreaFilled(false);
        volver.setBorderPainted(false);
        volver.setFocusPainted(false);
        volver.setVisible(true);
        
        volver.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
        setVisible(false);
        dispose();
         em.setVisible(true);
            }
        });
        
      setVisible(true);
       
    }
        
        public void info(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/libro-guia.png"));
   
        informacion = new MiBoton();
        informacion.setIcon(icono);
        informacion.setBounds(410, 10, 35, 30);
        
        informacion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        informacion.setContentAreaFilled(false);
        informacion.setBorderPainted(false);
        informacion.setFocusPainted(false);
        informacion.setVisible(true);
        tema1.add(informacion);
        
        informacion.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            JOptionPane.showMessageDialog(null, "<html>Visualiza el escenario:\n" +
                "\n" +
                "En la pantalla, verás un escenario dividido en dos partes.\n" +
                "En la parte izquierda se muestra la plataforma desde donde lanzarás el balón.\n" +
                "En la parte derecha se dibuja el recipiente donde el balón debe ingresar.\n" +
                "Configura los parámetros del juego:\n" +
                "\n" +
                "En la pantalla, busca una sección donde puedas ingresar los parámetros del juego.\n" +
                "Ingresa la altura de la plataforma desde donde lanzarás el balón.\n" +
                "Especifica la distancia entre la plataforma y el recipiente.\n" +
                "Ingresa el peso del balón que lanzarás.\n" +
                "Determina la fuerza que ejercerás al momento del lanzamiento.\n" +
                "Ajusta la velocidad del viento en ese momento.\n" +
                "Selecciona el valor de la gravedad de entre las opciones disponibles: Mercurio, Venus, La Tierra, Marte, Júpiter, Saturno, Urano o Neptuno.\n" +
                "Comienza el juego:\n" +
                "\n" +
                "Una vez que hayas configurado todos los parámetros, busca un botón o enlace que indique \"Iniciar juego\" o similar.\n" +
                "Haz clic en el botón para comenzar.\n" +
                "Intentos para ingresar el balón:\n" +
                "\n" +
                "Tendrás tres intentos para lanzar el balón y hacerlo ingresar en el recipiente.\n" +
                "Cada intento se realizará de manera secuencial.\n" +
                "Observa la trayectoria del balón:\n" +
                "\n" +
                "En la pantalla, se dibujará la trayectoria del balón a medida que cae hacia el recipiente.\n" +
                "La trayectoria se mostrará en al menos 5 momentos diferentes.\n" +
                "Por cada momento, se mostrará la distancia recorrida, la aceleración y el tiempo de caída.\n" +
                "Resultado final:\n" +
                "\n" +
                "Cuando el balón finalmente caiga y termine la caída libre, se mostrará el resultado final.\n" +
                "El resultado incluirá la distancia total recorrida, la aceleración total y el tiempo total de caída.\n" +
                "¡Disfruta del juego de física de caída libre parabólica y casi-parabólica!\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<html>");
            }
        });
        
     
       
    }
    
}
    


