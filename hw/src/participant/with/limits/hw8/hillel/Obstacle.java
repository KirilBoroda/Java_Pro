package participant.with.limits.hw8.hillel;

public abstract class Obstacle {
    protected int distanceOrHeight;

    public Obstacle(int distanceOrHeight) {
        this.distanceOrHeight = distanceOrHeight;
    }

    public abstract boolean overcome(Participant participant);
}