package com.example.nhdangdh.musiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Music>musicList = new ArrayList<>();
        musicList.add(new Music("Someone Like You", "Adele", "4:17", R.drawable.adele));
        musicList.add(new Music("Stranger In Moscow", "Michael Jackson", "5:44", R.drawable.jackson));
        musicList.add(new Music("Tìm Lại Bầu Trời", "Tuấn Hưng", "5:28", R.drawable.tuanhung));
        musicList.add(new Music("Chờ Ngày Mưa Tan", "Noo Phước Thịnh", "3:32", R.drawable.noo));
        musicList.add(new Music("Học Cách Quên Đi Một Mình", "Lương Bích Hữu", "3:43", R.drawable.lbh));
        musicList.add(new Music("Chị Tôi", "Bằng Kiều", "5:29", R.drawable.bk));
        musicList.add(new Music("Somebody's Me", "Enrique Iglesias", "3:58", R.drawable.enrique));
        musicList.add(new Music("Nơi Này Có Anh", "Sơn Tùng MTP", "5:00", R.drawable.mtp));
        musicList.add(new Music("Vợ Người Ta", "Vũ Duy Khánh", "4:25", R.drawable.vdk));

        ListView lvMusic = (ListView) findViewById(R.id.lvMusic);
        lvMusic.setAdapter(new MusicApdapter(this, R.layout.list_music_item, musicList));
    }
}
