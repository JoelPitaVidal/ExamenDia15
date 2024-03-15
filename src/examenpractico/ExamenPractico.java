package examenpractico;


public class ExamenPractico {

    
    public static void main(String[] args) {
        Arma newar = new Arma();
        Skin newes = new Skin();
        
        int opcion=1;
        
        System.out.println("Escoja la opción deseada:\n2: Agregar Arma\n3:Agregar Skin"
                + "\n4:Buscar Arma por tipo\n5:Mostrar las Skins\n6:Eliminar un Arma"
                + "\n7: Eliminar una Skin\8:Salir");
        switch (opcion){
            case 2:
                newar.agregarArma();
                break;
            case 3:
                newes.agregarSkin();
                break;
             case 4:
                newar.buscarArmaPorTipo(tipo);
                break;
            case 5:
            
                break;
            case 6:
            
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            
        }
        
    }
    
}
