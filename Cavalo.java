package HerancaPolimorfismo;

public class Cavalo extends Animal{

	private String coloracao;
	
	

	void correr() {
		System.out.println("est� correndo!");
	}
	public String getColoracao() {
		return coloracao;
	}
	public void setColoracao(String coloracao) {
		this.coloracao = coloracao;
	}
	@Override
	public void barulho() {
		System.out.println("est� relinchando");
		
	}
}
