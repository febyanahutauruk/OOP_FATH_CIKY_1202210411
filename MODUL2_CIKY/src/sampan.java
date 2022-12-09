public class sampan extends transportasiAir{
    protected int layar;

public sampan(int jumlahkursi, int biaya, int layar){
        super(jumlahkursi, biaya, layar);
        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah " + jumlahkursi + "ditetapkan dengan biaya sebesar" + biaya");
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar dengan " + layar + "layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh dipantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh dipantai dengan 2 jangkar");
    }

    
}
