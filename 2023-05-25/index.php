<?php
abstract class Rumus 
{
    abstract public function abc($a, $b, $c); // no detail
}

// turunan dari Rumus untuk implementasi
class Impl_Rumus extends Rumus
{
    function abc ($a, $b, $c)
    {
        return ($a*$b+2*$c);
    }
}

class Matematika 
{
    // properties
    public $angka1;
    public $angka2;
    

    // method yang memiliki return value
    function perkalian($angka1, $angka2)
    {
        $hasil = $angka1*$angka2;
        return $hasil;
    }

    // method yang tidak memiliki return value (void)
    function pembagian($angka1, $angka2)
    {
        if($angka2 != 0) {
            echo "Hasil bagi = ".($angka1/$angka2)."\n";
        } else {
            echo "pembagi tidak boleh nol\n";
        }
    }
}

class Mat_turunan extends Matematika 
{
    function penjumlahan ($angka1, $angka2) 
    {
        echo "Hasil penjumlahan = ".($angka1 + $angka2)."\n";
    }
}

// instansiasi objek dari class turunan
$m1 = new Mat_turunan();
echo $m1->perkalian(10,20); //panggil method dari class induk
echo "\n";
$m1->pembagian(10,2); //panggil method dari class induk
$m1->penjumlahan(8,10); //panggil method dari class turunan


// instansiasi objek Rumus
$r1 = new Impl_Rumus();
echo $r1->abc(4,5,6);
?>