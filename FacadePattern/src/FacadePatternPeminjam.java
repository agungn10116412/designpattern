	import java.io.BufferedReader;    
	import java.io.IOException;    
	import java.io.InputStreamReader;    
	    
	public class FacadePatternPeminjam {    
	    private static int  choice;    
	    public static void main(String args[]) throws NumberFormatException, IOException{    
	        do{         
	            System.out.print("========= PERPUSTAKAAN TADIKA MESRA ============ \n");    
	            System.out.print("            1. FISIKA.              \n");    
	            System.out.print("            2. BIOLOGI.              \n");    
	            System.out.print("            3. MATEMATIKA.            \n");    
	            System.out.print("            4. Exit.                     \n");    
	            System.out.print("Enter your choice: ");    
	                
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
	            choice=Integer.parseInt(br.readLine());    
	            Librarian sk=new Librarian();    
	                
	            switch (choice) {    
	            case 1:    
	                {     
	                  sk.fisikaSale();    
	                    }    
	                break;    
	       case 2:    
	                {    
	                  sk.biologiSale();          
	                    }    
	                break;      
	       case 3:    
	                           {    
	                           sk.matematikaSale();         
	                           }    
	                   break;       
	            default:    
	            {      
	                System.out.println("Yah kamu tidak jadi pinjam?");    
	            }           
	                return;    
	            }    
	                
	      }while(choice!=4);    
	   }    
	}    
