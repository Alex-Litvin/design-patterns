package ua.training.adapter;

public class SVGASocket implements Socket {

    @Override
    public void connect() {
        System.out.println("SVGA connection!");
    }
}
