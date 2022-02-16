/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import java.util.Random;

/**
 *
 * @author eber
 */
public class Juego {

    private int computer;
    private int user;
    
    public Juego(int userSlct){
        computer = userSlct;
    }
    public int getComp() {
        Random obj = new Random();
        int move = obj.nextInt(3);
        return move;
    }

    public String getDecision(int choice1, int choice2) {
        if (choice1 == choice2) {
            return "Empate";
        } else {
            switch (choice1) {
                case 0:
                    if (choice2 == 2) {
                        computer += 1;
                        return "Compu";
                    } else {
                        user += 1;
                        return "Jugador";
                    }
                case 1:
                    if (choice2 == 0) {
                        computer += 1;
                        return "Compu";
                    } else {
                        user += 1;
                        return "Jugador";
                    }
                case 2:
                    if (choice2 == 1) {
                        computer += 1;
                        return "Compu";
                    } else {
                        user += 1;
                        return "Jugador";
                    }
            }
        }
        return "Empate";
    }

    public void getResult() {
        if (user > computer) {
            System.out.println("User Wins");
        } else if (computer > user) {
            System.out.println("Computer wins");
        } else {
            System.out.println("It is a tie");
        }
    }
}
