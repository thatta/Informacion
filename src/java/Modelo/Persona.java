/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 *@author TATIANA ALMANSA
 *@author BRAYAN ALDANA
 */
// atributos del modelo
public class Persona {
    private String nombre;
    private int sueldo;
    private int diasTrabajados;
    private String [] idioma;
    

    public Persona(String nombre, int sueldo, int diasTrabajados, String [] idioma) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.diasTrabajados = diasTrabajados;
        this.idioma= idioma;
        
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

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String []getIdioma() {
        return idioma;
    }

    public void setIdioma(String [] idioma) {
        this.idioma = idioma;
    }
    
    
    //metodo para calcular el saldo total de la persona segun su idioma o dias trabajados segun su sueldo inicial
   public int Total(int Sueldo, int diasTrabajdos, String [] idioma ){
       
       int totalfinal=0;
       if(idioma.length ==0){
           totalfinal = Sueldo * diasTrabajdos;
                   
       } else {
                      totalfinal = Sueldo * diasTrabajdos;
                      for(int i=0; i< idioma.length ;i++){
                          if(idioma[i].equals("ingles")){
                              totalfinal= totalfinal + 100000;
                              
                          }else if(idioma[i].equals("frances")){
                              totalfinal= totalfinal + 150000;
                          }else if(idioma[i].equals("portugues"))
                          {
                              totalfinal= totalfinal + 65000;
                          }else if(idioma[i].equals("italiano")){
                              totalfinal= totalfinal + 25000;
                              
                          }else if(idioma[i].equals("latin")){
                              totalfinal= totalfinal + 45000;
                          }
                          
                      }


       } 
       return totalfinal;
   }
    
    
}
