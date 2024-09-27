import java.util.*;

class Process {
    int id;
    int burstTime;
    int remainingTime;
    public Process(int id, int burstTime) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}
public class RoundRobinScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        Process[] processes = new Process[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter burst time for Process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            processes[i] = new Process(i + 1, burstTime);
        }
        System.out.print("Enter time quantum: ");
        int timeQuantum = scanner.nextInt();
        calculateRoundRobin(processes, timeQuantum);
        System.out.println("\nProcess ID\tBurst Time\tWaiting Time\tTurnaround Time");
        for (Process p : processes) {
            System.out.println(p.id + "\t\t" + p.burstTime + "\t\t" + (p.remainingTime + p.burstTime) + "\t\t" + (p.remainingTime + p.burstTime));
        }
        scanner.close();
    }
    private static void calculateRoundRobin(Process[] processes, int timeQuantum) {
        int time = 0;
        boolean isComplete;
        do {
            isComplete = true;
            for (Process p : processes) {
                if (p.remainingTime > 0) {
                    isComplete = false;
                    if (p.remainingTime > timeQuantum) {
                        time += timeQuantum;
                        p.remainingTime -= timeQuantum;
                    } else {
                        time += p.remainingTime;
                        p.remainingTime = 0;
                    }
                }
            }
        } while (!isComplete);
    }
}
