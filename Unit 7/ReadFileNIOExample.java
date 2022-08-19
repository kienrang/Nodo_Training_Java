import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class ReadFileNIOExample {
    public static void main(String[] args) throws Exception {
        File file = new File("");
        FileInputStream fileInputStream = null;
        FileChannel fileChannel = fileInputStream.getChannel();

        try {
            fileInputStream = new FileInputStream(file);
            fileChannel = fileInputStream.getChannel();
            long size = fileChannel.size();
            ByteBuffer buff = ByteBuffer.allocate((int) size);
            fileChannel.read(buff);
            buff.rewind();
            System.out.println(new String(buff.array(), "utf8"));
        } finally {
            if (fileChannel != null) {
                fileChannel.close();
            }

            if (fileInputStream != null) {
                fileInputStream.close();
            }

        }
    }
}
