/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;

/**
 *
 *@author TATIANA ALMANSA
 *@author BRAYAN ALDANA
 */
@ManagedBean
@RequestScoped
public class Mostrar implements Serializable {
    //se llama al @ManagedBean para mostratr los datos que se ingresaron de la persona
    @ManagedProperty("#{controladorNavegacion}")
    
    //atributos del @ManagedBean
    private ControladorNavegacion controlador;
    /**
     * Creates a new instance of Mostrar
     */
    public Mostrar() {
    }
    //Setter y Getter 
    public ControladorNavegacion getControlador() {
        return controlador;
    }

    public void setControlador(ControladorNavegacion controlador) {
        this.controlador = controlador;
    }
    
    //metodo que pinta en el otro formulario la informacion final
    
    public String MostrarInformacion(){
        return "Tu Nombre es:"+controlador.getNombre()+ ","   +
                "Tu sueldo es:"+ controlador.getSueldo()+  ","   +  
                "Tus Dias Trabajados son:" +controlador.getDiastrabajados()+ ","   +
                "Tus idiomas:"+ controlador.getIdioma().length +   ","   +
                "Tu sueldo total es:"+ controlador.getPersona().Total(controlador.getSueldo(), controlador.getDiastrabajados(), controlador.getIdioma());
        
    }
    
}
