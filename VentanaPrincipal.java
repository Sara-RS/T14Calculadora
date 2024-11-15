package Ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame{
    public VentanaPrincipal() throws HeadlessException {
        setSize(300,300);
        setTitle("CALCULADORA");
        setLocation(200,200);
        
        setLayout(new BorderLayout());
        var panel = new JPanel();
        var panel1 = new JPanel();
        var textField= new JTextField("", 60);
        panel.setLayout(new GridLayout(4,4));
        //botones
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        
        add(panel,BorderLayout.CENTER);
        panel1.add(textField);
        add(panel1,BorderLayout.NORTH);
    }
}
