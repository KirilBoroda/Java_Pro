package participant.with.limits.hw8.hillel;

public class RunningPath extends Obstacle {
    public RunningPath(int distance) {
        super(distance);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(distanceOrHeight);
    }
}
