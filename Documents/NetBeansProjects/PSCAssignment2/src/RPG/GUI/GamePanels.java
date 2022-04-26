/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alex
 */
public class GamePanels
{
    
    public JPanel titalPanel()
    {
        JPanel panel = new JPanel();
        JLabel label;
        
        panel.setBounds(100, 100, 600, 150);
        panel.setBackground(Color.black);
        
        label = new JLabel("DUNGEON RPG");
        label.setForeground(Color.white);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        
        panel.add(label);
        
        return panel;
    }
    
    public JPanel startButtonPanel()
    {
        Handlers handlerGenerator = new Handlers();
        JPanel panel = new JPanel();
        
        panel.setBounds(300, 400, 200, 100);
        panel.setBackground(Color.black);
        
        JButton startButton = new JButton("ENTER DUNGEON");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        startButton.setFocusPainted(false);
          
        startButton.addActionListener(handlerGenerator.titalHandler());
        panel.add(startButton);
        
        return panel;
    }
}
