package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();

    private ClassicalMusic(){
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

    //Попробовать реализовать на уровне интерфейса
//    public String getRandomsong(){
//        int random_number = (int) (Math.random() *3);
//        return songs.get(random_number);
//    }
}
