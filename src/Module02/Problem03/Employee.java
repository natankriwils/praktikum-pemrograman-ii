package Module02.Problem03;

public class Employee {
    public String name;
    // Kode ini menyebabkan eror karena tipe data char tidak bisa digunakan untuk menginput teks string
    // public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    // Kode ini menyebabkan eror karena metode parameter yang digunakan tidak ada, yang menyebabkan "j" tidak terdefinisi
    // public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}