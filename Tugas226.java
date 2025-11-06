import java.util.Scanner;

public class Tugas226 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        System.out.print("Jumlah pesanan  : ");
        int jmlpesan= sc.nextInt();
        sc.nextLine();
        System.out.println("==============================");

        String[] pesanan= new String[jmlpesan];
        int[] harga= new int[jmlpesan];

        int total=0;
        for (int i=0; i<jmlpesan; i++) {
        System.out.print("Nama pesanan " +(i+1)+   "  : ");
        pesanan[i]= sc.nextLine();

        System.out.print("\tHarga   : ");
        harga[i]= sc.nextInt();
        sc.nextLine();

        total+=harga[i];
        }

        System.out.println("==============================");
        System.out.println("------- Daftar Pesanan -------");
        for (int i=0; i<jmlpesan; i++) {          
            System.out.println(pesanan[i]+"\t\t: "+harga[i]);
        }
        System.out.println("\nTotal\t\t: "+total);

        
    }
    
}
