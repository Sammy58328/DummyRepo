public class Main {
    public static void main(String args[]) {
        Thread t1 = new Thread(new Thread1(), "Thread 1");
        Thread1 t2 = new Thread1();
        t1.run();
        t1.run();
        t2.run();
        t2.run();
    }
}
