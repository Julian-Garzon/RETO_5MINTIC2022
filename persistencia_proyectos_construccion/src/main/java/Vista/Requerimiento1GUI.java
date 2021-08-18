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



public class Requerimiento1GUI extends JFrame  {
                                           //hereda de una clase abstracta



    //public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
    
    //atributos de la interfaz
    // JButton btnRequerimiento1;
    // JButton btnRequerimiento2;
    // JButton btnRequerimiento3;

    private JTable jtTablaRequerimiento1;
    
    

    public Requerimiento1GUI(ArrayList<Requerimiento_1> requerimiento_1s, ElControladorDeRequerimientos controlador){
        //TITULO
        super.setTitle("Requerimiento 1 !!"); //titulo de la tabla
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //CUANDO LE DEN CLICK EN EL BOTON X SE CIERRA
        String[] encabezados = {"Ciudad", "Acabados", "Clasificacion", "Banco_VInculado","Constructora"};
        jtTablaRequerimiento1 = new JTable(
                                     this.formatoquerimiento1(requerimiento_1s, encabezados.length),
                                     encabezados
                                     );
                               
        
        JScrollPane sp = new JScrollPane(jtTablaRequerimiento1);
        JPanel panel = new JPanel();
        panel.add(sp);
        getContentPane().add(panel); //incorporar tabla
        
        
        //propiedades de la ventana
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);


    
}

     public String[][] formatoquerimiento1(ArrayList<Requerimiento_1> requerimiento_1s , int numeroColumnas){
         //contenedor de los registros 
         String[][] registros = new String[requerimiento_1s.size()][numeroColumnas];
         //desempaquetar la coleccion de objetos que llegan

         for (int i = 0; i < registros.length; i++) {
             //Desempaqutar en una fila cada uno
             registros[i][0] = requerimiento_1s.get(i).getCiudad();
             registros[i][1] = requerimiento_1s.get(i).getAcabados();
             registros[i][2] = requerimiento_1s.get(i).getClasificacion();
             registros[i][3] = requerimiento_1s.get(i).getBanco_Vinculado();
             registros[i][4] = requerimiento_1s.get(i).getConstructora();
           //  registros[i][4] = String.valueOf(requerimiento_1s.get(i).getentero) para enteros

         }
         //retornar registros en formato convencional
         return registros;
     }

  


}
