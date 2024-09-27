import java.util.Arrays;
import java.util.Scanner;

public class Scan {
    public static void calculateSeekTime(int[] requests, int head, int direction) {
        int totalSeekTime = 0;
        int currentPosition = head; 
        Arrays.sort(requests);
        System.out.println("Order of requests:");
        int startIndex = 0;
        while (startIndex < requests.length && requests[startIndex] < currentPosition) {
            startIndex++;
        }
        if (direction == 1) { 
            for (int i = startIndex; i < requests.length; i++) {
                int seek = Math.abs(currentPosition - requests[i]);
                totalSeekTime += seek; 
                currentPosition = requests[i];
                System.out.print(requests[i] + " -> ");
            }
            totalSeekTime += Math.abs(currentPosition - 199);
            currentPosition = 199; 
            for (int i = startIndex - 1; i >= 0; i--) {
                int seek = Math.abs(currentPosition - requests[i]);
                totalSeekTime += seek; 
                currentPosition = requests[i];
                System.out.print(requests[i] + " -> ");
            }
        } else { 
            for (int i = startIndex - 1; i >= 0; i--) {
                int seek = Math.abs(currentPosition - requests[i]);
                totalSeekTime += seek;
                currentPosition = requests[i]; 
                System.out.print(requests[i] + " -> ");
            }
            totalSeekTime += Math.abs(currentPosition - 0);
            currentPosition = 0; 
            for (int i = startIndex; i < requests.length; i++) {
                int seek = Math.abs(currentPosition - requests[i]);
                totalSeekTime += seek; 
                currentPosition = requests[i];
                System.out.print(requests[i] + " -> "); 
            }
        }
        System.out.println("End");
        System.out.println("Total Seek Time: " + totalSeekTime);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial head position: ");
        int head = scanner.nextInt();
        System.out.print("Enter the direction of movement (1 for right, -1 for left): ");
        int direction = scanner.nextInt();
        System.out.print("Enter the number of disk requests: ");
        int n = scanner.nextInt();
        int[] requests = new int[n];
        System.out.println("Enter the disk requests:");
        for (int i = 0; i < n; i++) {
            requests[i] = scanner.nextInt();
        }
        calculateSeekTime(requests, head, direction);
        scanner.close();
    }
}

