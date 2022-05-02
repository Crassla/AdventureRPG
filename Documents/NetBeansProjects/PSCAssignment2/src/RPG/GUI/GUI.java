/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
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
    private JPanel titleScreen, loadGameScreen, newGameScreen, mainGameScreen;
    private JTextField loadTextField;
    private JLabel errorLabel, mainLabel;
    private JList classList;
    private JSpinner numRoomSpinner;

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

    private JPanel initPanel(JPanel panel)
    {
        panel = new JPanel();

        panel.setBackground(Color.black);
        panel.setBounds(0, 0, 800, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        return panel;
    }

    public void setTitleScreen()
    {
        removeCurrentScreen();

        titleScreen = initPanel(titleScreen);

        titleScreen.add(panelGenerator.titalPanel());
        titleScreen.add(panelGenerator.startButtonPanel());

        container.add(titleScreen);

        frame.setVisible(true);
    }

    private void removeCurrentScreen()
    {
        if (titleScreen != null)
        {
            titleScreen.setVisible(false);
        }
        if (mainGameScreen != null)
        {
            mainGameScreen.setVisible(false);
        }
        if (loadGameScreen != null)
        {
            loadGameScreen.setVisible(false);
        }
        if (newGameScreen != null)
        {
            newGameScreen.setVisible(false);
        }

        frame.validate();
        frame.repaint();
    }

    public void setGameScreen()
    {
        removeCurrentScreen();

        mainGameScreen = initPanel(mainGameScreen);

        mainLabel = panelGenerator.mainLabel();

        mainGameScreen.add(panelGenerator.gamePanel().add(mainLabel));

        mainLabel.setText("LOADED INTO GAME");

        container.add(mainGameScreen);

        frame.validate();
        frame.repaint();
    }

    public void setLoadScreen()
    {
        removeCurrentScreen();

        loadGameScreen = initPanel(loadGameScreen);

        loadTextField = panelGenerator.loadTextField();

        errorLabel = panelGenerator.errorLabel();
        
        JPanel loadTextPanel = panelGenerator.loadGameTextPanel();
        loadTextPanel.add(loadTextField);
        
        loadGameScreen.add(panelGenerator.loadGamePanel());
        loadGameScreen.add(panelGenerator.errorPanel().add(errorLabel));
        loadGameScreen.add(loadTextPanel);

        container.add(loadGameScreen);

        frame.validate();
        frame.repaint();
    }

    public void setNewGameScreen()
    {
        removeCurrentScreen();
        
        newGameScreen = initPanel(newGameScreen);  
        
        classList = panelGenerator.classList();
        numRoomSpinner = panelGenerator.NumRoomsSpinner();

        newGameScreen.add(panelGenerator.newGamePanel());
        newGameScreen.add(panelGenerator.newGameListPanel().add(classList));
        newGameScreen.add(panelGenerator.newGameNumRoomsPanel().add(numRoomSpinner));

        container.add(newGameScreen);

        frame.validate();
        frame.repaint();
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
