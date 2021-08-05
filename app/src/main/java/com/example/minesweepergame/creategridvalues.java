package com.example.minesweepergame;

import java.util.Random;

public class creategridvalues {
    public static int[][] create(int bombno,final int width,final int height){
        Random random=new Random();
        int[][] grid = new int[width][height];
        while (bombno>0){
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            if (grid[x][y]!=-1){
                grid[x][y]=-1;
                bombno--;
            }
        }
        grid = calneighbor(grid,width,height);
        return grid;
    }
    private static int[][] calneighbor(int[][] grid,final int width,final int height){
        for (int x=0;x<width;x++){
            for (int y=0;y<height;y++){
                grid[x][y]= getneighbour(x,y,grid,width,height);
            }
        }
        return grid;
    }

    private static int getneighbour(int x, int y, int[][] grid, final int width, final int height) {
        if(grid[x][y]==-1){
            return -1;
        }
        int count=0;
        if(checkneighbour(x-1,y-1,grid,width,height)){
            count++;
        }
        if(checkneighbour(x,y-1,grid,width,height)){
            count++;
        }
        if(checkneighbour(x+1,y-1,grid,width,height)){
            count++;
        }
        if(checkneighbour(x+1,y+1,grid,width,height)){
            count++;
        }
        if(checkneighbour(x+1,y,grid,width,height)){
            count++;
        }
        if(checkneighbour(x-1,y,grid,width,height)){
            count++;
        }
        if(checkneighbour(x-1,y+1,grid,width,height)){
            count++;
        }
        if(checkneighbour(x,y+1,grid,width,height)){
            count++;
        }
        return count;
    }
    private static boolean checkneighbour(int x,int y,int[][] grid,final int width,final  int height){
        if (x>=0 && y>=0 && x<width && y<height){
            if (grid[x][y]==-1){
                return true;
            }
        }
        return false;
    }



}
