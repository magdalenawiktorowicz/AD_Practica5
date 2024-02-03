package es.studium.ADpractica5;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	private String nombreCasa;
	private List<Habitacion> habitaciones;
	private Persona propietario;
	
	public Casa() {
		nombreCasa = "";
		habitaciones = new ArrayList<Habitacion>();
		propietario = new Persona();
	}

	public Casa(String nombreCasa, List<Habitacion> habitaciones, Persona propietario) {
		this.nombreCasa = nombreCasa;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
	}

	public String getNombreCasa() {
		return nombreCasa;
	}

	public void setNombreCasa(String nombreCasa) {
		this.nombreCasa = nombreCasa;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Casa [nombreCasa=" + nombreCasa + ", habitaciones=" + habitaciones + ", propietario=" + propietario
				+ "]";
	}
}
