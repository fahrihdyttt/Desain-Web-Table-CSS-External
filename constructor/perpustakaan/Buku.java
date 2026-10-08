package constructor.perpustakaan;

public class Buku {
    //fields
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int stok;
    //constructor tanpa parameter
    public Buku() {
        this.judul = "Tidak diketahui";
        this.penulis = "Tidak diketahui";
        this.tahunTerbit = 0;
        this.stok = 0;
    }
    //coinstructor dengan parameter
    public Buku(String judul, String penulis, int tahunTerbit, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
    }
    //setters dan getter
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getJudul() {
        return judul;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public String getPenulis() {
        return penulis;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getStok() {
        return stok;
    }
}