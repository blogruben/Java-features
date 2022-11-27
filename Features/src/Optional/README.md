# Con nulos (no usar)
 
```Funcion
guardarPersona( String name, String apellido){
	guardarPersona( name, apellido, null);
}

guardarPersona( String name, String apellido, String direcion){
//implementacion
}
```


```Llamar a la funcion
if ( apellido != null ){
	guardarPersona( name, apellido, direcion)
}
else{
	guardarPersona( name, apellido)			
}
```

# Optional
Usar
```
Vemos claramente en que parametros aceptamos nulos

guardarPersona( String name, String apellido, Optional<String> direcion){
//implementacion
}
```