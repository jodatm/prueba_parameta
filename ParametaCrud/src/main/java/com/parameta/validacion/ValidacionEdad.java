package com.parameta.validacion;

import javax.validation.Payload;
import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=ImplementacionValidacionEdad.class)
public @interface ValidacionEdad {
	String message() default "El empleado debe ser mayor de edad";
	Class<?>[] groups() default {};
	public abstract Class <? extends Payload> [] payload() default {};
		
}
