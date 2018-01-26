package builder;

public interface Builder<K,T> {
	public K preco (double preco);
	public K dscMotor (String dscMotor);
	public K anoDeFabricao (int anoDeFabricao);
	public K montadora (String montadora);
	public T create();
}