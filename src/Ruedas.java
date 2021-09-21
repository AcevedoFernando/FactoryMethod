
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cezz_
 */
public class Ruedas implements Producto {
     JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    
    public void sayHello(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hola soy un coche!");
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
