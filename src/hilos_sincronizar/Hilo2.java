/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_sincronizar;

/**
 *
 * @author Alex
 */
/**

 * Clase que representa a un hilo que debe esperar a que termine

 * otro hilo para empezar su tarea
 
 *
 
 */

public class Hilo2 extends Thread {

	private final static int MAXIMO = 5;

	// Hilo al que deberá esperar

	private Thread hilo;
	
	public Hilo2(Thread hilo) {

		this.hilo = hilo;

	}

	/*

	 * Tarea que desempeña el hilo. En este caso de forma simbólica 

	 * pinta una serie de líneas por pantalla

	 * @see java.lang.Thread#run()

	 */

	@Override

	public void run() {

		try {			

			// Espera a que termine el otro hilo

			//hilo.join();

			for (int i = 0; i < MAXIMO; i++) {

				System.out.println("Hola, soy el hilo 2");

				Thread.sleep(500);
			}

		} catch (InterruptedException ie) {}

	}

}