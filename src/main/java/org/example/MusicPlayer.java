package org.example;
// Will apply the inversion of control (Будем применять инверсию управления)

public class MusicPlayer {
    private Music music;  //Common interface

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing" + music.getSong());

    }
}
