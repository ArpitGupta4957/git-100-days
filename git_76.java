import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class git_76 {
    public int leastInterval(char[] tasks, int n) {
        int[] freqs = new int[26];
        for (char task : tasks) {
            freqs[task - 'A']++;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int freq : freqs) {
            if (freq > 0) {
                minHeap.offer(freq);
            }
        }

        int time = 0;
        while (!minHeap.isEmpty()) {
            int cycle = n + 1;
            Deque<Integer> store = new ArrayDeque<>();
            int taskCount = 0;

            while (cycle-- > 0 && !minHeap.isEmpty()) {
                int currFreq = minHeap.poll();
                if (currFreq > 1) {
                    store.offer(currFreq - 1);
                }
                taskCount += currFreq;
            }

            while (!store.isEmpty()) {
                int freq = store.poll();
                if (freq > 0) {
                    minHeap.offer(freq);
                }
            }

            if (!minHeap.isEmpty()) {
                time += n + 1;
            } else {
                time += taskCount;
            }
        }

        return time;
    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E'};
        int n = 2;
        System.out.println(new git_76().leastInterval(tasks, n));
    }
}