import java.util.Scanner;

public class SSTF {
    public static void calculateSeekTime(int[] requests, int head) {
        boolean[] served = new boolean[requests.length];
        int totalSeekTime = 0; 
        int currentPosition = head;
        System.out.println("Order of requests: ");
        System.out.print(head + " -> ");
        for (int count = 0; count < requests.length; count++) {
            int index = -1;
            int minSeek = Integer.MAX_VALUE;
            for (int i = 0; i < requests.length; i++) {
                if (!served[i]) {
                    int seek = Math.abs(currentPosition - requests[i]);
                    if (seek < minSeek) {
                        minSeek = seek;
                        index = i;
                    }
                }
            }
            if (index != -1) {
                totalSeekTime += minSeek; 
                currentPosition = requests[index]; 
                served[index] = true;
                System.out.print(requests[index] + " -> ");
            }
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
