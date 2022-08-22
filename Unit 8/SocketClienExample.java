import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class SocketClienExample {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9245);
        System.out.println("Client start sending...");
        try (DataInputStream inputStream = (DataInputStream) socket.getInputStream();
                DataOutputStream outputStream = (DataOutputStream) socket.getOutputStream()) {
            outputStream.writeUTF("Hello Server");
            System.out.println("Server Say" + inputStream.readUTF());
        } finally {
            socket.close();
        }
    }
}
