package ua.training.state;

public class Human {
    private String name;
    private State state;

    Human(String name) {
        this.name = name;
        this.state = new Fisherman(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
