package es.studium.ADpractica5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	public static void main(String[] args) {
		// Abrir el contenedor de Inversión de Control indicando la ruta del fichero beans.xml con las dependecias
		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		
		/* Obtener los beans 'persona' y establecer el valor del atributo 'nombre' de cada uno
		* El patrón de diseño de este bean es 'prototype', por lo cual se crea una instancia del bean 
		* cada vez que llamamos al método getBean y le pasamos el id 'persona' */
		Persona persona1 = appContext.getBean("persona", Persona.class);
		persona1.setNombre("David");
		Persona persona2 = appContext.getBean("persona", Persona.class);
		persona2.setNombre("Magda");
		Persona persona3 = appContext.getBean("persona", Persona.class);
		persona3.setNombre("María");
		
		// Obtener los beans de la clase Habitacion (aquí utilizamos los beans definidos por separado)
		Habitacion habitacion1 = appContext.getBean("cocina", Habitacion.class);
		// establecemos el valor del atributo 'persona' para no utilizar el valor por defecto
		habitacion1.setPersona(persona2);
		Habitacion habitacion2 = appContext.getBean("study", Habitacion.class);
		habitacion2.setPersona(persona1);
		Habitacion habitacion3 = appContext.getBean("salón", Habitacion.class);
		habitacion3.setPersona(persona1);
		
		// Crear una lista y añadir los objetos de tipo Habitacion a la lista
		// Lo podemos hacer o bien através del código, o bien en la definición del bean 'casa'
		// dentro de la etiqueta <list>, haciendo la referencia a cada habitación
		List<Habitacion> habitaciones = new ArrayList<Habitacion>();
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);
		habitaciones.add(habitacion3);
		// Obtener un bean 'casa' y establecer valores de los atributos
		Casa casa1 = appContext.getBean("casa", Casa.class);
		casa1.setPropietario(persona3);
		casa1.setHabitaciones(habitaciones); // también podemos utilizar valores por defecto del fichero beans.xml
		
		// Imprimir la información de la casa
		System.out.println(casa1);
		// Cerrar el contexto
		((ClassPathXmlApplicationContext) appContext).close();
	}
}
