package com.github.amsdec.tennis;

public class AdvantageState implements GameState {

    private final String player;

    public AdvantageState(final String player) {
        this.player = player;
    }

    @Override
    public void point(final String player, final Tennis tennis) {
        if (this.player.equals(player)) {
            tennis.setState(new WinState(player));
        } else {
            tennis.setState(new DeuceState());
        }
    }

    @Override
    public String getScore() {
        return String.format("%s advantages", this.player);
    }

}
