class GetPlanFactory{  
      
      
       public BukuPaket getPlan(String planType){  
            if(planType == null){  
             return null;  
            }  
          if(planType.equalsIgnoreCase("BUKU KELAS X")) {  
                 return new KelasX();  
               }   
           else if(planType.equalsIgnoreCase("BUKU KELAS XI")){  
                return new KelasXI();  
            }   
          else if(planType.equalsIgnoreCase("BUKU KELAS XII")) {  
                return new KelasXII();  
          }  
      return null;  
   }  
}