package org.example.game.concrete;

import org.example.game.Game;

public class FootBallGame extends Game {

    public void initialize() {
        System.out.println("FootBallGame initialized! start playing.");
    }

    public void startPlay() {
        System.out.println("FootBallGame Started. Enjoy the game!");
    }

    public void endPlay() {
        System.out.println("FootBallGame Finished");
    }
}
