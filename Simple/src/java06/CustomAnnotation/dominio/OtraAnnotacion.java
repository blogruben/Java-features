package java06.CustomAnnotation.dominio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OtraAnnotacion {
	int veces();//se comporta como un campo aunque sea una funcion
	            //only primitive type, String, Class, annotation, enumeration
	int[] algo();
	boolean algo1();
	String algo2();
	Class<Persona> algo3();
	int algo4() default 1;
	
}
