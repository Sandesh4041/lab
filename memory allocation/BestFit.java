import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MemoryBlock {
    int size; 
    boolean isFree; 

    MemoryBlock(int size) {
        this.size = size;
        this.isFree = true;
    }
}

public class BestFit {
    private List<MemoryBlock> memoryBlocks;

    public BestFit(int[] sizes) {
        memoryBlocks = new ArrayList<>();
        for (int size : sizes) {
            memoryBlocks.add(new MemoryBlock(size));
        }
    }

    public void allocate(int requestSize) {
        int bestIndex = -1;
        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < memoryBlocks.size(); i++) {
            MemoryBlock block = memoryBlocks.get(i);
            if (block.isFree && block.size >= requestSize && (block.size < minSize)) {
                minSize = block.size;
                bestIndex = i; 
            }
        }
        if (bestIndex != -1) {
            MemoryBlock bestBlock = memoryBlocks.get(bestIndex);
            bestBlock.isFree = false; 
            System.out.println("Allocated " + requestSize + " MB in a block of " + bestBlock.size + " MB.");
        } else {
            System.out.println("No suitable block found for " + requestSize + " MB.");
        }
    }
    public void free(int blockIndex) {
        if (blockIndex < 0 || blockIndex >= memoryBlocks.size()) {
            System.out.println("Invalid block index.");
            return;
        }
        if (memoryBlocks.get(blockIndex).isFree) {
            System.out.println("Block " + blockIndex + " is already free.");
        } else {
            memoryBlocks.get(blockIndex).isFree = true;
            System.out.println("Freed block " + blockIndex + ".");
        }
    }
    public void displayMemoryStatus() {
        System.out.println("Memory Status:");
        for (int i = 0; i < memoryBlocks.size(); i++) {
            MemoryBlock block = memoryBlocks.get(i);
            System.out.println("Block " + i + ": " + block.size + " MB - " + (block.isFree ? "Free" : "Allocated"));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sizes = {100, 500, 200, 300, 600};
        BestFit memoryAllocation = new BestFit(sizes);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Allocate Memory");
            System.out.println("2. Free Memory");
            System.out.println("3. Display Memory Status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter memory size to allocate: ");
                    int requestSize = scanner.nextInt();
                    memoryAllocation.allocate(requestSize);
                   break;
                case 2:
                    System.out.print("Enter block index to free: ");
                    int blockIndex = scanner.nextInt();
                    memoryAllocation.free(blockIndex);
                    break;
                case 3:
                    memoryAllocation.displayMemoryStatus();
                    break;
                case 4:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
