import java.util.Scanner;

public class SearchNilai26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arrNilai;
        int key=0, hasil= 0, i=0, jumlah, nilai;
        
        System.out.print("Jumlah mahasiswa: ");
        jumlah= sc.nextInt();
        arrNilai=new int[jumlah];

        for(i= 0; i<jumlah; i++) {
            System.out.print("Masukkuan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i]= sc.nextInt();
            
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key= sc.nextInt();

        for(i=0; i<arrNilai.length; i++) {
            if(key==arrNilai[i]) {
                hasil=i;
                System.out.println("Nilai "+key+" ketemu, merupakan nilai mahaiswa ke-"+hasil);
            } else {
                System.out.println("Nilai yang dicari tidak ada di dalam array");
            }
            break;
        }
            
        }
        
 }
