package ch.zhaw.springboot.demo_projekt_springboot;
public class ScoreKeeper {
    private int teamAScore;
    private int teamBScore;

    public ScoreKeeper() {
        this.teamAScore = 0;
        this.teamBScore = 0;
    }

    public void scoreTeamA1() {
        teamAScore += 1;
    }

    public void scoreTeamA2() {
        teamAScore += 2;
    }

    public void scoreTeamA3() {
        teamAScore += 3;
    }

    public void scoreTeamB1() {
        teamBScore += 1;
    }

    public void scoreTeamB2() {
        teamBScore += 2;
    }

    public void scoreTeamB3() {
        teamBScore += 3;
    }

    public String getScore() {
        return String.format("%03d:%03d", teamAScore, teamBScore);
    }

    public void reset() {
        teamAScore = 0;
        teamBScore = 0;
    }
}
