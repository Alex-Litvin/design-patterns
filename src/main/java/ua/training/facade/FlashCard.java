package ua.training.facade;

class FlashCard {
    private boolean data;

    public boolean isData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}