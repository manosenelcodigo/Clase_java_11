
package graficas;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Eventos_de_Ventana implements WindowListener 
{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("la ventana está abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("la ventana se ha cerrando");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("la ventana se ha cerrado");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("la ventana se ha minimizado");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("la ventana se ha maximizado");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("la ventana se ha activado");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("la ventana se ha desactivado");
    }
    
}
