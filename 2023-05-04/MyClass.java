import java.util.Scanner;
import java.lang.Math; //semua method dalam math bisa digunkan
class MyClass {
  public static void main(String[] args) {
    // Scanner myObj = new Scanner(System.in);
    // System.out.println("Enter username");

    // String userName = myObj.nextLine();
    // System.out.println("Username is: " + userName);

    Scanner myAngka = new Scanner(System.in);
    System.out.println("Masukkan angka:");
    int angka = myAngka.nextInt();
    double hasil = Math.sqrt(angka);
    System.out.println(hasil);
  }
}