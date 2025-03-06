import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama anda : ");
        String name  = input.nextLine();
        System.out.print("Masukan Nim anda : ");
        String Nim = input.nextLine();
        System.out.print("masukan umur anda : ");
        int age = input.nextInt();
        System.out.print("masukan tinggi badan anda : ");
        double height = input.nextDouble();

        System.out.print("\ndata yang anda masukan : ");
        System.out.println("nama anda : " + name);
        System.out.println("Nim anda : " + name);
        System.out.println("umur anda: " +age );
        System.out.println ("tinggi badan anda : " + height);

        double hasilsoal1 = (age * 2 + 10/ 5);
        System.out.println("hasil : " + hasilsoal1 );

        boolean  umur = age > 18;
        System.out.println("Masukan lebih dari 18:" + umur);

        boolean tinggi = height > 160;
        System.out.println("Masukan lebih dari 160:" + tinggi);

        double usia = (double) + age;
        int tinggibdn= (int) + height;

        System.out.println("usia dalam double: " + usia);
        System.out.println("tinggibdn dalam int: " + tinggibdn);







    }
}
