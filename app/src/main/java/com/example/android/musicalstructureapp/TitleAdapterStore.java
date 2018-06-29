package com.example.android.musicalstructureapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TitleAdapterStore extends ArrayAdapter<Title> {
    private static class ViewHolder{
        TextView firstList;
        TextView secondList;
    }

    public TitleAdapterStore(Context context, ArrayList<Title> titles){
        super(context, R.layout.list_item_store,titles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get the data item for this position
        Title title = getItem(position);
        //view lookup cache stored in tag
        ViewHolder viewHolder;

        if(convertView==null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item_store,parent,false);
            viewHolder.firstList = (TextView) convertView.findViewById(R.id.album_name);
            viewHolder.secondList = (TextView) convertView.findViewById(R.id.singer_name);
            convertView.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        assert title != null;
        viewHolder.firstList.setText(title.getAlbumName());
        viewHolder.secondList.setText(title.getSingerName());
        return convertView;
    }
}
