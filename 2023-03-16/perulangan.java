public class perulangan {
    public static void main(String[] args) {
    	// FADHIL PRAWIRA
		// 21060120140057
    
        /*
         * Perulangan:
         * - for ...
         * bentuk umum:
         *  for (batas_bawah; batas_atas; tahap_kenaikan) {
         *      pernyataan;
         * }
         * 
         * - while ...
         * 
         */

        // mencetak tulisan 100x menggunakan for
        for (int i=0; i<100; i++) {
            System.out.println("Tulisan ke: "+i+" Teknik Elektro menggunakan for");
        }


        // mencetak tulisan 100x menggunakan while
        int j = 1;
        while (j<100) {
            System.out.println("Tulisan ke: "+j+" Teknik Elektro menggunakan while");
            j++;
        }

        /*
         * Array: tipe data yang digunakan untuk menyimpan lebih dari 1 data/sekumpulan data
         * array:
         * - 1 dimensi->tipe_data[] nama_variabel, contoh String[] namabuah = {"Anggur", "Apel", "Durian", "Mangga"};
         * - multidimensi
         */

        // contoh array 1 dimensi
         String[] namabuah = {"Anggur", "Apel", "Durian", "Mangga"};

        
        // mengakses data dalam array -> nama__variabel[nomor_indeks]

        System.out.println("Nama buah ke 1: "+namabuah[0]);
        System.out.println("Nama buah ke 3: "+namabuah[2]);

        // untuk mengakses semua data dalam array -> menggunakan perulangan/loop

        for (int i=0; i<4; i++) {
            System.out.println("Buah ke " + i + " Nama buah: " + namabuah[i] + " menggunakan for");
        }
        
        int k = 0;
        while(k<4) {
            System.out.println("Buah ke " + k + " Nama buah: " + namabuah[k] + " menggunakan while");
            k++;
        }

        /*
         * Beberapa fungsi dalam array
         * - mengganti data dalam array -> nama_var[indeks] = "isi data baru";
         * - menghitung panjang array -> length
         */

        // menghitung panjang array
        System.out.println("Jumlah buah "+namabuah.length);

        // Mengubah anggur menjadi semangka
        namabuah[0] = "Semangka";
        System.out.println("Nama buah ke-1 adalah " + namabuah[0]);

        /*Untuk mengakses array: 
         * for eachfor(tipe_variabel indeks: nama_array)
         * {pernyataan}
        */

        for (String i: namabuah) {
            System.out.println(i);
        }

        // Array multi dimensi:
        int[][] data = {
            {1,2,3},
            {4,5,6}
        };
        /*
         * akses ke baris
         * 1 2 3
         * 4 5 6
         */

        // Akses baris ke-1 kolom ke-1
        System.out.println("baris ke-1 kolom ke-1 adalah " + data[0][0]);
        // Akses baris ke-2 kolom ke-3
        System.out.println("baris ke-2 kolom ke-3 adalah " + data[1][2]);
        
        System.out.println("");

        System.out.println("Akses array data menggunakan for");
        
        // Akses semua data menggunakan loop
        for (int baris=0;baris<2;baris++) {
            for (int kolom=0;kolom<3;kolom++) {
                // System.out.println("baris ke-"+baris+" kolom ke-"+kolom+" adalah " + data[baris][kolom]);
                System.out.print(data[baris][kolom]+"\t");
            }
            System.out.println("");
        }


        // Array multi dimensi:
        int[][] data2 = {
            {10,11,12},
            {13,14,15}
        };
        /*
         * akses ke baris
         * 10 11 12
         * 13 14 15
         */

        // Akses semua data menggunakan loop
        System.out.println("Akses array data2 menggunakan for");
        for (int baris=0;baris<2;baris++) {
            for (int kolom=0;kolom<3;kolom++) {
                System.out.print(data2[baris][kolom]+"\t");
            }
            System.out.println("");
        }

        // Menjumlahkan matriks data dan data2
        int[][] data3={{0,0,0},{0,0,0}};
        
        // Akses semua data menggunakan loop
        System.out.println("Menjumlahkan matriks data dan data2 menggunakan for");
        for (int baris=0;baris<2;baris++) {
            for (int kolom=0;kolom<3;kolom++) {
                data3[baris][kolom] = data[baris][kolom]+data2[baris][kolom];
                System.out.print(data3[baris][kolom]+"\t");
            }
            System.out.println("");
        }
    }
}
