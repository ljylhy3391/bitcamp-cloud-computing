package bitcamp.pms.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  //RUNTIME - 실행중에 애노테이션을 쓸수 있다  
public @interface RequestMapping {
    String value() default "";

}
