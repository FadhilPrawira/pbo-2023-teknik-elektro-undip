/*
 * Pewarisan/inheritance
 * newmatematika2 (subclass/anak) turunan dari newmatematika (superclass/induk)
 * di turunan/anak akan memiliki sifat yang dimiliki oleh induknya
 * access_specifier tipe_luaran nama_method()
 * Access specifier:
 * -public
 * -protected
 * -private
 * -tanpa specifier/default
 * 
 * Relationship dalam kelas
 * -IS-A: hubungan induk dan anak (turunan)
 * -HAS-A: hubungan memiliki->satu class memiliki class lain
 * 
 * Polymorphisme:
 * -overloading: 2 buah method/fungsi memiliki nama yang sama tapi argumentnya beda
 * 
 * TUGAS
 * Membuat class induk yang memiliki 2 fungsi. Satu fungsi public dan tidak return value, satu lainnya protected dan memiliki return value
 * Membuat class anak yang memiliki 2 fungsi (satu fungsi berbeda dari class induk, satu fungsi lainnya memiliki nama yang sama dengan fungsi di class induk)
 * Membuat class cucu yang tidak memiliki fungsi
 * 
 * Jalankan semua fungsi dari objek cucu
 */

class newmatematika {
    protected int perkalian(int a, int b) {
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
    // anak dari newmatematika
    void penjumlahan(int a, int b, int c) {
        int d = a+b+c;
        System.out.println("hasil penjumlahan 3 variabel = " + d);
    }
}

class newmatematika3 extends newmatematika2 {
    // tidak memiliki variabel/method 
    // cucu dari newmatematika
}


// membuat kelas untuk implementasi
class appmat_turunan {
    public static void main(String[] args) {
    // public: access modifier yang membuat fungsi bisa diakses dari manapun
    // static: membuat fungsi main() menjadi unik (tidak ada yang menyamai) dalam 1 proyek
    // void: fungsi main tidak memiliki return value/nilai luaran
        // memanggil objek turunan
        newmatematika3 objmat = new newmatematika3();

        // menggunakan fungsi/method melalui objeknya
        // nama_objek.nama_fungsi()

        // define bilangan
        int bil1 = 10;
        int bil2 = 20;

        // perkalian
        int hasil_kali_obj = objmat.perkalian(bil1, bil2);
        System.out.println("hasil perkalian "+ bil1 + " dan "+ bil2 + " adalah " + hasil_kali_obj);

        // penjumlahan
        objmat.penjumlahan(20, 40);
        objmat.penjumlahan(hasil_kali_obj,20, 40);
    }
}