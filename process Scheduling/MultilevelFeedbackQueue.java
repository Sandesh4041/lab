import java.util.*;

class Process {
    int id;
    int burstTime;
    int remainingTime;
    int queueLevel;
    public Process(int id, int burstTime) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.queueLevel = 1; 
    }
}
public class MultilevelFeedbackQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Process> queue1 = new ArrayList<>();
        List<Process> queue2 = new ArrayList<>();
        List<Process> queue3 = new ArrayList<>();
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter burst time for Process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            queue1.add(new Process(i + 1, burstTime));
        }
        System.out.println("\nScheduling Processes using Multilevel Feedback Queue:");
        scheduleProcesses(queue1, queue2, queue3);
        scanner.close();
    }
    private static void scheduleProcesses(List<Process> queue1, List<Process> queue2, List<Process> queue3) {
        int time = 0;
        while (!queue1.isEmpty()) {
            Process p = queue1.remove(0);
            if (p.remainingTime > 4) {
                time += 4;
                p.remainingTime -= 4;
                p.queueLevel = 2; 
                queue2.add(p);
            } else {
                time += p.remainingTime;
                p.remainingTime = 0;
                System.out.println("Process " + p.id + " completed at time " + time);
            }
        }
        while (!queue2.isEmpty()) {
            Process p = queue2.remove(0);
            if (p.remainingTime > 8) { 
                time += 8;
                p.remainingTime -= 8;
                p.queueLevel = 3; 
                queue3.add(p);
            } else {
                time += p.remainingTime;
                p.remainingTime = 0; 
                System.out.println("Process " + p.id + " completed at time " + time);
            }
        }
        while (!queue3.isEmpty()) {
            Process p = queue3.remove(0);
            time += p.remainingTime; 
            System.out.println("Process " + p.id + " completed at time " + time);
        }
    }
}
