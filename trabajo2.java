import javax.swing.JOptionPane;
public class trabajo2 {
    public static void main(String[]args){
        char l;
        int t;
        double hst,hdt,htt,hsc,hdc,htc;
        hst=20+1;
        hdt=25+1.25;
        htt=28+1.4;
        hsc=20;
        hdc=25;
        htc=28;
        l=JOptionPane.showInputDialog("S.-Hamburguesa simple\nD.-Hamburguesa doble\nT.-Hamburguesa triple\ndigite el tipo de hamburguesa segun la letra mayuscula: : ").charAt(0);
        if (l=='S'){
            JOptionPane.showMessageDialog(null,"usted selecciono el tipo de hamburguesa simple");
        }else if (l=='D'){
                JOptionPane.showMessageDialog(null,"usted selecciono el tipo de hamburguesa doble");
            }
            else if (l=='T'){
                JOptionPane.showMessageDialog(null,"usted selecciono el tipo de hamburguesa triple");
            }
            t=Integer.parseInt(JOptionPane.showInputDialog("seleccione el metodo de pago\n1.-Targeta\n2.-Contado"));
            if (t==1 && l=='S' ){
            JOptionPane.showMessageDialog(null,"hamburguesa simple (metodo de pago con targeta, con un cargo del %5)\n su costo es :"+hst);
            }else if (t==1 && l=='D' ){
               
                JOptionPane.showMessageDialog(null,"hamburguesa doble (metodo de pago con targeta, con un cargo del %5)\n su costo es :"+hdt);
               }else if (t==1 && l=='T' ){
                        JOptionPane.showMessageDialog(null,"hamburguesa triple (metodo de pago con targeta, con un cargo del %5)\n su costo es :"+htt);
        
                    }
                    if (t==2 && l=='S' ){
                        JOptionPane.showMessageDialog(null,"hamburguesa simple (metodo de pago al contado)\n su costo es :"+hsc);
                        }else if (t==2 && l=='D' ){
                           
                            JOptionPane.showMessageDialog(null,"hamburguesa doble (metodo de pago al contado)\n su costo es :"+hdc);
                           }else if (t==2 && l=='T' ){
                                    JOptionPane.showMessageDialog(null,"hamburguesa triple (metodo de pago al contado)\n su costo es :"+htc);
                    
                                }
                                JOptionPane.showMessageDialog(null, "gracias por su compra, vuelva pronto");
        
        }
    }