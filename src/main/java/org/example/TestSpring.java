package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ReflectionUtils;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        //System.out.println(music.getsong() + " " + music2.getsong() + " " + music3.getsong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        boolean isThatTrue = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(isThatTrue);
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());


        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());
        context.close();

    }
}
