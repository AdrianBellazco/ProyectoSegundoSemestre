
package nuevomenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import static java.util.Arrays.equals;
import java.util.Collections;
import java.util.List;
import static java.util.Objects.equals;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author USUARIO
 */
public class Humanidades extends JFrame {
    
    private final MenuPrincipal em;
    JComboBox<String> opcion;
    JButton volver, buscar2, limpiar, correo, abrir, guardar, iniciarsec,crear, buscarUsuario,listado, mandarcorreo;
    JButton regi2, regi;
    JPanel buscar, tema1, tema2, tema3, tema4, tema5, tema6, tema7, tema8, tema9, tema10, registrarse;
    JPanel inicioOregistro, iniciarsesion;
    JTextField usuario, correoi, codigo, codigoIngresar;
    int contador;
    int intentosClick=0;
    
    
    
    
    public Humanidades(MenuPrincipal em){
        
        super("Humanidades");
        this.em = em;
        setSize(900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color ( 198, 197, 235));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        iniciarsesionoregistrarse();
        BotonVolver();
        registrarse();
        IniciarSesion();
        panelTemas();
        TemaUno();
        TemaDos();
        TemaTres();
        TemaCuatro();
        TemaCinco();
        TemaSeis();
        TemaSiete();
        TemaOcho();
        TemaNueve();
        TemaDiez();
        
        
        add(volver);
    }
    
