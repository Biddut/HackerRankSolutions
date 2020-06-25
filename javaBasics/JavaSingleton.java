package javaBasics;

class Singleton {
    private static Singleton instance;
    public static String str;
    private Singleton() {}

    static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}