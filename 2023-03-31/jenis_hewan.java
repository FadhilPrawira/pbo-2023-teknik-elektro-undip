// Class induk
class hewan {
    public void jumlah_kaki() {
        System.out.println("Hewan memiliki 2 kaki");
    }

    protected String jenis_makanan(String makanan) {
        String pemberitahuan;
        if(makanan=="daging") {
            pemberitahuan= "karnivora";
        } else if (makanan == "tumbuhan") { 
            pemberitahuan = "herbivora";
        } else if (makanan == "campuran") {
            pemberitahuan = "omnivora";
        } else {
            pemberitahuan = "tidak ditemukan jenis hewan tersebut";
        }
        return pemberitahuan;
    }
}

// Class anak
class hewan_darat extends hewan{
    public void jumlah_kaki() {
        System.out.println("Hewan darat memiliki 2 dan 4 kaki");
    }

    public void cara_gerak() {
        System.out.println("Lari, lompat adalah beberapa cara bergerak");
    }
}

// Class cucu
class hewan_berkaki_4 extends hewan_darat{
    // tidak memiliki fungsi
}

class jenis_hewan {
    public static void main(String[] args) { 
        hewan_berkaki_4 obj1 = new hewan_berkaki_4();
        
        // class hewan
        String jenis_hewan = obj1.jenis_makanan("daging");
        System.out.println("Jenis hewan adalah " + jenis_hewan);
        
        
        obj1.jumlah_kaki(); // sudah di override oleh class hewan_darat()
        obj1.cara_gerak();
    }
}