public class KeluargaMain {
    public static void main(String[] args) {
        Ibu ibu = new Ibu("Mila ", 41, "Bekerja sebagai Ibu Rumah Tangga");
        Ayah ayah = new Ayah("Herman ", 42, "Bekerja sebagai Wiraswasta");
        Adik adik = new Adik("Sekar ", 6, "TK");
        Saya saya = new Saya("Lingga ", 20, "Berkuliah semester 4"); 
        
        System.out.println(ayah.nama + ayah.statusPekerjaan);
        System.out.println(ibu.nama + ibu.statusPekerjaan);
        System.out.println(adik.nama + " sedang " + adik.statusPendidikan);
        System.out.println(saya.nama + " sedang " + saya.statusKuliah);
    }
}