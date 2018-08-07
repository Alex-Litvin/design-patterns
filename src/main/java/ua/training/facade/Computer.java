package ua.training.facade;

class Computer {
    private Power power;
    private FlashCard card;
    private HDD hdd;

    Computer(Power power, FlashCard card, HDD hdd) {
        this.power = power;
        this.card = card;
        this.hdd = hdd;
    }

    void copy() {
        power.on();
        card.load();
        hdd.copyFromCard(card);
        power.off();
    }
}