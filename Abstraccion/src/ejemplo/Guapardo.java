package ejemplo;

public class Guapardo extends Felino{

	public Guapardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras,
			int velocidad) {
		super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String comer() {
	
		return "El guapardo come "; 
	}

	@Override
	public String dormir() {
		return "El guapardo duerme";
	}

	@Override
	public String correr() {
		return "El guapardo corre";
	}

	@Override
	public String comunicarse() {
		return "El guapardo se comunica";
	}

	
}
