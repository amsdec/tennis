package com.github.amsdec.tennis;

public class DeuceState implements GameState {

    @Override
    public void point(final String player, final Tennis tennis) {
        tennis.setState(new AdvantageState(player));
    }

    @Override
    public String getScore() {
        return "deuce";
    }

}
