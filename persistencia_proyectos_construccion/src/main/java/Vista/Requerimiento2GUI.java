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




public class Requerimiento2GUI extends JFrame  {
                                           //hereda de una clase abstracta



    //public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
    
    //atributos de la interfaz
    // JButton btnRequerimiento1;
    // JButton btnRequerimiento2;
    // JButton btnRequerimiento3;

    private JTable jtTablaRequerimiento2;
    
    

    public Requerimiento2GUI(ArrayList<Requerimiento_2> requerimiento_2s, ElControladorDeRequerimientos controlador){
        //TITULO
        super.setTitle("Requerimiento 2 !!"); //titulo de la tabla
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //CUNADO LE DEN CLICK EN EL BOTON X SE CIERRA
        Image icon = new ImageIcon(getClass().getResource("/img/compania.png")).getImage();
        setIconImage(icon);
        String[] encabezados = {"Nombre", "Primer_Apellido", "Ciudad_Residencia", "Cargo","Salario"};
        jtTablaRequerimiento2 = new JTable(
                                     this.formatorequerimiento2(requerimiento_2s, encabezados.length),
                                     encabezados
                                     );
                               
        
        JScrollPane sp = new JScrollPane(jtTablaRequerimiento2);
        JPanel panel = new JPanel();
        panel.add(sp);
        panel.setBorder(new TitledBorder("REquerimiento_2!!!!"));
        getContentPane().add(panel); //incorporar tabla
        
        
        //propiedades de la ventana
        setSize(500, 250);
        setLocationRelativeTo(null);
        setVisible(true);


    
}

     public String[][] formatorequerimiento2(ArrayList<Requerimiento_2> requerimiento_2s , int numeroColumnas){
         //contenedor de los registros 
         String[][] registros = new String[requerimiento_2s.size()][numeroColumnas];
         //desempaquetar la coleccion de objetos que llegan

         for (int i = 0; i < registros.length; i++) {
             //Desempaqutar en una fila cada uno
             registros[i][0] = requerimiento_2s.get(i).getNombre();
             registros[i][1] = requerimiento_2s.get(i).getPrimer_Apellido();
             registros[i][2] = requerimiento_2s.get(i).getCiudad_Residencia();
             registros[i][3] = requerimiento_2s.get(i).getCargo();
             registros[i][4] = String.valueOf(requerimiento_2s.get(i).getSalario());//conversion entero
             //registros[i][4] = requerimiento_2s.get(i).getSalario();
            //registros[i][4] = String.valueOf(requerimiento_2s.get(i).getSalario()); //para enteros

         }
         //retornar registros en formato convencional
         return registros;
     }

  


}
