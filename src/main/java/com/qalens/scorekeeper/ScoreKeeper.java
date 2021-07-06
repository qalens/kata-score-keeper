package com.qalens.scorekeeper;

public class ScoreKeeper {
    private int teamAScore=0;
    private int teamBScore=0;
    public String getScore(){
        return String.format("%03d:%03d",teamAScore,teamBScore);
    }

    public void scoreTeamB1() {
        teamBScore++;
    }

    public void scoreTeamB2() {
    }
}
