import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerExample {
    public SocketServerExample(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("SERVER Listening...");
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread({
                try (DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                    DataOutputStream outputStream = (DataOutputStream) socket.getOutputStream()) 
                    {
                        System.out.println("client say: " + inputStream.readUTF());
                        outputStream.writeUTF("I'm a socket server!");
                    }
            }).start();
        }
    }

    public static void main(String[] args) throws IOException {
        new SocketServerExample(9245);
    }
}
