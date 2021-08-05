package com.example.minesweepergame.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import com.example.minesweepergame.gameprocessor3;

public class grid3 extends GridView {
    public grid3(Context context, AttributeSet attrs){
        super(context,attrs);
        setNumColumns(gameprocessor3.WIDTH);
        setAdapter(new grid3Adapter());
    }
    private class grid3Adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return gameprocessor3.getInstance().WIDTH * gameprocessor3.getInstance().HEIGHT;
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
            return gameprocessor3.getInstance().getcell3(position);
        }
    }

}

