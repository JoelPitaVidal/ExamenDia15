package examenpractico;

import java.util.HashMap;
import java.util.Scanner;


public class Skin implements FortniteManager{
    
    private String Nombre;
    private String Rareza;
    
    
//Getter nombre de la Skin
    public String getNombre() {
        return Nombre;
    }
//Setter nombre de la Skin
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
//Getrer rareza de la Skin
    public String getRareza() {
        return Rareza;
    }
//Setter rareza de la skin
    public void setRareza(String Rareza) {
        this.Rareza = Rareza;
    }

    HashMap<String, String> Skinp = new HashMap<>();

    @Override
    public void agregarSkin(Skin skin) {
        System.out.println("Inserte el tipo de Arma,el nombre y el daño de esta");
        Scanner sc = new Scanner(System.in);
        Skinp.putAll(sc.next(Nombre),sc.next(Rareza));    
    }



    @Override
    public void buscarSkinsPorRareza(String tipo) {
        System.out.println("\nSkin por tipo " + Skinp.get(Rareza));
    }


    @Override
    public void eliminarSkin(String nombre) {
        System.out.println("Inserte el nombre de la skin a eliminar");
        Scanner sc = new Scanner(System.in);
        Skinp.remove(sc.next(Nombre));
    }
    
    
            
}
