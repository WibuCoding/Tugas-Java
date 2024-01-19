package constructor;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Rayhan", "G.231.23.0094","FTIK");

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.NIM);
        System.out.println(mahasiswa.jurusan);
    }
}
