
package nuevomenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.math.plot.Plot2DPanel; 


public class Algebra extends JFrame{
    
    
    private final MenuPrincipal em;
    JComboBox<String> opcion;
    JButton volver, buscar2;
    JPanel buscar, tema1, tema2, tema3, tema4, tema5, tema6;
    JTextField X1,X2,X3,Y1,Y2,Y3,X4,Y4,NXM,X5,Y5,X6,Y6,X7,Y7,ESC,X8,Y8,X9,Y9,X10,Y10,VEC,X11,Y11,X12,Y12,X14,Y14,DSC,Z10,Z11,Z12,MIX;
    JButton Operar1, Operar2, Operar3, Operar4, Operar5, Operar6, Limpiar1, Limpiar2, Limpiar3, Limpiar4, Limpiar5, Limpiar6;
    Double VectX1,VectX2,VectY1,VectY2,TotalX1,TotalY1,VectX4,VectY4,NumM,TotalX2,TotalY2,VectX6,VectY6,VectX7,VectY7,TotalP,VectX8,VectY8,VectX9,VectY9,TotalVEC,VectX10,VectY10,VectX11,VectY11,VectX12,VectY12,VectX14,VectY14,H2,VectZ10,VectZ11,VectZ12,TotalX3,TotalY3,TotalZ3,TotalMIX,resultado,Hip;

    private double[] XA={0.0,0.0};
    private double[] YA={0.0,0.0}; 
    private double[] XB={0.0,0.0};
    private double[] YB={0.0,0.0}; 
    private double[] XC={0.0,0.0};
    private double[] YC={0.0,0.0}; 
    private double[] XD={0.0,0.0};
    private double[] YD={0.0,0.0}; 
    private double[] XE={0.0,0.0};
    private double[] YE={0.0,0.0}; 
    private double[] XF={0.0,0.0}; 
    private double[] YF={0.0,0.0}; 
    private double[] XG={0.0,0.0};
    private double[] YG={0.0,0.0};
    private double[] XH={0.0,0.0}; 
    private double[] YH={0.0,0.0}; 
    private double[] XI={0.0,0.0};
    private double[] YI={0.0,0.0};
    private double[] XJ={0.0,0.0};
    private double[] YJ={0.0,0.0};
    private double[] XK={0.0,0.0};
    private double[] YK={0.0,0.0};
    private double[] XL={0.0,0.0};
    private double[] YL={0.0,0.0};
    private double[] XM={0.0,0.0};
    private double[] YM={0.0,0.0};
    
    private Plot2DPanel plot=new Plot2DPanel();
    private Plot2DPanel plot2=new Plot2DPanel();
    private Plot2DPanel plot3=new Plot2DPanel();
    private Plot2DPanel plot4=new Plot2DPanel();
    private Plot2DPanel plot5=new Plot2DPanel();
    private Plot2DPanel plot6=new Plot2DPanel();
    
    public Algebra(MenuPrincipal em){
        
        super("Algebra lineal");
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
        TemaCuatro();
        TemaCinco();
        TemaSeis();
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
                case 0:tema1.setVisible(true);tema2.setVisible(false);tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false); break;
                        
