package joption;

import javax.swing.JOptionPane;

public class JOption {
    //import javax.swing.JOptionPane;
    //Con JOption no se crea nada, solo se importa

    public static void MostrarMensajeEIntroducirValor() {
        //Para mostrar mensaje e introducir valor a la vez:
        String nombre = JOptionPane.showInputDialog("Introduce tu apellido: ");
    }
    
    public static void SoloMostrarMensaje() {        
        //Para solo mostrar texto o variables
        JOptionPane.showMessageDialog(null, "Texto ");
    }
    
    public static void MensajeConBotonesAElejir() {
    String[] opcionesPago = {"Tarjeta de crédito", "Pago en efectivo"};
    int metodoPago = JOptionPane.showOptionDialog(null, "Has seleccionado: " + "producto" + "\n"
            + "Selecciona el metodo de pago", 
        "Metodo de pago", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesPago, opcionesPago[0]);
    }
}
