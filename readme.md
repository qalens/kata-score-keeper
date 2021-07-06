# Score Keeper Kata
This Kata was helpful to understand Reusability and how tdd can help to prevent bugs due to copy pasting

## Problem Statement For Kata
Originally Posted At https://kata-log.rocks/score-keeper-kata

We need software to deliver the proper data to the scoreboard for a basketball team. Unfortunately the people using our software are not the brightest lights under the sun, so they need six buttons (each team can score either 1, 2 or 3 points with a single shot).

### Your task
Write a class ScoreKeeper which offers following methods:
```
void scoreTeamA1()
void scoreTeamA2()
void scoreTeamA3()
void scoreTeamB1()
void scoreTeamB2()
void scoreTeamB3()
String getScore()
```
### Rules
The returned String always has seven characters. An example would be 000:000

## Selected Stack
- Java 11
- gradle (with gradle wrapper) as build tool
- junit 5 as test framework

## Understanding Solution
- The Problem was solved using TDD and with the approach of just enough design at each stage
- Go through Each commit One by one to understand how first failing tests were written
- Each commit is one step of Red-Green-Refactor step