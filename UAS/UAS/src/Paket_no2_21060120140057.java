abstract class Paket_abstract_no2_21060120140057 implements Harga_21060120140057 {
    protected String nmPengirim;
    protected String tujuanPaket;
    protected int beratPaket;
    protected int hargaPerKg;
    protected double biaya;

    public String getNmPengirim() {
        return nmPengirim;
    }

    public void setNmPengirim(String temp) {
        nmPengirim = temp;
    }

    public String getTujuanPaket() {
        return tujuanPaket;
    }

    public void setTujuanPaket(String temp) {
        tujuanPaket = temp;
    }

    public int getBeratPaket() {
        return beratPaket;
    }

    public void setBeratPaket(int temp) {
        beratPaket = temp;
    }

    public abstract double biayaPerKg();

    public void biaya() {
        biaya = beratPaket * hargaPerKg;
        System.out.println(nmPengirim+", untuk pengiriman ke " + tujuanPaket + " seberat " + beratPaket + "kg, Anda perlu membayar Rp" + hargaPerKg);
    }
}

class Paket21060120140057 extends Paket_abstract_no2_21060120140057 {
    public double biayaPerKg() {
        if (tujuanPaket.equalsIgnoreCase("Semarang")) {
            hargaPerKg = 10000;
            return hargaPerKg;
        } else if (tujuanPaket.equalsIgnoreCase("Jawa Tengah Luar Semarang")) {
            hargaPerKg = 20000;
            return hargaPerKg;
        } else if (tujuanPaket.equalsIgnoreCase("Luar Jateng P.Jawa")) {
            hargaPerKg = 20000;
            return hargaPerKg;
        } else if (tujuanPaket.equalsIgnoreCase("Luar Jawa")) {
            hargaPerKg = 50000;
            return hargaPerKg;
        } else {
            hargaPerKg = 50000;  // Penambahan tanda = agar sesuai dengan sintaksis
            return hargaPerKg;
        }

    }
}

public class Paket_no2_21060120140057 {
    public static void main(String[] args) {
        Paket21060120140057 paket = new Paket21060120140057();
        paket.nmPengirim = "Fadhil";
        paket.tujuanPaket = "Semarang";
        paket.beratPaket = 5;
        paket.biaya();

    }
}