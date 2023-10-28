/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal1.pkg3;
import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
public class ProyectoFinal13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String lecture, modulo_1, modulo_2, modulo_3, modulo_4;
        int userMenu;
        
        Catalogos catalog = new Catalogos();
        
        lecture = JOptionPane.showInputDialog("Bienvenido a la programa, elija un de las opciones:" + "\n" + " 1- Configuracion del sistema."
        + "\n" + " 2- Configuracion visual " + "\n" +" 3 - Preload ");
        userMenu = Integer.parseInt(lecture);
        
        switch (userMenu) {
            /**
             * caso 1 es el registro de todos los sistemas.
             */
            
            case 1:
                JOptionPane.showMessageDialog(null,"Bienvenido al sistema. ");
                catalog.setChoose(userMenu);
                
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Bienvenido al sistema de UI.");
                
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Hoy es Miercoles");
                
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Hoy es Jueves");
                
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Hoy es Viernes");
                
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Hoy es Sabado");
                
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Hoy es Domingo");
                
                break;
                
        }
        
    }
    
}
