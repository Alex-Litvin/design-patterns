package ua.training.adapter;

public class Computer implements Socket {
    private Socket socket;

    public Computer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void connect() {
        socket.connect();
    }
}
