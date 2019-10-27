package id.ac.polinema.recyclerviewsangatsederhana.models;

public class Wisata {
    public String namawisata;
    public String alamat;
    public String tiket;
    public int wisata;

    public Wisata(String namawisata, String alamat, String tiket, int wisata) {
        this.namawisata = namawisata;
        this.alamat = alamat;
        this.tiket = tiket;
        this.wisata = wisata;
    }

    public int getWisata() {
        return wisata;
    }

    public void setWisata(int wisata) {
        this.wisata = wisata;
    }

    public String getNamawisata() {
        return namawisata;
    }

    public void setNamawisata(String namawisata) {
        this.namawisata = namawisata;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTiket() {
        return tiket;
    }

    public void setTiket(String tiket) {
        this.tiket = tiket;
    }
}
