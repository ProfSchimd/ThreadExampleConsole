public class Main {
    public static int T = 10;
    public static void main(String[] args) throws InterruptedException {
        FirstThread[] threads = new FirstThread[T];
        for (int i = 0; i < T; i++) {
            threads[i] = new FirstThread(i);
            threads[i].start();
        }
        for (int i = 0; i < T; i++) {
            threads[i].join();
        }
    }
}
