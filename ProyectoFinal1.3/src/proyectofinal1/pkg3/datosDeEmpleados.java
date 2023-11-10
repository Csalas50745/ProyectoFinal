/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal1.pkg3;

/**
 *
 * @author charliesalas
 */
public class datosDeEmpleados {
    
        public datosDeEmpleados(String name, String last_name, int iD, int schdule) {
        this.name = name;
        this.last_name = last_name;
        this.iD = iD;
        this.schdule = schdule;
        
    }

String name, last_name;
int iD, schdule;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getSchdule() {
        return schdule;
    }

    public void setSchdule(int schdule) {
        this.schdule = schdule;
    }


}
