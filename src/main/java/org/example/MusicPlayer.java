package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    private List<Music> list = new ArrayList<>();

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setList(List<Music> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing" + music.getSong());
    }

    public void playMusicList() {
        for (Music song : list) {
            System.out.println("Playing" + song.getSong());
        }
    }
}
