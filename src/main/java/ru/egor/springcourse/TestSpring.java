package ru.egor.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );

//        Music musicBean = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        musicPlayer.playMusic();
        context.close();
    }
}
