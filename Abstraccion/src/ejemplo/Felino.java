package ejemplo;

abstract public class Felino extends Mamifero {

	public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico) {
		super(habitat, altura, largo, peso, nombreCientifico);
		// TODO Auto-generated constructor stub
	}
	protected float tamanoGarras;
	protected int velocidad;

	
	
	public float getTamanoGarras() {
		return tamanoGarras;
	}
	public void setTamanoGarras(float tamanoGarras) {
		this.tamanoGarras = tamanoGarras;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	//constructor
	public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras,
			int velocidad) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.tamanoGarras = tamanoGarras;
		this.velocidad = velocidad;
	}
	
	
	
}
