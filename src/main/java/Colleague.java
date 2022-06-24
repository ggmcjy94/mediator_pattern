public abstract class Colleague {
    private Mediator mediator;
    private String message;
    private final String name;
    private final ColleagueType type;

    public Colleague(String name, ColleagueType type) {
        this.name = name;
        this.type = type;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public ColleagueType getType() {
        return type;
    }

    public void send() {
        System.out.println(this.name + " send()");
        System.out.println();
        mediator.mediate(this);
    }

    public abstract void receive(Colleague colleague);
}
