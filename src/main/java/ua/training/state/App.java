package ua.training.state;

public class App {
    public static void main(String[] args) {
        //fisherman
        Human human = new Human("Bob");
        human.getState().printState();
        //hunter
        human.setState(new Hunter(human));
        human.getState().printState();
        //mushroomer
        human.setState(new Mushroomer(human));
        human.getState().printState();
    }
}
