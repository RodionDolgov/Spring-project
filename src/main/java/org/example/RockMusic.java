package org.example;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> songs = new ArrayList<>();

    public void fillList(){
        songs.add("Follow Your Heart");
        songs.add("Believe in Love");
        songs.add("Turn on the night");
    }

    @Override
    public List<String> getSong() {
        return songs.subList(0,2);
    }
}
