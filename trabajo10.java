import javax.swing.JOptionPane;

public class trabajo10{
public static void main(String[] arg){
        int a,x,p,s=0;
        a=Integer.parseInt(JOptionPane.showInputDialog("digite el numero total de alumnos en el salon: "));
        for (int i=1;i<=a;i++){
            x=Integer.parseInt(JOptionPane.showInputDialog("digite la edad del alumno:["+i+"]="));
            s=s+x;
        }
        p=s/a;
        JOptionPane.showMessageDialog(null, "el promedio de edades es: "+p);
    }    
}
