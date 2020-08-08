public abstract class PaketDecorator implements Paket{  
    private Paket newPaket;  
    public PaketDecorator(Paket newPaket)  {  
        this.newPaket=newPaket;  
    }  
    @Override  
    public String jenisPaket(){  
        return newPaket.jenisPaket();   
    }  
    public double PaketHarga(){  
        return newPaket.paketHarga();  
    }  
}  