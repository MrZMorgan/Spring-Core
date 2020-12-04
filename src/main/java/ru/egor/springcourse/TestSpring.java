package ru.egor.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );

        Music music1 = context.getBean("rockMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(music1);
        rockMusicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        classicalMusicPlayer.playMusic();

        context.close();
    }
}
