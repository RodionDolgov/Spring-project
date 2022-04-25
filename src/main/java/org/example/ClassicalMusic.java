package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();

    public ClassicalMusic(){
        fillList();
    }

    public void fillList(){
        songs.add("Moon Sonate");
        songs.add("Kalinka");
        songs.add("Spring");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