        public void Buscar(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/informacion.png"));
   
        buscar2 = new MiBoton("Informacion");
        buscar2.setIcon(icono);
        buscar2.setBounds(20, 70, 150, 150);
        
        buscar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buscar2.setContentAreaFilled(false);
        buscar2.setBorderPainted(false);
        buscar2.setFocusPainted(false);
        buscar2.setVisible(true);
        buscar2.setVerticalTextPosition(SwingConstants.BOTTOM);
        buscar2.setHorizontalTextPosition(SwingConstants.CENTER);
        buscar2.setEnabled(false);
        buscar2.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
                    evento_buscar();
            }
        });
        
      setVisible(true);
       
      buscar.add(buscar2);
    }
        
        public void ListadoGeneral(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/mesa.png"));
   
        listado = new MiBoton("Registros");
        listado.setIcon(icono);
        listado.setBounds(100, 170, 150, 150);
        
        listado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        listado.setContentAreaFilled(false);
        listado.setBorderPainted(false);
        listado.setFocusPainted(false);
        listado.setVisible(true);
        listado.setVerticalTextPosition(SwingConstants.BOTTOM);
        listado.setHorizontalTextPosition(SwingConstants.CENTER);
        listado.setEnabled(false);
        listado.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
                    //evento_listado();
                    ListadoGeneral obj = new ListadoGeneral(Humanidades.this);
                    setVisible(false);
            }
        });
        
      setVisible(true);
       
      buscar.add(listado);
    }
    
        public void evento_buscar(){
            int item = opcion.getSelectedIndex();
            
            switch (item) {
                case 0:tema1.setVisible(true);tema2.setVisible(false);tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false); break;
                        
                case 1:tema2.setVisible(true);tema1.setVisible(false);tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false); break;                             
                        
                case 2:tema3.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false); break;
                
                case 3:tema4.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false); break;
                
                case 4:tema5.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false); break;
                
                case 5:tema6.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false); break;
                        
                case 6:tema7.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false); break;
                
                case 7:tema8.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false); break;
                
                case 8:tema9.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema10.setVisible(false); break;
                
                case 9:tema10.setVisible(true);tema1.setVisible(false);tema2.setVisible(false);;tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false); break;
                

                
            }
        }
        
        //objetivos de la ONU
        
        public void panelTemas(){
        buscar = new JPanel();
        
        buscar.setBackground(new Color ( 185, 184, 245));  
        buscar.setBounds(20, 220, 350, 300);
        buscar.setLayout(null);
        
        opciones();
        Buscar();
        abrirArchivo();
        ListadoGeneral();

        
        add(buscar);
       
        
    }
    
        
        public void TemaUno(){
        tema1 = new JPanel();
            JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
        tema1.add(titulo);
        
        
        tema1.setBackground(new Color ( 185, 184, 245));  
        tema1.setBounds(400, 28, 450, 500);
        tema1.setLayout(null);
        
        tema1.setVisible(false);
        Limpiar();
        tema1.add(limpiar);
        
        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>FIN DE LA POBREZA:</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>El objetivo principal es reducir la pobreza extrema a nivel mundial, lo cual implica que ninguna persona viva con menos de 1,90 dólares al día. Sin embargo, el ODS 1 también aborda la pobreza en todas sus manifestaciones, incluida la pobreza multidimensional, que considera factores como la falta de acceso a la educación, la salud, la vivienda adecuada, el agua potable, la seguridad alimentaria y otras necesidades básicas.\n" +
"\n" +
"<font face='Bahnschrift' size = '5' color='blakc'>El ODS 1 busca implementar políticas y medidas que promuevan el crecimiento económico inclusivo y sostenible, así como el empleo decente y productivo para todos. Esto implica brindar oportunidades económicas a las personas en situación de pobreza, incluyendo el acceso a recursos productivos, servicios financieros y capacitación laboral.\n" +
"\n" +
"<font face='Bahnschrift' size = '5' color='blakc'>Además, el objetivo también busca implementar sistemas de protección social adecuados que brinden apoyo a las personas en situación de vulnerabilidad y pobreza, especialmente a través de programas de transferencias monetarias, seguros de salud y pensiones.\n" +
"\n" +
"<font face='Bahnschrift' size = '5' color='blakc'>El ODS 1 reconoce la importancia de abordar las desigualdades económicas y sociales, así como de promover la inclusión social y el acceso equitativo a los recursos y servicios básicos para todas las personas. También destaca la necesidad de fortalecer la resiliencia de las personas en situación de pobreza frente a crisis y desastres.\n" +
"\n" +
"<font face='Bahnschrift' size = '5' color='blakc'><br><br><br>En resumen, el objetivo \"Fin de la pobreza\" de la ONU busca abordar la pobreza en todas sus dimensiones, promover el crecimiento económico inclusivo y sostenible, y garantizar que todas las personas puedan disfrutar de una vida digna y libre de privaciones, con acceso a recursos y servicios básicos.<br>"
                + "<a href = 'https://www.youtube.com/watch?v=PQveU35dxIE'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/sustainabledevelopment/es/poverty/'>Material de apoyo 1</a><br>"
                + "<a href = 'https://www.un.org/es/chronicle/article/objetivo-1-poner-fin-la-pobreza-en-todas-sus-formas-y-en-todo-el-mundo'>Material de apoyo 2</a><br>"
                + "<a href = 'https://www.un.org/es/impacto-académico/atendiendo-la-pobreza'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema1.add(js);
        add(tema1);
        }
        
        public void TemaDos(){
        tema2 = new JPanel();
         JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
            tema2.add(titulo);
        
        tema2.setBackground(new Color ( 185, 184, 245));  
        tema2.setBounds(400, 28, 450, 500);
        tema2.setLayout(null);
        
        tema2.setVisible(false);
        Limpiar();
        tema2.add(limpiar);
       JEditorPane tema;
         tema = new JEditorPane();
        
         
        
        //TEMA
        
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>HAMBRE CERO:</font> </div><br><br><br><br>"
               + "<font face='Bahnschrift' size = '5' color='blakc'>El objetivo principal es asegurar el acceso de todas las personas, especialmente las más vulnerables, a alimentos suficientes y nutritivos durante todo el año. El ODS 2 busca erradicar todas las formas de desnutrición, incluyendo la desnutrición aguda y crónica, así como la malnutrición relacionada con la falta de nutrientes esenciales.\n" +
"\n" +
"El ODS 2 busca aumentar la productividad agrícola y la eficiencia en la producción de alimentos, promoviendo prácticas agrícolas sostenibles. También se centra en garantizar sistemas de producción y distribución de alimentos que sean resilientes, adaptativos y sostenibles frente al cambio climático.\n" +
"\n" +
"Además, el objetivo busca promover la inversión en infraestructuras rurales, la investigación agrícola y la transferencia de tecnología agrícola para mejorar la productividad y la sostenibilidad del sector agrícola.\n" +
"\n" +
"El ODS 2 también se preocupa por garantizar el acceso equitativo a los recursos productivos, como la tierra, el agua y los insumos agrícolas, especialmente para los pequeños agricultores y las comunidades rurales. Además, busca promover la diversificación de las fuentes de ingresos rurales y mejorar la resiliencia de los sistemas de producción de alimentos.\n" +
"\n" +
"En resumen, el objetivo \"Hambre Cero\" de la ONU busca erradicar el hambre, lograr la seguridad alimentaria, mejorar la nutrición y promover la agricultura sostenible. Esto implica garantizar el acceso a alimentos suficientes y nutritivos, promover prácticas agrícolas sostenibles y fortalecer los sistemas de producción y distribución de alimentos, especialmente en las comunidades rurales y entre los grupos más vulnerables." 
                + "<br><a href = 'https://www.youtube.com/watch?v=W_NUWV7qgk0'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/sustainabledevelopment/es/hunger/'>Material de apoyo 1</a><br>"
                + "<a href = 'https://colombia.un.org/es/sdgs/2'>Material de apoyo 2</a><br>"
                + "<a href = 'https://www.fao.org/sustainable-development-goals/goals/goal-2/es/'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema2.add(js);
        add(tema2);
        
        }

        public void TemaTres(){
        tema3 = new JPanel();
         JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
            tema3.add(titulo);
        
        tema3.setBackground(new Color ( 185, 184, 245));  
        tema3.setBounds(400, 28, 450, 500);
        tema3.setLayout(null);
        
        tema3.setVisible(false);
        Limpiar();
         
        
        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>SALUD Y BIENESTAR:</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>El Objetivo de Desarrollo Sostenible número 3 (ODS 3) se centra en garantizar una vida saludable y promover el bienestar para todas las personas en todas las edades. El objetivo busca abordar una amplia gama de temas relacionados con la salud, desde la reducción de la mortalidad infantil y materna hasta la prevención y el tratamiento de enfermedades no transmisibles.\n" +
"\n" +
"El objetivo principal es garantizar una cobertura sanitaria universal, lo que implica asegurar que todas las personas tengan acceso a servicios de salud esenciales de calidad sin incurrir en dificultades financieras. El ODS 3 se esfuerza por promover servicios de atención médica inclusivos y equitativos, y por fortalecer los sistemas de salud a nivel global.\n" +
"\n" +
"El objetivo busca reducir la mortalidad infantil y materna mediante la prevención y el tratamiento de enfermedades prevenibles, la mejora del acceso a servicios de atención prenatal y postnatal, y la promoción de prácticas saludables durante el embarazo y el parto.\n" +
"\n" +
"Además, el ODS 3 se ocupa de combatir enfermedades transmisibles como el VIH/SIDA, la malaria y la tuberculosis, así como enfermedades no transmisibles como enfermedades cardiovasculares, cáncer y diabetes. Busca promover la prevención y el tratamiento de estas enfermedades, así como el acceso a medicamentos y vacunas asequibles.\n" +
"\n" +
"El objetivo también se preocupa por abordar los desafíos de salud mental, promoviendo la conciencia y el acceso a servicios de salud mental y bienestar psicológico.\n" +
"\n" +
"En resumen, el objetivo \"Salud y Bienestar\" de la ONU busca garantizar una vida saludable y promover el bienestar para todas las personas. Esto implica asegurar una cobertura sanitaria universal, reducir la mortalidad infantil y materna, combatir enfermedades transmisibles y no transmisibles, y promover la salud mental y el bienestar psicológico.<br>"
                + "<a href = 'https://www.youtube.com/watch?v=Gnks9aUC9gs'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/sustainabledevelopment/es/health/'>Material de apoyo 1</a><br>"
                + "<a href = 'https://datosods.uniandes.edu.co/indicadores-para-los-ods/3-salud-y-bienestar'>Material de apoyo 2</a><br>"
                + "<a href = 'https://www.sdgfund.org/es/objetivo-3-buena-salud'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema3.add(js);
        tema3.add(limpiar);
        add(tema3);
        }

        public void TemaCuatro(){
        tema4 = new JPanel();
            JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50); 
            tema4.add(titulo);
      
        tema4.setBackground(new Color ( 185, 184, 245));  
        tema4.setBounds(400, 28, 450, 500);
        tema4.setLayout(null);
        
        tema4.setVisible(false);
        Limpiar();

        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>EDUCACIÓN DE CALIDAD:</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>El Objetivo de Desarrollo Sostenible número 4 (ODS 4) se centra en garantizar una educación inclusiva, equitativa y de calidad para todos. El objetivo busca abordar los desafíos relacionados con el acceso a la educación, la calidad de la enseñanza y el aprendizaje, y la promoción de oportunidades educativas igualitarias.\n" +
