package method;

public class Mahasiswa {
    String Nama;
    String Nim;
    Mahasiswa(String Nama, String Nim) {
        this.Nama = Nama;
        this.Nim = Nim;
    }
    void show() {
        System.out.println("Nama : " + this.Nama);
        System.out.println("Nim : " + this.Nim);
    }

    void setNama(String Nama) {
        this.Nama = Nama;
    }

    String getName(){
        return this.Nama;
    }

    String getNim() {
        return this.Nim;
    }
    String sayhii(String message) {
        return message + "juga Nama saya adalah" + this.Nama;
    }
}
