package src.participant.with.limits.hw8.hillel;

public class Competition {
    private Participant[] participants;
    private Obstacle[] obstacles;

    public Competition(Participant[] participants, Obstacle[] obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void start() {
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    System.out.println(participant.getName() + " провалив змагання.Пичина: " + obstacle.getClass().getSimpleName());
                    break;
                }
            }
        }
    }
}