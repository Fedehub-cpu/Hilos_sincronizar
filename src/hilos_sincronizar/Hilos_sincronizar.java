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
public class Hilos_sincronizar {

    /*

	 * Lanza los dos hilos.

	 * hilo2 espera a que termine hilo1 para empezar

	 */

	public static void main(String[] args) {

			

		Hilo1 hilo1 = new Hilo1();

		Hilo2 hilo2 = new Hilo2(hilo1);

		

		hilo1.start();

		hilo2.start();

	}
    
}
