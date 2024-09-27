import java.util.Arrays;
import java.util.Scanner;

public class CScan {
    public static void calculateSeekTime(int[] requests, int head, int maxCylinder) {
        int totalSeekTime = 0; 
        int currentPosition = head; 
        Arrays.sort(requests);
        System.out.println("Order of requests: ");
        System.out.print(head + " -> "); 
        for (int i = 0; i < requests.length; i++) {
            if (requests[i] >= currentPosition) {
                int seek = Math.abs(currentPosition - requests[i]);
                totalSeekTime += seek; 
                currentPosition = requests[i];
                System.out.print(requests[i] + " -> ");
            }  }
        totalSeekTime += Math.abs(currentPosition - maxCylinder); 
        currentPosition = maxCylinder; 
        totalSeekTime += Math.abs(currentPosition - 0);
        currentPosition = 0;
        for (int i = 0; i < requests.length; i++) {
            if (requests[i] < head) {
                int seek = Math.abs(currentPosition - requests[i]);
                totalSeekTime += seek;
                currentPosition = requests[i];
                System.out.print(requests[i] + " -> "); 
            } }
        System.out.println("End");
        System.out.println("Total Seek Time: " + totalSeekTime);
    }   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial head position: ");
        int head = scanner.nextInt();
        System.out.print("Enter the maximum cylinder number: ");
        int maxCylinder = scanner.nextInt();
        System.out.print("Enter the number of disk requests: ");
        int n = scanner.nextInt();
        int[] requests = new int[n];
        System.out.println("Enter the disk requests:");
        for (int i = 0; i < n; i++) {
            requests[i] = scanner.nextInt();
        }
        calculateSeekTime(requests, head, maxCylinder);
        scanner.close();
    }
}
