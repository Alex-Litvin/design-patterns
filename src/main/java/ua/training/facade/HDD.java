package ua.training.facade;

class HDD {
    void copyFromCard(FlashCard card) {
        if (card.isData()) {
            System.out.println("Copying...");
            try {
                Thread.sleep(2000);
                System.out.println("Complete!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Input card!");
        }
    }
}