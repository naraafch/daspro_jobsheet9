import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nilaiMhs;
        double total=0;
        double rata2;
        int lulus=0, jumlah;

        System.out.print("Jumlah mahasiswa: ");
        jumlah= sc.nextInt();
        nilaiMhs= new int[jumlah];

        for(int i=0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i]= sc.nextInt();

            if (nilaiMhs[i]>70) {
                lulus++;
            }
        }

        for(int i=0; i<nilaiMhs.length; i++) {
            total+=nilaiMhs[i];
        }

        rata2= total/nilaiMhs.length;
        System.out.println("Rata-rata nilai= "+rata2);
        System.out.println("Jumlah mahasiswa yang lulus: " +lulus);
    }
}
