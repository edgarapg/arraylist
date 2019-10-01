package labcoleccion;

public class Producto implements Comparable<Producto>{
private  String nombre; 
private  int cantidad; 

//constructor de la clase producto

public Producto(String s, int i) { 
nombre = s; 
cantidad = i; 
                                 } 
//método de la clase object
    @Override 
    public String toString(){ 
return ("Nombre: "+nombre+" Cantidad: "+cantidad); 
} 

//métodos de encapsulamiento
public String getNombre() { 
return this.nombre; 
} 
public int getCantidad() { 
return this.cantidad; 
}

@Override
public int compareTo(Producto p){
   if(p.getCantidad()>cantidad){
       return -1;
   }else if(p.getCantidad()>cantidad){
  return 0;
   }else{
     return -1;  
   }
  
}
}
