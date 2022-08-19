import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

public class ObjectReaderExample {

    public static void main(String[] args) throws Exception {
        File file = new File("c:/Nodo_Training_Java/Unit 7/Tem");
        ObjectInputStream input = null;
        input = new ObjectInputStream(new FileInputStream(new File(file, "my_object")));

        Object obj = input.readObject();
        Method method = obj.getClass().getMethod("run", new Class[0]);
        method.invoke(obj, new Object[0]);
        input.close();
    }
}
