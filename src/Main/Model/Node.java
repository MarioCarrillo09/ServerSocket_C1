package Main.Model;

import java.net.Socket;

public class Node {
    private int hash;
    private String name;
    private Socket socket;

    public Node(int hash, String name, Socket socket) {
        this.hash = hash;
        this.name = name;
        this.socket = socket;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}