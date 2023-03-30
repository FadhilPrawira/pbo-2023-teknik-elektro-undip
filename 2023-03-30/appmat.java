class matematika {
    /*
     * fungsi:
     * -perkalian -> memiliki luaran integer, dengan input a dan b, luaran c
     * -penjumlahan -> tidak luaran nilai, input a dan b
     * -pembagian -> memiliki luaran return, input a dan b
     * -pengurangan -> tidak memiliki luaran nilai, input a dan b
     */

    int perkalian(int a, int b) {
        int c = a*b;
        return c;
    }

    void penjumlahan(int a, int b) {
        int c = a+b;
        System.out.println("hasil penjumlahan = " + c);
    }

    float pembagian(float a, float b) {
        float c = a/b;
        return c;
    }

    void pengurangan(int a, int b) {
        int c = a-b;
        System.out.println("hasil pengurangan = " + c);
    }

} // akhir dari kelas matematika


class matematika2 {
    /*
     * fungsi:
     * -perkalian -> memiliki luaran integer, dengan input a dan b, luaran c
     * -penjumlahan -> tidak luaran nilai, input a dan b
     * -pembagian -> memiliki luaran return, input a dan b
     * -pengurangan -> tidak memiliki luaran nilai, input a dan b
     */

    float pembagian(float a, float b) {
        float c = a/b;
        return c;
    }

    void pengurangan(int a, int b) {
        int c = a-b;
        System.out.println("hasil pengurangan = " + c);
    }

} // akhir dari kelas matematika



// membuat kelas untuk implementasi
public class appmat {
    public static void main(String[] args) {
        // membuat objek dari kelas matematika
        // nama_class nama_objek = new nama_class();
        System.out.println("======== Percobaan obj1 class matematika ========");

        matematika objmat1 = new matematika();
        matematika2 objmat2 = new matematika2();

        // menggunakan fungsi/method melalui objeknya
        // nama_objek.nama_fungsi()

        // define bilangan
        int bil1 = 10;
        int bil2 = 20;

        // perkalian
        int hasil_kali_obj1 = objmat1.perkalian(bil1, bil2);
        System.out.println("hasil perkalian "+ bil1 + " dan "+ bil2 + " adalah " + hasil_kali_obj1);

        // penjumlahan
        objmat1.penjumlahan(bil1, bil2);

        System.out.println("======== Percobaan obj2 class matematika2 ========");

        // pembagian
        float hasil_bagi_obj2 = objmat2.pembagian(bil1, bil2);
        System.out.println("hasil pembagian "+ bil1 + " dan "+ bil2 + " adalah " + hasil_bagi_obj2);

        // pengurangan
        objmat2.pengurangan(bil1, bil2);
    }
}