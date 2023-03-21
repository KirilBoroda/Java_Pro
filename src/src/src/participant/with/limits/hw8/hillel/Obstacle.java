package src.participant.with.limits.hw8.hillel;

public abstract class Obstacle {
    protected int difficulty;

    public Obstacle(int difficulty) {
        this.difficulty = difficulty;
    }

    public abstract boolean overcome(Participant participant);
}