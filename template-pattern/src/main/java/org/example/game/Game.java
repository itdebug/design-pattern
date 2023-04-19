package org.example.game;

public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

}
