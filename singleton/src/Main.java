import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {
        // serialization breaks the singleton pattern
        // exampleSerialization();

        // reflection also breaks the singleton pattern
        exampleReflection();

    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        SerializableLazySingleton lazySingleton = SerializableLazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        SerializableLazySingleton deserializedLazy = (SerializableLazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + lazySingleton.hashCode());
        System.out.println("Object 2 :" + deserializedLazy.hashCode());
    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, NoSuchMethodException, IllegalAccessException {
        LazySingleton instance = LazySingleton.getInstance();

        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();

        System.out.println("Initial singleton: " + instance.hashCode());
        System.out.println("New singleton: " + newInstance.hashCode());

    }

}
