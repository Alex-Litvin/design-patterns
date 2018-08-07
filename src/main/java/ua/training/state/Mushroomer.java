package ua.training.state;

public class Mushroomer extends State {

    public Mushroomer(Human human) {
        super(human);
    }

    @Override
    public void printState() {
        System.out.println("I am a mushroomer now!");
    }
}
