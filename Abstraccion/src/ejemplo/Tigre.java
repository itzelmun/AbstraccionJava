package ejemplo;

public class Tigre extends Felino{


	protected String especieTigre;

	@Override
	public String comer() {
		return "El tigre de la especie " + especieTigre + "come";
		
	}

	@Override
	public String dormir() {

		return "El tigre de la especie " + especieTigre + "duerme";
		
	}

	@Override
	public String correr() {
		
		return "El tigre de la especie " + especieTigre + "corre";
	}

	@Override
	public String comunicarse() {
		
		return "El tigre de la especie " + especieTigre + "se comunica";
	}

	//constructor
	public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, String especieTigre) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.especieTigre = especieTigre;
	}

	//getters and setters
	public String getEspecieTigre() {
		return especieTigre;
	}

	public void setEspecieTigre(String especieTigre) {
		this.especieTigre = especieTigre;
	}
	
	
	
}
