/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocollectionsjava;

import java.util.Objects;

/**
 *
 * @fefe Usuario
 */
public class alumnos implements Comparable<alumnos>{

    public alumnos(String nombre, String matricula, Integer edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }
    
    
    private String nombre;
    
    private String matricula;
    
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getmatricula() {
        return matricula;
    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "alumnos{" + "nombre=" + nombre + ", matricula=" + matricula + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(alumnos o) {
        
        if (this.getEdad() <o.getEdad())
            
            return -1;
        
        else if (this.getEdad() >o.getEdad() )
            
            return 1;
        
        else 
            
            return 0;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.edad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final alumnos other = (alumnos) obj;
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }

     
    

   
    
    
}
