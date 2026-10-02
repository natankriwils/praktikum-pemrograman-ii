package Module02.Problem03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        // Kode ini menyebabkan eror karena pada akhir baris kode tidak ada penutup semicolon (;)
        // e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assassin");

        // Memperbaiki teks output karena pada modul tidak ada kalimat "pegawai"
        // System.out.println("Nama Pegawai: " + p1.getName());
        System.out.println("Name: " + e.getName());
        System.out.println("Origin: " + e.getOrigin());
        System.out.println("Position: " + e.role);
        // Menambahkan kalimat "years old" agar sesuai dengan soal pada modul
        // System.out.println("Umur: " + e.age);
        e.age = 17;
        System.out.println("Age: " + e.age + " years old");
    }
}