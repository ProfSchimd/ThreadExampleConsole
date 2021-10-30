public class FirstThread extends  Thread {
    private static int N = 100000;

    private int tid;
    public FirstThread(int tid) {
        this.tid = tid;
    }
    @Override
    public void run() {
        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            x[i] = (double)i;
        }
        System.out.println(tid);
    }
}
