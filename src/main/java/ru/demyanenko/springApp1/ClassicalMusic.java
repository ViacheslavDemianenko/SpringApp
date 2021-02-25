package ru.demyanenko.springApp1;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destraction");
    }

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
