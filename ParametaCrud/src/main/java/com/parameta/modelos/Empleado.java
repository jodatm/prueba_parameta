package com.parameta.modelos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.lang.NonNull;

import com.parameta.validacion.ValidacionEdad;

@Entity
@Table(name="Empleado", catalog="parameta", schema="")
@IdClass(EmpleadoCompositeKey.class)
public class Empleado {

	@Id
	@Column(name="`Tipo De Documento`")	
	@NotEmpty(message = "El campo Tipo de Documento no puede ser vacio")
	private String tipo_documento;
	
	@Id
	@Column(name="`Número de Documento`")
	@NotEmpty(message = "El campo Número de documento no puede ser vacio")
	private String numero_documento;
	
	@Column
	@NotEmpty(message = "El campo Nombres no puede ser vacio")
	private String Nombres;
	
	@Column
	@NotEmpty(message = "El campo Apellidos no puede ser vacio")
	private String Apellidos;
	
	@Column(name="`Fecha de Nacimiento`")
	@NotNull(message = "El campo Fecha de Nacimiento no puede ser vacio")
	@ValidacionEdad()
	private Date fecha_nacimiento;
	
	@Column(name="`Fecha de Vinculación a la Compañia`")
	@NotNull(message = "El campo Fecha de Vinculación a la Compañia no puede ser vacio")
	private Date fecha_vinculacion;
	
	@Column
	@NotEmpty(message = "El campo Cargo no puede ser vacio")
	private String Cargo;
	
	@Column
	@NotNull(message = "El campo Salario no puede ser vacio")
	private Double Salario;
	
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Date getFecha_vinculacion() {
		return fecha_vinculacion;
	}
	public void setFecha_vinculacion(Date fecha_vinculacion) {
		this.fecha_vinculacion = fecha_vinculacion;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	public String getEdadEmpleado() {
		LocalDate l = Instant.ofEpochMilli( getFecha_nacimiento().getTime() )
				.atZone( ZoneId.systemDefault() )
				.toLocalDate();		
		Period p = Period.between(l, LocalDate.now());	
		return p.getYears() + " años " + p.getMonths() + " meses y " + p.getDays() + " días";
	}
	
	public String getTiempoVinculacion() {
		LocalDate l = Instant.ofEpochMilli( getFecha_vinculacion().getTime() )
				.atZone( ZoneId.systemDefault() )
				.toLocalDate();		
		Period p = Period.between(l, LocalDate.now());	
		return p.getYears() + " años y " + p.getMonths() + " meses ";
	}
	
}
