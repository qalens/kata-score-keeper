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
}
