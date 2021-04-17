package tugas;

public class App {
    public static void main(String[] args) {
        NIM nim = new NIM("12050116400");

        System.out.println("NIM : " + nim);
        System.out.println("Jenjang Pendidikan : " + nim.jenjangPendidikan());
        System.out.println("Angkatan : " + nim.angkatan());
        System.out.println("Fakultas : " + nim.fakultas());
        System.out.println("Prodi : " + nim.prodi());
        System.out.println("Jenis Kelamin : " + nim.jenisKelamin());
        System.out.println("No Unik : " + nim.noUnik());
    }
}
