package src.participant.with.limits.hw8.hillel;

public class Wall extends Obstacle {
    public Wall(int height) {
        super(height);
    }

    @Override
    public boolean overcome(Participant participant) throws NullPointerException {
        if (participant == null) {
            throw new NullPointerException("Participant cannot be null");
        }
        return participant.jump(difficulty);
    }
}
