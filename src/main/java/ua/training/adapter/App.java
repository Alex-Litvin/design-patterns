package ua.training.adapter;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer(new SVGASocket());
        computer.connect();
        computer = new Computer(new DVISocketAdapter(new DVISocket()));
        computer.connect();
    }
}
