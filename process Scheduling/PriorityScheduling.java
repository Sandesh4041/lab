import java.util.*;

class Process {
    int id;
    int burstTime;
    int waitingTime;
    int turnaroundTime;
    int priority;
    public Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}
public class PriorityScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        Process[] processes = new Process[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter burst time for Process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            System.out.print("Enter priority for Process " + (i + 1) + " (lower number means higher priority): ");
            int priority = scanner.nextInt();
            processes[i] = new Process(i + 1, burstTime, priority);
        }
        calculatePriorityScheduling(processes);
        System.out.println("\nProcess ID\tBurst Time\tPriority\tWaiting Time\tTurnaround Time");
        for (Process p : processes) {
            System.out.println(p.id + "\t\t" + p.burstTime + "\t\t" + p.priority + "\t\t" + p.waitingTime + "\t\t" + p.turnaroundTime);
        }
        scanner.close();
    }
    private static void calculatePriorityScheduling(Process[] processes) {
        Arrays.sort(processes, Comparator.comparingInt(p -> p.priority));
        processes[0].waitingTime = 0; 
        for (int i = 1; i < processes.length; i++) {
            processes[i].waitingTime = processes[i - 1].waitingTime + processes[i - 1].burstTime;
        }
        for (Process p : processes) {
            p.turnaroundTime = p.burstTime + p.waitingTime;
        }
    }
}
