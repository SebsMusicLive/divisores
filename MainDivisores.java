public class MainDivisores
{
   public static void main(String[]args){
        Consola c =new Consola();
        Divisible d = new Divisible();
        d.numero =c.leerEntero();

        d.divisores();
        c.imprimir(d.numero+" tiene "+d.divisores.length+" divisores:");
        for(int i=0;i<d.divisores.length;i++)
            c.imprimir(d.divisores[i]);
    }
}