                case 1:tema2.setVisible(true);tema1.setVisible(false);tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false); break;
                        
                case 2:tema3.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false); break;
                
                case 3:tema4.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false); break;
                
                case 4:tema5.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema6.setVisible(false); break;
                
                case 5:tema6.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false); break;
                        
                case 6:tema6.setVisible(false);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false); break;

                
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
        JLabel titulo = new JLabel("Suma de vectores");
        titulo.setBounds(0, 0, 200, 50);
        tema1.add(titulo);
        tema1.setBackground(new Color ( 185, 184, 245));  
        tema1.setBounds(400, 28, 450, 500);
        tema1.setLayout(null);
        tema1.setVisible(false);
        JLabel etiqueta =  new JLabel();
        JLabel etiqueta2 =  new JLabel();
        JLabel etiqueta3 =  new JLabel();
        JLabel etiqueta4 =  new JLabel();
        etiqueta.setText("Ingrese los valores del vertice1");
        etiqueta.setBounds(0, 40, 300, 20);
        etiqueta2.setText("Ingrese los valores del vertice2");
        etiqueta2.setBounds(0, 60, 300, 20);
        etiqueta3.setText("Resultado de la operacion");
        etiqueta3.setBounds(0, 80, 300, 20);
        etiqueta4.setBounds(0, 120, 400,400); //
        plot.addScatterPlot("Datos", XC, YC ); //
        plot.addLinePlot("Lineas", XA, YA );
        plot.addLinePlot("Lineas", XB, YB ); //
        plot.addLinePlot("Lineas", XC, YC ); //
        etiqueta4.setLayout(new BorderLayout()); //
        etiqueta4.add(plot, BorderLayout.CENTER); //
        tema1.add(etiqueta);
        tema1.add(etiqueta2);
        tema1.add(etiqueta3);
        tema1.add(etiqueta4); //
        X1 = new JTextField(5);   
        X1.setBounds(190, 40, 30, 19);
        tema1.add(X1);
        X2 = new JTextField(5);   
        X2.setBounds(190, 60, 30, 19);
        tema1.add(X2);
        X3 = new JTextField(5);   
        X3.setBounds(190, 80, 30, 19);
        tema1.add(X3);
        Y1 = new JTextField(5);   
        Y1.setBounds(230, 40, 30, 19);
        tema1.add(Y1);
        Y2 = new JTextField(5);   
        Y2.setBounds(230, 60, 30, 19);
        tema1.add(Y2);
        Y3 = new JTextField(5);   
        Y3.setBounds(230, 80, 30, 19);
        tema1.add(Y3);
        X3.setEditable(false);
        Y3.setEditable(false);
        
        Operar1 = new JButton();
        Operar1.setText("CALCULAR");
        Operar1.setBounds(300, 40, 100, 30);
        tema1.add(Operar1);
        Operar1.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Operar1();
            }
        });
        
        Limpiar1 = new JButton();
        Limpiar1 .setText("BORRAR");
        Limpiar1 .setBounds(300, 70, 100, 30);
        tema1.add(Limpiar1);
        Limpiar1 .addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Limpiar1();
            }
        });
        
        add(tema1);
        }
        
        public void evento_Operar1(){
        DecimalFormat df = new DecimalFormat("0.00"); //
        VectX1 = Double.parseDouble(X1.getText()); 
        VectX2 = Double.parseDouble(X2.getText()); 
        TotalX1 = VectX1 + VectX2; //
        X3.setText(String.valueOf(TotalX1));
        double[] arrXC = {0.0, 0.0, TotalX1}; 
        double[] arrXB = {0.0, 0.0, VectX2}; 
        double[] arrXA = {0.0, 0.0, VectX1}; 
        VectY1 = Double.parseDouble(Y1.getText()); 
        VectY2 = Double.parseDouble(Y2.getText()); 
        TotalY1 = VectY1 + VectY2; //
        Y3.setText(String.valueOf(TotalY1));
        double[] arrYC ={0.0, 0.0, TotalY1}; 
        double[] arrYB = {0.0, 0.0, VectY2}; 
        double[] arrYA = {0.0, 0.0, VectY1}; 
        plot.removeAllPlots(); //
        plot.addLinePlot("Lineas", Color.BLUE, arrXA, arrYA);
        plot.addLinePlot("Lineas", Color.RED, arrXB, arrYB);
        plot.addLinePlot("Lineas", Color.GREEN, arrXC, arrYC);
        
        }
        
        public void evento_Limpiar1(){
        VectX1 = 0.0;
        VectX2 = 0.0;
        TotalX1 = 0.0;
        X1.setText(String.valueOf(VectX1));
        X2.setText(String.valueOf(VectX2));
        X3.setText(String.valueOf(TotalX1));
        VectY1 = 0.0;
        VectY2 = 0.0;
        TotalY1 = 0.0;
        Y1.setText(String.valueOf(VectY1));
        Y2.setText(String.valueOf(VectY2));
        Y3.setText(String.valueOf(TotalY1));
        
        }
        
        public void TemaDos(){
        tema2 = new JPanel();
        JLabel titulo = new JLabel("Producto por un escalar");
        titulo.setBounds(0, 0, 200, 50);
        tema2.add(titulo);
        tema2.setBackground(new Color ( 185, 184, 245));  
        tema2.setBounds(400, 28, 450, 500);
        tema2.setLayout(null);
        tema2.setVisible(false);
        JLabel etiqueta =  new JLabel();
        JLabel etiqueta2 =  new JLabel();
        JLabel etiqueta3 =  new JLabel();
        JLabel etiqueta4 =  new JLabel();
        etiqueta.setText("Ingrese los valores del vertice ");
        etiqueta.setBounds(0, 40, 300, 20);
        etiqueta2.setText("Producto por el cual se multiplica");
        etiqueta2.setBounds(0, 60, 300, 20);
        tema2.add(etiqueta);
        tema2.add(etiqueta2);
        tema2.add(etiqueta3);
        tema2.add(etiqueta4);
        etiqueta3.setText("Resultado de la operacion");
        etiqueta3.setBounds(0, 80, 300, 20);
        etiqueta4.setBounds(0, 120, 400,400);
        plot2.addScatterPlot("Datos", XE, YE );
        plot2.addLinePlot("Lineas", XD, YD );
        plot2.addLinePlot("Lineas", XE, YE ); 
        etiqueta4.setLayout(new BorderLayout()); 
        etiqueta4.add(plot2, BorderLayout.CENTER); 
        
        X4 = new JTextField(5);   
        X4.setBounds(190, 40, 30, 19);
        tema2.add(X4);
        Y4 = new JTextField(5);   
        Y4.setBounds(230, 40, 30, 19);
        tema2.add(Y4);
        NXM = new JTextField();   
        NXM.setBounds(190, 60, 30, 19);
        tema2.add(NXM);
        X5 = new JTextField(5);   
        X5.setBounds(190, 80, 30, 19);
        tema2.add(X5);
        Y5 = new JTextField(5);   
        Y5.setBounds(230, 80, 30, 19);
        tema2.add(Y5);
        X5.setEditable(false);
        Y5.setEditable(false);
        
        Operar2 = new JButton();
        Operar2.setText("CALCULAR");
        Operar2.setBounds(300, 40, 100, 30);
        tema2.add(Operar2);
        Operar2.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Operar2();
            }
        });
        
        Limpiar2 = new JButton();
        Limpiar2 .setText("BORRAR");
        Limpiar2 .setBounds(300, 70, 100, 30);
        tema2.add(Limpiar2);
        Limpiar2 .addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Limpiar2();
            }
        });
        
        add(tema2);
        
        }
        
        public void evento_Operar2(){
        VectX4 = Double.parseDouble(X4.getText());
        VectY4 = Double.parseDouble(Y4.getText());
        NumM = Double.parseDouble(NXM.getText()); 
        TotalX2 = VectX4 * NumM;
        double[] arrXD = {0.0, 0.0, VectX4}; 
        double[] arrXE = {0.0, 0.0, TotalX2};
        X5.setText(String.valueOf(TotalX2)); 
        TotalY2 = VectY4 * NumM;
        double[] arrYD = {0.0, 0.0, VectY4}; 
        double[] arrYE = {0.0, 0.0, TotalY2};
        Y5.setText(String.valueOf(TotalY2));
        plot2.removeAllPlots();
        plot2.addLinePlot("Lineas", Color.BLUE, arrXD, arrYD);
        plot2.addLinePlot("Lineas", Color.RED, arrXE, arrYE);
        
        }
        public void evento_Limpiar2(){
        VectX4 = 0.0;
        VectY4 = 0.0;
        NumM = 0.0;
        TotalX2 = 0.0;
        TotalY2 = 0.0;
        NXM.setText(String.valueOf(NumM));
        X4.setText(String.valueOf(VectX4));
        Y4.setText(String.valueOf(VectY4)); 
        X5.setText(String.valueOf(TotalX2));
        Y5.setText(String.valueOf(TotalY2));    
        }
        
        public void TemaTres(){
        tema3 = new JPanel();
        JLabel titulo = new JLabel("Producto escalar");
        titulo.setBounds(0, 0, 200, 50);
        tema3.add(titulo);
        tema3.setBackground(new Color ( 185, 184, 245));  
        tema3.setBounds(400, 28, 450, 500);
        tema3.setLayout(null);
        tema3.setVisible(false);
        JLabel etiqueta =  new JLabel();
        JLabel etiqueta2 =  new JLabel();
        JLabel etiqueta3 =  new JLabel();
        JLabel etiqueta4 =  new JLabel();
        etiqueta.setText("Ingrese los valores del vertice1");
        etiqueta.setBounds(0, 40, 300, 20);
        tema3.add(etiqueta);
        etiqueta2.setText("Ingrese los valores del vertice2");
        etiqueta2.setBounds(0, 60, 300, 20);
        tema3.add(etiqueta2);
        etiqueta3.setText("Resultado de la operacion");
        etiqueta3.setBounds(0, 80, 300, 20);
        tema3.add(etiqueta3);
        etiqueta4.setBounds(0, 120, 400,400);
        plot3.addScatterPlot("Datos", XG, YG );
        plot3.addLinePlot("Lineas", XF, YF );
        plot3.addLinePlot("Lineas", XG, YG );
        etiqueta4.setLayout(new BorderLayout()); 
        etiqueta4.add(plot3, BorderLayout.CENTER);
        tema3.add(etiqueta4);
        X6 = new JTextField();   
        X6.setBounds(190, 40, 30, 19);
        tema3.add(X6);
        Y6 = new JTextField();   
        Y6.setBounds(230, 40, 30, 19);
        tema3.add(Y6);
        X7 = new JTextField();   
        X7.setBounds(190, 60, 30, 19);
        tema3.add(X7);
        Y7 = new JTextField();   
        Y7.setBounds(230, 60, 30, 19);
        tema3.add(Y7);
        ESC = new JTextField();   
        ESC.setBounds(190, 80, 30, 19);
        tema3.add(ESC);
        ESC.setEditable(false);
        
        Operar3 = new JButton();
        Operar3.setText("CALCULAR");
        Operar3.setBounds(300, 40, 100, 30);
        tema3.add(Operar3);
        Operar3.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Operar3();
            }
        });
        
        Limpiar3 = new JButton();
        Limpiar3 .setText("BORRAR");
        Limpiar3 .setBounds(300, 70, 100, 30);
        tema3.add(Limpiar3);
        Limpiar3 .addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Limpiar3();
            }
        });
        
        add(tema3);
        }
        
        public void evento_Operar3(){
        VectX6 = Double.parseDouble(X6.getText());
        VectY6 = Double.parseDouble(Y6.getText());
        VectX7 = Double.parseDouble(X7.getText());
        VectY7 = Double.parseDouble(Y7.getText());
        TotalP = (VectX6 * VectX7)+(VectY6 *VectY7);
        ESC.setText(String.valueOf(TotalP));
        double[] arrXF = {0.0, 0.0, VectX6}; 
        double[] arrXG = {0.0, 0.0, VectX7}; 
        double[] arrYF = {0.0, 0.0, VectY6}; 
        double[] arrYG = {0.0, 0.0, VectY7};
        plot3.removeAllPlots();
        plot3.addLinePlot("Lineas", Color.BLUE, arrXF, arrYF);
        plot3.addLinePlot("Lineas", Color.GREEN, arrXG, arrYG);
        }
        
        public void evento_Limpiar3(){
        VectX6 = 0.0;
        VectY6 = 0.0;
        VectX7 = 0.0;
        VectY7 = 0.0;
        TotalP = 0.0;
        X6.setText(String.valueOf(VectX6));
        Y6.setText(String.valueOf(VectY6));
        X7.setText(String.valueOf(VectX7));
        Y7.setText(String.valueOf(VectY7));
        ESC.setText(String.valueOf(TotalP));    
        }
        
        public void TemaCuatro(){
        tema4 = new JPanel();
        JLabel titulo = new JLabel("Producto vectorial");
        titulo.setBounds(0, 0, 200, 50); 
        tema4.add(titulo);        
        tema4.setBackground(new Color ( 185, 184, 245));  
        tema4.setBounds(400, 28, 450, 500);
        tema4.setLayout(null);
        tema4.setVisible(false);
        JLabel etiqueta =  new JLabel();
        JLabel etiqueta2 =  new JLabel();
        JLabel etiqueta3 =  new JLabel();
        JLabel etiqueta4 =  new JLabel();
        etiqueta.setText("Ingrese los valores del vertice1");
        etiqueta.setBounds(0, 40, 300, 20);
        etiqueta2.setText("Ingrese los valores del vertice2");
        etiqueta2.setBounds(0, 60, 300, 20);
        etiqueta3.setText("Resultado de la operacion");
        etiqueta3.setBounds(0, 80, 300, 20);
        etiqueta4.setBounds(0, 120, 400,400);
        plot4.addScatterPlot("Datos", XI, YI );
        plot4.addLinePlot("Lineas", XH, YH );
        plot4.addLinePlot("Lineas", XI, YI );
        etiqueta4.setLayout(new BorderLayout()); 
        etiqueta4.add(plot4, BorderLayout.CENTER);
        tema4.add(etiqueta);
        tema4.add(etiqueta2);
        tema4.add(etiqueta3);
        tema4.add(etiqueta4);
        X8 = new JTextField();   
        X8.setBounds(190, 40, 30, 19);
        tema4.add(X8);
        Y8 = new JTextField();   
        Y8.setBounds(230, 40, 30, 19);
        tema4.add(Y8);
        X9 = new JTextField();   
        X9.setBounds(190, 60, 30, 19);
        tema4.add(X9);
        Y9 = new JTextField();   
        Y9.setBounds(230, 60, 30, 19);
        tema4.add(Y9);
        VEC = new JTextField();   
        VEC.setBounds(190, 80, 30, 19);
        VEC.setEditable(false);
        tema4.add(VEC);
        
        Operar4 = new JButton();
        Operar4.setText("CALCULAR");
        Operar4.setBounds(300, 40, 100, 30);
        tema4.add(Operar4);
        Operar4.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Operar4();
            }
        });
        
        Limpiar4 = new JButton();
        Limpiar4 .setText("BORRAR");
        Limpiar4 .setBounds(300, 70, 100, 30);
        tema4.add(Limpiar4);
        Limpiar4 .addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Limpiar4();
            }
        });
        
        add(tema4);
        }
        
        public void evento_Operar4(){
        VectX8 = Double.parseDouble(X8.getText());
        VectY8 = Double.parseDouble(Y8.getText());
        VectX9 = Double.parseDouble(X9.getText());
        VectY9 = Double.parseDouble(Y9.getText());
        TotalVEC = (VectX8 * VectY9)-(VectY8 * VectX9);
        VEC.setText(String.valueOf(TotalVEC));
        double[] arrXH = {0.0, 0.0, VectX8}; 
        double[] arrXI = {0.0, 0.0, VectX9}; 
        double[] arrYH = {0.0, 0.0, VectY8}; 
        double[] arrYI = {0.0, 0.0, VectY9};
        plot4.removeAllPlots();
        plot4.addLinePlot("Lineas", Color.BLUE, arrXH, arrYH);
        plot4.addLinePlot("Lineas", Color.RED, arrXI, arrYI);
        
        }
        
        public void evento_Limpiar4(){
        VectX8 = 0.0;
        VectY8 = 0.0;
        VectX9 = 0.0;
        VectY9 = 0.0;
        TotalVEC = 0.0;
        X8.setText(String.valueOf(VectX8));
        Y8.setText(String.valueOf(VectY8));
        X9.setText(String.valueOf(VectX9));
        Y9.setText(String.valueOf(VectY9));
        VEC.setText(String.valueOf(TotalVEC));
        
        }
        
        public void TemaCinco(){
        tema5 = new JPanel();
        JLabel titulo = new JLabel("Producto mixto");
        titulo.setBounds(0, 0, 200, 50);
        tema5.add(titulo);
        tema5.setBackground(new Color ( 185, 184, 245));  
        tema5.setBounds(400, 28, 450, 500);
        tema5.setLayout(null);
        tema5.setVisible(false);
        JLabel etiqueta =  new JLabel();
        JLabel etiqueta2 =  new JLabel();
        JLabel etiqueta3 =  new JLabel();
        JLabel etiqueta4 =  new JLabel();
        JLabel etiqueta5 =  new JLabel();
        etiqueta.setText("Ingrese los valores del vertice1");
        etiqueta.setBounds(0, 40, 300, 20);
        etiqueta2.setText("Ingrese los valores del vertice2");
        etiqueta2.setBounds(0, 60, 300, 20);
        etiqueta3.setText("Ingrese los valores del vertice3");
        etiqueta3.setBounds(0, 80, 300, 20);
        etiqueta4.setText("Resultado de la operacion");
        etiqueta4.setBounds(0, 100, 300, 20);
        tema5.add(etiqueta);
        tema5.add(etiqueta2);
        tema5.add(etiqueta3);
        tema5.add(etiqueta4);
        tema5.add(etiqueta5);
        etiqueta5.setBounds(0, 120, 400,400);
        plot5.addScatterPlot("Datos", XL, YL );
        plot5.addLinePlot("Lineas", XJ, YJ );
        plot5.addLinePlot("Lineas", XK, YK );
        plot5.addLinePlot("Lineas", XL, YL );
        etiqueta5.setLayout(new BorderLayout()); 
        etiqueta5.add(plot5, BorderLayout.CENTER);
        X10 = new JTextField();   
        X10.setBounds(190, 40, 30, 19);
        tema5.add(X10);
        Y10 = new JTextField();   
        Y10.setBounds(230, 40, 30, 19);
        tema5.add(Y10);
        Z10 = new JTextField();   
        Z10.setBounds(270, 40, 30, 19);
        tema5.add(Z10);
        X11 = new JTextField();   
        X11.setBounds(190, 60, 30, 19);
        tema5.add(X11);
        Y11 = new JTextField();   
        Y11.setBounds(230, 60, 30, 19);
        tema5.add(Y11);
        Z11 = new JTextField();   
        Z11.setBounds(270, 60, 30, 19);
        tema5.add(Z11);
        X12 = new JTextField();   
        X12.setBounds(190, 80, 30, 19);
        tema5.add(X12);
        Y12 = new JTextField();   
        Y12.setBounds(230, 80, 30, 19);
        tema5.add(Y12);
        Z12 = new JTextField();   
        Z12.setBounds(270, 80, 30, 19);
        tema5.add(Z12);
        MIX = new JTextField();   
        MIX.setBounds(190, 100, 30, 19);
        MIX.setEditable(false);
        tema5.add(MIX);
        
        Operar5 = new JButton();
        Operar5.setText("CALCULAR");
        Operar5.setBounds(320, 40, 100, 30);
        tema5.add(Operar5);
        Operar5.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Operar5();
            }
        });
        
        Limpiar5 = new JButton();
        Limpiar5 .setText("BORRAR");
        Limpiar5 .setBounds(320, 70, 100, 30);
        tema5.add(Limpiar5);
        Limpiar5 .addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Limpiar5();
            }
        });
        
        add(tema5);
        }
        
        public void evento_Operar5(){
        VectX10 = Double.parseDouble(X10.getText());
        VectY10 = Double.parseDouble(Y10.getText());
        VectZ10 = Double.parseDouble(Z10.getText());
        VectX11 = Double.parseDouble(X11.getText());
        VectY11 = Double.parseDouble(Y11.getText());
        VectZ11 = Double.parseDouble(Z11.getText());
        VectX12 = Double.parseDouble(X12.getText());
        VectY12 = Double.parseDouble(Y12.getText());
        VectZ12 = Double.parseDouble(Z12.getText());
        TotalX3 = (VectX10*((VectY11*VectZ12)-(VectY12*VectZ11)));
        TotalY3 = (-VectY10*((VectX11*VectZ12)-(VectX12*VectZ11)));
        TotalZ3 = (VectZ10*((VectX11*VectY12)-(VectX12*VectY11)));
        TotalMIX = TotalX3 + TotalY3 + TotalZ3;
        MIX.setText(String.valueOf(TotalMIX));
        double[] arrXJ = {0.0, 0.0, VectX10}; 
        double[] arrXK = {0.0, 0.0, VectX11}; 
        double[] arrYJ = {0.0, 0.0, VectY10}; 
        double[] arrYK = {0.0, 0.0, VectY11};
        double[] arrXL = {0.0, 0.0, VectX12}; 
        double[] arrYL = {0.0, 0.0, VectY12};
        plot5.removeAllPlots();
        plot5.addLinePlot("Lineas", Color.BLUE, arrXJ, arrYJ);
        plot5.addLinePlot("Lineas", Color.RED, arrXK, arrYK);
        plot5.addLinePlot("Lineas", Color.GREEN, arrXL, arrYL);
        }
        
        public void evento_Limpiar5(){
        VectX10 = 0.0;
        VectY10 = 0.0;
        VectZ10 = 0.0;
        VectX11 = 0.0;
        VectY11 = 0.0;
        VectZ11 = 0.0;
        VectX12 = 0.0;
        VectY12 = 0.0;
        VectZ12 = 0.0;
        TotalX3 = 0.0;
        TotalY3 = 0.0;
        TotalZ3 = 0.0;
        TotalMIX = 0.0;
        X10.setText(String.valueOf(VectX10));
        Y10.setText(String.valueOf(VectY10));
        Z10.setText(String.valueOf(VectZ10));
        X11.setText(String.valueOf(VectX11));
        Y11.setText(String.valueOf(VectY11));
        Z11.setText(String.valueOf(VectZ11));
        X12.setText(String.valueOf(VectX12));
        Y12.setText(String.valueOf(VectY12));
        Z12.setText(String.valueOf(VectZ12));
        MIX.setText(String.valueOf(TotalMIX));
        }
        
        public void TemaSeis(){
        tema6 = new JPanel();
        JLabel titulo = new JLabel("Descomposicion de vector");
        titulo.setBounds(0, 0, 200, 50);
        tema6.add(titulo);
        tema6.setBackground(new Color ( 185, 184, 245));  
        tema6.setBounds(400, 28, 450, 500);
        tema6.setLayout(null);
        tema6.setVisible(false);
        JLabel etiqueta =  new JLabel();
        JLabel etiqueta2 =  new JLabel();
        JLabel etiqueta3 =  new JLabel();
        etiqueta.setText("Ingrese los valores del vertice1");
        etiqueta.setBounds(0, 40, 300, 20);
        etiqueta2.setText("Resultado de la magnitud");
        etiqueta2.setBounds(0, 60, 300, 20);
        etiqueta3.setBounds(0, 120, 400,400);
        plot6.addScatterPlot("Datos", XM, YM );
        plot6.addLinePlot("Lineas", XM, YM );
        etiqueta3.setLayout(new BorderLayout()); 
        etiqueta3.add(plot6, BorderLayout.CENTER);
        tema6.add(etiqueta);
        tema6.add(etiqueta2);
        tema6.add(etiqueta3);
        X14 = new JTextField();   
        X14.setBounds(190, 40, 30, 19);
        tema6.add(X14);
        Y14 = new JTextField();   
        Y14.setBounds(230, 40, 30, 19);
        tema6.add(Y14);
        DSC = new JTextField();   
        DSC.setBounds(190, 60, 90, 19);
        DSC.setEditable(false);
        tema6.add(DSC);
        
        Operar6 = new JButton();
        Operar6.setText("CALCULAR");
        Operar6.setBounds(300, 40, 100, 30);
        tema6.add(Operar6);
        Operar6.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Operar6();
            }
        });
        
        Limpiar6 = new JButton();
        Limpiar6 .setText("BORRAR");
        Limpiar6 .setBounds(300, 70, 100, 30);
        tema6.add(Limpiar6);
        Limpiar6.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
            evento_Limpiar6();
            }
        });
        
        add(tema6);
        }
     
        public void evento_Operar6(){
        VectX14 = Double.parseDouble(X14.getText());
        VectY14 = Double.parseDouble(Y14.getText());
        H2 = (VectX14*VectX14)+(VectY14*VectY14);
        double resultado = Math.sqrt(H2);
        Hip = resultado;
        DSC.setText(String.valueOf(Hip));
        double[] arrYM = {0.0, 0.0, VectY14};
        double[] arrXM = {0.0, 0.0, VectX14};
        plot6.removeAllPlots();
        plot6.addLinePlot("Lineas", Color.BLUE, arrXM, arrYM);

        }
        
        public void evento_Limpiar6(){
        VectX14 = 0.0;
        VectY14 = 0.0;
        Hip = 0.0;
        X14.setText(String.valueOf(VectX14));
        Y14.setText(String.valueOf(VectY14));
        DSC.setText(String.valueOf(Hip));    
        }
        
        public void opciones(){
        opcion = new JComboBox<>();
        opcion.setBounds(50, 20, 240, 50);
        opcion.setBackground(new Color ( 198, 197, 235));
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Suma de vectores");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Producto por un escalar");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Producto escalar");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Producto vectorial");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Producto mixto");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>descomposicion de vector");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Vaciar");
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
