package ua.training.state;

public class Hunter extends State {

    public Hunter(Human human) {
        super(human);
    }

    @Override
    public void printState() {
        System.out.println("I am a hunter now!");
    }
}
