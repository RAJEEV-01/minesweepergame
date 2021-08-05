package com.example.minesweepergame.views;

import android.content.Context;
import android.view.View;

import com.example.minesweepergame.gameprocessor3;

public abstract class basecell3 extends View {
    private  int value;


    private boolean isbomb;
    private boolean isrevealed;
    private boolean isclicked;
    private boolean isflagged;

    private int x;
    private int y;
    private int position;

    public basecell3(Context context){
        super(context);
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        isbomb = false;
        isrevealed = false;
        isclicked = false;
        isflagged = false;

        if (value == -1){
            isbomb = true;
        }
        this.value = value;
    }
    public boolean isIsbomb() {
        return isbomb;
    }

    public void setIsbomb(boolean isbomb) {
        this.isbomb = isbomb;
    }
    public boolean isIsrevealed() {
        return isrevealed;
    }

    public void setIsrevealed() {

        this.isrevealed = true;
        invalidate();
    }

    public boolean isIsclicked() {
        return isclicked;
    }

    public void setIsclicked() {
        this.isclicked = true;
        this.isrevealed=true;

        invalidate();
    }

    public boolean isIsflagged() {
        return isflagged;
    }

    public void setIsflagged(boolean isflagged) {
        this.isflagged = isflagged;
    }
    public int getXPos() {
        return x;
    }

    public int getYPos() {
        return y;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int x,int y){
        this.x=x;
        this.y=y;
        this.position = y*gameprocessor3.WIDTH +x;
        invalidate();
    }
}

