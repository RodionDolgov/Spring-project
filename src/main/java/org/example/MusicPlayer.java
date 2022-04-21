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

@Component
public class MusicPlayer{
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2){
        this.music1=music1;
        this.music2=music2;
    }

    public String playMusic(Genre genre){
        List<String> current_playlist = null;//new ArrayList<>(music1.getSong());

        switch (genre){
            case CLASSICAL:{
                current_playlist = new ArrayList<>(music1.getSong());
//                for(int i = 0; i < music1.getSong().size(); i++){
//                    current_playlist.add(music1.getSong().get(i));
//                }
                //addAll Можно использовать

                try{
                    int random_number = (int) (Math.random() * 3);
                    return current_playlist.get(random_number);
                }catch (NullPointerException e){
                    return "Something went wrong :(";
                }
            }
            case POP:{

            }
            case ROCK:{
                current_playlist = music2.getSong();
            }
        }

        try{
            return current_playlist.get(1);
        }catch (NullPointerException e){
            return "Something went wrong :(";
        }
        //return "Playing: " + music1.getSong() + ", " +music2.getSong();
    }
}
