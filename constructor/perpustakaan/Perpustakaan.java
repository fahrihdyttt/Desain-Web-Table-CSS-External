package constructor.perpustakaan;

public class Perpustakaan {
    public static void main(String[] args) {
        // Menggunakan Constructor Parametrik
        Buku buku1 = new Buku("Cantik Itu Luka", "Eka Kurniawan", 2002, 12);
        Buku buku2 = new Buku("Gadis Kretek", "Ratih Kumala", 2012, 18);

        // Menggunakan Constructor Default & Setter
        Buku buku3 = new Buku();
        buku3.setJudul("Filosofi Teras");
        buku3.setPenulis("Henry Manampiring");
        buku3.setTahunTerbit(2018);
        buku3.setStok(40);

        Buku buku4 = new Buku();
        buku4.setJudul("Atomic Habits");
        buku4.setPenulis("James Clear");
        buku4.setTahunTerbit(2018);
        buku4.setStok(35);

        // Menampilkan Informasi Buku
        tampilkanBuku(buku1);
        tampilkanBuku(buku2);
        tampilkanBuku(buku3);
        tampilkanBuku(buku4);
    }

    public static void tampilkanBuku(Buku buku) {
        System.out.println("Judul        : " + buku.getJudul());
        System.out.println("Penulis      : " + buku.getPenulis());
        System.out.println("Tahun Terbit : " + buku.getTahunTerbit());
        System.out.println("Stok         : " + buku.getStok());
        System.out.println("========================================");
    }
}