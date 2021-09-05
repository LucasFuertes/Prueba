package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Instanciar un Objeto
		Persona personita = new Persona();

		// Asignacion de valores a la instancia
		personita.nombre = "Lucas Maximiliano";
		personita.edad = 18;
		personita.estatura = (float) 1.85;
		personita.auto = crearAuto();

		// Llamado a la funcion
		mostrarPersona(personita);

		personaNueva();

	}

	public static void mostrarPersona(Persona objetoPersona) {

		System.out.println(objetoPersona.nombre + " " + objetoPersona.edad + " " + objetoPersona.estatura + " "
				+ objetoPersona.auto.patente + " " + objetoPersona.auto.modelo + " " + objetoPersona.auto.anio);
	}

	// Hacer una funcion que instancie un nuevo objeto persona y valide si es una
	// persona de +21

	public static void personaNueva() {
		Persona chato = new Persona();

		chato.nombre = "El Piti";
		chato.edad = 15;
		chato.estatura = (float) 1.20;
		
		Auto autito = new Auto();

		Scanner in = new Scanner(System.in);
		String inputPatente = in.nextLine();
		String inputModelo = in.nextLine();
		Short inputAnio = in.nextShort();
		
		autito.patente = inputPatente;
		autito.modelo = inputModelo;
		autito.anio = inputAnio;
		
		chato.auto = autito;
		
		mostrarPersona(chato);
		in.close();

	}

	// Crear una clase Auto, que tenga de atributos PATENTE, MODELO Y AÑO

	public static Auto crearAuto() {
		Auto datos = new Auto();

		datos.patente = "THQ 729";
		datos.modelo = "Mustang GT";
		datos.anio = 2012;
		return datos;
	}

}
