import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramServerExample implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    public DatagramServerExample() throws SocketException {
        DatagramSocket socket = new DatagramSocket(4445);
        System.out.println("Data server listening...");

    }

    /**
     * @param args
     * @throws SocketException
     */
    public static void main(String[] args) throws SocketException {
        new Thread(new DatagramServerExample());
    }

}
