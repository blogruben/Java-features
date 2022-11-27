package java06.CustomAnnotation.dominio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunImmediately {
	int veces();//se comporta como un campo aunque sea una funcion
	            //only primitive type, String, Class, annotation, enumeration
	
}
