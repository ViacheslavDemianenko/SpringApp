package ru.demyanenko.springApp1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
       /* Конфигурация через xml-файл ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // without DI     Music music = context.getBean("musicBean", Music.class);

        // without DI   MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println("Марка: "+musicPlayer.getName());
        System.out.println("Громкость: "+musicPlayer.getVolume());

        context.close();
    }

}