import java.io.Serializable;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){
        // to prevent reflection from breaking singleton pattern
        if (instance != null) {
            throw new RuntimeException("getInstance method should be called instead of constructor");
        }
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}