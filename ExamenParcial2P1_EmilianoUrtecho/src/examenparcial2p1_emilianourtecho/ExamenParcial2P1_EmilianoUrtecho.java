
package examenparcial2p1_emilianourtecho;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamenParcial2P1_EmilianoUrtecho {
    
    static ArrayList <Producto> productos = new ArrayList<>();
    static Scanner escan = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Cosas por hacer: ");
        System.out.println("    1. Agregar Productos");
        System.out.println("    2. Buscar productos");
        System.out.println("    3. Listar todos los productos");
        System.out.println("    4. SALIR");
        System.out.print("Elija usted: ");
        byte eleccion = escan.nextByte();
        
        do {
            switch(eleccion){
                case 1://AGREGAR productos
                    
                    AgregarProducto();
                    
                    break;
                case 2://BUSCAR productos
                    
                    System.out.println("        Elija una forma de buscar su producto - ");
                    System.out.println("            1. Nombre del producto");
                    System.out.println("            2. Codigo del producto");
                    System.out.println("            3. SALIR");
                    System.out.print("        Vuelva a elegir: ");
                    byte eleccion2 = escan.nextByte();
                    
                    do {
                        switch(eleccion2){
                            case 1://NOMBRE DEL PRODUCTO
                                
                                BuscarNombre();
                                
                                break;
                            case 2://CODIGO DE PRODUCTO
                                
                                BuscarID();
                                
                                break;
                            case 3://SALIR
                                System.out.println("Si desea salir, vuelva a presionar la tecla de SALIR");
                                break;
                            default://NO SE
                                System.out.println("Elija una de las opciones por favor");
                                break;
                        }
                        
                        System.out.println("        Elija una forma de buscar su producto - ");
                        System.out.println("            1. Nombre del producto");
                        System.out.println("            2. Codigo del producto");
                        System.out.println("            3. SALIR");
                        System.out.print("        Vuelva a elegir: ");
                        eleccion2 = escan.nextByte();                        
                        
                    } while (eleccion2 != 3);
                    
                    break;
                    
                case 3://LISTAR todos los productos
                    
                    ListarProductos();
                    
                    break;
                    
                case 4://SALIR
                    
                    System.out.println("Si desea salir vuelva a presionar la tecla de salida.");
                    
                    break;
                    
                default://NO SE
                    
                    System.out.println("No puedo leer eso, elija una opcion valida por favor");
                    
                    break;
            }
            
            System.out.println("Cosas por hacer: ");
            System.out.println("    1. Agregar Productos");
            System.out.println("    2. Buscar productos por nombre o por codigo de producto");
            System.out.println("    3. Listar todos los productos");
            System.out.println("    4. SALIR");
            System.out.print("Elija usted: ");
            eleccion = escan.nextByte();
            
        } while (eleccion != 4);
        
    }
    
    public static void AgregarProducto(){
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = escan.nextLine();
        nombre = escan.nextLine();
        
        System.out.print("Ingrese la cantidad que hay en el almacen: ");
        int cantidad = escan.nextInt();
        
        System.out.print("Ingrese el precio del '"+nombre+ "': ");
        double precio = escan.nextDouble();
        
        Producto producto = new Producto(cantidad, nombre, precio);
        productos.add(producto);
        
        System.out.println("ID del producto: "+producto.ProductoID());
        System.out.println("El producto se ha ingresado con exito");
        
    }
    
    public static void BuscarNombre(){
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = escan.nextLine();
        nombre = escan.nextLine();
        
        boolean estado = false;
        
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Se ha encontrado el producto!!");
                estado = true;
                break;
            }
        }
        if (!estado) {
            System.out.println("Lo siento, pero no se ha encontrado el producto ("+nombre+")");
        }
    }
    
    public static void BuscarID(){
        System.out.println("Ingrese el ID del producto: ");
        int ID = escan.nextInt();
        
        boolean estado = false;
        
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.ProductoID() == ID) {
                System.out.println("Se ha encontrado el producto!!");
                estado = true;
                break;
            }
        }
        if (!estado) {
            System.out.println("Lo siento, pero no se ha encontrado el producto");
        }
    }
    
    public static void ListarProductos(){
        if (productos.isEmpty()) {
            System.out.println("No hay productos");
        }else{
            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
                System.out.println("- "+producto);
            }
        }
    }
}