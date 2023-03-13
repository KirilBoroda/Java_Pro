package participant.with.limits.hw8.hillel;


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

