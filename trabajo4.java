import java.util.Scanner;

import javax.swing.JOptionPane;

public class trabajo4 {
    public static void main(String[]args){
        int numero,numero2,conteo_rojos=0,conteo_blanco=0,conteo_verde=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite el numero total de focos sean blancos,verdes y rojos: "));
		for (int i=1;i<=numero;i++){//para no estar haciedno n lineas usamos un bucle
		numero2=Integer.parseInt(JOptionPane.showInputDialog("1.-foco rojo\n2.-foco verde\n3.-foco blanco\ndigite el color de foco correspondiente: "));
		if(numero2==1){
			conteo_rojos++;
		}
		else if (numero2==2){
			conteo_verde++;
		}
		else if (numero2==3){
			conteo_blanco++;
		}
	}
	System.out.println("el numero de focos verdes es: "+conteo_verde);
	System.out.println("el numero de focos blancos es: "+conteo_blanco);
	System.out.println("el numero de focos rojos es: "+conteo_rojos);

    }
    
}
