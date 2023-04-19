package org.example;

import org.example.game.Game;
import org.example.game.concrete.BasketBallGame;
import org.example.game.concrete.FootBallGame;

/**
 * Hello world!
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new BasketBallGame();
        game.play();
        System.out.println();
        game = new FootBallGame();
        game.play();
    }
}
