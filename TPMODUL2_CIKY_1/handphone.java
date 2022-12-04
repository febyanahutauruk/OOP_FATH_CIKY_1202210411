package TPMODUL2_CIKY_1;

public class handphone extends perangkat{
    protected boolean fingerprint;

    public handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor, fingerprint);
        this.fingerprint = fingerprint;
    }

    public void informasi(){
        System.out.println("Handphone ini memiliki drive tipe" + drive + "dengan ram sebesar" + ram + "dan processor secepat" + processor + ". Selain itu handphone ini TIDAK memiliki Fingerprint");
    }
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No" + no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No" + no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No" + no_hp1 + "dan ke No" + no_hp2);
    }
 
}
