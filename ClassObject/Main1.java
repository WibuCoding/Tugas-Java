package ClassObject;

public class Main1 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama ="Rayhan";
        mahasiswa.NIM ="G.231.23.0094";
        mahasiswa.jurusan ="Teknik Informatika";
        mahasiswa.IPK =4.0;
        mahasiswa.umur =17;

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.NIM);
        System.out.println(mahasiswa.jurusan);
        System.out.println(mahasiswa.IPK);
        System.out.println(mahasiswa.umur);
    }
}
