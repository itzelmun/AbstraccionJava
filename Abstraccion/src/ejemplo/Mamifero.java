package ejemplo;

abstract public class Mamifero {

	protected String habitat;
	protected float altura;
	protected float largo;
	protected float peso;
	protected String nombreCientifico;
	
	abstract public String comer();
	abstract public String dormir();
	abstract public String correr();
	abstract public String comunicarse();
	
	
	//getters and setters
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getLargo() {
		return largo;
	}
	public void setLargo(float largo) {
		this.largo = largo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	
	//constructor
	public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
		super();
		this.habitat = habitat;
		this.altura = altura;
		this.largo = largo;
		this.peso = peso;
		this.nombreCientifico = nombreCientifico;
	}
	

	
	
	
	
	
}
