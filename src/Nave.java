/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cezz_
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nave implements Producto{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    
    
    public void sayHello(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hola soy una nave!");
        label.setOpaque(true);
        label.setFont(new Font("Dialog", Font.BOLD, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);

        frame.setSize(320, 200);
        frame.setVisible(true);
    }
}
