package src.participant.with.limits.hw8.hillel;

public abstract class Participant {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;

    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробіг " + distance + " метрів.");
            return true;
        } else {
            System.out.println(name + " не може пробігти " + distance + " метрів.");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " пригнув " + height + " метрів.");
            return true;
        } else {
            System.out.println(name + " не перепригнув " + height + " метрів.");
            return false;
        }
    }
}