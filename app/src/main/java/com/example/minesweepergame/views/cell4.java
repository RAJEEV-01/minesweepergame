package com.example.minesweepergame.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.example.minesweepergame.R;
import com.example.minesweepergame.gameprocessor4;

public class cell4 extends basecell4 implements View.OnClickListener {
    Vibrator vibrator;
    public static int score =0;
    public cell4(Context context, int x,int y){
        super(context);
        setPosition(x,y);
        setOnClickListener(this);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec,widthMeasureSpec);
    }
    @Override
    public void onClick(View v) {
        gameprocessor4.getInstance().click(getXPos(),getYPos());
    }

    @Override
    protected void onDraw(Canvas canvas) {
       super.onDraw(canvas);
        drawbtn(canvas);
        if (isIsflagged()){
            drawflag(canvas);
        }
        else{
            if (isIsrevealed() && isIsbomb() && !isIsclicked()){
                drawnormalbomb(canvas);
            } else {
                if (isIsclicked()){
                    if (getValue() == -1){
                        drawexplodedbomb(canvas);
                    }
                    else{
                        drawnumber(canvas);
                        score++;
                    }
                }  else
                    drawbtn(canvas);
            }
        }
    }
    private void drawflag(Canvas canvas){
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.flag);
        drawable.setBounds(0,0,getWidth(),getHeight());
        drawable.draw(canvas);
    }
    private void drawexplodedbomb(Canvas canvas){
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.explodedbomb);
        drawable.setBounds(0,0,getWidth(),getHeight());
        drawable.draw(canvas);

    }
    private void drawbtn(Canvas canvas){
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.btntile);
        drawable.setBounds(0,0,getWidth(),getHeight());
        drawable.draw(canvas);
    }
    private void drawnormalbomb(Canvas canvas){
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.normalbomb);
        drawable.setBounds(0,0,getWidth(),getHeight());
        drawable.draw(canvas);
    }
    private void drawnumber(Canvas canvas){
        Drawable drawable = null;
        switch (getValue()){

            case 0:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number01);
                break;
            case 1:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number11);
                break;
            case 2:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number02);
                break;
            case 3:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number03);
                break;
            case 4:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number04);
                break;
            case 5:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number05);
                break;
            case 6:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number06);
                break;
            case 7:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number07);
                break;
            case 8:
                drawable = ContextCompat.getDrawable(getContext(),R.drawable.number08);
                break;
        }
        drawable.setBounds(0,0,getWidth(),getHeight());
        drawable.draw(canvas);
    }
}


