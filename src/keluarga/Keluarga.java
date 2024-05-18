public class Keluarga {
    String nama;
    int umur;

    public Keluarga(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void bekerja(String pekerjaan) {
        System.out.println(nama + " bekerja sebagai " + pekerjaan);
    }
}
