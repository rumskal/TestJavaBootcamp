abstract class AgileEvent {
    protected final String eventType;
    public AgileEvent(String type){
        this.eventType = type;
    }
}
interface Recurring{}

public class SprintPlanning extends AgileEvent implements Recurring{
    public SprintPlanning(){
        super("Sprint Planning");
    }
    public AgileEvent get(){
        return this;
    }

    public static void main(String[] args) {
        Recurring event = (Recurring) (AgileEvent) new SprintPlanning().get();
        System.out.println(((SprintPlanning) event).eventType);
    }
}
