import javax.swing.JOptionPane;
public class trabaajo16 {
    public static void main(String [] args){
        double a,b,c;
        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos numeros digitara: "));
        for (int i = 1; i <= a; i++){
            b=Integer.parseInt(JOptionPane.showInputDialog("asigna un valor positivo mayor a 0: "+ (i)));
            c=Math.pow(b,3);
            c++;
        
            JOptionPane.showMessageDialog(null,"los valores dados al cubo son:"+c);
        }
    } 
}   
