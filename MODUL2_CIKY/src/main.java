public class main{

    public static void main(String[] args) throws Exception{
        System.out.println("Class TransportasiAir");
        transportasiAir transportasiAir1 = new transportasiAir(4 , 2000);
        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();


        System.out.println("Class Sampan");
        sampan sampan1 = new sampan(20, 5000);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(int jangkar);

        
        System.out.println("Class Kapal");
        kapal kapal1 = new kapal(50, 100000);
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(int kecepatan);
        kapal.berlabuh();
    }
}
