package ch.zhaw.springboot.demo_projekt_springboot;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {

    @Test
    public void testInitialScore() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA1() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA1();
        assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA2() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA2();
        assertEquals("002:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA3() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA3();
        assertEquals("003:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB1() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB1();
        assertEquals("000:001", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB2() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB2();
        assertEquals("000:002", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB3() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB3();
        assertEquals("000:003", scoreKeeper.getScore());
    }

    @Test
    public void testMultipleScores() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamA3();
        assertEquals("004:002", scoreKeeper.getScore());
    }

    @Test
    public void testLargeScores() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        for (int i = 0; i < 100; i++) {
            scoreKeeper.scoreTeamA3();
            scoreKeeper.scoreTeamB3();
        }
        assertEquals("300:300", scoreKeeper.getScore());
    }

    @Test
    public void testScoreAfterReset() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.reset();
        assertEquals("000:000", scoreKeeper.getScore());
    }
}
