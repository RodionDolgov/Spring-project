package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Computer {
    private  int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter Genre: POP, ROCK, CLASSIC");
            String userGenre = reader.readLine();
            switch (userGenre) {
                case "POP":
                    return "Computer " + id + " " + musicPlayer.playMusic(Genre.POP);
                case "ROCK":
                    return "Computer " + id + " " + musicPlayer.playMusic(Genre.ROCK);
                case "CLASSICAL":
                    return "Computer " + id + " " + musicPlayer.playMusic(Genre.CLASSICAL);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Введите значение повторно. Текущее значение неверно");
        toString();
        return "Something went wrong";
    }
}
