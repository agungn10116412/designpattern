public class PaketRanking extends PaketDecorator{  
  public PaketRanking(Paket newPaket)    {  
        super(newPaket);  
  }  
    public String jenisPaket(){  
        return super.jenisPaket() +" + 20 BUKU !  ";   
    }  
    public double paketHarga()   {  
        return super.PaketHarga()+20000;  
        }  
}  