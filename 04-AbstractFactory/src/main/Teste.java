package main;

import factory.BasicaFactory;
import factory.CasaFactory;
import factory.ConfortoFactory;
import factory.LuxoFactory;

public class Teste {

	public static void main(String[] args) {
		CasaFactory casa_basica, casa_conforto, casa_luxo;
		
		casa_basica = new BasicaFactory();
		casa_conforto = new ConfortoFactory();
		casa_luxo = new LuxoFactory();
		
		System.out.println("\nCasa Basica:");
		casa_basica.createLoucas().criouLouca();
		casa_basica.createMetais().criouMetal();
		System.out.println("\nCasa Conforto:");
		casa_conforto.createParede().criouParede();
		casa_conforto.createPorta().criouPorta();
		System.out.println("\nCasa Luxo:");
		casa_luxo.createPiso().criouPiso();
		casa_luxo.createParede().criouParede();
		
		casa_basica.createComodo();
	}

}
