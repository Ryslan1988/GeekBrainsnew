package Java3HW4;

public class Java3HW4 {

    private static Object monitorOne = new Object();
    private static final int attempt = 5;
    private static volatile char finallyForcorrectlyWorck = 'C';

    public static void main(String[] args) {
        Thread threadOne = new SomePrinterThread('C', 'A');
        Thread threadTwo = new SomePrinterThread('A', 'B');
        Thread threadThree = new SomePrinterThread('B', 'C');

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }

    private static class SomePrinterThread extends Thread {
        private char before;
        private char after;

        public SomePrinterThread(char before, char after) {
            this.before = before;
            this.after = after;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < attempt; i++) {
                    synchronized (monitorOne) {
                        while (finallyForcorrectlyWorck != before) {
                            monitorOne.wait();
                        }
                        System.out.print(after);
                        finallyForcorrectlyWorck = after;
                        monitorOne.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

