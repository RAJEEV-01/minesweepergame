package com.example.minesweepergame.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import com.example.minesweepergame.gameprocessor4;

public class grid4 extends GridView {
    public grid4(Context context, AttributeSet attrs){
        super(context,attrs);
        setNumColumns(gameprocessor4.WIDTH);
        setAdapter(new grid4Adapter());
    }
    private class grid4Adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return gameprocessor4.getInstance().WIDTH * gameprocessor4.getInstance().HEIGHT;
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
            return gameprocessor4.getInstance().getcell4(position);
        }
    }

}


