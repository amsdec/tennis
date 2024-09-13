package com.github.amsdec.tennis;

public class WinState implements GameState {

    private final String winner;

    public WinState(final String player) {
        this.winner = player;
    }

    @Override
    public void point(final String player, final Tennis tennis) {
        System.out.println("Game already finished...");
    }

    @Override
    public String getScore() {
        return String.format("%s wins!!!!", this.winner);
    }

}
