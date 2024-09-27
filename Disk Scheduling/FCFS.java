import java.util.Scanner;

public class FCFS {
    public static void calculateSeekTime(int[] requests, int head) {
        int totalSeekTime = 0;
        int currentPosition = head;
        System.out.println("Order of requests: ");
        System.out.print(head + " -> ");
        for (int request : requests) {
            int seek = Math.abs(currentPosition - request);
            totalSeekTime += seek; 
            currentPosition = request;
            System.out.print(request + " -> ");
        }
        System.out.println("End");
        System.out.println("Total Seek Time: " + totalSeekTime);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial head position: ");
        int head = scanner.nextInt();
        System.out.print("Enter the number of disk requests: ");
        int n = scanner.nextInt();
        int[] requests = new int[n];
        System.out.println("Enter the disk requests:");
        for (int i = 0; i < n; i++) {
            requests[i] = scanner.nextInt();
        }
        calculateSeekTime(requests, head);
        scanner.close();
    }
}
