/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {

        Human h = new Human();
        h.setNama("Wisnu Bayu");
        System.out.print(h.getNama());
        h.walk("");
        System.out.print(h.getNama());
        h.breath("");
        System.out.print(h.getNama());
        h.eat("");
    }
}
