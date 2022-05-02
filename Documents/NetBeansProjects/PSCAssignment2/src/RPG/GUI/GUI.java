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
    private JPanel titleScreenPanel, gameScreenPanel, newGameScreenPanel, loadGameScreenPanel;
    private JTextField loadTextField, newGameTextField;
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

        setTitleScreen();
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

        titleScreenPanel = initPanel(titleScreenPanel);

        titleScreenPanel.add(panelGenerator.titalPanel());
        titleScreenPanel.add(panelGenerator.startButtonPanel());

        container.add(titleScreenPanel);

        frame.setVisible(true);
    }

    private void removeCurrentScreen()
    {
        if (titleScreenPanel != null)
        {
            titleScreenPanel.setVisible(false);
        }
        if (gameScreenPanel != null)
        {
            gameScreenPanel.setVisible(false);
        }
        if (newGameScreenPanel != null)
        {
            newGameScreenPanel.setVisible(false);
        }
        if (loadGameScreenPanel != null)
        {
            loadGameScreenPanel.setVisible(false);
        }

        frame.validate();
        frame.repaint();
    }

    public void setGameScreen()
    {
        removeCurrentScreen();

        gameScreenPanel = initPanel(gameScreenPanel);

        mainLabel = panelGenerator.mainLabel();

        gameScreenPanel.add(panelGenerator.gamePanel());
        gameScreenPanel.add(mainLabel);

        mainLabel.setText("LOADING INTO GAME");

        container.add(gameScreenPanel);

        frame.validate();
        frame.repaint();
    }

    public void setLoadScreen()
    {
        removeCurrentScreen();

        loadGameScreenPanel = initPanel(loadGameScreenPanel);

        loadTextField = panelGenerator.loadTextField();
        errorLabel = panelGenerator.errorLabel();

        loadGameScreenPanel.add(panelGenerator.loadGamePanel());
        loadGameScreenPanel.add(panelGenerator.loadGameTextPanel().add(loadTextField));
        loadGameScreenPanel.add(panelGenerator.errorPanel().add(errorLabel));

        container.add(loadGameScreenPanel);

        container.repaint();
    }

    public void setNewGameScreen()
    {
        removeCurrentScreen();

        newGameScreenPanel = initPanel(newGameScreenPanel);

        classList = panelGenerator.classList();
        numRoomSpinner = panelGenerator.NumRoomsSpinner();
        newGameTextField = panelGenerator.newGameTextField();

        newGameScreenPanel.add(panelGenerator.newGamePanel());
        newGameScreenPanel.add(panelGenerator.newGameListPanel().add(classList));
        newGameScreenPanel.add(panelGenerator.newGameNumRoomsPanel().add(numRoomSpinner));
        newGameScreenPanel.add(panelGenerator.newGameUserNamePanel().add(newGameTextField));
        newGameScreenPanel.add(panelGenerator.newGameEnterPanel());

        container.add(newGameScreenPanel);

        container.repaint();
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
