package java16.record.dominio;

//Es igual que la clase Empleado
//los atributos son final, es decir la clase es inmutable por defecto
//y no usamos Trabajador.getName sino Trabajador.name


public record EmpleadoRecord(String nombre, int numero) {

//No tenemos que definir ningun constructor 
//se genera por defector el contructor 
//los getters toString codehash




}
