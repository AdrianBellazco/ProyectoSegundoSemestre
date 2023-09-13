
package nuevomenu;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class TemasMatematica extends JFrame{

    private final MenuPrincipal em;
    JLabel labelFuncion, labelDerivada;
    JTextField textFieldFuncion, textFieldDerivada;
    Derivadas derivadas;
    JComboBox<String> opcion;
    JButton volver, buscar2,derivar, limpiar, salir;
    JPanel buscar, tema1, tema2, tema3;
    JEditorPane Mtema1,Mtema2;
    
    public TemasMatematica(MenuPrincipal em){
        
        super("Matematica");
        this.em = em;
        setSize(900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color ( 198, 197, 235));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        
        BotonVolver();
        
        panelTemas();
        TemaUno();
        TemaDos();
        TemaTres();
        add(volver);
    }
    
        public void Buscar(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/buscando.png"));
   
        buscar2 = new MiBoton();
        buscar2.setIcon(icono);
        buscar2.setBounds(100, 100, 150, 150);
        
        buscar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buscar2.setContentAreaFilled(false);
        buscar2.setBorderPainted(false);
        buscar2.setFocusPainted(false);
        buscar2.setVisible(true);
        
        buscar2.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
                    evento_buscar();
            }
        });
        
      setVisible(true);
       
      buscar.add(buscar2);
    }
    
        public void evento_buscar(){
            int item = opcion.getSelectedIndex();
            
            switch (item) {
                case 0:tema1.setVisible(true);tema2.setVisible(false);tema3.setVisible(false); break;
                        
                case 1:tema2.setVisible(true);tema1.setVisible(false);tema3.setVisible(false); break;
                        
                case 2:tema3.setVisible(true);tema1.setVisible(false);tema2.setVisible(false); break;
                        
              
                
            }
        }
        
        public void panelTemas(){
        buscar = new JPanel();
        
        buscar.setBackground(new Color ( 185, 184, 245));  
        buscar.setBounds(20, 150, 350, 300);
        buscar.setLayout(null);
        opciones();
        Buscar();
        
        add(buscar);
       
        
    }
        
    
        public void TemaUno(){
        tema1 = new JPanel();
            JLabel titulo = new JLabel("");
            titulo.setBounds(0, 0, 100, 50);
            tema1.add(titulo);
        
        tema1.setBackground(new Color ( 185, 184, 245));  
        tema1.setBounds(400, 28, 450, 500);
        tema1.setLayout(null);
        
        tema1.setVisible(false);
        
        //TEMA
        
        Mtema1 = new JEditorPane();
        Mtema1.setContentType("text/html");
        URL url = getClass().getResource("/imagenes/f1.png");
        URL url2 = getClass().getResource("/imagenes/mate.png");
        URL url3 = getClass().getResource("/imagenes/resta.png");
        URL url4 = getClass().getResource("/imagenes/multi.png");
        URL url5 = getClass().getResource("/imagenes/div.png");
            Mtema1.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>Formulas para derivar</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>En este apartado se colocaran las formulas necesarias a la hora de realizar los"
                + "diversos casos de derivadas trigonometricaa, sin mas que decir, comencemos.<br><br><br>"
                + ""
                + ""
                + "<font face='Bahnschrift' size = '5' color='blakc'>Las siguientes formulas son utilizadas tanto en suma como en resta, siempre"
                    + " <font face='Bahnschrift' size = '5' color='blakc'>y cuando este respete sus respectivos simbolos."
                    + ""
                    + "<font face='Bahnschrift' size = '5' color='blakc'><br><br><br>Suma:<br>"
                    + "<div align 'center'><img src = '"+ url2 + "' width = 250 height = 200><br><br><br>"
                    + ""
                    + "<font face='Bahnschrift' size = '5' color='blakc'>Resta:<br>"
                    + "<div align 'center'><img src = '"+ url3 + "' width = 250 height = 200><br><br><br>"
                    + "<font face='Bahnschrift' size = '5' color='blakc'>Esta es usada para datos que se multiplican:<br>"
                    + "<div align 'center'><img src = '"+ url4 + "' width = 250 height = 200><br><br><br>"
                    + "<font face='Bahnschrift' size = '5' color='blakc'>Esta es usada para datos que se dividen:<br>"
                    + "<div align 'center'><img src = '"+ url5 + "' width = 250 height = 200><br><br><br>"
                    + "<font face='Bahnschrift' size = '5' color='blakc'>Ahora las siguientes forumulas son necesarias para cada tipo"
                    + "<font face='Bahnschrift' size = '5' color='blakc'>de funcion trigonometrica:<br><br><br><br>"
                    + ""
                    + "<div align 'center'><img src = '"+ url + "' width = 300 height = 400>");
        Mtema1.setBackground(new Color ( 185, 184, 245)); 
        Mtema1.setCaretPosition(0);
        Mtema1.setEditable(false);  
        
            JScrollPane js = new JScrollPane(Mtema1);
            js.setBounds(40, 40, 375, 410);
        tema1.add(js);
        add(tema1);
        }
        
        public void TemaDos(){
        tema2 = new JPanel();
         JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 100, 50);
            tema2.add(titulo);
        
        tema2.setBackground(new Color ( 185, 184, 245));  
        tema2.setBounds(400, 28, 450, 500);
        tema2.setLayout(null);
        
        tema2.setVisible(false);
        
        //TEMA
         Mtema2 = new JEditorPane();
        URL url2 = getClass().getResource("/imagenes/Dsumar.png");
        URL url3 = getClass().getResource("/imagenes/Draa.png");
        URL url4 = getClass().getResource("/imagenes/Ddiv.png");
         
        Mtema2.setContentType("text/html");
        Mtema2.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>Derivacion con logaritmos</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>En este apartado se otorgaran las formulas necesarias a la hora de realizar"
                + " los diversos casos de derivadas trigonometricas, sin mas que decir, comencemos.<br><br><br>"
                + ""
                + ""
                + "Las siguientes formulas es usando cuando dos terminos se multiplican, esto pasara individualmente a "
                + "temer im ln y se sumaran:"
                    + ""
                    + "<br><br>Multiplicar:<br>"
                    + "<div align 'center'><img src = '"+ url3 + "' width = 200 height = 50><br><br><br>"
                    + ""
                    + "<font face='Bahnschrift' size = '5' color='blakc'>La siguiente formula es usada cuando dos terminos se dividen, esto pasara individualmente"
                    + "al tener un ln y se restaran:<br>"
                    + "<div align 'center'><img src = '"+ url4 + "' width = 200 height = 50><br><br><br>"
                    + "<font face='Bahnschrift' size = '5' color='blakc'>Formula utilizada a la hora de derivar un logaritmo natural:<br>"
                    + "<div align 'center'><img src = '"+ url2 + "' width = 200 height = 50><br><br><br>"
                    + ""
                    + ""
                    + "");
        Mtema2.setBackground(new Color ( 185, 184, 245)); 
        Mtema2.setCaretPosition(0);
        Mtema2.setEditable(false);
        
            JScrollPane js = new JScrollPane(Mtema2);
            js.setBounds(40, 40, 375, 410);
        tema2.add(js);
        
        add(tema2);
        }

        public void TemaTres(){
        tema3 = new JPanel();
         JLabel titulo = new JLabel("<html><font face='Bahnschrift' size = '9' color='purple'>Calculadora para derivar");
            titulo.setBounds(210, 0, 250, 100);
            tema3.add(titulo);
        
        tema3.setBackground(new Color ( 185, 184, 245));  
        tema3.setBounds(400, 28, 450, 500);
        tema3.setLayout(null);
        
        tema3.setVisible(false);
        GUIDerivada();
        add(tema3);
        
        }
        
            private void GUIDerivada() {
        labelFuncion = new JLabel("<html><font face='Bahnschrift' size = '4' color='purple'>Ingrese la función a derivar:<html>");
        labelFuncion.setForeground(Color.PINK);
        labelFuncion.setBounds(20, 50, 200, 100);
        tema3.add(labelFuncion);
        

        textFieldFuncion = new JTextField();
        textFieldFuncion.setBounds(20, 115, 180, 30);
        tema3.add(textFieldFuncion);

        labelDerivada = new JLabel("<html><font face='Bahnschrift' size = '4' color='purple'>La función derivada:");
        labelDerivada.setForeground(Color.BLACK);
        labelDerivada.setBounds(20, 125, 200, 100);
        tema3.add(labelDerivada);

        textFieldDerivada = new JTextField();
        textFieldDerivada.setBounds(20, 185, 180, 30);
        textFieldDerivada.setEnabled(false);
        tema3.add(textFieldDerivada);

        ImageIcon ico = new ImageIcon(getClass().getResource("/imagenes/derivar.png"));
        derivar = new MiBoton("<html><font face='Bahnschrift' size = '4' color='purple'>Derivar");
        derivar.setIcon(ico);
        derivar.setBounds(220, 80, 150, 100);
        derivar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        derivar.setToolTipText("Haga clic aquí para derivar");
        derivar.setBackground(new Color(185, 184, 245));
        derivar.setForeground(Color.BLACK);
        derivar.setBorder(new LineBorder(Color.BLACK));
        derivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoDerivar();
            }
        });
        derivar.setContentAreaFilled(false);
        derivar.setBorderPainted(false);
        derivar.setFocusPainted(false);
        tema3.add(derivar);
        
        ImageIcon ico2 = new ImageIcon(getClass().getResource("/imagenes/escoba (1).png"));
        limpiar = new MiBoton("<html><font face='Bahnschrift' size = '4' color='purple'>Limpiar");
        limpiar.setIcon(ico2);
        limpiar.setBounds(220, 150, 150, 100);
        limpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        limpiar.setToolTipText("Haga clic aquí para limpiar");
        limpiar.setBackground(new Color(185, 184, 245));
        limpiar.setForeground(Color.BLACK);
        limpiar.setBorder(new LineBorder(Color.BLACK));
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        limpiar.setContentAreaFilled(false);
        limpiar.setBorderPainted(false);
        limpiar.setFocusPainted(false);
        tema3.add(limpiar);
        
        salir = new JButton("Salir");
        salir.setBounds(640, 400, 100, 40);
        salir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        salir.setToolTipText("Haga clic aquí para salir");
        salir.setBackground(new Color(185, 184, 245));
        salir.setForeground(Color.BLACK);
        salir.setBorder(new LineBorder(Color.BLACK));
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoSalir();
            }
        });
        tema3.add(salir);
    }
         public void limpiar() {
        textFieldFuncion.setText("");
        textFieldDerivada.setText("");
    }

    public void eventoDerivar() {
        String funcion = textFieldFuncion.getText();
        derivadas = new Derivadas(funcion);
        String derivada = derivadas.derivar();
        textFieldDerivada.setText(derivada);
    }
    
    public void eventoSalir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicación?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            if (respuesta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Estás volviendo al menú");
            }
        }
    }
    
        public void opciones(){
        opcion = new JComboBox<>();
        opcion.setBounds(50, 20, 240, 50);
        opcion.setBackground(new Color ( 198, 197, 235));
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Formulas derivadas<br> trigonometricas</font><html>");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Formulas derivadas<br> logaritmicas</font><html>");
        opcion.addItem("<html><font face='Bahnschrift' size = '5' color='purple'>Calculadora</font><html>");
        opcion.setVisible(true);
        
        buscar.add(opcion);

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
        
        
       
    
}
