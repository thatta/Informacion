/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author TATIANA ALMANSA
 * @author BRAYAN ALDANA
 */
@ManagedBean
@RequestScoped
public class ControladorNavegacion  implements Serializable{ //escucha los eventos de algun boton
     //Declara variables de tipo objeto
    private String nombre;
    private int sueldo;
    private int diastrabajados;
    private String [] idioma;
    
    
    Persona persona = new Persona(nombre,sueldo,diastrabajados, idioma);
    /**
     * Creates a new instance of ControladorNavegacion
     */
    
    public ControladorNavegacion()  {
        
    }
    
    // Setter y Getter de las propiedades declaradas
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDiastrabajados() {
        return diastrabajados;
    }

    public void setDiastrabajados(int diastrabajados) {
        this.diastrabajados = diastrabajados;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
     
}
