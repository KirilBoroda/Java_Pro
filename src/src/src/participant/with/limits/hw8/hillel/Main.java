package src.participant.with.limits.hw8.hillel;


public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Ivan"),
                new Cat("Trixy"),
                new Robot("Terminator")
        };

        Obstacle[] obstacles = {
                new RunningPath(100),
                new Wall(1),
                new RunningPath(500),
                new Wall(2)
        };

        Competition competition = new Competition(participants,obstacles);
        competition.start();
    }
}

