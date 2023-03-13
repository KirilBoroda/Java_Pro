package participant.hw8;

public class Main {
    public static void main(String[] args) {



        Participant[] participants = {

                new Human("John"),
                new Cat("Fluffy"),
                new Robot("Robo")
        };

        Let[] lets = {
                new RaceTrack(43),
                new Wall(5),
                new RaceTrack(345),
                new Wall(435)
        };

        for (Participant participant : participants) {

            for (Let let : lets) {

let.overcome(participant);

            }
        }
    }
}

