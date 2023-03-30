/*
 * Pewarisan/inheritance
 * newmatematika2 (subclass/anak) turunan dari newmatematika (superclass/induk)
 * di turunan/anak akan memiliki sifat yang dimiliki oleh induknya
 */

class newmatematika {
    int perkalian(int a, int b) {
        int c = a*b;
        return c;
    }
    void penjumlahan(int a, int b) {
        int c = a+b;
        System.out.println("hasil penjumlahan = " + c);
    }
}

class newmatematika2 extends newmatematika {
    // tidak memiliki variabel/method 
}

// membuat kelas untuk implementasi
public class appmat_turunan {
    public static void main(String[] args) {
        // memanggil objek turunan
        newmatematika2 objmat = new newmatematika2();

        // menggunakan fungsi/method melalui objeknya
        // nama_objek.nama_fungsi()

        // define bilangan
        int bil1 = 10;
        int bil2 = 20;

        // perkalian
        int hasil_kali_obj = objmat.perkalian(bil1, bil2);
        System.out.println("hasil perkalian "+ bil1 + " dan "+ bil2 + " adalah " + hasil_kali_obj);

        // penjumlahan
        objmat.penjumlahan(hasil_kali_obj, bil2);
    }
}