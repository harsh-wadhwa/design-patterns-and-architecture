import java.io.Serializable;

public class SerializableLazySingleton implements Serializable {
    private static SerializableLazySingleton instance = null;

    private SerializableLazySingleton(){

    }

    public static SerializableLazySingleton getInstance() {
        if (instance == null) {
            instance = new SerializableLazySingleton();
        }
        return instance;
    }

//    private Object readResolve() {
//        return instance;
//    }

}