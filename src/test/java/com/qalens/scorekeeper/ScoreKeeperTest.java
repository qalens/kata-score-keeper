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
    public void shouldGetScore000002WhenTeamBScores2Point(){
        scoreKeeper.scoreTeamB2();
        Assertions.assertEquals("000:002",scoreKeeper.getScore());
    }
    @Test
    public void shouldGetScore000003WhenTeamBScores3Point(){
        scoreKeeper.scoreTeamB3();
        Assertions.assertEquals("000:003",scoreKeeper.getScore());
    }

    @Test
    public void shouldGetScore001000WhenTeamAScores1Point(){
        scoreKeeper.scoreTeamA1();
        Assertions.assertEquals("001:000",scoreKeeper.getScore());
    }
    @Test
    public void shouldGetScore002000WhenTeamAScores2Point(){
        scoreKeeper.scoreTeamA2();
        Assertions.assertEquals("002:000",scoreKeeper.getScore());
    }
    @Test
    public void shouldGetScore003000WhenTeamAScores3Point(){
        scoreKeeper.scoreTeamA3();
        Assertions.assertEquals("003:000",scoreKeeper.getScore());
    }

    @Test
    public void shouldGetScore000003WhenTeamBScores1And2And3Point(){
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        Assertions.assertEquals("006:006",scoreKeeper.getScore());
    }
}
