
import java.util.Arrays;

public class BankersAlgorithm {
    private int processes; 
    private int resources; 
    private int[] available; 
    private int[][] max; 
    private int[][] allocation;
    private int[][] need; 
    public BankersAlgorithm(int processes, int resources, int[] available, int[][] max, int[][] allocation) {
        this.processes = processes;
        this.resources = resources;
        this.available = available;
        this.max = max;
        this.allocation = allocation;
        this.need = new int[processes][resources];
        for (int i = 0; i < processes; i++) {
            for (int j = 0; j < resources; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
    }
    public boolean requestResources(int processId, int[] request) {
        for (int j = 0; j < resources; j++) {
            if (request[j] > need[processId][j]) {
                System.out.println("Error: Process has exceeded its maximum claim.");
                return false;
            }
        }
        for (int j = 0; j < resources; j++) {
            if (request[j] > available[j]) {
                System.out.println("Process is blocked; not enough resources available.");
                return false;
            }
        }
        for (int j = 0; j < resources; j++) {
            available[j] -= request[j];
            allocation[processId][j] += request[j];
            need[processId][j] -= request[j];
        }
        if (isSafe()) {
            System.out.println("Request granted.");
            return true;
        } else {
            for (int j = 0; j < resources; j++) {
                available[j] += request[j];
                allocation[processId][j] -= request[j];
                need[processId][j] += request[j];
            }
            System.out.println("Request denied; system not in a safe state.");
            return false;
        }
    }
    private boolean isSafe() {
        boolean[] finish = new boolean[processes];
        int[] work = Arrays.copyOf(available, resources);
        int count = 0;
        while (count < processes) {
            boolean found = false;
            for (int p = 0; p < processes; p++) {
                if (!finish[p]) {
                    boolean canAllocate = true;
                    for (int j = 0; j < resources; j++) {
                        if (need[p][j] > work[j]) {
                            canAllocate = false;
                            break;
                        }
                    }
                    if (canAllocate) {
                        for (int j = 0; j < resources; j++) {
                            work[j] += allocation[p][j];
                        }
                        finish[p] = true;
                        found = true;
                        count++;
                    }
                }
            }
            if (!found) {
                break; 
            }
        }
        return count == processes;
    }

    public static void main(String[] args) {
        int processes = 5; 
        int resources = 3;
        int[] available = {3, 3, 2};
        int[][] max = {
            {7, 5, 3},
            {3, 2, 2},
            {9, 0, 2},
            {2, 2, 2},
            {4, 3, 3}
        };
        int[][] allocation = {
            {0, 1, 0},
            {2, 0, 0},
            {3, 0, 2},
            {2, 1, 1},
            {0, 0, 2}
        };
        BankersAlgorithm ba = new BankersAlgorithm(processes, resources, available, max, allocation);
        int[] request = {1, 0, 2};
        ba.requestResources(1, request);
    }
}

