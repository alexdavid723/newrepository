import java.util.Scanner;
public class trabajo8{
public static void main(String[] arg){
    Scanner compi=new Scanner(System.in);
    double n;
    
    System.out.println("ingrese el costo total de los articulos: ");
    n=compi.nextInt();
    if (n>=200){
        n -= (n*0.15);
    }
        else if (n>=100 && n<200){
            n-=(n*0.12);
            
        }
        else{
            n-=(n*0.1);
        }
        {
            System.out.println("el costo total con su respectivo descuento es: "+n);
        }
    }   
}   
