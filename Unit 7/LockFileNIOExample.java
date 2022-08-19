import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.awt.*;

public class LockFileNIOExample {
    public static void main(String[] args) throws Exception {
        File file = new File("c:/Nodo_Training_Java/Unit 7/Tem/hanoi.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        FileChannel channel = raf.getChannel();
        FileLock lock = channel.tryLock(0, Long.max(1024, 4 * 1024), false);
        Desktop.getDesktop().edit(file);
        Thread.sleep(15 * 1000l);
        lock.release();
    }
}
