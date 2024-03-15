package examenpractico;

import java.util.HashMap;
import java.util.Scanner;


public class Arma implements FortniteManager{

    public String nombre;
    public String tipo;
    public int daño;
    
    
//Getter tipo de arma
    public String getTipo() {
        return tipo;
    }
//Setter tipo de arma 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//Getter daño del arma
    public int getDaño() {
        return daño;
    }
//Setter daño del arma
    public void setDaño(int daño) {
        this.daño = daño;
    }

    HashMap<String, int> Armap = new HashMap<>();
    
    public void agregarArma() {
        System.out.println("Inserte el tipo de Arma,el nombre y el daño de esta");
        Scanner sc = new Scanner(System.in);
        Armap.putAll(sc.next(tipo),sc.next(nombre),sc.nextInt(daño));
        
    }
    


    @Override
    public void buscarArmaPorTipo(String tipo) {
        System.out.println("\nArma por tipo: $" + Armap.get(nombre));
    }


    @Override
    public void eliminarArma(String tipo) {
        System.out.println("Inserte el tipo y daño de el Arma que desea eliminar");
        Scanner sc = new Scanner(System.in);
       Armap.remove(sc.next(),sc.nextInt());
    }
    
    
}
