package com.example.minesweepergame;

import android.content.Context;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;

import com.example.minesweepergame.views.cell4;

public class gameprocessor4 extends MainActivity4{
    public Context getContext(){
        Vibrator vibrator;
        return context;
    }

    public static gameprocessor4 instance;
    public static final int BOMBNO=30;
    public static final int WIDTH=8;
    public static final int HEIGHT=8;
    private Context context;
    public cell4[][] minesweepergrid4 = new cell4[WIDTH][HEIGHT];

    public static gameprocessor4 getInstance() {
        if (instance == null) {
            instance = new gameprocessor4();
        }
        return instance;
    }

    private gameprocessor4() {
    }

    public void creategrid(Context context) {
        this.context = context;
        Log.e("gameprocessor4", "creategrid is working");

        int[][] createGrid = creategridvalues.create(BOMBNO, WIDTH, HEIGHT);
        print.prt(createGrid, WIDTH, HEIGHT);
        setgrid(context, createGrid);
    }

    private void setgrid(final Context context, final int[][] grid) {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (minesweepergrid4[x][y] == null) {
                    minesweepergrid4[x][y] = new cell4(context,x,y);
                }
                minesweepergrid4[x][y].setValue(grid[x][y]);
                minesweepergrid4[x][y].invalidate();
            }
        }

    }

    public View getcell4(int position) {
        int x = position % WIDTH;
        int y = position / WIDTH;
        return minesweepergrid4[x][y];
    }

    public cell4 getcellat(int x, int y) {
        return minesweepergrid4[x][y];
    }

    public void click(int x, int y) {
        if (x >= 0 && y >= 0 && x < WIDTH && y < HEIGHT && !getcellat(x, y).isIsclicked()) {
            getcellat(x, y).setIsclicked();
            if (getcellat(x, y).getValue() == 0) {
                for (int a = -1; a <= 1; a++) {
                    for (int b = -1; b <= 1; b++) {
                        if (a != b) {
                            click(x + a, y + b);
                        }
                    }
                }
            }
            if (getcellat(x, y).isIsbomb()) {
                ongamelost();
            }
        }
        checkend();
    }

    private boolean checkend() {
        int bombnotfound = BOMBNO;
        int notrevealed = WIDTH * HEIGHT;
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (getcellat(x, y).isIsrevealed()) {
                    notrevealed--;
                }
            }
        }
        if ((notrevealed - bombnotfound) == 0) {
            Toast.makeText(context, "game won", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    public void ongamelost() {
        Toast.makeText(context, "game lost", Toast.LENGTH_SHORT).show();
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                getcellat(x,y).setIsrevealed();
            }
        }

    }
}



