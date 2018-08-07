package ua.training.adapter;

public class DVISocketAdapter implements Socket {
    private DVISocket dviSocket;

    public DVISocketAdapter(DVISocket dviSocket) {
        this.dviSocket = dviSocket;
    }

    @Override
    public void connect() {
        dviSocket.connect();
    }
}
