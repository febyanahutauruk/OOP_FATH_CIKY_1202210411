package TPMODUL2_CIKY_1;

public class Main{


    public static void main(String[] args, String Adata) throws Exception{
        System.out.println("Class perangkat");
        perangkat perangkat1 = new perangkat(Adata, 2, (float) 1.40, false);
        perangkat1.informasi();
        System.out.println("");


        System.out.println("Class handphone");
        handphone handphone1 = new handphone(null, 0, 0, false);
        handphone1.informasi();
        handphone1.telfon(628122122);
        handphone1.kirimSMS(52852112);
        handphone1.kirimSMS(62812121, 629292211);
        System.out.println("");


        System.out.println("Class laptop");
        laptop laptop1 = new laptop(null, 0, 0, false);
        laptop1.informasi();
        laptop1.bukaGame();
        laptop1.kirimEmail(null);
        laptop1.kirimEmail(null, null);
        System.out.println("");

    }
    
}