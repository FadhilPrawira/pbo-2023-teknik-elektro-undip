// Tugas 2 Interface
// FADHIL PRAWIRA
// 21060120140057


// Interface
interface DataBuku {
  public void insert_data(int id_buku, String judul_buku, String pengarang); // interface method (does not have a body)
  public void update_data(int id_buku, String judul_buku, String pengarang); // interface method (does not have a body)
}

// Buku_lokal "implements" the Buku interface
class Buku implements DataBuku {
  int id_buku;
  String id_buku_str;
  String judul_buku;
  String pengarang;

  public void insert_data(int id_buku, String judul_buku, String pengarang) {
    id_buku_str = Integer.toString(id_buku);

    // The body of insert_data() is provided here
    System.out.println("Buku berjudul " + judul_buku + " karangan " +  pengarang + " berhasil ditambahkan");
    System.out.println("INSERT INTO table_name (id_buku, judul_buku, pengarang) VALUES (" + id_buku_str + ", '"+ judul_buku + "', '"+ pengarang +"');");
  }
  public void update_data(int id_buku, String judul_buku, String pengarang) {
    id_buku_str = Integer.toString(id_buku);

    // The body of update_data() is provided here
    System.out.println("Informasi buku berhasil diubah");
    System.out.println("UPDATE table_name SET judul_buku = '" + judul_buku + "', pengarang = '" + pengarang + "' WHERE id_buku = '" + id_buku_str + ";");
  }
}


class Buku_lokal extends Buku {
  // ini fungsi lokal
  public void ucapan() {
    System.out.println("Selamat datang di perpustakaan UNDIP");
  }
}


class Buku_asing extends Buku {
  // ini fungsi lokal
  public void greeting() {
    System.out.println("Welcome to UNDIP library");
  }

  public void insert_data(int id_buku, String judul_buku, String pengarang) {
    id_buku_str = Integer.toString(id_buku);

    // The body of insert_data() is provided here
    System.out.println("Book that titled '" + judul_buku + "' written by '" +  pengarang + "'' successfully addede");
    System.out.println("INSERT INTO table_name (id_buku, judul_buku, pengarang) VALUES (" + id_buku_str + ", '"+ judul_buku + "', '"+ pengarang +"');");
  }

  public void update_data(int id_buku, String judul_buku, String pengarang) {
    id_buku_str = Integer.toString(id_buku);

    // The body of update_data() is provided here
    System.out.println("Book's detail successfully changed");
    System.out.println("UPDATE table_name SET judul_buku = '" + judul_buku + "', pengarang = '" + pengarang + "' WHERE id_buku = '" + id_buku_str + ";");
  }
}


class tugas_2 {
  public static void main(String[] args) {
    System.out.println("Tugas 2 Interface - FADHIL PRAWIRA");
    Buku_lokal myLocalBook = new Buku_lokal();  // Create a Buku_lokal object
    myLocalBook.ucapan();
    myLocalBook.insert_data(1, "Harry Potter", "JK Rowling");
    myLocalBook.update_data(1, "Harry Potter and Deadly Hallow", "JK Rowling");
    System.out.println("==========================================");

    Buku_asing myForeignBook = new Buku_asing(); // Create a Buku_asing object
    myForeignBook.greeting();
    myForeignBook.insert_data(2, "Modern cont. eng.", "Katsuhiko Ogata");
    myForeignBook.update_data(2, "Modern Control Engineering", "Katsuhiko Ogata");

  }
}