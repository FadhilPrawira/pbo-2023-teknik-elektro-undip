<?php

class Dosen
{
    public $id_dosen;
    public $nama_dosen;
    public $alamat_dosen;
    public $telp_dosen;

    function info_profil($id, $nama, $alamat, $telp)
    {
        $this->id_dosen = $id;
        $this->nama_dosen = $nama;
        $this->alamat_dosen = $alamat;
        $this->telp_dosen = $telp;

        // place it in array
        $myarray = [
            "id dosen"=>$this->id_dosen,
            "nama dosen"=>$this->nama_dosen,
            "alamat dosen"=>$this->alamat_dosen,
            "telepon dosen"=>$this->telp_dosen
        ];

        return $myarray;
    }
}

class Jadwal
{
    public $periode;
    public $hari;
    public $jam_masuk;
    public $jam_keluar;

    function getTotalTime($jam_masuk, $jam_keluar)
    {
        $this->jam_masuk = $jam_masuk;
        $this->jam_keluar = $jam_keluar;

        // convert into datetime object
        $start_datetime = new DateTime($jam_masuk);
        $end_datetime = new DateTime($jam_keluar); 
        
        // calculate the difference
        $diff = date_diff($start_datetime, $end_datetime);
        $totalTime = $diff;
        
        return $totalTime;
    }
}

class Ruang
{
    public $kd_ruang;
    public $ket_ruang;
    public $lokasi;

    function detail_ruang($kd_ruang, $ket_ruang, $lokasi)
    {
        $this->kd_ruang = $kd_ruang;
        $this->ket_ruang = $ket_ruang;
        $this->lokasi = $lokasi;

        $myarray = [
            "kode ruang" => $kd_ruang,
            "keterangan ruang" => $ket_ruang,
            "lokasi ruang" => $lokasi
        ];

        return $myarray;
    }
}

// kurang nilai, matkul, krs, mahasiswa

// instance
$dosen_1 = new Dosen();
var_dump($dosen_1->info_profil(1, "maman", "banyumanik", "0852"));

$jadwal_1 = new Jadwal(); 
$jam_masuk = '2023-05-25 08:00:30'; 
$jam_keluar = '2023-05-25 09:40:45'; 
var_dump($jadwal_1->getTotalTime($jam_masuk, $jam_keluar));