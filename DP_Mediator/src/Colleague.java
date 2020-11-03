public abstract class Colleague {

    protected Mediator mediator;
    protected String name;

    //since the is a bidirectional relation between Colleague and mediator
    public Colleague(String name, Mediator mediator){
        this.mediator = mediator;
        this.name = name;
        mediator.addCollegue(name, this);
    }

    public Colleague(String name) {
        this.name = name;
    }

    public Colleague() {
        super();
    }

    public abstract void sendMessage(Message message);
    public abstract void receiveMessage(Message message);

    public Mediator getMediator(){
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


}