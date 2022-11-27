package java06.CustomAnnotation.dominio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//solo se puede anotar la case y el metodo
@Target({ElementType.TYPE, ElementType.METHOD})
//runtime - mantener las anotation durante la ejecucion normalmente se usa
//source - las anotaciones se quitan cuando se compila por ejemplo suprewarning
//class - se compila pero no se procesa en ejecutar
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {

}
