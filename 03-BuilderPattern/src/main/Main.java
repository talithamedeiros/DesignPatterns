package main;
import builder.CarroBuilder;
import model.CarroProduct;

public class Main {

	public static void main(String[] args) {		
		CarroProduct carro1 = new CarroBuilder("Uno").anoDeFabricao(2010).dscMotor("motor alguma coisa").preco(20000).montadora("Fiat").create();		
		CarroProduct carro2 = new CarroBuilder("Fusca").dscMotor("motor alguma coisa").preco(7000).montadora("Wolkswagen").create();			
		
		System.out.println("Carro1");
		System.out.println(carro1);
		
		System.out.println("\nCarro2\nSEM ano de fabricação");
		System.out.println(carro2);
		
		System.out.println("\nCOM ano de fabricação");
		carro2.setAnoDeFabricacao(1970);
		System.out.println(carro2);		
	}

}
