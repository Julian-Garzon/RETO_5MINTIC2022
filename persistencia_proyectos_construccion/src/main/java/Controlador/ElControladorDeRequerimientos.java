package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;

import org.xml.sax.SAXException;

import Modelo.dao.Requerimiento_1Dao;
import Modelo.dao.Requerimiento_2Dao;
import Modelo.dao.Requerimiento_3Dao;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

import Vista.MenuRequerimientosGUI;
import Vista.Requerimiento1GUI;
import Vista.Requerimiento2GUI;
import Vista.Requerimiento3GUI;

import java.awt.event.ActionListener; //eventos
import java.awt.event.ActionEvent;
import javax.swing.JButton;  //libreria botones

import Vista.VistaRequerimientos;




public class ElControladorDeRequerimientos implements ActionListener{

    
    

    //no se pueden modificar final y constantes
    private final Requerimiento_1Dao requerimiento_1Dao;
    private final Requerimiento_2Dao requerimiento_2Dao;
    private final Requerimiento_3Dao requerimiento_3Dao;
    //variable tipo requerimiento_1Dao


    private MenuRequerimientosGUI menuRequerimientosGUI; //se instancia el menurequer en version grafica
    private Requerimiento1GUI requerimiento1gui;
    private Requerimiento2GUI requerimiento2gui;
    private Requerimiento3GUI requerimiento3gui;

    public ElControladorDeRequerimientos(){


        this.requerimiento_1Dao= new Requerimiento_1Dao();
        this.requerimiento_2Dao= new Requerimiento_2Dao();
        this.requerimiento_3Dao= new Requerimiento_3Dao();
        this.menuRequerimientosGUI = new MenuRequerimientosGUI();
        //creando objetos
        
    }
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            return this.requerimiento_1Dao.requerimiento1();
        
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            return this.requerimiento_2Dao.requerimiento2();
        }
    
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            return this.requerimiento_3Dao.requerimiento3();
        } 

        public void inicio(){
        
            this.menuRequerimientosGUI.iniciarGUI();


        }

        @Override
        public void actionPerformed(ActionEvent e) {
          String actionCommand = ((JButton)e.getSource()).getActionCommand();//(recast del objeto)traemos el objeto y miramos que boton fue
           //trae una cadena y segun lo que traiga la cadena hacemos algo
            //caminos segun eventos ocurridos

            switch(actionCommand){  //dependiendo de lo que quedo en la cadena actioncommand

            case "requerimiento_1" :

            //System.out.println("Requerimiento 1 en construccion");
            //ArrayList<Requerimiento_1> requerimiento_1s = new ArrayList<Requerimiento_1>();
            try{
            //VistaRequerimientos.requerimiento1b(this.consultarRequerimiento1()); //para mostrar en consola
            this.requerimiento1gui = new Requerimiento1GUI( this.consultarRequerimiento1(), 
                                      this);
                     //        this es esta clase en la que estamos parados por eso se pone this no mas
           
            }catch(SQLException exception){
               System.err.println("Problemas consultando reque1"+exception);

            }//muetsra por consola para prueba
          
            
            break;
            case "requerimiento_2" :
            //System.out.println("Requerimiento 2 en construccion");
            try{
                //VistaRequerimientos.requerimiento1b(this.consultarRequerimiento1()); //para mostrar en consola
                this.requerimiento2gui = new Requerimiento2GUI( this.consultarRequerimiento2(), 
                                          this);
                         //        this es esta clase en la que estamos parados por eso se pone this no mas
               
                }catch(SQLException exception){
                   System.err.println("Problemas consultando reque2"+exception);
    
                }//muetsra por consola para prueba
              
            break;
            case "requerimiento_3" :
            try{
                //VistaRequerimientos.requerimiento1b(this.consultarRequerimiento1()); //para mostrar en consola
                this.requerimiento3gui = new Requerimiento3GUI( this.consultarRequerimiento3(), 
                                          this);
                         //        this es esta clase en la que estamos parados por eso se pone this no mas
               
                }catch(SQLException exception){
                   System.err.println("Problemas consultando reque3"+exception);
    
                }
            break;

            } 
        
        }

}
