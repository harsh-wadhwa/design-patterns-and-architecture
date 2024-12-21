public class SynchronizedMethodLazySingleton {

    private static SynchronizedMethodLazySingleton instance = null;

    private SynchronizedMethodLazySingleton() {

    }

    public static synchronized SynchronizedMethodLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedMethodLazySingleton();
        }
        return instance;
    }

}
