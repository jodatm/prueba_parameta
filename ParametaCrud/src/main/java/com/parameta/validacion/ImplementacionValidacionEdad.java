package com.parameta.validacion;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.parameta.modelos.Empleado;

public class ImplementacionValidacionEdad implements ConstraintValidator<ValidacionEdad, Date> {	

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		LocalDate l = Instant.ofEpochMilli( value.getTime() )
				.atZone( ZoneId.systemDefault() )
				.toLocalDate();		
		Period p = Period.between(l, LocalDate.now());		
		return p.getYears()> 18;
	}

	@Override
	public void initialize(ValidacionEdad validacion) {
		
	}
	
	
}
