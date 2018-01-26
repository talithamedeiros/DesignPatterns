package model;

public class CarroProduct {
  public double preco;
  public String dscMotor;
  public int anoDeFabricacao;
  public String modelo;
  public String montadora;
  
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDscMotor() {
		return dscMotor;
	}
	public void setDscMotor(String dscMotor) {
		this.dscMotor = dscMotor;
	}
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	@Override
	public String toString() {
		return "CarroProduct [preco=" + preco + ", dscMotor=" + dscMotor + ", anoDeFabricacao=" + anoDeFabricacao
				+ ", modelo=" + modelo + ", montadora=" + montadora + "]";
	}
  
  
}
