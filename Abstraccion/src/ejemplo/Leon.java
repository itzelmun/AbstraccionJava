package ejemplo;

public class Leon extends Felino{

	public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico) {
		super(habitat, altura, largo, peso, nombreCientifico);
		// TODO Auto-generated constructor stub
	}
	protected int numManada;
	protected float potenciaRugido;
	@Override
	public String comer() {
		return "El leon come";
		
	}
	@Override
	public String dormir() {
		return "El leon duerme";
	}
	@Override
	public String correr() {
		return "El leon corre";
	}
	@Override
	public String comunicarse() {
		return "El leon se comunica";
	}
	
	//constructor
	public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, int numManada,
			float potenciaRugido) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.numManada = numManada;
		this.potenciaRugido = potenciaRugido;
	}
	
	//getters and setters
	public int getNumManada() {
		return numManada;
	}
	public void setNumManada(int numManada) {
		this.numManada = numManada;
	}
	public float getPotenciaRugido() {
		return potenciaRugido;
	}
	public void setPotenciaRugido(float potenciaRugido) {
		this.potenciaRugido = potenciaRugido;
	}
	

	
}
