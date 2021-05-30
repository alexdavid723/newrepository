import java.util.Scanner;

public class trabajo19 {
    public static void main(String[]args){
        int a,b;
        Scanner imp=new Scanner(System.in);
        Scanner clave=new Scanner(System.in);
        System.out.println("cuantos automoviles posees: ");
        a=imp.nextInt();
        for (int i = 1; i <= a; i++){
            System.out.println("que clave posee el automovil: "+i);
            b=clave.nextInt();
        
            if(b==1){
                System.out.println("pagas el 10% del valor del vehiculo");
            }
            else if(b==2){
                System.out.println("pagas el 7% del valor del vehiculo");

            }
            else if(b==3){
                System.out.println("pagas el 5% del valor del vehiculo");

            }
            

        }
    }
}
