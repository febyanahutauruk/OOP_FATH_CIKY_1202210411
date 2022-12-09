public class tranportasiAir {
    protected Integer jumlahkursi;
    protected Integer biaya;
    
    public class transportasiAir(int jumlahkursi, int biaya){
    this.jumlahkursi = jumlahkursi;
    this. biaya = biaya;
    }

    public transportasiAir(int jumlahkursi, int biaya, int layar, String mesin)

    public void informasi() {
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah " + jumlahkursi + "ditetapkan dengan biaya sebesar" + biaya);

    }
    public void berlayar() {
        System.out.println("Transportasi Air jenis tidak diketahui sedang berlayar");

    }
    public void berlabuh() {
        System.out.println("Transportasi Air jenis tidak diketahui berlabuh di pantai");

    }
}
