public class SynchronizedBlockLazySingleton {

    private static SynchronizedBlockLazySingleton instance = null;

    private SynchronizedBlockLazySingleton() {

    }

    public static SynchronizedBlockLazySingleton getInstance() {
        if (instance == null) {
            // synchronized block here: acquiring the lock on class
            synchronized (SynchronizedMethodLazySingleton.class) {
                if (instance == null) {
                    instance = new SynchronizedBlockLazySingleton();
                }
            }
        }
        return instance;
    }


}
