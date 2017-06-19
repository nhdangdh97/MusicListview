package com.example.nhdangdh.musiclistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nhdangdh on 6/19/2017.
 */

public class MusicApdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Music>musicList;

    public MusicApdapter(Context context, int layout, List<Music> musicList) {
        this.context = context;
        this.layout = layout;
        this.musicList = musicList;
    }

    @Override
    public int getCount() {
        return musicList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =  inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.txtMusicName = (TextView) convertView.findViewById(R.id.txtMusicName);
            holder.txtSinger = (TextView) convertView.findViewById(R.id.txtSinger);
            holder.imgSinger = (ImageView) convertView.findViewById(R.id.imgSinger);
            holder.txtTime = (TextView) convertView.findViewById(R.id.txtTime);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Music music = this.musicList.get(position);

        holder.imgSinger.setImageResource(music.getImg());
        holder.txtMusicName.setText(music.getMusicName());
        holder.txtSinger.setText(music.getSinger());
        holder.txtTime.setText(music.getTime());

        return convertView;
    }

    static class ViewHolder{
        ImageView imgSinger;
        TextView txtMusicName, txtSinger, txtTime;
    }
}
