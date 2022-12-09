package ejemplo;

abstract public class Canino extends Mamifero{

	public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico) {
		super(habitat, altura, largo, peso, nombreCientifico);
		// TODO Auto-generated constructor stub
	}
	
	//propiedades
	protected String color;
	protected float tamanoColmillos;
	
	//getters and setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getTamanoColmillos() {
		return tamanoColmillos;
	}
	public void setTamanoColmillos(float tamanoColmillos) {
		this.tamanoColmillos = tamanoColmillos;
	}
	
	//constructor
	public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
			float tamanoColmillos) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.color = color;
		this.tamanoColmillos = tamanoColmillos;
	}
	
	
	
	
	
}
