package participant.with.limits.hw8.hillel;

public class Wall extends Obstacle {
    public Wall(int height) {
        super(height);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(distanceOrHeight);
    }
}
