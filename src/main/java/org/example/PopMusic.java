package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class PopMusic implements Music{
    private PopMusic(){}
    public static PopMusic getPopMusic(){
        return new PopMusic();
    }
    public void MyInit(){
        System.out.println("Creating of object");
    }
    public void MyDestroy(){
        System.out.println("Destroying of object");
    }
    private List<String> songs= new ArrayList<>();

    public void fillList(){
        songs.add("Blue mood");
        songs.add("Blinding by the lights");
        songs.add("Who's laughing now");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
