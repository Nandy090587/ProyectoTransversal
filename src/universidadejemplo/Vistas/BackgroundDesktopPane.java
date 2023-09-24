
package universidadejemplo.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;


public class BackgroundDesktopPane extends JDesktopPane {
   
    private Image imagen;

    public BackgroundDesktopPane(String imagePath) {
        // Carga la imagen de fondo desde un archivo de imagen
        imagen = new ImageIcon(getClass().
                getResource("/universidadejemplo/Recursos/alumnoB.png")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}