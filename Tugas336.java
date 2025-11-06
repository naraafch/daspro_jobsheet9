import java.util.Scanner;

public class Tugas336 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] menu= {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate ice"};
        
        System.out.println("------- Daftar Menu -------");
        for (int i=0; i<menu.length; i++) {
            System.out.println((i+1)+". "+menu[i]);
        }
        
        System.out.println("===========================");
        System.out.print("Cari menu: ");
        String cari= sc.nextLine();

        boolean carimenu= false;
        int indeks=-1;
        for (int i=0; i<menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                carimenu= true;
                indeks=i;
                break;
            }
        }

        System.out.println("===========================");
        if (carimenu) {
            System.out.println("Menu "+cari+" tersedia");
            } else {
            System.out.println("Menu tidak tersedia");
            } 
        }
    }

