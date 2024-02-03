package es.studium.ADpractica5;

public class Habitacion {
	private String nombreHabitacion;
	private Integer pisoHabitacion;
	private Boolean tieneVentana;
	private Persona persona;
	
	public Habitacion() {
		nombreHabitacion = "";
		pisoHabitacion = 0;
		tieneVentana = false;
		persona = new Persona();
	}

	public Habitacion(String nombreHabitacion, Integer pisoHabitacion, Boolean tieneVentana, Persona persona) {
		this.nombreHabitacion = nombreHabitacion;
		this.pisoHabitacion = pisoHabitacion;
		this.tieneVentana = tieneVentana;
		this.persona = persona;
	}

	public String getNombreHabitacion() {
		return nombreHabitacion;
	}

	public void setNombreHabitacion(String nombreHabitacion) {
		this.nombreHabitacion = nombreHabitacion;
	}

	public Integer getPisoHabitacion() {
		return pisoHabitacion;
	}

	public void setPisoHabitacion(Integer pisoHabitacion) {
		this.pisoHabitacion = pisoHabitacion;
	}

	public Boolean getTieneVentana() {
		return tieneVentana;
	}

	public void setTieneVentana(Boolean tieneVentana) {
		this.tieneVentana = tieneVentana;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Habitación [nombreHabitacion=" + nombreHabitacion + ", pisoHabitacion=" + pisoHabitacion
				+ ", tieneVentana=" + tieneVentana + ", persona=" + persona + "]";
	}

}
