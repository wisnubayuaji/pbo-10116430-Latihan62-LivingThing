/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */
public class Human extends LivingThing{
    private String nama;
    public String getNama() {
        return nama;

    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama){
        System.out.println(nama + " sedang berjalan");
    }
    
}
