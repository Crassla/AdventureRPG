/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.RunGame;

import RPG.FileIO.GameSave;
import RPG.GUI.GUI;
import RPG.GameSetup.Game;
import RPG.UserInput.ParseInput;

/**
 *
 * @author Alex
 *
 * This class controls the start of the game
 */
public class StartGame
{

    private GUI gui;

    public StartGame(GUI gui)
    {
        this.gui = gui;
    }

    //creates a new game object for the user
    public void newGame()
    {
        gui.setGameScreen();
        gui.updateGameTextArea("CREATING NEW GAME");
    }

    //load the game into a previous save
    public void loadGame()
    {
        gui.setGameScreen();
        gui.updateGameTextArea("LOADING PREVIOUS CHARACTER");
    }
}
