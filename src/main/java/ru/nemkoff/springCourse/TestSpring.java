package ru.nemkoff.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml"
    );

    //Music music = context.getBean("musicBean", Music.class);
    //MusicPlayer musicPlayer = new MusicPlayer(music);

    MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

    MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    System.out.println("Check links: " + (firstMusicPlayer == secondMusicPlayer));

    firstMusicPlayer.playMusic();
    System.out.println(firstMusicPlayer.getName() + " : " + firstMusicPlayer.getVolume());

    System.out.println(firstMusicPlayer);

    System.out.println(secondMusicPlayer);

    firstMusicPlayer.setVolume(10);
    System.out.println(firstMusicPlayer.getVolume());
    System.out.println(secondMusicPlayer.getVolume());
    context.close();
    // email is changed
  }
}
