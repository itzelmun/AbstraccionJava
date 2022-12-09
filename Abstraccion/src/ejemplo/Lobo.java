package ejemplo;

public class Lobo extends Canino{

	public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
			float tamanoColmillos) {
		super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
		// TODO Auto-generated constructor stub
	}
	
	//atributos
	protected int numCamada;
	protected String especieLobo;
	
	
	
	@Override
	public String comer() {
		return "El lobo come";
	}
	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String correr() {
		return "El lobo corre";
	}
	@Override
	public String comunicarse() {
		return "El lobo se comunica";
	}
	
	//constructor
	public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, int numCamada,
			String especieLobo) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.numCamada = numCamada;
		this.especieLobo = especieLobo;
	}
	
	//getters and setters
	public int getNumCamada() {
		return numCamada;
	}
	public void setNumCamada(int numCamada) {
		this.numCamada = numCamada;
	}
	public String getEspecieLobo() {
		return especieLobo;
	}
	public void setEspecieLobo(String especieLobo) {
		this.especieLobo = especieLobo;
	}
	
	
}
