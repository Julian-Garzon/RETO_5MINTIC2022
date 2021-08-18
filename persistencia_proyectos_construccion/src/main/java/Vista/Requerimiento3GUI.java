package Vista;

import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame; //tablas 
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Image;




public class Requerimiento3GUI extends JFrame  {
                                           //hereda de una clase abstracta



    //public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
    
    //atributos de la interfaz
    // JButton btnRequerimiento1;
    // JButton btnRequerimiento2;
    // JButton btnRequerimiento3;

    private JTable jtTablaRequerimiento3;
    
    

    public Requerimiento3GUI(ArrayList<Requerimiento_3> requerimiento_3s, ElControladorDeRequerimientos controlador){
        //TITULO
        super.setTitle("Requerimiento  3 !!"); //titulo de la tabla
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //CUNADO LE DEN CLICK EN EL BOTON X SE CIERRA
        Image icon = new ImageIcon(getClass().getResource("/img/compania.png")).getImage();
        setIconImage(icon);
        String[] encabezados = {"Proveedor", "Pagado", "Constructora"};
        jtTablaRequerimiento3 = new JTable(
                                     this.formatorequerimiento3(requerimiento_3s, encabezados.length),
                                     encabezados
                                     );
                               
        
        JScrollPane sp = new JScrollPane(jtTablaRequerimiento3);
        JPanel panel = new JPanel();
        panel.add(sp);
        panel.setBorder(new TitledBorder("REquerimiento_3!!!!"));
        getContentPane().add(panel); //incorporar tabla
        
        
        //propiedades de la ventana
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);


    
}

     public String[][] formatorequerimiento3(ArrayList<Requerimiento_3> requerimiento_3s , int numeroColumnas){
         //contenedor de los registros 
         String[][] registros = new String[requerimiento_3s.size()][numeroColumnas];
         //desempaquetar la coleccion de objetos que llegan

         for (int i = 0; i < registros.length; i++) {
             //Desempaqutar en una fila cada uno
             registros[i][0] = requerimiento_3s.get(i).getProveedor();
             registros[i][1] = requerimiento_3s.get(i).getPagado();
             registros[i][2] = requerimiento_3s.get(i).getConstructora();
             //registros[i][4] = String.valueOf(requerimiento_3s.get(i).getSalario());//conversion entero
             //registros[i][4] = requerimiento_2s.get(i).getSalario();
            //registros[i][4] = String.valueOf(requerimiento_2s.get(i).getSalario()); //para enteros

         }
         //retornar registros en formato convencional
         return registros;
     }

  


}
