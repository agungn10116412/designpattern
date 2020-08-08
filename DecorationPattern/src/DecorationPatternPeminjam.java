import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class DecorationPatternPeminjam {  
    private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException    {  
       do{        
        System.out.print("========= LANGGANAN KARTU PERPUSTAKAAN TADIKA MESRA ============ \n");  
        System.out.print("            1. PAKET HEMAT.   \n");  
        System.out.print("            2. PAKET PINTAR.\n");  
        System.out.print("            3. PAKET RANKING.         \n");  
        System.out.print("            4. Exit                        \n");  
        System.out.print("masukan pilihan kamu: ");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        choice=Integer.parseInt(br.readLine());  
        switch (choice) {  
        case 1:{   
                 PaketHemat vf=new PaketHemat();  
              System.out.println(vf.jenisPaket());  
              System.out.println( vf.paketHarga());  
            }  
            break;  
              
                case 2:{  
                Paket f1=new PaketPintar((Paket) new PaketHemat());  
                    System.out.println(f1.jenisPaket());  
                System.out.println( f1.paketHarga());  
        }  
            break;    
     case 3:{  
             Paket f2=new PaketRanking((Paket) new PaketHemat());  
                     System.out.println(f2.jenisPaket());  
                    System.out.println( f2.paketHarga());  
              }  
            break;    
              
         default:{    
            System.out.println("Selain ini tidak ada paket lain lagi");  
        }         
    return;  
     } 
          
}while(choice!=4);  
    }  
}  