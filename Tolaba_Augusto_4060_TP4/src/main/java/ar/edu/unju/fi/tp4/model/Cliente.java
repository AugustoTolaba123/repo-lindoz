package ar.edu.unju.fi.tp4.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component("clienteObj")
public class Cliente {
	
	private String tipoDocumento;
	private int dni;
	private String nombreApellido;
	private String email;
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	private int edad;
	private int codigoAreaTelefono;
	private int nroTelefono;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaUltimaCompra;
	public Cliente() {
		super();
	}
	public Cliente(String tipoDocumento, int dni, String nombreApellido, String email, String password,
			LocalDate fechaNacimiento, int edad, int codigoAreaTelefono, int nroTelefono, LocalDate fechaUltimaCompra) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.dni = dni;
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.codigoAreaTelefono = codigoAreaTelefono;
		this.nroTelefono = nroTelefono;
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCodigoAreaTelefono() {
		return codigoAreaTelefono;
	}
	public void setCodigoAreaTelefono(int codigoAreaTelefono) {
		this.codigoAreaTelefono = codigoAreaTelefono;
	}
	public int getNroTelefono() {
		return nroTelefono;
	}
	public void setNroTelefono(int nroTelefono) {
		this.nroTelefono = nroTelefono;
	}
	public LocalDate getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}
	public void setFechaUltimaCompra(LocalDate fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	@Override
	public String toString() {
		return "Cliente [tipoDocumento=" + tipoDocumento + ", dni=" + dni + ", nombreApellido=" + nombreApellido
				+ ", email=" + email + ", password=" + password + ", fechaNacimiento=" + fechaNacimiento + ", edad="
				+ edad + ", codigoAreaTelefono=" + codigoAreaTelefono + ", nroTelefono=" + nroTelefono
				+ ", fechaUltimaCompra=" + fechaUltimaCompra + "]";
	}
	

	public String getEdadd() {
		int edad=0;
		
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento,hoy);
		edad = periodo.getYears();
		
		String pe=edad+" A??os";
		return pe;
		
	}
	public String cambioMay() {
		String pe;
		pe=this.nombreApellido.toUpperCase();
		
		return pe;
	}
	
public String getTUltimaCompra() {
		
		String text="";
		LocalDate hoy = LocalDate.now();
		
		LocalDate TInicioCarrera = LocalDate.of(this.fechaUltimaCompra.getYear(),this.fechaUltimaCompra.getMonth(),this.fechaUltimaCompra.getDayOfMonth());
		Period periodo = Period.between(TInicioCarrera,hoy);
		text= " A??o: " + periodo.getYears() + " Mes: " + periodo.getMonths() + " Dia: " + periodo.getDays();
		
	return text;
	}
	public long TiempoEnDias() {	
	  int anio;
	  int mes;
	  int dia;
	  
	  anio=this.fechaNacimiento.getYear();
	  mes=this.fechaNacimiento.getMonthValue();
	  dia=this.fechaNacimiento.getDayOfMonth();
	  
	  System.out.println(anio);
	  System.out.println(mes);
	  System.out.println(dia);
	  Calendar timee = Calendar.getInstance();
	  
	  timee.set(anio,mes,dia);
Calendar hoy = Calendar.getInstance();
		long milisegundos = hoy.getTimeInMillis() - timee.getTimeInMillis();
		long dias = milisegundos/1000/60/60/24;
		
	     return  dias;
		
	
	
	}
	
	
	public String Thastacumple() {
		String text="";
		LocalDate hoy = LocalDate.now();
		
		int varanio;
		if(hoy.getMonthValue() < this.fechaNacimiento.getMonthValue()){
			varanio= hoy.getYear();
		}else
	      {
			varanio=hoy.getYear()+1;
	      }
		
		
		LocalDate fechaProxCumple = LocalDate.of(varanio,this.fechaNacimiento.getMonth(),this.fechaNacimiento.getDayOfMonth());
		Period periodo = Period.between(hoy, fechaProxCumple);
		text= " A??o: " + periodo.getYears() + " Mes: " + periodo.getMonths() + " Dia: " + periodo.getDays();
		
		LocalDateTime ahora = LocalDateTime.now();
		LocalDateTime fechaHoraProxCumple = LocalDateTime.of(varanio, this.fechaNacimiento.getMonth(),this.fechaNacimiento.getDayOfMonth(),0,0,0);
		
		Duration duracion = Duration.between(ahora, fechaHoraProxCumple);
		
		
		
	text= text + " Hora: " + duracion.toHoursPart()+ " Min: " + duracion.toMinutesPart() + " Seg: " + duracion.toSecondsPart();	
	
	return text;	
	}







}
