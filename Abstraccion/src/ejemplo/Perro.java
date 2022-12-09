package ejemplo;

public class Perro extends Canino{

	public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
			float tamanoColmillos) {
		super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
		// TODO Auto-generated constructor stub
	}

	protected int fuerzaMordida;

	@Override
	public String comer() {
		return "El perro come";
	}

	@Override
	public String dormir() {
		return "El perro duerme";
	}

	@Override
	public String correr() {
		return "El perro corre";
	}

	@Override
	public String comunicarse() {
		return "El perro se comunica";
	}

	//constructor
	public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, int fuerzaMordida) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.fuerzaMordida = fuerzaMordida;
	}

	//getters and setters
	public int getFuerzaMordida() {
		return fuerzaMordida;
	}

	public void setFuerzaMordida(int fuerzaMordida) {
		this.fuerzaMordida = fuerzaMordida;
	}
	
	
	
}
