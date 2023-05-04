/*
 * Tipe-tipe Access Modifier:
 * - public -> bisa diakses semua class
 * - private -> hanya bisa diakses class itu sendiri
 * - protected -> bisa diakses di package yang sama dan di subclass/anak/turunan
 * - default -> hanya bisa diakses di package yang sama
 * 
 * Tipe-tipe Non Access Modifier:
 * > Untuk class
 * - final -> class tidak bisa diturunkan/di-extends
 * - abstract -> class tidak bisa dibuat objek
 * > Untuk atribut dan method
 * - final -> atribut dan method tidak bisa di override/modified
 * - static -> atribut dan method hanya bisa di satu class, tidak boleh dimiliki class lainnya
 * 
 * Package --> class --> method
 * built-in package --> instance package
 * 
 * 
 * paket1 --> classp1 --> public m1
 *        --> classp2
 * 
 * paket2 --> class2
 */

abstract class induk {
    abstract void dengar();
    protected void suara() {
        System.out.println("go ....");
    }
}

class anak extends induk{
    void dengar() {
        System.out.println("yes ....");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        // instance kelas
        anak obj = new anak();
        obj.suara();
        obj.dengar();
    }
}