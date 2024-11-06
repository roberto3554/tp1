public class Criptomoneda{
	private String nombre;
	private dobule valorDeToken;

	public Criptomoneda(String nomvre, double valorDeToken){
		this.nombre = nombre;
		this.valorDeToken = valorDeToken;
	}

	public String getNombre(){
		return nombre;
	}

	public double getValorDeToken(){
		return valorDeToken;
	}
	
	@override
	public String toString(){
		return String.format("%5s", nombre) + ":" + String.format("%10.1f", valorDeToken);
	}
}
