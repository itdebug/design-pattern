package org.example.game.concrete;

import org.example.game.Game;

public class BasketBallGame extends Game {

    public void initialize() {
        System.out.println("BasketBallGame initialized! start playing.");
    }

    public void startPlay() {
        System.out.println("BasketBallGame Started. Enjoy the game!");
    }

    public void endPlay() {
        System.out.println("BasketBallGame Finished");
    }
}
