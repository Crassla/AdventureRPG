/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG.RunGame;

import RPG.FileIO.GameSave;
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

    //main run method of start game
    public Game startGame()
    {
        System.out.println("Welcome to Dungeon RPG");

        if (ParseInput.getYNInput("Do you wish to view the game instructions (y/n): ")) //prints out the instructions if the user wants to see them
        {
            Instructions instruc = new Instructions();
            instruc.printInstructions();
        }

        System.out.println("=================DUNGEON RPG STARTING==================");

        if (!ParseInput.getYNInput("Do you want to load into a previous game (y/n): "))//returns game based on wheter the user want to load in or not
        {
            return newGame();
        }
        else
        {
            return loadGame();
        }
    }

    //creates a new game object for the user
    private Game newGame()
    {
        Game game;
        int output = 0;
        int numRooms;
        int playerClass;

        System.out.println("\n=================CREATE NEW CHARACTER==================");

        do //wait until the users input is correct before selecting the character
        {
            System.out.println("Select Your Character:");
            System.out.println("Paladin      (1)");
            System.out.println("Wizard      (2)");
            System.out.println("Barbarian (3)");

            output = ParseInput.getIntInput("Please input a number between 1 and 3\n");

            if ((output < 1 || output > 3))
            {
                System.out.println("Please input a number between 1 and 3\n");
            }

        }
        while ((output < 1 || output > 3));

        playerClass = output; //set the player class to the users input

        do //get number of rooms
        {
            System.out.println("How many rooms do you want to go through?");
            output = ParseInput.getIntInput("How many rooms do you want to go through?");

            if (output <= 0 || output > 20)
            {
                System.out.println("Please input a number between 1 and 20\n");
            }
        }
        while (output <= 0 || output > 20); //setting 100 as max limit of rooms

        numRooms = output;

        game = new Game(numRooms, playerClass);

        do //take in the players name input (spaces and c are not allowed due to how saves are made)
        {
            System.out.println("Please Input Your Characters Name (c and spaces not allowed): ");
            game.getPlayer().setName(ParseInput.getStringInput());
        }
        while (!ParseInput.getYNInput("Is " + game.getPlayer().getName() + " the name you want (y/n):") || game.getPlayer().getName().equals("c"));

        return game;
    }

    //load the game into a previous save
    private Game loadGame()
    {
        System.out.println("\n=================LOADING CHARACTER==================");
        GameSave gameSave = new GameSave();
        Game game;
        String input;

        do //get the previous save or cancel loading if needed
        {
            System.out.println("Please input previous characters name: ");
            input = ParseInput.getStringInput();
            game = gameSave.findSavedGame(input);

            if (game == null && !input.equals("c"))
            {
                System.out.println("If you wish to cancel loading character press (c): ");
            }
        }
        while (game == null && !input.equals("c"));

        //if they decide to cancel it just creates a new game
        if (game == null)
        {
            return newGame();
        }
        else
        {
            return game;
        }
    }
}
