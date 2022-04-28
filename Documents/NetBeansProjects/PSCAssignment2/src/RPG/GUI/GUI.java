/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    private JPanel titlePanel, startButtonPanel, gamePanel, loadPanel, loadTextPanel, errorPanel, newGamePanel;
    private JTextField loadTextField;
    private JLabel errorLabel, mainLabel;

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
        removeCurrentScreen();
        
        titlePanel = panelGenerator.titalPanel();
        startButtonPanel = panelGenerator.startButtonPanel();

        container.add(titlePanel);
        container.add(startButtonPanel);

        frame.setVisible(true);
    }

    private void removeCurrentScreen()
    {
        if (titlePanel != null)
            titlePanel.setVisible(false);
        if (startButtonPanel != null)
            startButtonPanel.setVisible(false);
        if (gamePanel != null)
            gamePanel.setVisible(false);
        if (loadPanel != null)
            loadPanel.setVisible(false);
        if (loadTextPanel != null)
            loadTextPanel.setVisible(false);
        if (errorPanel != null)
            errorPanel.setVisible(false);

        frame.validate();
        frame.repaint();
    }

    public void setGameScreen()
    {
        removeCurrentScreen();
        
        gamePanel = panelGenerator.gamePanel();
        mainLabel = panelGenerator.mainLabel();

        gamePanel.add(mainLabel);
        
        mainLabel.setText("LOADED INTO GAME");

        container.add(gamePanel);

        frame.validate();
        frame.repaint();
    }

    public void setLoadScreen()
    {
        removeCurrentScreen();

        loadPanel = panelGenerator.loadGamePanel();
        errorPanel = panelGenerator.errorPanel();
        loadTextPanel = panelGenerator.loadGameTextPanel();

        loadTextField = panelGenerator.loadTextField();
        
        errorLabel = panelGenerator.errorLabel();
        
        errorPanel.add(errorLabel);

        loadTextPanel.add(loadTextField);
        
        container.add(loadPanel);
        container.add(loadTextPanel);
        container.add(errorPanel);
        
        frame.validate();
        frame.repaint();
    }

    public void setNewGameScreen()
    {
        removeCurrentScreen();
    }

    public void updateMainLabel(String text)
    {
        mainLabel.setText(text);
    }
    
    public String getLoadTextField()
    {
        return loadTextField.getText();
    }
    
    public void updateErrorLabel(String text)
    {
        errorLabel.setText(text);
    }
}
