package com.example.minesweepergame;

import android.util.Log;

public class print {
    public static void prt(final int[][] grid, final int width,final int height){
        for (int x=0;x<width;x++){
            String printtext = "| ";
            for (int y=0;y<height;y++){
                printtext+=String.valueOf(grid[x][y]).replace("-1","B") + "| ";
            }
       Log.e("",printtext);
        }

    }
}
