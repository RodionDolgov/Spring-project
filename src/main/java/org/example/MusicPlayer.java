package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer{
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2){
        this.music1=music1;
        this.music2=music2;
    }

    public String playMusic(){
        return "Playing: " + music1.getSong() + ", " +music2.getSong();
    }
}