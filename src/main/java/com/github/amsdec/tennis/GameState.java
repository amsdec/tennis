package com.github.amsdec.tennis;

public interface GameState {

    void point(String player, Tennis tennis);

    String getScore();

}
