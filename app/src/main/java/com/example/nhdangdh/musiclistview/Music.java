package com.example.nhdangdh.musiclistview;

/**
 * Created by nhdangdh on 6/19/2017.
 */

public class Music {

    private String musicName;
    private String singer;
    private String time;
    private int img;

    public Music(String musicName, String singer, String time, int img) {
        this.musicName = musicName;
        this.singer = singer;
        this.time = time;
        this.img = img;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
