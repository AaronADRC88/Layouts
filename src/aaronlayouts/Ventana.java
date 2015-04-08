
package aaronlayouts;

import java.awt.*;
import javax.swing.*;

public class Ventana {

    public Ventana() {
    }

    public void AmosarVentana() {
        JFrame marco = new JFrame("***Flow****");
        JPanel panel = new JPanel();
        JButton boton1 = new JButton("boton1");
        JButton boton2 = new JButton("boton2");
        JButton boton3 = new JButton("boton3");
        JButton boton4 = new JButton("boton4");
        JButton boton5 = new JButton("boton5");
        
        //FlowLayout
        FlowLayout dis =new FlowLayout();
        panel.setLayout(dis);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        
        marco.add(panel);
        marco.setVisible(true);
        
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocation(0,0);
        //boxlayout
        JFrame marco1 =new JFrame("**BOX**");
        JPanel panel1=new JPanel();
        JButton boton6 = new JButton("boton1");
        JButton boton7 = new JButton("boton2");
        JButton boton8 = new JButton("boton3");
        JButton boton9 = new JButton("boton4");
        JButton boton10 = new JButton("boton5");
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
      
        panel1.add(boton6);
        panel1.add(boton7);
        panel1.add(boton8);
        panel1.add(boton9);
        panel1.add(boton10);
        
        marco1.add(panel1);
        marco1.setVisible(true);
        
        marco1.pack();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setLocation(100, 100);
        //borderLayout
        JFrame marco2 =new JFrame("**Border**");
        JPanel panel2=new JPanel();
        JButton boton11 = new JButton("boton1");
        JButton boton12 = new JButton("boton2");
        JButton boton13 = new JButton("boton3");
        JButton boton14 = new JButton("boton4");
        JButton boton15 = new JButton("boton5");
        panel2.setLayout(new BorderLayout());
      
        panel2.add(boton11,BorderLayout.NORTH);
        panel2.add(boton12,BorderLayout.CENTER);
        panel2.add(boton13,BorderLayout.SOUTH);
        panel2.add(boton14,BorderLayout.WEST);
        panel2.add(boton15,BorderLayout.EAST);
        
        marco2.add(panel2);
        marco2.setVisible(true);
        
        marco2.pack();
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setLocation(200, 200);
        //Grid
        JFrame marco3 =new JFrame("**Grid**");
        JPanel panel3=new JPanel();
        JButton boton16 = new JButton("boton1");
        JButton boton17 = new JButton("boton2");
        JButton boton18 = new JButton("boton3");
        JButton boton19 = new JButton("boton4");
        JButton boton20 = new JButton("boton5");
        panel3.setLayout(new GridLayout(2,6));
      
        panel3.add(boton16);
        panel3.add(boton17);
        panel3.add(boton18);
        panel3.add(boton19);
        panel3.add(boton20);
        
        marco3.add(panel3);
        marco3.setVisible(true);
        
        marco3.pack();
        marco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco3.setLocation(450, 300);
    }
    
}
