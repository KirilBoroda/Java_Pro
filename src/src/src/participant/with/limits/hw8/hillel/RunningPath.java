package src.participant.with.limits.hw8.hillel;

public class RunningPath extends Obstacle {
    public RunningPath(int distance) {
        super(distance);
    }

    @Override
    public boolean overcome(Participant participant) throws NullPointerException {
        if (participant == null) {
            throw new NullPointerException("Participant cannot be null");
        }
        return participant.run(difficulty);
    }
}
