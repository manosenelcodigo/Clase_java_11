
package graficas;

import javax.swing.JFrame;

public class Marco extends JFrame {
    
    public void getVentana()
    {
        setBounds(200, 50, 500, 400);
        setVisible(true);
        setTitle("Ventana de #manosenelcódigo");
        
        addWindowListener(new Eventos_de_Ventana_2());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
