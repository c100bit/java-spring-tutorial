package org.example;

public class Computer {
    private final MusicPlayer musicPlayer;


    public Computer(MusicPlayer musicPlayer) {
        int id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return musicPlayer.playMusic(Genre.CLASSICAL);
    }
}
