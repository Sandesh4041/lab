import java.util.*;

class Process {
    int id;
    int burstTime;
    int remainingTime;
    int priority;
    public Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}
public class MultilevelQueueScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Process> highPriorityQueue = new ArrayList<>();
        List<Process> lowPriorityQueue = new ArrayList<>();
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter burst time for Process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            System.out.print("Enter priority for Process " + (i + 1) + " (1 for high priority, 2 for low priority): ");
            int priority = scanner.nextInt();
            Process process = new Process(i + 1, burstTime, priority);
            if (priority == 1) {
                highPriorityQueue.add(process);
            } else {
                lowPriorityQueue.add(process);
            }
        }
        System.out.print("Enter time quantum for Round Robin: ");
        int timeQuantum = scanner.nextInt();
        System.out.println("\nScheduling High Priority Queue (Round Robin):");
        roundRobinScheduling(highPriorityQueue, timeQuantum);
        System.out.println("\nScheduling Low Priority Queue (FCFS):");
        fcfsScheduling(lowPriorityQueue);
        scanner.close();
    }
    private static void roundRobinScheduling(List<Process> processes, int timeQuantum) {
        int time = 0;
        while (!processes.isEmpty()) {
            Process p = processes.remove(0);
            if (p.remainingTime > timeQuantum) {
                time += timeQuantum;
                p.remainingTime -= timeQuantum;
                processes.add(p);
            } else {
                time += p.remainingTime;
                p.remainingTime = 0;
                System.out.println("Process " + p.id + " completed at time " + time);
            }
        }
    }
    private static void fcfsScheduling(List<Process> processes) {
        int time = 0;
        for (Process p : processes) {
            time += p.burstTime;
            System.out.println("Process " + p.id + " completed at time " + time);
        }
    }
}

