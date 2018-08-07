package ua.training.facade;

public class App {
    public static void main(String[] args) {
        Power power = new Power();
        FlashCard card = new FlashCard();
        HDD hdd = new HDD();
        Computer computer = new Computer(power, card, hdd);
        computer.copy();
    }
}