"\n" +
"El objetivo principal es asegurar que todas las niñas y niños, así como los jóvenes y los adultos, tengan acceso a una educación de calidad en igualdad de condiciones. Esto implica la promoción de la educación preescolar, primaria y secundaria, así como el acceso a oportunidades de educación técnica, profesional y superior.\n" +
"\n" +
"El ODS 4 se esfuerza por mejorar la calidad de la educación, lo que implica garantizar que los estudiantes adquieran las habilidades necesarias para la vida y el empleo, incluyendo habilidades socioemocionales, habilidades digitales y habilidades para el desarrollo sostenible.\n" +
"\n" +
"Además, el objetivo busca eliminar las disparidades de género en la educación y promover la igualdad de acceso a la educación para todas las personas, independientemente de su origen socioeconómico, discapacidad, ubicación geográfica o cualquier otra forma de discriminación.\n" +
"\n" +
"El objetivo también se preocupa por mejorar las condiciones de los docentes y fortalecer los sistemas educativos. Esto incluye la capacitación y el apoyo profesional de los docentes, la mejora de la infraestructura escolar y el fomento de entornos de aprendizaje seguros e inclusivos.\n" +
"\n" +
"En resumen, el objetivo \"Educación de Calidad\" de la ONU busca garantizar una educación inclusiva, equitativa y de calidad para todos. Esto implica el acceso igualitario a la educación, la mejora de la calidad de la enseñanza y el aprendizaje, la promoción de habilidades relevantes para el empleo y el desarrollo sostenible, y la eliminación de las disparidades en la educación."
                + "<br><a href = 'https://www.youtube.com/watch?v=Axrfh2cae7E'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/sustainabledevelopment/es/education/'>Material de apoyo 1</a><br>"
                + "<a href = 'https://datosods.uniandes.edu.co/indicadores-para-los-ods/4-educacion-de-calidad'>Material de apoyo 2</a><br>"
                + "<a href = 'https://agenda2030lac.org/es/ods/4-educacion-de-calidad'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema4.add(js);
        tema4.add(limpiar);
        add(tema4);
        }
        
        public void TemaCinco(){
        tema5 = new JPanel();
            JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
            tema5.add(titulo);
      
        tema5.setBackground(new Color ( 185, 184, 245));  
        tema5.setBounds(400, 28, 450, 500);
        tema5.setLayout(null);
        
        tema5.setVisible(false);
        Limpiar();
 
        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>IGUALDAD DE GÉNERO:</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>El Objetivo de Desarrollo Sostenible número 5 (ODS 5) se centra en lograr la igualdad de género y empoderar a todas las mujeres y niñas. El objetivo busca abordar la discriminación y la violencia basada en el género, así como promover la participación igualitaria de las mujeres en todos los ámbitos de la sociedad.\n" +
"\n" +
"El objetivo principal es eliminar todas las formas de discriminación y violencia contra las mujeres y las niñas, incluyendo la violencia doméstica, la trata de personas y la mutilación genital femenina. El ODS 5 se esfuerza por garantizar el pleno ejercicio de los derechos humanos de las mujeres y promover su empoderamiento en todas las esferas.\n" +
"\n" +
"El ODS 5 busca alcanzar la igualdad de género en la toma de decisiones, promoviendo la participación activa y significativa de las mujeres en la política, la economía y la vida pública. Esto implica fomentar el liderazgo y la representación equitativa de las mujeres en puestos de toma de decisiones.\n" +
"\n" +
"Además, el objetivo busca garantizar el acceso igualitario a la educación para niñas y mujeres, así como a oportunidades de empleo digno y remunerado. También se preocupa por eliminar la brecha salarial de género y promover el acceso a recursos económicos y financieros para las mujeres.\n" +
"\n" +
"El ODS 5 se ocupa de abordar las normas y estereotipos de género, promoviendo una cultura de igualdad y respeto. También busca garantizar la salud sexual y reproductiva de las mujeres y el ejercicio de sus derechos reproductivos.\n" +
"\n" +
"En resumen, el objetivo \"Igualdad de Género\" de la ONU busca lograr la igualdad de género y empoderar a todas las mujeres y niñas. Esto implica eliminar la discriminación y la violencia basada en el género, promover la participación igualitaria en la toma de decisiones, garantizar el acceso a la educación y oportunidades económicas, y desafiar los estereotipos y normas de género."
                + "<br><a href = 'https://www.youtube.com/watch?v=8JPpqtZbn_4'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/es/global-issues/gender-equality'>Material de apoyo 1</a><br>"
                + "<a href = 'https://www.unwomen.org/es/news/in-focus/women-and-the-sdgs/sdg-5-gender-equality'>Material de apoyo 2</a><br>"
                + "<a href = 'https://www.unwomen.org/es'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema5.add(js);
        tema5.add(limpiar);
        add(tema5);
        }
        
        public void TemaSeis(){
        tema6 = new JPanel();
            JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
            tema6.add(titulo);
        
        tema6.setBackground(new Color ( 185, 184, 245));  
        tema6.setBounds(400, 28, 450, 500);
        tema6.setLayout(null);
        
        tema6.setVisible(false);
        Limpiar();
        
        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>AGUA LIMPIA Y SANEAMIENTO</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>El Objetivo de Desarrollo Sostenible número 6 (ODS 6) se centra en garantizar la disponibilidad y gestión sostenible del agua y el saneamiento para todos. El objetivo busca abordar los desafíos relacionados con el acceso a agua potable y saneamiento adecuado, así como la gestión sostenible de los recursos hídricos.\n" +
"\n" +
"El objetivo principal es asegurar que todas las personas tengan acceso a agua potable segura, asequible y accesible. Esto implica garantizar el acceso a fuentes de agua mejoradas y la implementación de infraestructuras adecuadas para el abastecimiento de agua.\n" +
"\n" +
"Además, el ODS 6 se esfuerza por mejorar el saneamiento y la higiene, promoviendo el acceso a instalaciones sanitarias adecuadas y la adopción de prácticas de higiene adecuadas, como el lavado de manos con jabón. También busca abordar la gestión adecuada de las aguas residuales y la reducción de la contaminación del agua.\n" +
"\n" +
"El objetivo busca garantizar la participación equitativa en la gestión de los recursos hídricos, promoviendo la colaboración entre los diferentes sectores y partes interesadas. También se preocupa por proteger y restaurar los ecosistemas relacionados con el agua, como ríos, lagos y acuíferos.\n" +
"\n" +
"El ODS 6 aborda la falta de acceso a agua y saneamiento en áreas rurales y comunidades marginadas, así como en situaciones de emergencia y crisis humanitarias. Busca mejorar la resiliencia de las comunidades frente a eventos relacionados con el agua, como sequías e inundaciones.\n" +
"\n" +
"En resumen, el objetivo \"Agua Limpia y Saneamiento\" de la ONU busca garantizar la disponibilidad y gestión sostenible del agua y el saneamiento para todos. Esto implica asegurar el acceso a agua potable segura y saneamiento adecuado, promover la gestión sostenible de los recursos hídricos, y abordar los desafíos relacionados con la falta de acceso en áreas rurales y en situaciones de emergencia."
                + "<br><a href = 'https://www.youtube.com/watch?v=vYKmRdhMBy4'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/sustainabledevelopment/es/water-and-sanitation/'>Material de apoyo 1</a><br>"
                + "<a href = 'https://www.pactomundial.org/ods/6-agua-limpia-y-saneamiento/'>Material de apoyo 2</a><br>"
                + "<a href = 'https://www.sdgfund.org/es/objetivo-6-agua-limpia-y-saneamiento'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema6.add(js);
        tema6.add(limpiar);
        add(tema6);
        }
     
        public void TemaSiete(){
        tema7 = new JPanel();
            JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
            tema7.add(titulo);

        tema7.setBackground(new Color ( 185, 184, 245));  
        tema7.setBounds(400, 28, 450, 500);
        tema7.setLayout(null);
        
        tema7.setVisible(false);
        Limpiar();
        
        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>ENERGÍA ASEQUIBLE\nY NO CONTAMINANTE:</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>El Objetivo de Desarrollo Sostenible número 7 (ODS 7) se centra en garantizar el acceso a una energía asequible, confiable, sostenible y moderna para todos. El objetivo busca abordar los desafíos relacionados con el acceso a fuentes de energía seguras, limpias y sostenibles, así como promover la eficiencia energética y la adopción de energías renovables.\n" +
"\n" +
"El objetivo principal es asegurar el acceso universal a servicios energéticos modernos y asequibles, incluyendo el acceso a electricidad y a fuentes de energía limpias para el uso doméstico y productivo. Esto implica promover la expansión de la infraestructura energética y el acceso equitativo a la energía en áreas rurales y comunidades marginadas.\n" +
"\n" +
"Además, el ODS 7 busca mejorar la eficiencia energética en todos los sectores, promoviendo el uso racional de la energía y la adopción de tecnologías energéticas eficientes. También se centra en aumentar la participación de las energías renovables en el mix energético global, como la energía solar, eólica, hidroeléctrica y geotérmica, entre otras.\n" +
"\n" +
"El objetivo busca promover la investigación y el desarrollo de tecnologías energéticas limpias y sostenibles, así como fomentar la colaboración internacional en el ámbito de la energía. También se preocupa por abordar los desafíos relacionados con la contaminación del aire y la reducción de las emisiones de gases de efecto invernadero provenientes del sector energético.\n" +
"\n" +
"El ODS 7 se relaciona estrechamente con otros objetivos de desarrollo sostenible, como la lucha contra el cambio climático (ODS 13) y la promoción de ciudades sostenibles (ODS 11).\n" +
"\n" +
"En resumen, el objetivo \"Energía Asequible y No Contaminante\" de la ONU busca garantizar el acceso a una energía asequible, confiable y sostenible para todos, promoviendo la eficiencia energética y la adopción de energías renovables. Esto implica asegurar el acceso universal a servicios energéticos modernos, mejorar la eficiencia energética, aumentar el uso de energías renovables y abordar los desafíos relacionados con la contaminación del aire y el cambio climático."
                + "<br><a href = 'https://www.youtube.com/watch?v=3LLAvYbsT7Q'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/sustainabledevelopment/es/energy/'>Material de apoyo 1</a><br>"
                + "<a href = 'https://www.pactomundial.org/ods/7-energia-asequible-y-no-contaminante/'>Material de apoyo 2</a><br>"
                + "<a href = 'https://agenda2030lac.org/es/ods/7-energia-asequible-y-no-contaminante'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema7.add(js);
        tema7.add(limpiar);
        add(tema7);
        }

        public void TemaOcho(){
        tema8 = new JPanel();
            JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
            tema8.add(titulo);
      
        tema8.setBackground(new Color ( 185, 184, 245));  
        tema8.setBounds(400, 28, 450, 500);
        tema8.setLayout(null);
        
        tema8.setVisible(false);
        Limpiar();
        
        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>TRABAJO DECENTE Y CRECIMIENTO ECONÓMICO</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>El Objetivo de Desarrollo Sostenible número 8 (ODS 8) se centra en promover el crecimiento económico sostenido, inclusivo y sostenible, así como garantizar el trabajo decente para todos. El objetivo busca abordar los desafíos relacionados con la generación de empleo, la productividad laboral y el acceso a oportunidades económicas.\n" +
"\n" +
"El objetivo principal es promover el crecimiento económico inclusivo que beneficie a todas las personas, en particular a los más vulnerables. Esto implica fomentar la creación de empleo productivo y de calidad, así como el emprendimiento y el desarrollo de habilidades para el empleo.\n" +
"\n" +
"El ODS 8 busca erradicar el trabajo infantil, el trabajo forzado y la trata de personas, y promover entornos de trabajo seguros y saludables. También se preocupa por garantizar la igualdad de oportunidades y de remuneración para hombres y mujeres, así como promover la protección de los derechos laborales.\n" +
"\n" +
"Además, el objetivo busca mejorar la productividad laboral y promover el acceso a servicios financieros para el crecimiento económico sostenible. Busca fomentar la inversión en infraestructuras y en sectores clave, así como estimular la innovación y el desarrollo tecnológico.\n" +
"\n" +
"El ODS 8 se relaciona estrechamente con otros objetivos de desarrollo sostenible, como la reducción de la desigualdad (ODS 10) y la promoción de la industrialización sostenible (ODS 9). También se preocupa por promover políticas económicas y fiscales que favorezcan la inclusión y la sostenibilidad.\n" +
"\n" +
"En resumen, el objetivo \"Trabajo Decente y Crecimiento Económico\" de la ONU busca promover el crecimiento económico sostenido, inclusivo y sostenible, así como garantizar el trabajo decente para todos. Esto implica fomentar la creación de empleo productivo, erradicar el trabajo infantil y el trabajo forzado, mejorar la productividad laboral, promover la igualdad de oportunidades y de remuneración, y estimular la inversión y la innovación para el crecimiento económico sostenible."
                + "<br><a href = 'https://www.youtube.com/watch?v=UnVQRrxwkaQ'>Video complementario</a><br>"
                + "<a href = 'https://www.sdgfund.org/es/objetivo-8-trabajo-decente-y-crecimiento-económico'>Material de apoyo 1</a><br>"
                + "<a href = 'https://www.un.org/es/chronicle/article/objetivo-1-poner-fin-la-pobreza-en-todas-sus-formas-y-en-todo-el-mundo'>Material de apoyo 2</a><br>"
                + "<a href = 'https://www.pactomundial.org/ods/8-trabajo-decente-y-crecimiento-economico/'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema8.add(js);
        tema8.add(limpiar);
        add(tema8);
        }

        public void TemaNueve(){
        tema9 = new JPanel();
            JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
            tema9.add(titulo);
        
        tema9.setBackground(new Color ( 185, 184, 245));  
        tema9.setBounds(400, 28, 450, 500);
        tema9.setLayout(null);
       
        tema9.setVisible(false);
        Limpiar();
        
        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>INDUSTRIA, INNOVACIÓN E RAESTRUCTURA</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>El objetivo principal es promover el desarrollo de infraestructuras sostenibles y resilientes que apoyen el crecimiento económico y mejoren la calidad de vida de las personas. Esto implica invertir en infraestructuras básicas como transporte, energía, agua y saneamiento, así como en tecnologías de la información y la comunicación.\n" +
"\n" +
"El ODS 9 busca fomentar la industrialización inclusiva y sostenible, promoviendo el crecimiento de sectores industriales diversificados y sostenibles, especialmente en los países en desarrollo. Esto implica aumentar la inversión en investigación y desarrollo, impulsar la adopción de tecnologías limpias y promover la eficiencia en el uso de los recursos.\n" +
"\n" +
"Además, el objetivo se preocupa por fomentar la innovación en todos los sectores y promover el acceso equitativo a tecnologías y conocimientos. Busca estimular la colaboración entre empresas, academia y gobierno para impulsar la innovación y el emprendimiento.\n" +
"\n" +
"El ODS 9 también busca mejorar la conectividad y el acceso a servicios básicos en áreas rurales y comunidades marginadas, promoviendo la inclusión digital y la expansión de infraestructuras en estas áreas.\n" +
"\n" +
"En resumen, el objetivo \"Industria, Innovación e Infraestructura\" de la ONU busca promover el desarrollo de infraestructuras sostenibles, la industrialización inclusiva y sostenible, y la promoción de la innovación. Esto implica invertir en infraestructuras básicas, fomentar la diversificación industrial y la adopción de tecnologías limpias, estimular la innovación y el emprendimiento, y mejorar la conectividad y el acceso a servicios básicos en áreas rurales y comunidades marginadas."
                + "<br><a href = 'https://www.youtube.com/watch?v=2xparLO41zQ'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/sustainabledevelopment/es/infrastructure/'>Material de apoyo 1</a><br>"
                + "<a href = 'https://agenda2030lac.org/es/ods/9-industria-innovacion-e-infraestructura'>Material de apoyo 2</a><br>"
                + "<a href = 'https://www.pactomundial.org/ods/9-industria-innovacion-e-infraestructura/'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema9.add(js);
        tema9.add(limpiar);
        add(tema9);
        }

        public void TemaDiez(){
        tema10 = new JPanel();
            JLabel titulo = new JLabel();
            titulo.setBounds(0, 0, 200, 50);
            tema10.add(titulo);
        
        tema10.setBackground(new Color ( 185, 184, 245));  
        tema10.setBounds(400, 28, 450, 500);
        tema10.setLayout(null);
        encuesta();
        tema10.add(correo);
        tema10.setVisible(false);
        Limpiar();
        mandarCorreo();
        //TEMA
        JEditorPane tema;
         tema = new JEditorPane();
        
         
        tema.setContentType("text/html");
        tema.setText("<div align 'center'><font face='Bahnschrift' size = '10' color='purple'>IGUALDAD: POR QUÉ ES IMPORTANTE</font> </div><br><br><br><br>"
                + "<font face='Bahnschrift' size = '5' color='blakc'>La igualdad es importante porque busca asegurar que todas las personas tengan los mismos derechos, oportunidades y acceso a recursos, independientemente de su género, raza, etnia, orientación sexual, discapacidad o cualquier otra característica personal. Aquí se presentan algunas razones por las cuales la igualdad es importante:\n" +
"\n" +
"<br>1. Justicia y derechos humanos: La igualdad es un principio fundamental de justicia y derechos humanos. Todas las personas tienen el derecho inherente de ser tratadas con igualdad y dignidad, sin importar sus diferencias. La igualdad garantiza que todos tengan la oportunidad de desarrollar su potencial, ejercer sus derechos y participar plenamente en la sociedad.\n" +
"\n" +
"<br>2. Desarrollo social y económico: La igualdad es un catalizador para el desarrollo social y económico sostenible. Cuando se eliminan las barreras y se promueve la igualdad de oportunidades, se fomenta la participación plena y activa de todas las personas en la sociedad. Esto contribuye al crecimiento económico, la reducción de la pobreza y la creación de sociedades más equitativas y prósperas.\n" +
"\n" +
"<br>3. Paz y estabilidad: La igualdad juega un papel crucial en la construcción de sociedades pacíficas y estables. La discriminación y la desigualdad pueden generar tensiones sociales, conflictos y violencia. Promover la igualdad de derechos y oportunidades ayuda a construir sociedades más justas, inclusivas y cohesionadas, en las cuales se respetan los derechos de todas las personas.\n" +
"\n" +
"<br>4. Empoderamiento individual y colectivo: La igualdad empodera a las personas y les permite tomar decisiones sobre sus vidas y participar en la toma de decisiones que les afectan. Al eliminar las barreras y desafiar las normas de género, por ejemplo, se promueve el empoderamiento de las mujeres y niñas, lo que les permite desarrollar todo su potencial y contribuir plenamente a la sociedad.\n" +
"\n" +
"<br>5. Sostenibilidad ambiental: La igualdad también está vinculada a la sostenibilidad ambiental. La desigualdad socioeconómica puede conducir a la explotación no sostenible de los recursos naturales y a la degradación ambiental. Promover la igualdad en el acceso a recursos y oportunidades ayuda a fomentar un enfoque más equilibrado y sostenible hacia el medio ambiente.\n" +
"\n" +
"En resumen, la igualdad es importante porque es un principio fundamental de justicia y derechos humanos. Además, contribuye al desarrollo social y económico, promueve la paz y la estabilidad, empodera a las personas y fomenta la sostenibilidad ambiental. Al promover la igualdad, se construyen sociedades más justas, inclusivas y prósperas para todos."
                + "<br><a href = 'https://www.youtube.com/watch?v=4oTdAHb6ESk'>Video complementario</a><br>"
                + "<a href = 'https://www.un.org/es/global-issues/gender-equality#:~:text=La%20igualdad%20de%20género%2C%20además,productividad%20y%20el%20crecimiento%20económico.'>Material de apoyo 1</a><br>"
                + "<a href = 'https://www.uexternado.edu.co/unidad-de-genero/por-que-es-importante-la-igualdad-de-genero/'>Material de apoyo 2</a><br>"
                + "<a href = 'https://www.telesurtv.net/telesuragenda/Por-que-es-importante-la-igualdad-de-genero-20170227-0039.html'>Material de apoyo 3</a><br>");
        
                
        tema.setEditable(false);//mostrar solo codigo HTML
        
        tema.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        );
        
        tema.setBackground(new Color ( 185, 184, 245)); 
        tema.setCaretPosition(0);
        tema.setEditable(false);
        
            JScrollPane js = new JScrollPane(tema);
            js.setBounds(40, 40, 375, 360);
        tema10.add(js);
        tema10.add(mandarcorreo);
        tema10.add(limpiar);
        add(tema10);
        }
                           
        //metodos
        public void opciones(){
        opcion = new JComboBox<>();
        opcion.setBounds(50, 20, 240, 50);
        opcion.setBackground(new Color ( 198, 197, 235));
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 1");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 2");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 3");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 4");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 5");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 6");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 7");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 8");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 9");
        opcion.addItem("<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 10");
        opcion.setEnabled(false);
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
        
        public void Limpiar(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/escoba.png"));
   
        limpiar = new MiBoton("Limpiar");
        limpiar.setIcon(icono);
        limpiar.setBounds(361, 400, 99, 99);
        
        limpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        limpiar.setContentAreaFilled(false);
        limpiar.setBorderPainted(false);
        limpiar.setFocusPainted(false);
        limpiar.setVisible(true);
        limpiar.setVerticalTextPosition(SwingConstants.BOTTOM);
        limpiar.setHorizontalTextPosition(SwingConstants.CENTER);
        
        limpiar.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
         tema1.setVisible(false);tema2.setVisible(false);tema3.setVisible(false);;tema4.setVisible(false);;tema5.setVisible(false);;tema6.setVisible(false);;tema7.setVisible(false);;tema8.setVisible(false);;tema9.setVisible(false);;tema10.setVisible(false);

            }
        });
        
      setVisible(true);
       
    }
    
        public void encuesta(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/encuesta (3).png"));
   
        correo = new MiBoton("Realizar cuestionario");
        correo.setIcon(icono);
        correo.setBounds(215, 400, 155, 99);
        
        correo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        correo.setContentAreaFilled(false);
        correo.setBorderPainted(false);
        correo.setFocusPainted(false);
        correo.setVisible(true);
        correo.setVerticalTextPosition(SwingConstants.BOTTOM);
        correo.setHorizontalTextPosition(SwingConstants.CENTER);
        
        correo.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
             
         //  CuestionarioApp cuestionarioApp = new CuestionarioApp();
              //  cuestionarioApp.cuestionario();
              PreguntasAdri obj = new PreguntasAdri(Humanidades.this);
              setVisible(false);
              intentosClick++;
              
             
         
            }
        });
        
      setVisible(true);
       
    }

        public void abrirArchivo(){
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/documentos.png"));
   
        abrir = new MiBoton("Abrir archivo");
        abrir.setIcon(icono);
        abrir.setBounds(180, 70, 150, 150);
        
        abrir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        abrir.setContentAreaFilled(false);
        abrir.setBorderPainted(false);
        abrir.setFocusPainted(false);
        abrir.setVisible(true);
        abrir.setVerticalTextPosition(SwingConstants.BOTTOM);
        abrir.setHorizontalTextPosition(SwingConstants.CENTER);
        abrir.setEnabled(false);
        abrir.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
              evento_abrir_archivo();
            }
        });
        
      setVisible(true);
      buscar.add(abrir);
       
    }
        
        public void evento_abrir_archivo(){
        int item = (int) opcion.getSelectedIndex();
        String string = (String) opcion.getSelectedItem();
       
        
        switch (string) {
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 1":abrirArchivor() ;break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 2":abrirArchivor();;break;   
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 3": abrirArchivor();;break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 4":abrirArchivor();break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 5": abrirArchivor();break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 6": abrirArchivor();break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 7": abrirArchivor();break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 8": abrirArchivor();break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 9": abrirArchivor();break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 10": abrirArchivor();break;
          
                
           
        }
    }
    
        public void abrirArchivor(){
        String temaSeleccionado = (String) opcion.getSelectedItem();
        String nombreArchivo = "";
        
        switch (temaSeleccionado) {
            
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 1":
                nombreArchivo = "docs/1.pdf";
                break;                
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 2":
                nombreArchivo = "docs/2.pdf";
                break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 3":
                nombreArchivo = "docs/3.pdf";
                break;                
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 4":
                nombreArchivo = "docs/4.pdf";
                break;            
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 5":
                nombreArchivo = "docs/5.pdf";
                break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 6":
                nombreArchivo = "docs/6.pdf";
                break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 7":
                nombreArchivo = "docs/7.pdf";
                break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 8":
                nombreArchivo = "docs/8.pdf";
                break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 9":
                nombreArchivo = "docs/9.pdf";
                break;
            case "<html><font face='Bahnschrift' size = '4' color='purple'>Capitulo 10" :
                nombreArchivo = "docs/10.pdf";
                break;
        }
       try {
            File archivo = new File(nombreArchivo);
            Desktop.getDesktop().open(archivo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, 
                    "Error al abrir el archivo '" + nombreArchivo + "'", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }      
        
        public void iniciarsesionoregistrarse(){
            inicioOregistro = new JPanel();
            inicioOregistro.setBounds(150, 25, 220, 180);
            inicioOregistro.setBackground(new Color ( 185, 184, 245));  
            inicioOregistro.setLayout(null);
            
            JLabel titulo = new JLabel("<html><center>Registrarse o<br> inicie sesion<br> para usar<center><html>");
            titulo.setBounds(68, 2, 150, 50);
            inicioOregistro.add(titulo);
            
        
            
            //boton registro----------------------------------------------------------------------
            
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/blog.png"));
   
        crear = new MiBoton("Registrarse");
        crear.setIcon(icono);
        crear.setBounds(0, 55, 110, 110);
        
        crear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        crear.setContentAreaFilled(false);
        crear.setBorderPainted(false);
        crear.setFocusPainted(false);
        crear.setVisible(true);
        crear.setVerticalTextPosition(SwingConstants.BOTTOM);
        crear.setHorizontalTextPosition(SwingConstants.CENTER);
       
        crear.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
                    registrarse.setVisible(true);
                    inicioOregistro.setVisible(false);
            }
        });
        
        
      
            inicioOregistro.add(crear);
            add(inicioOregistro);
            
            //boton para iniciar sesion----------------------------------------------------------
            
           ImageIcon icono2 = new ImageIcon(getClass().getResource("/imagenes/registrarse.png"));
   
        iniciarsec = new MiBoton("Iniciar sesion");
        iniciarsec.setIcon(icono2);
        iniciarsec.setBounds(110, 55, 110, 110);
        
        iniciarsec.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iniciarsec.setContentAreaFilled(false);
        iniciarsec.setBorderPainted(false);
        iniciarsec.setFocusPainted(false);
        iniciarsec.setVisible(true);
        iniciarsec.setVerticalTextPosition(SwingConstants.BOTTOM);
        iniciarsec.setHorizontalTextPosition(SwingConstants.CENTER);
       
        iniciarsec.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
                    iniciarsesion.setVisible(true);
                    inicioOregistro.setVisible(false);
            }
        });
        
        
      
            inicioOregistro.add(iniciarsec);
            add(inicioOregistro);

            
        }
    
        public void registrarse(){
            registrarse = new JPanel();
            registrarse.setBounds(150, 25, 220, 180);
            registrarse.setBackground(new Color ( 185, 184, 245));  
            registrarse.setLayout(null);
            
            JLabel titulo = new JLabel("Registrarse");
            titulo.setBounds(75, 2, 150, 13);
            registrarse.add(titulo);
            
            JLabel nombre = new JLabel("Nombre");
            nombre.setBounds(5, 30, 50, 13);
            registrarse.add(nombre);
            
            JLabel correo = new JLabel("Correo");
            correo.setBounds(5, 60, 50, 13);
            registrarse.add(correo);
            
            JLabel codigo1 = new JLabel("Codigo");
            codigo1.setBounds(5, 90, 50, 13);
            registrarse.add(codigo1);
            
            usuario = new JTextField();
            correoi = new JTextField();
            codigo =  new JTextField();
            
            usuario.setBounds(55, 28, 150, 20);
            registrarse.add(usuario);
            
            correoi.setBounds(55, 58, 150, 20);
            registrarse.add(correoi);
            
            codigo.setBounds(55, 88, 150, 20);
            registrarse.add(codigo);
            
            //boton iniciar sesion
            
            ImageIcon icono2 = new ImageIcon(getClass().getResource("/imagenes/registrarse(1).png"));
     
        regi = new MiBoton("Entrar");
        regi.setIcon(icono2);
        regi.setBounds(10, 120, 100, 50);
        
        
        regi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        regi.setContentAreaFilled(false);
        regi.setBorderPainted(false);
        regi.setFocusPainted(false);
        regi.setVisible(true);
        regi.setVerticalTextPosition(SwingConstants.BOTTOM);
        regi.setHorizontalTextPosition(SwingConstants.CENTER);
       
        regi.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
             iniciarsesion.setVisible(true);
             registrarse.setVisible(false);
             
         }
        });
        registrarse.add(regi);
            
            //boton guardar----------------------------------------------------------------------
            
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/salvar (1).png"));
   
        guardar = new MiBoton("Guardar");
        guardar.setIcon(icono);
        guardar.setBounds(110, 120, 100, 50);
        
        
        guardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        guardar.setContentAreaFilled(false);
        guardar.setBorderPainted(false);
        guardar.setFocusPainted(false);
        guardar.setVisible(true);
        guardar.setVerticalTextPosition(SwingConstants.BOTTOM);
        guardar.setHorizontalTextPosition(SwingConstants.CENTER);
       
        guardar.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
             String codigoestu = codigo.getText();
            if(!codigo.getText().equals("")){
                    eventoguardar();
            }else{
                 JOptionPane.showMessageDialog(null, "Ingrese un codigo estudiantil", "Error",
                JOptionPane.ERROR_MESSAGE);
            }
            }
        });
        
      registrarse.setVisible(false);
      
            registrarse.add(guardar);
            add(registrarse);
        }
        
        public void IniciarSesion(){
            iniciarsesion = new JPanel();
            iniciarsesion.setBounds(150, 25, 220, 180);
            iniciarsesion.setBackground(new Color ( 185, 184, 245));  
            iniciarsesion.setLayout(null);
            
            JLabel titulo = new JLabel("Iniciar sesion");
            titulo.setBounds(75, 2, 150, 13);
            iniciarsesion.add(titulo);
            
            
            
            JLabel codigo1 = new JLabel("Codigo");
            codigo1.setBounds(5, 35, 50, 13);
            iniciarsesion.add(codigo1);
            
            codigoIngresar =  new JTextField();
            codigoIngresar.setBounds(55, 32, 150, 20);
            iniciarsesion.add(codigoIngresar);
            
            //boton registrarse
            ImageIcon icono2 = new ImageIcon(getClass().getResource("/imagenes/blog (2).png"));
        
        regi2 = new MiBoton("Registrarse");
        regi2.setIcon(icono2);
        regi2.setBounds(0, 50, 120, 100);
        
        
        regi2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        regi2.setContentAreaFilled(false);
        regi2.setBorderPainted(false);
        regi2.setFocusPainted(false);
        regi2.setVisible(true);
        regi2.setVerticalTextPosition(SwingConstants.BOTTOM);
        regi2.setHorizontalTextPosition(SwingConstants.CENTER);
       
        regi2.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
             registrarse.setVisible(true);
             iniciarsesion.setVisible(false);
         }
        });
        iniciarsesion.add(regi2);
            
            //boton guardar----------------------------------------------------------------------
            
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/salvar (1).png"));
   
        buscarUsuario = new MiBoton("Iniciar");
        buscarUsuario.setIcon(icono);
        buscarUsuario.setBounds(120, 50, 100, 100);
        
        buscarUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buscarUsuario.setContentAreaFilled(false);
        buscarUsuario.setBorderPainted(false);
        buscarUsuario.setFocusPainted(false);
        buscarUsuario.setVisible(true);
        buscarUsuario.setVerticalTextPosition(SwingConstants.BOTTOM);
        buscarUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
       
        buscarUsuario.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
             
                    eventoBuscar();
         
         }
        });
        
      iniciarsesion.setVisible(false);
      
            iniciarsesion.add(buscarUsuario);
            add(iniciarsesion);
        }
        
        public void eventoBuscar(){
            String code = codigoIngresar.getText();
            if (verificarCedulaDuplicada(code)) {
        JOptionPane.showMessageDialog(this, "Inicio de sesion correcta.", "Bienvenido",
                JOptionPane.INFORMATION_MESSAGE);
                desbloquear();
        return;
    }
            else{
                JOptionPane.showMessageDialog(this, "El codigo no existe", "Error",
                JOptionPane.ERROR_MESSAGE);
            }
        }

        
        public void eventoguardar(){
             String Nom = usuario.getText();
             String gmail = correoi.getText();
             String codigoestu = codigo.getText();
             String numero_intentos = "0";
             String promedio = "0%";
            
            
              
             //verificar que no se duplique el codigo estudiantil
             
             if (verificarCedulaDuplicada(codigoestu)) {
        JOptionPane.showMessageDialog(this, "El codigo ya está registrado.", "Error",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

             //guardar en el CSV
    FileWriter fw = null;
    boolean error = false;

    try {
        fw = new FileWriter("Registro.csv", true);
    } catch (Exception e) {
        error = true;
        JOptionPane.showMessageDialog(this, "Error al crear el archivo Registro.csv", "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    try {
        fw.write(Nom + ";" + gmail + ";" + codigoestu + ";" + numero_intentos + ";"  + promedio + "\r\n");
    } catch (Exception e) {
        error = true;
        JOptionPane.showMessageDialog(this, "Error al guardar en el archivo RegistroC.csv", "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    if (!error) {
        try {
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cerrar el archivo Registro.csv", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(this,"Registro de estudiante completo");
        limpiarTexto();
        desbloquear();
    }         
        }
        
        public void desbloquear(){
         
        /*    if(contador==0){
                buscar2.setEnabled(false);
                abrir.setEnabled(false);
                opcion.setEnabled(false);
                codigo.setEnabled(true);
                correoi.setEnabled(true);
                usuario.setEnabled(true);
                   JOptionPane.showMessageDialog(this, "Ingresa el codigo estudiantil", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
            else{
                */
                buscar2.setEnabled(true);
                abrir.setEnabled(true);
                opcion.setEnabled(true);
                listado.setEnabled(true);
                regi.setEnabled(false);
                regi2.setEnabled(false);
              //   System.out.println(contador);
                 guardar.setEnabled(false);
                 
               
          //  }
           
        }
       
        public void limpiarTexto(){
            codigo.setText("");
            correoi.setText("");
            usuario.setText("");
            codigo.setEnabled(false);
            correoi.setEnabled(false);
            usuario.setEnabled(false);
            codigoIngresar.setEnabled(false);
        }
        
        private boolean verificarCedulaDuplicada(String codigoestu) {
    try {
        File archivo = new File("Registro.csv");
        Scanner scanner = new Scanner(archivo);

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] espacio = linea.split(";");

            if (espacio.length >= 3 && espacio[2].equals(codigoestu)) {
                scanner.close();
                return true; 
            }
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        
    }

    return false; 
}
        
        public void mandarCorreo(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/correo (1).png"));
   
        mandarcorreo = new MiBoton("Mandar correo");
        mandarcorreo.setIcon(icono);
        mandarcorreo.setBounds(100, 400, 118, 99);
        
        mandarcorreo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mandarcorreo.setContentAreaFilled(false);
        mandarcorreo.setBorderPainted(false);
        mandarcorreo.setFocusPainted(false);
        mandarcorreo.setVisible(true);
        mandarcorreo.setVerticalTextPosition(SwingConstants.BOTTOM);
        mandarcorreo.setHorizontalTextPosition(SwingConstants.CENTER);
        
        mandarcorreo.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent e) { 
               accion_mandarcorreo();
            }
        });
        
      setVisible(true);
       
    }

        public void accion_mandarcorreo(){
             JOptionPane.showMessageDialog(null, "Correo enviado con exito.");
             EnviarCorreo obj = new EnviarCorreo();
             obj.test3();
        }
            
            
        
}