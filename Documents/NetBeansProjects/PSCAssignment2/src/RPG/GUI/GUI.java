/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class GUI
{

    private final JFrame frame;
    private final GamePanels panelGenerator;
    private final Container container;
    private JPanel titlePanel, startButtonPanel, gamePanel, loadPanel, loadTextPanel, newGamePanel;
    private JTextField mainTextField, loadTextField;

    public GUI()
    {
        frame = new JFrame();
        panelGenerator = new GamePanels(this);

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);

        container = frame.getContentPane();
    }

    public void setTitleScreen()
    {
        titlePanel = panelGenerator.titalPanel();
        startButtonPanel = panelGenerator.startButtonPanel();

        container.add(titlePanel);
        container.add(startButtonPanel);

        frame.setVisible(true);
    }

    private void removeTitleScreen()
    {
        titlePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        frame.validate();
        frame.repaint();
    }

    public void setGameScreen()
    {
        gamePanel = panelGenerator.gamePanel();
        mainTextField = panelGenerator.mainTextField();

        gamePanel.add(mainTextField);

        container.add(gamePanel);

        frame.validate();
        frame.repaint();
    }

    public void setLoadScreen()
    {
        removeTitleScreen();

        loadPanel = panelGenerator.loadGamePanel();
        loadTextPanel = panelGenerator.loadGameTextPanel();

        loadTextField = panelGenerator.loadTextField();

        loadTextPanel.add(loadTextField);
        
        container.add(loadPanel);
        container.add(loadTextPanel);
        
        frame.validate();
        frame.repaint();
    }

    public void setNewGameScreen()
    {

    }

    public void updateGameTextArea(String text)
    {
        mainTextField.setText(text);
    }
    
    public String getLoadTextField()
    {
        return loadTextField.getText();
    }
}
