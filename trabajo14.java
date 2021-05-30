import javax.swing.JOptionPane;

public class trabajo14 {
    public static void main(String[] args) {
        double nota,n;
        int aprobados = 0, reprobados = 0;
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el total de alumnos evaluados: "));
        
        for (int i = 1; i <= n; i++){
            nota=Integer.parseInt(JOptionPane.showInputDialog("Nota del alumno No. " + (i) + " (1-20): "));
            
            if ((nota >= 0) && (nota < 11)){
                reprobados++;
            }else if ((nota >= 11) && (nota <=20)){ 
                aprobados++;

        }
    }
        
        JOptionPane.showMessageDialog(null, "\nAlumnos reprobados: " + reprobados);
        JOptionPane.showMessageDialog(null,"Alumnos aprobados: " + aprobados);
}
}
