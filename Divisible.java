class Divisible
{   int numero; 
    int [] divisores;

    int cantidad(int numero){
        int divisor=2;
        int cantidad=2;
        while(divisor<=(int)Math.sqrt(numero)){
            if(numero%divisor==0){
                cantidad+=2;              
            }
            divisor+=1;
        }
        if((int)Math.sqrt(numero)==Math.sqrt(numero))
            cantidad--;
        return cantidad;
    }

    void divisores(){
        int n = cantidad(numero);
        divisores= new int[n];
        int i = 0, j = n-1;
        divisores[i++] = 1;
        divisores[j--] = numero;
        if((int)Math.sqrt(numero)==Math.sqrt(numero))
            divisores[n/2] = (int)Math.sqrt(numero);
        int divisor=2;
        while(divisor<=(int)Math.sqrt(numero)){
            if(numero%divisor==0){
                divisores[i++] = divisor;
                divisores[j--] = numero / divisor;
            }
            divisor+=1;
        }
    }

}