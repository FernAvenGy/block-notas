import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javafx.stage.WindowEvent;

public class BlockNotas extends JFrame{

    private TextArea textArea;
    private JMenuBar jmenuBar;
    private JMenu archivo;
    private JMenuItem nuevo, abrir, abrirReciente, guardar;
    private JMenuItem guardarComo, salir, impirmir;

    private class CW extends WindowAdapter {
        public void windowClosing(WindowEvent event) {
            setVisible(false);
            dispose();
        }
    }
    

    private void crearMenuArchivo(){
        archivo = new JMenu();
        archivo.setMnemonic('A');
        archivo.setText("Archivo");

        nuevo = new JMenuItem();
        nuevo.setMnemonic('N');
        nuevo.setText("Nuevo");

        abrir = new JMenuItem();
        abrir.setMnemonic('B');
        abrir.setText("Abrir");

        abrirReciente = new JMenuItem();
        abrirReciente.setMnemonic('C');
        abrirReciente.setText("Abrir reciente");

        guardar = new JMenuItem();
        guardar.setMnemonic('G');
        guardar.setText("Guardar");

        guardarComo = new JMenuItem();
        guardarComo.setMnemonic('E');
        guardarComo.setText("Guardar como");

        impirmir = new JMenuItem();
        impirmir.setMnemonic('I');
        impirmir.setText("Imprimir");

        salir = new JMenuItem();
        salir.setMnemonic('S');
        salir.setText("Salir");

        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(abrirReciente);
        archivo.addSeparator();
        archivo.add(guardar);
        archivo.add(guardarComo);
        archivo.addSeparator();
        archivo.add(impirmir);
        archivo.addSeparator();
        archivo.add(salir);

    }

    public BlockNotas(){
        super("Block de Notas");
        addWindowListener(new CW() );
        setVisible(true);
        setSize(500, 500);
        textArea = new TextArea();
        add(textArea, "Center");

        crearMenuArchivo();
        jmenuBar.add(archivo);
        setJMenuBar(jmenuBar);
    

    }

    public static void main(String[] args) {
        BlockNotas blockNotas = new BlockNotas();
    }
}
