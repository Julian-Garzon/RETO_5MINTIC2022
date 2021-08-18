package Vista;

import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

import javax.swing.JButton;
import javax.swing.JFrame; //tablas 
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;


import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon; //libreria para manejar imagen
import java.awt.Image; //para redimensionar la imagen
import java.awt.Component;
import java.awt.BorderLayout;





public class MenuRequerimientosGUI extends JFrame  {
                                           //hereda de una clase abstracta



    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
    
    //atributos de la interfaz
    private JButton btnRequerimiento1;
    private JButton btnRequerimiento2;
    private JButton btnRequerimiento3;
    private JLabel lJLabel, lJLabel2;
    private JPanel panel, panel2;

    



    //metodo que genere la ventana

    public void iniciarGUI(){

        //TITULO DE LA TABLA 
        setTitle("MENU DE LOS REQUERIMIENTOS"); //TITULO DE LA TABLA
        setDefaultCloseOperation(EXIT_ON_CLOSE); //CUANDO LE DEN CLICK EN EL BOTON X SE CIERRA
        Image icon = new ImageIcon(getClass().getResource("/img/compania.png")).getImage();
        setIconImage(icon);
       setLayout(new BorderLayout());
        
        //INSTANCIAR COMPONENTES Y CREAR BOTONES
        // ImageIcon icono = new ImageIcon("/img/imagen_boton_reque3.png"); //se crea boton con icono y se le manda la ruta por parmetro
        // RUTA RELATIVA!
        // Image img = icono.getImage();
        // icono = new ImageIcon(img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH) ); //redimensionar la imagen 
        btnRequerimiento1 = new JButton(); //se puede enviar imagen al boton
        btnRequerimiento1.setText("primer requerimiento");
        btnRequerimiento1.setFont(new Font("Dialog", Font.PLAIN, 16));
        btnRequerimiento1.addActionListener(controlador);//quien nos escucha? seria el controlador
        btnRequerimiento1.setActionCommand("requerimiento_1");  // que decimos con este boton



          //icono boton
          // ImageIcon icono2 = new ImageIcon("img/imagen_boton_reque3.png"); //se crea boton con icono y se le manda la ruta por parmetro
          // RUTA RELATIVA!
          // Image img2 = icono2.getImage();
          // icono2 = new ImageIcon(img2.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH) ); //redimensionar la imagen 
        btnRequerimiento2 = new JButton(); //se puede enviar imagen
        btnRequerimiento2.setText("segundo requerimiento");
        btnRequerimiento2.setFont(new Font("Dialog", Font.PLAIN, 16));
        btnRequerimiento2.addActionListener(controlador);//quien nos escucha? seria el controlador
        btnRequerimiento2.setActionCommand("requerimiento_2");  // que decimos con este boton

        lJLabel= new JLabel("BIENVENIDO GRUPO 34");
        lJLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        lJLabel.setFont(new Font("Arial", 1, 14));

        lJLabel2 = new JLabel();
        lJLabel2.setIcon(new ImageIcon(getClass().getResource("/img/compania.png")));
        lJLabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        //icono boton
        // ImageIcon icono3 = new ImageIcon("/img/compania.png"); //se crea boton con icono y se le manda la ruta por parmetro
        // RUTA RELATIVA!
        // Image img3 = icono3.getImage();
        // icono3 = new ImageIcon(img3.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH) ); //redimensionar la imagen 
        btnRequerimiento3 = new JButton(); //se puede enviar imagen
        btnRequerimiento3.setText("tercer requerimiento");
        btnRequerimiento3.setFont(new Font("Dialog", Font.PLAIN, 16));
        btnRequerimiento3.addActionListener(controlador);//quien nos escucha? seria el controlador
        btnRequerimiento3.setActionCommand("requerimiento_3");  // que decimos con este boton


        //añadir los componentes a contenedores o contenedores intermedios
       
       
       //contenedor intermedio
        JPanel panel = new JPanel();
       // panel.setLayout(new GridLayout(3,1)); //3 filas 1 columna para que os botones tengan el tamaño de la ventana
        panel.add(btnRequerimiento1);
        panel.add(btnRequerimiento2);
        panel.add(btnRequerimiento3);

        JPanel panel2= new JPanel();
        panel2.add(lJLabel);
        panel2.add(lJLabel2);



       //contenedor intermedio a la ventana
      //  getContentPane().add(panel); //AGRUPO los botones y se los agregamos a la ventana


       //Establecer ultimas propiedades del frame
       getContentPane().add(panel,BorderLayout.CENTER);
       getContentPane().add(panel2,BorderLayout.SOUTH);
       setSize(600,200);
       setLocationRelativeTo(null);
       setVisible(true); //visible

        
        

     }
    
    // public static void requerimiento1(){
        
    //     try {
    //         ArrayList<Requerimiento_1> lista1 = controlador.consultarRequerimiento1();

    //       for (Requerimiento_1 reque : lista1) {
    //           System.out.printf("%s %s %s %s %s %n",
    //           reque.getCiudad(),
    //           reque.getAcabados(),
    //           reque.getClasificacion(),
    //           reque.getBanco_Vinculado(),
    //           reque.getConstructora()
    //           );
    //       }

    //     } catch (Exception e) {
    //         System.err.println("Ha ocurrido un error!"+e.getMessage());
    //     }
    // }

   

    // public static void requerimiento2(){
        
    //     try {
    //         ArrayList<Requerimiento_2> lista2 = controlador.consultarRequerimiento2();
    //         for (Requerimiento_2 reque : lista2) {
    //             System.out.printf("%s %s %s %s %s %n",
    //             reque.getNombre(),
    //             reque.getPrimer_Apellido(),
    //             reque.getCiudad_Residencia(),
    //             reque.getCargo(),
    //             reque.getSalario()
    //             );
    //         }


    //     } catch (Exception e) {
    //         System.err.println("Ha ocurrido un error!"+e.getMessage());
    //     }
    // }

    // public static void requerimiento3(){
    //     try {
    //         ArrayList<Requerimiento_3> lista3 = controlador.consultarRequerimiento3();
    //         for (Requerimiento_3 reque : lista3) {
    //             System.out.printf("%s %s %s %n",
    //             reque.getProveedor(),
    //             reque.getPagado(),
    //             reque.getConstructora()
               
    //             );
    //         }

    //     } catch (Exception e) {
    //         System.err.println("Ha ocurrido un error!"+e.getMessage());
    //     }
    // }
}
