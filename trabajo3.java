import javax.swing.JOptionPane;

public class trabajo3 {
    public static void main(String []args){
		int numero,conteo_ceros=0,conteo_negativos=0,conteo_positivos=0;
		for (int i=1;i<=10;i++){//para no estar haciedno 10 lineas usamos un bucle
		numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
		if(numero==0){//si el numero es 0
			conteo_ceros++;//aumenta el conteo de 0
		}
		else if (numero<0){//si el numero es negativo<0
			conteo_negativos++;
		}
		else if (numero>0){//si el numero es positivos>0
			conteo_positivos++;
		}
	}
	System.out.println("el conteo de ceros digitados es: "+conteo_ceros);
	System.out.println("el conteo de negativos digitados es: "+conteo_negativos);
	System.out.println("el conteo de positivos digitados es: "+conteo_positivos);
}
}

