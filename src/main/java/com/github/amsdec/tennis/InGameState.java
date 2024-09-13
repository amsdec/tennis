package com.github.amsdec.tennis;

public class InGameState implements GameState {

    private int player1Points = 0;

    private int player2Points = 0;

    @Override
    public void point(final String player, final Tennis tennis) {
        this.addPoint(player);

        if (this.isDeuce()) {
            tennis.setState(new DeuceState());
        }

        if (this.isThereAWinner()) {
            tennis.setState(new WinState(player));
        }
    }

    private void addPoint(final String player) {
        if ("player1".equals(player)) {
            this.player1Points++;
        } else if ("player2".equals(player)) {
            this.player2Points++;
        }
    }

    private boolean isDeuce() {
        return this.player1Points == this.player2Points && this.player1Points >= 3;
    }

    private boolean isThereAWinner() {
        return this.isPlayer1Winner() || this.isPlayer2Winner();
    }

    private boolean isPlayer1Winner() {
        return this.isWinner(this.player1Points, this.player2Points);
    }

    private boolean isPlayer2Winner() {
        return this.isWinner(this.player2Points, this.player1Points);
    }

    private boolean isWinner(final int points1, final int points2) {
        return points1 >= 4 && points1 > points2 + 1;
    }

    @Override
    public String getScore() {
        final String player1Score = this.translatePlayerScore(this.player1Points);
        final String player2Score = this.translatePlayerScore(this.player2Points);

        return String.format("player1 %s, player2 %s", player1Score, player2Score);
    }

    private String translatePlayerScore(final int playerPoints) {
        switch (playerPoints) {
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "love";
        }

    }

}
