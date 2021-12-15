package com.company;

public class Roomba implements iRobot{
    int[][] room;
    Main.Direction dir;

    public Roomba(int[][] room){
        this.room = room;
        dir = Main.Direction.DOWN;
    }

    @Override
    public boolean move(int[][] room) {
        int i = 0;
        int j = 0;
        room = new int[i][j];
        for(i = 0, j = 0; i < room.length && j < room[j].length; i++, j++){
            if(room[i+1][j] != -1) return true;
            if(room[i+1][j] == -1) return false;
        }
        return true;
    }


    @Override
    public void turnLeft() {
        Main.Direction dir = this.dir;
        dir = Main.Direction.LEFT;
    }

    @Override
    public void turnRight() {
        Main.Direction dir = this.dir;
        dir = Main.Direction.RIGHT;

    }

    @Override
    public int clean() {
        for(int i = 0, j = 0; i < room.length && j < room[j].length; i++, j++){
            if(room[i][j] == 0){
                return 1;
            }
        }
        return 0;
    }
}
