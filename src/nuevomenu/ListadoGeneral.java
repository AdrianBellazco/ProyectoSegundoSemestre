
package nuevomenu;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class ListadoGeneral extends JFrame{
    
    JButton Atras;
    
    ModeloTabla mt;
    JTable tabla;
    
    private final Humanidades ra;
    
    public ListadoGeneral(Humanidades ra){
        
        super("Listado General");
       this.ra = ra;
        
        setSize(900, 600);        
        setLocale(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color ( 198, 197, 235));
        
        BotonAtras();
        Titulo1();
        
        Infor();  
        setVisible(true);
        LlenarTabla();
    }
    
    public void Infor(){
        
        String encabezado[] = {"<html><font face='Bahnschrift' size = '5' color='purple'>Nombre", "<html><font face='Bahnschrift' size = '5' color='purple'>Correo", "<html><font face='Bahnschrift' size = '5' color='purple'>Codigo estudiantil","<html><font face='Bahnschrift' size = '5' color='purple'>Intentos", "<html><font face='Bahnschrift' size = '5' color='purple'>Promedio"};
        String datos [][] = new String [1][5];
        
        mt = new ModeloTabla(datos, encabezado);
        tabla = new JTable(mt);
        
        JScrollPane jsTabla = new JScrollPane(tabla);
        jsTabla.setBounds(50, 100, 800, 400);
        jsTabla.setBackground(new Color ( 198, 197, 235));
        
        
        
        add(jsTabla);
        
    }
    
    public void LlenarTabla(){
        FileReader fr = null;
        boolean error = false;
        
        try {
            fr= new FileReader("Registro.csv");
        } catch (Exception e) {
            error=true;
            JOptionPane.showMessageDialog(this, "Error al conectar la base de datos",
                                            "Error", JOptionPane.ERROR_MESSAGE);
        }
       if(!error){
           String registro = "";
           BufferedReader br = new BufferedReader(fr);
           String tokens[];
           mt.removeRow(0);
           
           try {
               while((registro = br.readLine())!= null){
                   tokens = registro.split(";");
                    mt.addRow(tokens);
               }
           } catch (Exception e) {
               error =true;
               JOptionPane.showMessageDialog(this, "Error al entrar en la base de datos",
                       "Error", JOptionPane.ERROR_MESSAGE);        
           }
           try {
               fr.close();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, "Error al salir de la base de datos",
                       "Error", JOptionPane.ERROR_MESSAGE);
           }          
           
       } 
    }
    
    public void Titulo1(){
        JLabel Titulo = new JLabel("<html><font face='Bahnschrift' size = '7' color='purple'>Registro general");
        Titulo.setBackground(new Color ( 198, 197, 235));
        Titulo.setBounds(300, 20, 500, 50);
        Titulo.setFont(new Font("Avenir Next LT Pro", Font.BOLD, 18));
        
        Titulo.setOpaque(true);
        
     
        add(Titulo);
    }
   
     public void BotonAtras(){
        
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/volver.png"));
        
   
        Atras =new  MiBoton();
        Atras.setIcon(icono);
        Atras.repaint();
        Atras.setLocation(0, 0);
        Atras.setSize(100, 100);
        Atras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {         
                AccionVolver();
            }
        });
        add(Atras);
    Atras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));      
    Atras.setOpaque(false);
    Atras.setContentAreaFilled(false);
    Atras.setBorderPainted(false);
    Atras.setFocusPainted(false);

    }
    
     public void AccionVolver(){
       setVisible(false);
        dispose();
       ra.setVisible(true);
    }
 
    
    
}
