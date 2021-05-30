import javax.swing.JOptionPane;
public class trabajo17 {
    public static void main(String[]args){
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el un numero para mostrar la tabla de multiplicar"));
        JOptionPane.showMessageDialog(null, "tabla del"+n);
        for(int i=1;i<=10;i++){
            JOptionPane.showMessageDialog(null,n+"*"+i+"="+n*i);

        }
    }

    
}
