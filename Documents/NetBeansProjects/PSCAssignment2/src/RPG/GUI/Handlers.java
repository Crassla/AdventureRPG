/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.GUI;

import RPG.RunGame.StartGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alex
 */
public class Handlers
{

    private GUI gui;

    public Handlers(GUI gui)
    {
        this.gui = gui;
    }

    public ActionListener newGameHandler()
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                StartGame startGame = new StartGame(gui);
                startGame.newGame();
            }
        };

        return listener;
    }

    public ActionListener loadGameHandler()
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                StartGame startGame = new StartGame(gui);
                startGame.loadGame();
            }
        };

        return listener;
    }
    
    public ActionListener loadGameTextFieldHandler()
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                StartGame startGame = new StartGame(gui);
                System.out.println(startGame.validateLoadInput(gui.getLoadTextField()));
            }
        };

        return listener;
    }
}
