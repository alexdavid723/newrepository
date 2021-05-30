import javax.swing.JOptionPane;
public class trabajo20 {
public static void main(String[]args){


 
        double degrees, radians,sinValue;
 
        // Obtain angle in degrees
        String strDegrees = JOptionPane.showInputDialog(null,
                "Introduce los grados del ángulo", "Funciones trigonométricas",
                JOptionPane.QUESTION_MESSAGE);
 
        degrees = Double.parseDouble(strDegrees);
 
       
        radians = Math.toRadians(degrees);
 
        System.out.println("\tFunciones trigonométricas");
        System.out.printf("Grados: %f, Radianes: %f%n", degrees, radians);
 
      
        sinValue = Math.sin(radians);
        System.out.printf("%nSeno: sen(%.2f) = %.2f %n", degrees, sinValue);
}
}

 
       