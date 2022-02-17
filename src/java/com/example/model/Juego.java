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

    private static int computer;
    private static int user;
    private static int empates;
    private static int partidas;

    public Juego(int userSlct) {
        computer = userSlct;
    }

    public int getComp() {
        Random obj = new Random();
        int move = obj.nextInt(3);
        return move;
    }

    public String getDecision(int choice1, int choice2) { // choice1 = jugador, choice 2 = compu
        iniciarPartida();
        if (choice1 == choice2) {
            empates++;
            partidas++;
            return "Empate";
        } else {
            switch (choice1) { // 0 piedra, 1 papel, 2 tijeras
                case 0:
                    if (choice2 == 1) {
                        computer++;
                        partidas++;
                        return "Compu";
                    } else {
                        user++;
                        partidas++;
                        return "Jugador";
                    }
                case 1:
                    if (choice2 == 2) {
                        computer++;
                        partidas++;
                        return "Compu";
                    } else {
                        user++;
                        partidas++;
                        return "Jugador";
                    }
                case 2:
                    if (choice2 == 0) {
                        computer++;
                        partidas++;
                        return "Compu";
                    } else {
                        user++;
                        partidas++;
                        return "Jugador";
                    }
            }
        }
        return "A";
    }

    public int getJPuntos() {return user;}

    public int getCPuntos() {return computer;}

    public int getEmpates() {return empates;}
    
    public void iniciarPartida(){
        if(partidas == 5){
            user = 0;
            computer = 0;
            empates = 0;
            partidas = 0;
        }
    }

    public String getResult() {
        if (partidas == 5) {
            if (user > computer) {
                return "User Wins" + "\n Fin de la partida";
            } else if (computer > user) {
                return "Computer wins" + "\n Fin de la partida";
            } else {
                return "It is a tie" + "\n Fin de la partida";
            }
        }
        return "Partida en progreso";
    }
}
