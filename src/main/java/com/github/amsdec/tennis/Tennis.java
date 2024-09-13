package com.github.amsdec.tennis;

public class Tennis {

    private int pointsPlayer1 = 0;

    private int pointsPlayer2 = 0;

    public void player1Points() {
        this.pointsPlayer1++;

    }

    public void player2Points() {
        this.pointsPlayer2++;

    }

    public String score() {
        if (this.pointsPlayer1 == this.pointsPlayer2 && this.pointsPlayer1 >= 3) {
            return "deuce";
        }

        if (this.pointsPlayer1 >= 4 && this.pointsPlayer2 >= 3 && this.pointsPlayer1 - 1 == this.pointsPlayer2) {
            return "player1 advantages";
        }

        if (this.pointsPlayer2 >= 4 && this.pointsPlayer1 >= 3 && this.pointsPlayer2 - 1 == this.pointsPlayer1) {
            return "player2 advantages";
        }

        if (this.pointsPlayer1 >= 4 && this.pointsPlayer1 > this.pointsPlayer2 + 1) {
            return "player1 wins!!!!";
        }

        if (this.pointsPlayer2 >= 4 && this.pointsPlayer2 > this.pointsPlayer1 + 1) {
            return "player2 wins!!!!";
        }

        final String player1Score = this.translatePlayerScore(this.pointsPlayer1);
        final String player2Score = this.translatePlayerScore(this.pointsPlayer2);

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
                break;
        }

        return "love";
    }

}
