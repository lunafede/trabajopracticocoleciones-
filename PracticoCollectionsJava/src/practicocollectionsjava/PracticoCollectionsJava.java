/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocollectionsjava;
import java.util.*;
/**
 *
 * @fefe Usuario
 */
public class PracticoCollectionsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayList<alumnos> Tipoalumnos = new ArrayList<>();
        //Set <alumnos> Tipoalumnos=new HashSet<alumnos>();
        //LinkedList<alumnos> Tipoalumnos = new LinkedList<>();
        
        
//        alumnos AL1= new alumnos ("carlos ", "ELSI444", 24);
//        alumnos AL2= new alumnos ("Emanuel", "21", 28);
//        
//        
//        
//        Tipoalumnos.add(AL1);
//        Tipoalumnos.add(AL2);
        
        
//        for (alumnos obj : Tipoalumnos)
//        System.out.println(obj.getNombre());
        
        
//        for ( alumnos : Tipoalumnos) {
//
//            System.out.println(alumnos.getNombre()+ " " + alumnos.getmatricula() + " "
//            + alumnos.getEdad());
//            
//        }
        
//        System.out.println(Tipoalumnos);
//        
//        ListIterator<alumnos> ite = Tipoalumnos.listIterator(); 
//        
//        ite.next();
//        ite.add(AL2);
//        Tipoalumnos.forEach(obj -> System.out.println(obj));
        
        
        Set<alumnos> players = new TreeSet<>(Comparator.reverseOrder());
        
        alumnos AL1= new alumnos ("oso vreys", "ELSI528", 24);
        alumnos AL2= new alumnos ("charly godoy", "ELSI001", 42);
        
        players.add(AL1);
        players.add(AL2);
        
        players.forEach(obj -> System.out.print(obj));
        
    }
    
    }
    

