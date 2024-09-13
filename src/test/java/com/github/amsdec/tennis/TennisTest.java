package com.github.amsdec.tennis;

import org.junit.Assert;
import org.junit.Test;

public class TennisTest {

    @Test
    public void initialScore() {
        final Tennis game = new Tennis(new InGameState());
        Assert.assertEquals("player1 love, player2 love", game.score());
    }

    @Test
    public void player1OnePoint() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();

        Assert.assertEquals("player1 15, player2 love", game.score());
    }

    @Test
    public void player1TwoPoints() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();
        game.player1Points();

        Assert.assertEquals("player1 30, player2 love", game.score());
    }

    @Test
    public void player1ThreePoints() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();
        game.player1Points();
        game.player1Points();

        Assert.assertEquals("player1 40, player2 love", game.score());
    }

    @Test
    public void player1FourPoints() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();
        game.player1Points();
        game.player1Points();
        game.player1Points();

        Assert.assertEquals("player1 wins!!!!", game.score());
    }

    @Test
    public void player2OnePoint() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();

        Assert.assertEquals("player1 love, player2 15", game.score());
    }

    @Test
    public void player2TwoPoints() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();
        game.player2Points();

        Assert.assertEquals("player1 love, player2 30", game.score());
    }

    @Test
    public void player2ThreePoints() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();
        game.player2Points();
        game.player2Points();

        Assert.assertEquals("player1 love, player2 40", game.score());
    }

    @Test
    public void player2FourPoints() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();
        game.player2Points();
        game.player2Points();
        game.player2Points();

        Assert.assertEquals("player2 wins!!!!", game.score());
    }

    @Test
    public void drawThreePoints() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();
        game.player1Points();
        game.player1Points();

        game.player2Points();
        game.player2Points();
        game.player2Points();

        Assert.assertEquals("deuce", game.score());
    }

    @Test
    public void payer1Advantage() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();

        Assert.assertEquals("player1 advantages", game.score());
    }

    @Test
    public void payer2Advantage() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();

        Assert.assertEquals("player2 advantages", game.score());
    }

    @Test
    public void payer1LosesAdvantage() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();

        Assert.assertEquals("deuce", game.score());
    }

    @Test
    public void payer2LosesAdvantage() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();

        Assert.assertEquals("deuce", game.score());
    }

    @Test
    public void payer1Advantage2Times() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();

        Assert.assertEquals("player1 advantages", game.score());
    }

    @Test
    public void payer2Advantage2Times() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();

        Assert.assertEquals("player2 advantages", game.score());
    }

    @Test
    public void payer1WinsAfterAdvantage() {
        final Tennis game = new Tennis(new InGameState());
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player1Points();

        Assert.assertEquals("player1 wins!!!!", game.score());
    }

    @Test
    public void payer2WinsAfterAdvantage() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player2Points();

        Assert.assertEquals("player2 wins!!!!", game.score());
    }

    @Test
    public void coolGame() {
        final Tennis game = new Tennis(new InGameState());
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player1Points();
        game.player2Points();
        game.player2Points();

        Assert.assertEquals("player2 wins!!!!", game.score());
    }

}
