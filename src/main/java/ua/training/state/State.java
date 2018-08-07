package ua.training.state;

public abstract class State {
    private Human human;

    public State(Human human) {
        this.human = human;
    }

    public abstract void printState();
}
