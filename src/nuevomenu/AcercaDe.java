
package nuevomenu;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class AcercaDe extends JFrame{
    
    private final MenuPrincipal em;
    JComboBox<String> opcion;
    JButton volver, buscar2;
    JPanel buscar, tema1, tema2, tema3;
    
    public AcercaDe(MenuPrincipal em){
        
        super("Acerca de...");
        this.em = em;
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color ( 198, 197, 235));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        
        BotonVolver();
        add(volver);
        CrearGUI();
    }
    
    public void CrearGUI(){
        
        JLabel autor1 = new JLabel("<html>Adrian Sebastian Saavedra Romero<br><center>230222015<center><html>");
        autor1.setBounds(0, 450, 300, 30);
        autor1.setHorizontalAlignment(SwingConstants.CENTER);
        add(autor1);
        
        JLabel autor2 = new JLabel("<html>Jose Alejandro Hernández Vallecilla<br><center>230222020<center><html>");
        autor2.setBounds(450, 450, 300, 30);
        autor2.setHorizontalAlignment(SwingConstants.CENTER);
        add(autor2);
        
        JLabel autor3 = new JLabel("<html>Jolmer Alexander Viedma Agudelo<br><center>230222005<center><html>");
        autor3.setBounds(230, 450, 300, 30);
        autor3.setHorizontalAlignment(SwingConstants.CENTER);
        add(autor3);
        
        JLabel autor4 = new JLabel("<html>Juan Esteban Tobón Diaz<br><center>230222027<center><html>");
        autor4.setBounds(670, 450, 300, 30);
        autor4.setHorizontalAlignment(SwingConstants.CENTER);
        add(autor4);
        
        
    }
    
      public void paint (Graphics g){
        super.paint(g);
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/adri.png"));
        g.drawImage(img.getImage(),40, 180, 250, 250, this);
        ImageIcon img2 = new ImageIcon(getClass().getResource("/imagenes/nino.png"));
        g.drawImage(img2.getImage(),260,180, 250, 250, this); 
        ImageIcon img4 = new ImageIcon(getClass().getResource("/imagenes/alejo.png"));
        g.drawImage(img4.getImage(),480,180, 250, 250, this);
        ImageIcon img5 = new ImageIcon(getClass().getResource("/imagenes/tobon.png"));
        g.drawImage(img5.getImage(),700,180, 250, 250, this);
        
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

