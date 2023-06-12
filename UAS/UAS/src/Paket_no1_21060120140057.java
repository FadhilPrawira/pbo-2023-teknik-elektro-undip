interface Harga_21060120140057 {
    double biayaperKg = 0;
}
public class Paket_no1_21060120140057 implements Harga_21060120140057{
    public String nmPengirim;
    public String tujuanPaket;
    public int beratPaket;
    public double biayaperKg;
    public double bayar;
    public String getNamaPengirim() {
        return nmPengirim;
    }

    public String setNamaPengirim(String temp){
        nmPengirim=temp;
        return nmPengirim;
    }

    public String setTujuanPaket() {
        return tujuanPaket;
    }

    public int beratPaket() {
        return beratPaket;
    }

    public void biaya() {
        if(tujuanPaket.equalsIgnoreCase("Semarang")){
            biayaperKg=10000;
        }
        else if(tujuanPaket.equalsIgnoreCase("Jawa Tengah Luar Semarang")){
            biayaperKg=20000;
        }
        else if (tujuanPaket.equalsIgnoreCase("Luar Jateng P. Jawa")){
            biayaperKg=30000;
        }
        else { //Luar jawa
            biayaperKg=50000;
        }
        bayar = beratPaket*biayaperKg;
        System.out.println(nmPengirim+", untuk pengiriman ke " + tujuanPaket + " seberat " + beratPaket + "kg, Anda perlu membayar Rp" + bayar);
    }

    public static void main(String[] args) {
        Paket_no1_21060120140057 barang1 = new Paket_no1_21060120140057();

        barang1.tujuanPaket = "Semarang";
        barang1.beratPaket = 2;
        barang1.nmPengirim = "Fadhil";

        barang1.biaya();
    }
}


