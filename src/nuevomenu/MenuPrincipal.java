
package nuevomenu;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MenuPrincipal extends JFrame{
    
    JButton matematica, algebra, fisica, humanidades, acerca;
    
    public MenuPrincipal(){
        super("Student Support");
        setSize(900,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color ( 198, 197, 235));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/logo.png "));
        Image image = icono.getImage();
        Image imagenRedimensionada = image.getScaledInstance(500, 180, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
        JLabel etiqueta = new JLabel(iconoRedimensionado);
        etiqueta.setBounds(160, 10, 500, 200);

        getContentPane().add(etiqueta);
        
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/imagenes/logopequeño.png"));
        Image icono2 = iconoVentana.getImage();
        setIconImage(icono2);
        
        BotonMatematica();
        BotonAlgebra();
        BotonFisica();
        BotonHuma();
        BotonAcerca();
        
        setVisible(true);
    }
  
    
    
    
    public void BotonMatematica(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/matematicas.png"));
   
        matematica = new MiBoton("Matematicas");
        matematica.setIcon(icono);
        matematica.setBounds(50, 200, 180, 180);
        matematica.setVerticalTextPosition(SwingConstants.BOTTOM);
        matematica.setHorizontalTextPosition(SwingConstants.CENTER); 
        
        matematica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        matematica.setContentAreaFilled(false);
        matematica.setBorderPainted(false);
        matematica.setFocusPainted(false);
        matematica.setVisible(true);
        
        matematica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                eventoMatematica();       
            }
        });
        
        
        add(matematica);
    }
    
    public void BotonAlgebra(){
    ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/algebra.png"));
   
        algebra = new MiBoton("Algebra lineal");
        algebra.setIcon(icono);
        algebra.setVerticalTextPosition(SwingConstants.BOTTOM);
        algebra.setHorizontalTextPosition(SwingConstants.CENTER);    
        algebra.setBounds(250, 200, 180, 180);
        
        algebra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        algebra.setContentAreaFilled(false);
        algebra.setBorderPainted(false);
        algebra.setFocusPainted(false);
        
        algebra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoAlgebra();
            }
        });
        
        add(algebra);
    }
    
    public void BotonFisica(){
ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/fisica.png"));
   
        fisica = new MiBoton("Fisica");
        fisica.setIcon(icono);
        fisica.setVerticalTextPosition(SwingConstants.BOTTOM);
        fisica.setHorizontalTextPosition(SwingConstants.CENTER);      
        fisica.setBounds(450, 200, 180, 180);
        
        fisica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fisica.setContentAreaFilled(false);
        fisica.setBorderPainted(false);
        fisica.setFocusPainted(false);
        
        
        fisica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoFisica();
            }
        });
        
        add(fisica);
    }
    
    public void BotonHuma(){
ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/humanidades.png"));
   
        humanidades = new MiBoton("humanidades");
        humanidades.setIcon(icono);
        humanidades.setVerticalTextPosition(SwingConstants.BOTTOM);
        humanidades.setHorizontalTextPosition(SwingConstants.CENTER);    
        humanidades.setBounds(650, 200, 180, 180);
        
        humanidades.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        humanidades.setContentAreaFilled(false);
        humanidades.setBorderPainted(false);
        humanidades.setFocusPainted(false);
        
        humanidades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoHumanidades();
            }
        });
        
        add(humanidades);
    }
    
    public void BotonAcerca(){
ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/equipo.png"));
   
        acerca = new MiBoton("Acerca de...");
        acerca.setIcon(icono);
        acerca.setVerticalTextPosition(SwingConstants.BOTTOM);
        acerca.setHorizontalTextPosition(SwingConstants.CENTER);    
        acerca.setBounds(350, 400, 180, 180);
        
        acerca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        acerca.setContentAreaFilled(false);
        acerca.setBorderPainted(false);
        acerca.setFocusPainted(false);
        
        acerca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoacercade();
                
            }
        });
        
        add(acerca);
    }
    
    public void eventoMatematica(){
        TemasMatematica obj = new TemasMatematica(this);
        setVisible(false);
    }
    
    public void eventoAlgebra(){
        Algebra obj = new Algebra(this);
        setVisible(false);
    }
    
    public void eventoFisica(){
        Fisica obj = new Fisica(this);
        setVisible(false);
    }
    
    public void eventoHumanidades(){
        Humanidades obj = new Humanidades(this);
        setVisible(false);
    }
    
    public void eventoacercade(){
        AcercaDe obj = new AcercaDe(this);
        setVisible(false);
    }
    
}
