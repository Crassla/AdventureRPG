/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alex
 */
public class GUISetup
{
    JFrame frame;
    Container container;
    
    public GUISetup()
    {
        GamePanels panelGenerator = new GamePanels();
        
       frame = new JFrame();
        
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        
        container = frame.getContentPane();
        
        JPanel titlePanel = panelGenerator.titalPanel();
        JPanel startButtonPanel = panelGenerator.startButtonPanel();
        
        container.add(titlePanel);
        container.add(startButtonPanel);
        
        frame.setVisible(true);
    }
}
