import java.util.Scanner;

public class Tugas126 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int jumlah;
        int[] nilai;
        double total=0, rata2;

        System.out.print("Jumlah Mahasiswa: ");
        jumlah= sc.nextInt();
        nilai= new int[jumlah];
        System.out.println("=======================================");

        for (int i=0; i<jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilai[i]= sc.nextInt();
        }

        for (int i=0; i<jumlah; i++) {
            total+=nilai[i];
        }
        
        rata2= total/jumlah;

        int nilaiTerendah= nilai[0];
        int nilaiTertinggi= nilai[0];
        for (int i=0; i<jumlah; i++) {
            if (nilaiTerendah>nilai[i]) {
                nilaiTerendah= nilai[i];
            } 
            if (nilaiTertinggi<nilai[i]) {
                nilaiTertinggi= nilai[i];
            }
        }

        System.out.println("=======================================");
        System.out.println("Rata-rata nilai mahasiswa   : "+rata2);
        System.out.println("Nilai mahasiswa terendah    : "+nilaiTerendah);
        System.out.println("Nilai mahsiswa tertinggi    : "+nilaiTertinggi);
    }
}