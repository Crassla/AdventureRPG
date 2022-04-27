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
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class GamePanels
{
    private GUI gui;
    
    public GamePanels(GUI gui)
    {
        this.gui = gui;
    }
    
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
        Handlers handlerGenerator = new Handlers(gui);
        JPanel panel = new JPanel();
        
        panel.setBounds(300, 400, 200, 100);
        panel.setBackground(Color.black);
        
        JButton startButton = new JButton("NEW GAME");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        startButton.setFocusPainted(false);
        
        JButton loadButton = new JButton("LOAD GAME");
        loadButton.setBackground(Color.black);
        loadButton.setForeground(Color.white);
        loadButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        loadButton.setFocusPainted(false);
          
        startButton.addActionListener(handlerGenerator.newGameHandler());
        loadButton.addActionListener(handlerGenerator.loadGameHandler());
        panel.add(startButton);
        panel.add(loadButton);
        
        return panel;
    }
    
    public JPanel gamePanel()
    {
        JPanel gamePanel = new JPanel();
        gamePanel.setBounds(100, 100, 600, 250);
        gamePanel.setBackground(Color.black);
        
        return gamePanel;
    }
    
    public JTextField mainTextField()
    {
        JTextField gameTextArea = new JTextField();
        gameTextArea.setBounds(100, 100, 600, 250);
        gameTextArea.setBackground(Color.black);
        gameTextArea.setForeground(Color.white);
        gameTextArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
        gameTextArea.setBorder(null);
        
        return gameTextArea;
    }
}
