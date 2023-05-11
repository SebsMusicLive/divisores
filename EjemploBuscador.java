
public class EjemploBuscador
{
   int [] a;
   int [] s;
    
    boolean buscar(int x){
     boolean existe = false;
     int i = 0;
     
     for(i = 0; !existe && i< a.length; i++){
       if(a[i]==x){
         existe = true;
       }
     }
     
     return existe;
    }
    
    int buscar2(int x){
     boolean existe = false;
     int i = 0;
     
     for(i = 0; !existe && i< a.length; i++){
       if(a[i]==x){
         existe = true;
       }
     }
     
     return i;
    }
    
    int contar(int x){
     int n = 0;
    
     for(int i = 0; i< a.length; i++){
       if(a[i]==x){
         n++;
       }
     }
     
     return n;
    }
    

    void calcularOcurrencias(int x){
      int n = contar(x);
      s = new int[n];
      int j = 0;
      
      for(int i = 0; i< a.length; i++){
       if(a[i]==x){
         s[j++] = i;
       }
     }
      
    }
    
    void probar(){
     a = new int[]{2,7,6,15,7,8,7,16,7,40,15};
     calcularOcurrencias(7);
    }
}
