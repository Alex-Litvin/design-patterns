package ua.training.state;

public class Fisherman extends State {

    public Fisherman(Human human) {
        super(human);
    }

    @Override
    public void printState() {
        System.out.println("I am a fisherman now!");
    }
}
