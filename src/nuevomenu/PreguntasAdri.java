
package nuevomenu;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public  class  PreguntasAdri extends JFrame {

    public int preguntasAcertadas = 0;
    public int preguntasContestadas = 0;
    private final Humanidades em;
    private JButton volver, siguiente, atras;
    private JLabel preguntaLabel;
    private JRadioButton opcion1RadioButton, opcion2RadioButton, opcion3RadioButton, vacio;
    private ButtonGroup opcionesGroup;

    private ArrayList<Pregunta> preguntas;
    private int preguntaActual;
    private int preguntasMostradas;

    public PreguntasAdri(Humanidades em) {
        super("Cuestionario");
        this.em = em;
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(198, 197, 235));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        generarPreguntas();

        BotonVolver();
        siguiente();
        atrass();

        preguntaLabel = new JLabel();
        preguntaLabel.setBounds(100, 50, 600, 100);
        preguntaLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        add(preguntaLabel);

        opcion1RadioButton = new JRadioButton();
        opcion1RadioButton.setBounds(50, 150, 600, 50);
        opcion1RadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        opcion1RadioButton.setBackground(new Color ( 198, 197, 235));
        
        add(opcion1RadioButton);

        opcion2RadioButton = new JRadioButton();
        opcion2RadioButton.setBounds(50, 200, 600, 50);
        opcion2RadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        opcion2RadioButton.setBackground(new Color ( 198, 197, 235));
        add(opcion2RadioButton);

        opcion3RadioButton = new JRadioButton();
        opcion3RadioButton.setBounds(50, 250, 600, 50);
        opcion3RadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        opcion3RadioButton.setBackground(new Color ( 198, 197, 235));
        add(opcion3RadioButton);
        
        vacio = new JRadioButton();
        add(vacio);

        opcionesGroup = new ButtonGroup();
        opcionesGroup.add(opcion1RadioButton);
        opcionesGroup.add(opcion2RadioButton);
        opcionesGroup.add(opcion3RadioButton);
        opcionesGroup.add(vacio);
       
        setVisible(true);

        mostrarSiguientePregunta();
    }

    public void BotonVolver() {
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

        add(volver);
    }

    public void siguiente() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/sig.png"));
        siguiente = new MiBoton();
        siguiente.setIcon(icono);
        siguiente.setBounds(520, 300, 99, 99);

        siguiente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        siguiente.setContentAreaFilled(false);
        siguiente.setBorderPainted(false);
        siguiente.setFocusPainted(false);
        siguiente.setVisible(true);

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarRespuesta();
                mostrarSiguientePregunta();
                vacio.setSelected(true);
            }
        });

        add(siguiente);
    }

    public void atrass() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/retro.png"));
        atras = new MiBoton();
        atras.setIcon(icono);
        atras.setBounds(50, 300, 99, 99);

        atras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        atras.setContentAreaFilled(false);
        atras.setBorderPainted(false);
        atras.setFocusPainted(false);
        atras.setVisible(true);

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarRespuesta();
                mostrarPreguntaAnterior();
            }
        });

        add(atras);
    }

    private void generarPreguntas() {
        preguntas = new ArrayList<>();

        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es el objetivo principal del primer artículo de<br> la ONU sobre el desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Promover el crecimiento económico sostenible.",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Garantizar la igualdad de género.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Reducir la pobreza extrema.",
                1));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuáles son los principios fundamentales del desarrollo sostenible según el<br> segundo artículo de la ONU?",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Prosperidad, paz y justicia",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Eficiencia, diversidad y equidad.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Solidaridad, resiliencia y responsabilidad.",
                2));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es el objetivo del tercer artículo de la ONU sobre<br> el desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Combatir el cambio climático.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Promover la educación de calidad.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Erradicar la pobreza en todas sus formas.",
                3));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuáles son los principios de igualdad y equidad <br>mencionados en el<br> cuarto artículo de la ONU?",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Acceso universal, inclusión y no discriminación.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Solidaridad intergeneracional, participación y cooperación.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Justicia social, transparencia y responsabilidad.",
                1));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es la importancia de la participación ciudadana<br> según el quinto artículo de la ONU sobre el<br> desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Mejorar la gestión de los recursos naturales.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fortalecer la gobernanza democrática.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fomentar la innovación tecnológica.",
                2));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es el objetivo del sexto artículo<br> de la ONU en relación con el desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Garantizar el acceso a la energía asequible y no contaminante.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Promover la igualdad de género",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Mejorar la calidad del agua y el saneamiento.",
                1));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Qué medidas se mencionan en el séptimo artículo<br> de la ONU para abordar el cambio climático y sus impactos?",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Impulsar la igualdad de oportunidades en el empleo.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Reducir la deforestación y promover la reforestación.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fomentar la conservación de los ecosistemas marinos.",
                2));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es la importancia de la conservación de los<br> recursos naturales según el octavo artículo de la ONU?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Proteger la biodiversidad y los ecosistemas.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fomentar la inclusión financiera y el acceso a los servicios básicos.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Promover la igualdad de oportunidades en el mercado laboral.",
                1));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuáles son las medidas propuestas en el noveno <br>artículo de la ONU para promover la agricultura sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Mejorar la infraestructura de transporte y comunicaciones.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fomentar la inversión en energías renovables",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Apoyar la adopción de prácticas agrícolas sostenibles.",
                3));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es el objetivo principal del décimo artículo<br> de la ONU en relación con el desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Promover la igualdad de oportunidades en el acceso a la educación.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Garantizar la disponibilidad y gestión sostenible del agua.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Combatir la desertificación y la degradación del suelo.",
                2));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es el objetivo principal del undécimo<br> artículo de la ONU sobre el desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Garantizar la producción y el consumo sostenibles",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Promover la igualdad de género.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fomentar la conservación de los ecosistemas terrestres.",
                1));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Qué se menciona en el duodécimo artículo de la ONU como una medida<br> para garantizar la sostenibilidad de las ciudades?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Mejorar el acceso a servicios de salud de calidad.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Reducir las emisiones de gases de efecto invernadero.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Promover la igualdad de oportunidades en el empleo.",
                2));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es el objetivo del decimotercer artículo<br> de la ONU en relación con el desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Combatir la pobreza en todas sus formas.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Promover la igualdad de género y el empoderamiento de las mujeres.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Adoptar medidas urgentes para combatir el cambio climático.",
                3));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Qué se menciona en el decimocuarto artículo de la<br> ONU como una medida para conservar los océanos y los recursos marinos?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Fomentar la adopción de tecnologías limpias",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Reducir la contaminación del aire y mejorar la calidad del aire.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Regular la pesca excesiva y proteger los ecosistemas marinos.",
                3));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es la importancia de la energía<br> renovable según el decimoquinto artículo de la ONU?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Garantizar el acceso a energía asequible, confiable, sostenible y moderna.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Combatir la desertificación y la degradación del suelo.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Mejorar la calidad del agua y el saneamiento.",
                1));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuáles son las medidas propuestas en el decimosexto<br> artículo de la ONU para promover la paz, la justicia y las instituciones sólidas?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Fomentar la colaboración global en la lucha contra enfermedades.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fortalecer la gobernanza democrática y el Estado de derecho.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Reducir las desigualdades económicas y sociales.",
                2));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es el objetivo principal del decimoséptimo<br> artículo de la ONU en relación con el desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Reducir las desigualdades económicas y sociales.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fomentar la conservación y el uso sostenible de los ecosistemas terrestres.",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Garantizar el acceso a una educación inclusiva, equitativa y de calidad.",
                2));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Qué se menciona en el decimoctavo artículo de la<br> ONU como una medida para promover el uso sostenible de los recursos naturales?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Reducir las emisiones de gases de efecto invernadero.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Aumentar la inversión en energías renovables.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Promover la gestión sostenible de los bosques y detener la deforestación.",
                3));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Cuál es el objetivo del decimonoveno artículo <br>de la ONU en relación con el desarrollo sostenible?",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Reducir las emisiones de gases de efecto invernadero.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Combatir la pobreza en todas sus formas.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Garantizar la disponibilidad y gestión sostenible del agua.",
                2));
        preguntas.add(new Pregunta("<html><font face='Bahnschrift' size = '5' color='purple'>¿Qué se menciona en el vigésimo artículo de<br> la ONU como una medida para promover la paz y la justicia?",
                "<html><font face='Bahnschrift' size = '5' color='purple'>  Reducir las desigualdades económicas y sociales.",
                "<html><font face='Bahnschrift' size = '5' color='purple'> Fortalecer las alianzas para la implementación de los objetivos.",
                "<html><font face='Bahnschrift' size = '5' color='purple'>Fomentar la participación efectiva de las personas en la toma de decisiones.",
        3));

        

        Collections.shuffle(preguntas);

        preguntaActual = 0;
        preguntasMostradas = 0;
    }

    private void mostrarSiguientePregunta() {
        if (preguntasMostradas >= 5) {
            mostrarResultados();
            return;
        }

        Pregunta pregunta = preguntas.get(preguntaActual);

        preguntaLabel.setText(pregunta.getPregunta());
        opcion1RadioButton.setText(pregunta.getOpcion1());
        opcion2RadioButton.setText(pregunta.getOpcion2());
        opcion3RadioButton.setText(pregunta.getOpcion3());

        opcion1RadioButton.setSelected(pregunta.isOpcion1Seleccionada());
        opcion2RadioButton.setSelected(pregunta.isOpcion2Seleccionada());
        opcion3RadioButton.setSelected(pregunta.isOpcion3Seleccionada());

        preguntaActual++;
        preguntasMostradas++;

        revalidate();
        repaint();
    }

    private void mostrarPreguntaAnterior() {
        if (preguntasMostradas <= 1) {
            JOptionPane.showMessageDialog(this, "Es la primera pregunta");
            return;
        }

        preguntaActual -= 2;
        preguntasMostradas -= 2;
        mostrarSiguientePregunta();
    }

    private void verificarRespuesta() {
        Pregunta pregunta = preguntas.get(preguntaActual - 1);

        pregunta.setOpcion1Seleccionada(opcion1RadioButton.isSelected());
        pregunta.setOpcion2Seleccionada(opcion2RadioButton.isSelected());
        pregunta.setOpcion3Seleccionada(opcion3RadioButton.isSelected());

        int respuestaSeleccionada = -1;
        if (opcion1RadioButton.isSelected()) {
            respuestaSeleccionada = 1;
        } else if (opcion2RadioButton.isSelected()) {
            respuestaSeleccionada = 2;
        } else if (opcion3RadioButton.isSelected()) {
            respuestaSeleccionada = 3;
        }

        if (respuestaSeleccionada == pregunta.getRespuestaCorrecta()) {
          //  JOptionPane.showMessageDialog(this, "Respuesta correcta");
            preguntasAcertadas++;
        } else {
           // JOptionPane.showMessageDialog(this, "Respuesta incorrecta");
        }

        preguntasContestadas++;
    }

    public   void  mostrarResultados() {
        double porcentaje = (double) preguntasAcertadas / preguntasContestadas * 100;
        String mensaje = "Preguntas acertadas: " + preguntasAcertadas +
                "\nPreguntas contestadas: " + preguntasContestadas +
                "\nPorcentaje de aciertos: " + String.format("%.2f", porcentaje) + "%";
        
        

        JOptionPane.showMessageDialog(this, mensaje);
        setVisible(false);
        dispose();
        em.setVisible(true);
    }




    

    private class Pregunta {
        private String pregunta;
        private String opcion1;
        private String opcion2;
        private String opcion3;
        private int respuestaCorrecta;

        private boolean opcion1Seleccionada;
        private boolean opcion2Seleccionada;
        private boolean opcion3Seleccionada;

        public Pregunta(String pregunta, String opcion1, String opcion2, String opcion3, int respuestaCorrecta) {
            this.pregunta = pregunta;
            this.opcion1 = opcion1;
            this.opcion2 = opcion2;
            this.opcion3 = opcion3;
            this.respuestaCorrecta = respuestaCorrecta;
        }

        public String getPregunta() {
            return pregunta;
        }

        public String getOpcion1() {
            return opcion1;
        }

        public String getOpcion2() {
            return opcion2;
        }

        public String getOpcion3() {
            return opcion3;
        }

        public int getRespuestaCorrecta() {
            return respuestaCorrecta;
        }

        public boolean isOpcion1Seleccionada() {
            return opcion1Seleccionada;
        }

        public void setOpcion1Seleccionada(boolean opcion1Seleccionada) {
            this.opcion1Seleccionada = opcion1Seleccionada;
        }

        public boolean isOpcion2Seleccionada() {
            return opcion2Seleccionada;
        }

        public void setOpcion2Seleccionada(boolean opcion2Seleccionada) {
            this.opcion2Seleccionada = opcion2Seleccionada;
        }

        public boolean isOpcion3Seleccionada() {
            return opcion3Seleccionada;
        }

        public void setOpcion3Seleccionada(boolean opcion3Seleccionada) {
            this.opcion3Seleccionada = opcion3Seleccionada;
        }
    }
}
