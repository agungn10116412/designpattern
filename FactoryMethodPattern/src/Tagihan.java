import java.io.*;    
class Tagihan{  
    public static void main(String args[])throws IOException{  
      GetPlanFactory planFactory = new GetPlanFactory();  
        
      System.out.print("tuliskan BUKU + KELAS yang akan dipinjam. CONTOH : BUKU KELAS X: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      String planName=br.readLine();  
      System.out.print("Masukkan jumlah buku untuk tagihan yang akan dihitung: ");  
      int units=Integer.parseInt(br.readLine());  
  
      BukuPaket p = planFactory.getPlan(planName);  
      
  
       System.out.print("Jumlah tagihan pinjaman  "+planName+" untuk satu semester dari  "+units+" buku adalah: ");  
           p.getRate();  
           p.calculateBill(units);  
            }  
    }