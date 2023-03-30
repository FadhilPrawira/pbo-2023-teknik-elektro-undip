import java.util.Scanner;


class percabangan {
    public static void main(String[] args) {
		// FADHIL PRAWIRA
		// 21060120140057


        /*
         * kondisional
         * if(kondisi){
         *  pernyataan benar'
         * }
         */



         
         // cek bilangan genap/ganjil
         // bilangan genap adalah bilangan yang jika dibagi 2 sisanya 0
         int angka = 3;
         if(angka%2==0) {
            // cetak bilangan itu genap
            System.out.println("bilangan genap");
         } else {
            System.out.println("bilangan ganjil");
         }
         
         
         /*
          * cek gaji
          berdasarkan golongan dan

          */
         int golongan = 1;
         if(golongan==1) {
            System.out.println("Gaji 1 juta");
         } else if(golongan==2){
            System.out.println("Gaji 500rb");
         }

         /*
          * konversi nilai ke bobot
          nilai   bobot
          A       4
          B       3
          C       2
          D       1
          E       0
          */

         System.out.println("");

         // Percabangan menggunakan if
         char nilai = 'A';
         if(nilai=='A') {
            System.out.println("Nilai anda 4");
         } else if (nilai == 'B') {
            System.out.println("Nilai anda 3");
         } else if (nilai == 'C') {
            System.out.println("Nilai anda 2");
         } else if (nilai == 'D') {
            System.out.println("Nilai anda 1");
         } else if (nilai == 'E') {
            System.out.println("Nilai anda 0");
         } else {
            System.out.println("nilai anda belum ada");
         }

         // Percabangan menggunakan switch
         switch(nilai) {
            case 'A': System.out.println("bobot 4");
               break;
            case 'B': System.out.println("bobot 3");
               break;
            case 'C': System.out.println("bobot 2");
               break;
            case 'D': System.out.println("bobot 1");
               break;
            case 'E': System.out.println("bobot 0");
               break;
               default: System.out.println("input salah");
         }

         /*
          * skor           nilai
            80 s.d. 100    A
            70 s.d. 79     B
            60 s.d. 69     C
            50 s.d. 59     D
            <50            E
          */

         // double skor=100.1;
         double skor;

         Scanner myObj = new Scanner(System.in);
         
         skor = myObj.nextDouble();
         char nilai2;
         if(skor>=80 && skor<=100) nilai2= 'A';
         else if (skor>=70 && skor<80) nilai2 = 'B';
         else if (skor>=60 && skor<70) nilai2 = 'C';
         else if (skor>=50 && skor<60) nilai2 = 'D';
         else nilai2 = 'E';

         System.out.println("Skor Anda adalah "+skor+" sehingga nilai Anda adalah "+nilai2);
    }
}