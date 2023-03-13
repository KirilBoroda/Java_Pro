package participant.hw8;

public class RaceTrack implements Let{
    private int length;

    public RaceTrack(int length) {
        this.length = length;
    }

    public void overcome(Participant participant){
        participant.run();
        System.out.println(participant.getName() + " пробіг доріжку довжиною " + length);

    }



}
