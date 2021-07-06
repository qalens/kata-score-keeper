package com.qalens.scorekeeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {
    ScoreKeeper scoreKeeper;
    @BeforeEach()
    public void assignNewScoreKeeper(){
        scoreKeeper = new ScoreKeeper();
    }
    @Test
    public void shouldGetScore000000WhenNoOneScored(){
        Assertions.assertEquals("000:000",scoreKeeper.getScore());
    }
    @Test
    public void shouldGetScore000001WhenTeamBScores1Point(){
        scoreKeeper.scoreTeamB1();
        Assertions.assertEquals("000:001",scoreKeeper.getScore());
    }
    @Test
    public void shouldGetScore000002WhenTeamBScores1Point(){
        scoreKeeper.scoreTeamB2();
        Assertions.assertEquals("000:002",scoreKeeper.getScore());
    }
}
