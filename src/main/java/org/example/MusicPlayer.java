package org.example;
// Will apply the inversion of control (Будем применять инверсию управления)

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    //private Music music;  //Common interface
    private String name; //this name is Player
    private int volume;

    //IoC
    //public MusicPlayer(Music music) {  //with arguments
    //    this.music = music;
    //}
    //public MusicPlayer(){ //no arguments
    //}
    // public void setMusic(Music music) {
    //  this.music = music;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) { //this method will use in applicationContext
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) { //this method will use in applicationContext
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList() {
        for(Music music : musicList)
            System.out.println("Playing: " + music.getSong());



    }
}
