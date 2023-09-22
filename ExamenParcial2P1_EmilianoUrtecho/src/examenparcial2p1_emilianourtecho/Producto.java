package examenparcial2p1_emilianourtecho;

public class Producto {
    private int ID;
    private int cant;
    private String nombre;
    private double PrecioUnitario;
    private boolean Estado;
    
    public Producto (int cant, String nombre, double PrecioUnitario){
        this.ID = ID;
        this.cant = cant;
        this.nombre = nombre;
        this.PrecioUnitario = PrecioUnitario;
        this.Estado = Estado;
    }
    
    //GET
    public int ProductoID(){
        return ID;
    }
    
    public int cantidad (){
        return cant;
    }
    
    public String getNombre(){
        return nombre;
    }

    
    public double getPrecioUnitario(){ //PrecioUnitario
        return PrecioUnitario;
    }
    
    public boolean Estados (){
        return Estado;
    }
    public void agotado(){
        Estado = false;
    }
    public void disponible(){
        Estado = true;
    }
}
