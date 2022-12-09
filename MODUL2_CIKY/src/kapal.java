public class kapal extends transportasiAir{
    protected String mesin;

public kapal(int jumlahkursi, int biaya, String mesin){
        super(jumlahkursi, biaya, mesin);
        this.mesin = mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah " + jumlahkursi + "ditetapkan dengan biaya sebesar " + biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar dengan menggunakan " + mesin + "dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar dengan menggunakan " + mesin + "dengan kecepatan yang stabil dikisaran " + kecepatan);
    }
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal sedang berlabuh dipantai");
    }
}