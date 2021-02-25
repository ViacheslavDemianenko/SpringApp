package ru.demyanenko.springApp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.demyanenko.springApp1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    
    /* Создание и внедрение бинов вручную
    //Создание бинов
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }
    //Внедрение зависимости в MusicPlayer
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic());
    }

     */
}
