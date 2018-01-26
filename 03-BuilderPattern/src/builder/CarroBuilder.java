package builder;
import model.CarroProduct;

public class CarroBuilder implements Builder <CarroBuilder, CarroProduct>{
	private final String modelo;
	private double preco;
	private String dscMotor;
	private int anoDeFabricacao;
	private String montadora;

	public CarroBuilder (String modelo) {
		this.modelo=modelo;
	}

	@Override
	public CarroBuilder preco(double preco) {
		this.preco = preco;
		return this;
	}

	@Override
	public CarroBuilder dscMotor(String dscMotor) {
		this.dscMotor = dscMotor;
		return this;
	}

	@Override
	public CarroBuilder anoDeFabricao(int anoDeFabricao) {
		this.anoDeFabricacao = anoDeFabricao;
		return this;
	}
	
	@Override
	public CarroBuilder montadora(String montadora) {
		this.montadora=montadora;
		return this;
	}

	@Override
	public CarroProduct create() {
		CarroProduct c = new CarroProduct();
		c.setModelo(this.modelo);
		c.setPreco(this.preco);
		c.setAnoDeFabricacao(this.anoDeFabricacao);
		c.setDscMotor(this.dscMotor);
		c.setMontadora(this.montadora);
		return c;
	}
}
