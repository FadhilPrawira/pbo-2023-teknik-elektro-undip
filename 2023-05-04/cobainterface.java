interface matematika {
    public void penjumlahan(int a, int b);
    public void perkalian(int a, int b);
}

class aplikasimatematika implements matematika {
    // membuat detail dari fungsi yang ada di interface
    public void penjumlahan(int a, int b) {
        System.out.println("Hasil penjumlahan = "+(a+b));
    }
    public void perkalian(int a, int b) {
        System.out.println("Hasil perkalian = "+(a*b));
    }

}

class cobainterface {
    public static void main(String[] args) {
        aplikasimatematika objmat = new aplikasimatematika();
        objmat.penjumlahan(10,20);
        objmat.perkalian(10,20);

    }
}