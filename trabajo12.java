import javax.swing.JOptionPane;

public class trabajo12 {
    public static void main(String[]args){
       double a,x,s=0;
        a=Integer.parseInt(JOptionPane.showInputDialog("digite el numero total de billetes y monedas: "));
        for (int i=1;i<=a;i++){
            x=Integer.parseInt(JOptionPane.showInputDialog("digite el valor del billete o moneda:["+i+"]="));
            s=s+x;
        }
        JOptionPane.showMessageDialog(null, "el valor total de las monedas es: "+s);
    }
    
}
