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
        
        /**
         *  Todos las variables e iniciazciones empiezan en este ciclo
         */
        
        String lecture, modulo_1, modulo_2, modulo_3, modulo_4;
        int userMenu = 0;
        
        datosDeEmpleados arregloDeEmpleados [] = new datosDeEmpleados [1];
        
        lecture = JOptionPane.showInputDialog("Bienvenido a la programa, elija un de las opciones:" + "\n" + " 1- Configuracion del sistema."
        + "\n" + " 2- Configuracion visual " + "\n" +" 3 - Empleados ");
        userMenu = Integer.parseInt(lecture);
        
        switch (userMenu) {
            
            /**
             * caso 1 es el registro de todos los sistemas.
             */
            
            case 1:
                JOptionPane.showMessageDialog(null,"Bienvenido al sistema. ");
                
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Bienvenido al sistema de UI.");
                
                break;
            case 3:
                
                /**
                 * Llamado de la clase Datos de empleado para ingresar el empleado.
                 */
                
                for (int i = 0; i<arregloDeEmpleados.length; i++) {
                
                JOptionPane.showMessageDialog(null,"Empleados");
                
                String name = JOptionPane.showInputDialog("Digite el nombre: ");
                String last_name = JOptionPane.showInputDialog("Digite su apellido: ");
                int iD = Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula: "));
                int schdule = Integer.parseInt(JOptionPane.showInputDialog("Digite el horario: "));
                arregloDeEmpleados[i] = new datosDeEmpleados(name, last_name, iD, schdule); 
                
                }
                
                /**
                 *  Lector de todos los datos ingresados
                 */
                
                for ( int i = 0; i < 4; i++) {
                    
                JOptionPane.showMessageDialog(null, "El nombre del empleado: " + arregloDeEmpleados[i].getName()+ " \n" + "El apellido del empleado: " +
                        arregloDeEmpleados[i].getLast_name()+ " \n" + "El ID del empleado es: " + arregloDeEmpleados[i].getiD()+ " \n"+ "El horario escogido es: " + arregloDeEmpleados[i].getSchdule());
 
                }
      
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
