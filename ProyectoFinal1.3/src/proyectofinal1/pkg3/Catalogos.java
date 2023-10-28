/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal1.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
class Catalogos {
    
        public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        
        lecture = JOptionPane.showInputDialog("Elija una opcion: " + "\n" + " 1- Gimansio " + "\n" + " 2- Cine " + "\n" +" 3- Clases ");
        choose = Integer.parseInt(lecture);
        
         switch (choose) {
            /**
             * caso 1 es el registro de todos los sistemas.
             */
            
            case 1:
                JOptionPane.showMessageDialog(null," Necio pe ");
                
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Bienvenido al sistema de UI.");
                
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Hoy es Miercoles");
                
                break;
                
        }
         
        this.choose = choose;
    }
    
    String lecture;
    int  choose;
    
    
    
}
