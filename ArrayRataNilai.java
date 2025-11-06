import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nilaiMhs;
        double total=0;
        double rata2lulus, rata2tdklulus;
        int lulus=0, tdklulus=0, jumlah, nilailulus=0, nilaitdklulus=0;

        System.out.print("Jumlah mahasiswa: ");
        jumlah= sc.nextInt();
        nilaiMhs= new int[jumlah];

        for(int i=0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i]= sc.nextInt();

            if (nilaiMhs[i]>70) {
                nilailulus+=nilaiMhs[i];
                lulus++;
            } else {
                nilaitdklulus+=nilaiMhs[i];
                tdklulus++;
            }
        }

        for(int i=0; i<nilaiMhs.length; i++) {
            total+=nilaiMhs[i];
        }

        rata2lulus= nilailulus/lulus;
        rata2tdklulus= nilaitdklulus/tdklulus;
        System.out.println("Rata-rata nilai mahasiswa yang lulus        : "+rata2lulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus  : "+rata2tdklulus);
    }
}
