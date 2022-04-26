/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.RunGame;

import RPG.GameSetup.Game;
import RPG.UserInput.ParseInput;

/**
 *
 * @author alex
 * 
 * This class contains the main method for the game
 */
public class RunGame
{
    public static void runGame()
    {   
        //sets runGame to true when the program is first run
        boolean runGame = true;
        
        while (runGame) //loops the game while runGame is true
        {
            Game game = (new StartGame()).startGame(); //gets the game

            System.out.println(game.getPlayer()); //prints out the player stats
            System.out.println(game.getPlayer().getRoom()); //prints out the first room

            boolean exit;

            do //runs the main game
            {
                System.out.println("\nYou have " + (game.getMapSize() + 1 - game.getPlayer().getRoomNum()) + " room" + (((game.getMapSize() + 1 - game.getPlayer().getRoomNum()) == 1) ? " " : "s ") + "left"); 
                Encounter encounter = new Encounter(game.getPlayer(), game.getPlayer().getRoom().getEnemy()); //creates a new encounter based on the room
                if (!encounter.runEncounter()) //runs the encounter code
                {
                    exit = false;
                }
                else
                {
                    exit = ParseInput.parseCommandInput(game); //checks if the player wants to exit
                } 
            }
            while (exit);
            
            EndGame endGame = new EndGame(game); 
            
            runGame = endGame.endGame(); //runs the endgame code
        }
    }
}
