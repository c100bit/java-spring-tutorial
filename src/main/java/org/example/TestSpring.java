package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//  Computer computer = context.getBean("computer", Computer.class);
//  System.out.println(computer);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(player.getName());
        ClassicalMusic music1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music1 == music2);
        context.close();
    }
}
