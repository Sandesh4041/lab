import java.util.*;

class Process {
    int id;
    int burstTime;
    int waitingTime;
    int turnaroundTime;
    public Process(int id, int burstTime) {
        this.id = id;
        this.burstTime = burstTime;
    }
}
public class FCFS_Scheduling {
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
        calculateWaitingTime(processes);
        calculateTurnaroundTime(processes);
        System.out.println("\nProcess ID\tBurst Time\tWaiting Time\tTurnaround Time");
        for (Process p : processes) {
            System.out.println(p.id + "\t\t" + p.burstTime + "\t\t" + p.waitingTime + "\t\t" + p.turnaroundTime);
        }
        scanner.close();
    }
    private static void calculateWaitingTime(Process[] processes) {
        processes[0].waitingTime = 0; 
        for (int i = 1; i < processes.length; i++) {
            processes[i].waitingTime = processes[i - 1].waitingTime + processes[i - 1].burstTime;
        }
    }
    private static void calculateTurnaroundTime(Process[] processes) {
        for (Process p : processes) {
            p.turnaroundTime = p.burstTime + p.waitingTime;
        }
    }
}

