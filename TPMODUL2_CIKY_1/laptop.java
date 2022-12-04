package TPMODUL2_CIKY_1;

public class laptop extends perangkat{
    protected boolean webcam;

public laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor, webcam);
        this.webcam = webcam;
    }

    public void informasi(){
        System.out.println("Laptop ini memiliki drive tipe Seagate dengan ram sebesar 8 GB dan processor secepat 2.40 Ghz. Selain itu laptop ini juga memiliki Webcam");
    }
    public void bukaGame(){
        System.out.println("Laptop berhasil membuka game Dota 2");
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke niceyuk@gmail.com");
    }
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke aanarji@gmail.com dan rusmango@gmail.com");
    }
 
    
}
