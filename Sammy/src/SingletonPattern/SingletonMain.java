package SingletonPattern;

public class SingletonMain {    //Singleton pattern ensures only one instance of the class is created.

    private static SingletonMain sm;    //private static instance of the class

    private SingletonMain() {        //private constructor of the class to avoid instantiation

    }

    public static SingletonMain getInstance() {   //public static getter to provide access to object
        if (sm == null) {
            sm = new SingletonMain();
        }
        return sm;
    }

    public void displayMsg() {      //This is Eager Initialization. There are also static initialization, Lazy initialization etc.
        System.out.println("Achieved Singleton");
    }
}
