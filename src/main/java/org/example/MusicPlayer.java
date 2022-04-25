package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MusicPlayer{
    private Music music1;
    private Music music2;
    private Music music3;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2, @Qualifier("popMusic") Music music3){
        this.music1=music1;
        this.music2=music2;
        this.music3=music3;
    }

    public String playMusic(Genre genre){
        List<String> current_playlist = null;

        switch (genre){
            case CLASSICAL:{
                current_playlist = new ArrayList<>(music1.getSong());
                int random_number = (int) (Math.random() * 3);
                return current_playlist.get(random_number);
            }
            case ROCK:{
                current_playlist = new ArrayList<>(music2.getSong());
                int random_number = (int) (Math.random() * 3);
                return current_playlist.get(random_number);
            }
            case POP:{
                current_playlist = new ArrayList<>(music3.getSong());
                int random_number = (int) (Math.random() * 3);
                return current_playlist.get(random_number);
            }
        }
        return "Something went wrong :(";
        //return "Playing: " + music1.getSong() + ", " +music2.getSong();
    }
}
