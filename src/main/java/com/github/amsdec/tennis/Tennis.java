package com.github.amsdec.tennis;

import lombok.Setter;

public class Tennis {

    @Setter
    private GameState state;

    public Tennis(final GameState state) {
        this.state = state;
    }

    public void player1Points() {
        this.state.point("player1", this);
    }

    public void player2Points() {
        this.state.point("player2", this);
    }

    public String score() {
        return this.state.getScore();
    }

}
