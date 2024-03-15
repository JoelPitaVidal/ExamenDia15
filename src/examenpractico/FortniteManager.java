package examenpractico;


public interface FortniteManager{
     
//metodo para añadir un arma
    public void agregarArma (Arma arma);
  
//metodo para añadir una skin
     public void agregarSkin (Skin skin);
     
//metodo para buscar un arma por tipo y mostrar su información
     public void buscarArmaPorTipo(String tipo);
 
//metodo para mostrar todas las Skins del inventario con una rareza específica
     public void buscarSkinsPorRareza(String tipo);
     
//metodo para eliminar un arma del inventario por tipo
     public void eliminarArma(String tipo);
//metodo para eliminar una Skin del inventario por nombre
     public void eliminarSkin(String nombre);
}
