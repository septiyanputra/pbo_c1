package tugaspakbudi;

import java.util.Scanner;

public class TugasPakBudi {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        boolean isPlus = true;
        
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("isPlus = " + isPlus);
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan nilai untuk variabel nilaiA (int): ");
        nilaiA = input.nextInt();
        System.out.println("nilaiA yang baru = " + nilaiA);
        
        System.out.println("\nMasukkan nilai untuk variabel nilaiB (int): ");
        nilaiB = input.nextInt();
        System.out.println("nilaiB yang baru = " + nilaiB);
        
        System.out.println("\nMasukkan nilai untuk variabel isPlus (boolean): ");
        isPlus = input.nextBoolean();
        System.out.println("data isPlus yang baru = " + isPlus);
    }    
}
