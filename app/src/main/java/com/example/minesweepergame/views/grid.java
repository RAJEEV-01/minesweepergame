package com.example.minesweepergame.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.example.minesweepergame.gameprocessor;

public class grid extends GridView {
    public grid(Context context, AttributeSet attrs){
        super(context,attrs);
        setNumColumns(gameprocessor.WIDTH);
        setAdapter(new gridAdapter());
    }
    private class gridAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return gameprocessor.getInstance().WIDTH * gameprocessor.getInstance().HEIGHT;
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
            return gameprocessor.getInstance().getcell(position);
        }
    }

}
