public class PaketPintar extends PaketDecorator{  
  public PaketPintar(Paket newPaket)    {  
        super(newPaket);  
  }  
    public String jenisPaket(){  
        return super.jenisPaket() +"  + 10 BUKU !  ";   
    }  
    public double paketHarga()   {  
        return super.PaketHarga()+10000;  
        }  
}  