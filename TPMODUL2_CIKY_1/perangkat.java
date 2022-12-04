package TPMODUL2_CIKY_1;
public class perangkat {
    protected String drive;
    protected Integer ram;
    protected float processor;

    public perangkat (String drive, int ram, float processor){
    this.drive = drive;
    this.ram = ram;
    this.processor = processor;
    }

    public perangkat(String drive, int ram, float processor, boolean fingerprint) {
    }

    public void informasi() {
        System.out.println("Perangkat tidak diketahui memiliki drive tipe " + drive + "dengan ram sebesar" + ram + "dan processor secepat" + processor);

    }
}
