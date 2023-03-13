package participant.hw8;

public class Wall implements Let {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Participant participant) {
        participant.jump();
        System.out.println(participant.getName() + " перестрибнув стіну висотою " + height);
    }
}