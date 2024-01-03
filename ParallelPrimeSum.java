import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class ParallelPrimeSum {

    public static void main(String[] args) {
        int limit = 1000; // Specify your limit here
        int numThreads = 4; // Specify the number of threads

        long sum = parallelPrimeSum(limit, numThreads);
        System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
    }

    static long parallelPrimeSum(int limit, int numThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        AtomicLong result = new AtomicLong(0);

        int segmentSize = limit / numThreads;
        int remaining = limit % numThreads;
        int start = 2;

        for (int i = 0; i < numThreads; i++) {
            int end = start + segmentSize - 1 + (i < remaining ? 1 : 0);
            executorService.execute(new PrimeSumTask(start, end, result));
            start = end + 1;
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // Wait for all threads to finish
        }

        return result.get();
    }

    static class PrimeSumTask implements Runnable {
        private final int start;
        private final int end;
        private final AtomicLong result;

        public PrimeSumTask(int start, int end, AtomicLong result) {
            this.start = start;
            this.end = end;
            this.result = result;
        }

        @Override
        public void run() {
            long sum = 0;
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    sum += num;
                }
            }
            result.addAndGet(sum);
        }

        private boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
