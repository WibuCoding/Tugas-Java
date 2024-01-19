package method;

public class Main2 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Ragil","G.211.21.2345");
        mahasiswa.show();
        mahasiswa.setNama("Totti");
        mahasiswa.show();

        System.out.println(mahasiswa.getName());
        System.out.println(mahasiswa.getNim());

        String data = mahasiswa.sayhii("wibu");
        System.out.println(data);
    }


}