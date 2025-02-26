package ru.nemkoff.springCourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
  private List<Music> musicList = new ArrayList<>();
  private String name;
  private int volume;

  public MusicPlayer(List<Music> music) {
    this.musicList = music;
  }

  public MusicPlayer() {
  }

  public void playMusic() {
    musicList.forEach(music -> System.out.println("Playing: " + music.getSong() + "..."));
  }

  public void setMusicList(List<Music> music) {
    this.musicList = music;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
