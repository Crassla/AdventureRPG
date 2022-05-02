/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.GUI;

import RPG.GUI.GUI;
import RPG.GUI.Handlers;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author alex
 */
public class GamePanels
{

    private GUI gui;
    private final Handlers handlerGenerator;

    public GamePanels(GUI gui)
    {
        this.gui = gui;
        handlerGenerator = new Handlers(gui);
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
        JPanel panel = new JPanel();

        panel.setBounds(300, 400, 200, 100);
        panel.setBackground(Color.black);

        JButton startButton = new JButton("NEW GAME");
        startButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFocusPainted(false);
        startButton.setOpaque(true);

        JButton loadButton = new JButton("LOAD GAME");
        loadButton.setBackground(Color.black);
        loadButton.setForeground(Color.white);
        loadButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        loadButton.setFocusPainted(false);
        loadButton.setOpaque(true);

        startButton.addActionListener(handlerGenerator.newGameHandler());
        loadButton.addActionListener(handlerGenerator.loadGameHandler());
        panel.add(startButton);
        panel.add(loadButton);

        return panel;
    }

    public JPanel loadGamePanel()
    {
        JPanel panel = new JPanel();
        JLabel label;

        panel.setBounds(100, 100, 600, 150);
        panel.setBackground(Color.black);

        label = new JLabel("LOAD PREVIOUS GAME");
        label.setForeground(Color.white);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 50));

        panel.add(label);

        return panel;
    }

    public JPanel newGamePanel()
    {
        JPanel panel = new JPanel();
        JLabel label;

        panel.setBounds(100, 100, 600, 100);
        panel.setBackground(Color.black);

        label = new JLabel("CREATE NEW GAME");
        label.setForeground(Color.white);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 50));

        panel.add(label);

        return panel;
    }

    public JPanel newGameListPanel()
    {

        JPanel gamePanel = new JPanel();
        gamePanel.setBounds(100, 200, 600, 250);
        gamePanel.setBackground(Color.black);

        return gamePanel;
    }

    public JPanel newGameNumRoomsPanel()
    {
        JPanel gamePanel = new JPanel();

        gamePanel.setBounds(105, 325, 600, 250);
        gamePanel.setBackground(Color.black);

        return gamePanel;
    }

    public JPanel newGameUserNamePanel()
    {
        JPanel panel = new JPanel();

        panel.setBounds(105, 400, 600, 250);
        panel.setBackground(Color.black);

        return panel;
    }

    public JPanel newGameEnterPanel()
    {
        JPanel ngpanel = new JPanel();

        ngpanel.setBounds(100, 480, 600, 250);
        ngpanel.setBackground(Color.black);

        Font font = new Font("Times New Roman", Font.BOLD, 20);

        JButton newGameButton = new JButton("ENTER");

        newGameButton.setBackground(Color.white);
        newGameButton.setForeground(Color.black);
        newGameButton.setFont(font);

        newGameButton.addActionListener(handlerGenerator.createGameHandler());
        
        ngpanel.add(newGameButton);
        
        newGameButton.setVisible(true);
        ngpanel.setVisible(true);
        
        ngpanel.repaint();

        return ngpanel;
    }

    public JPanel loadGameTextPanel()
    {
        JPanel panel = new JPanel();

        JButton textButton = new JButton("ENTER");
        textButton.setBackground(Color.black);
        textButton.setForeground(Color.white);
        textButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textButton.setFocusPainted(false);

        textButton.addActionListener(handlerGenerator.loadGameTextFieldHandler());

        panel.setBounds(100, 400, 600, 250);
        panel.setBackground(Color.black);

        panel.add(textButton);

        return panel;
    }

    public JPanel gamePanel()
    {
        JPanel gamePanel = new JPanel();
        gamePanel.setBounds(100, 100, 600, 250);
        gamePanel.setBackground(Color.black);

        return gamePanel;
    }

    public JPanel errorPanel()
    {
        JPanel errorPanel = new JPanel();
        errorPanel.setBounds(100, 300, 600, 250);
        errorPanel.setBackground(Color.black);

        return errorPanel;
    }

    public JTextField loadTextField()
    {
        Font font = new Font("Times New Roman", Font.BOLD, 20);
        
        JTextField loadTextField = new JTextField(30);
        loadTextField.setBounds(100, 500, 600, 250);
        loadTextField.setBackground(Color.black);
        loadTextField.setForeground(Color.white);
        loadTextField.setFont(font);
        
        Border border1 = BorderFactory.createLineBorder(Color.white);
        TitledBorder border2 = BorderFactory.createTitledBorder(border1, "Enter previous character name here", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, font, Color.white);
        loadTextField.setBorder(border2);        

        return loadTextField;
    }

    public JTextField newGameTextField()
    {
        JTextField newTextField = new JTextField(20);
        Font font = new Font("Times New Roman", Font.BOLD, 20);
        newTextField.setBackground(Color.black);
        newTextField.setForeground(Color.white);
        newTextField.setFont(font);
        Border border1 = BorderFactory.createLineBorder(Color.white);
        TitledBorder border2 = BorderFactory.createTitledBorder(border1, "Enter character name here", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, font, Color.white);
        newTextField.setBorder(border2);

        return newTextField;
    }

    public JLabel errorLabel()
    {
        JLabel label = new JLabel();
        label.setBackground(Color.black);
        label.setForeground(Color.red);
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label.setBorder(null);

        return label;
    }

    public JLabel mainLabel()
    {
        JLabel label = new JLabel();
        label.setBackground(Color.black);
        label.setForeground(Color.white);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        label.setBorder(null);

        return label;
    }

    public JList classList()
    {
        Font font = new Font("Times New Roman", Font.PLAIN, 20);

        String[] classList =
        {
            "Paladin", "Wizard", "Barbarian"
        };

        JList list = new JList(classList);
        list.setFixedCellWidth(250);
        list.setBackground(Color.black);
        list.setForeground(Color.white);
        list.setFont(font);

        DefaultListCellRenderer renderer = (DefaultListCellRenderer) list.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        Border border1 = BorderFactory.createLineBorder(Color.white);
        TitledBorder border2 = BorderFactory.createTitledBorder(border1, "Choose Class", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, font, Color.white);

        list.setBorder(border2);

        return list;
    }

    public JSpinner NumRoomsSpinner()
    {
        Font font = new Font("Times New Roman", Font.PLAIN, 20);

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));

        JComponent editor = spinner.getEditor();

        JFormattedTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
        tf.setColumns(18);
        tf.setFont(font);
        tf.setBackground(Color.black);
        tf.setForeground(Color.white);
        tf.setHorizontalAlignment(SwingConstants.CENTER);
        tf.setEditable(false);

        Border border1 = BorderFactory.createLineBorder(Color.white);
        TitledBorder border2 = BorderFactory.createTitledBorder(border1, "Chose Number of Rooms", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, font, Color.white);

        tf.setBorder(border2);

        return spinner;
    }
}
