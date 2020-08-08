	public class Librarian {    
	    private Perpustakaan fisika;    
	    private Perpustakaan biologi;    
	    private Perpustakaan matematika;    
	        
	    public Librarian(){    
	        fisika= new Fisika();    
	        biologi=new Biologi();    
	        matematika=new Matematika();    
	    }    
	    public void fisikaSale(){    
	        fisika.namaBuku();    
	        fisika.harga();    
	    }    
	        public void biologiSale(){    
	        biologi.namaBuku();    
	        biologi.harga();  
	    }    
	   public void matematikaSale(){    
	        matematika.namaBuku();    
	        matematika.harga();    
	        }    
	}    
