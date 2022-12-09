package ejemplo;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guapardo gua = new Guapardo("selva", 25, 45, 36, "guapo", 15, 15874);
		Leon leo= new Leon("selva", 45, 20, 10, "Leo", 15, 75);
		Lobo lob = new Lobo("selva", 85, 60, 45, "lobo raptor 2022", 45, "felino");
		Perro per= new Perro("casa", 54, 12, 36, "perrón", 58);
		Tigre tig= new Tigre("Bosque", 85, 40, 450, "tres tristes tigres", "Canino");
		
		
		//se hace una instancia para el array
			Mamifero[] animales = new Mamifero[5];
				
			animales[0]= gua;
			animales[1]= leo;
			animales[2]=lob;
			animales[3]=per;
			animales[4]= tig;
	
				
			//se hace una comparacion de los objetos con el equals y dice si son iguales o no
			if(per.equals(lob)) {
				System.out.println("Son objeto iguales");
			}else {
				System.out.println("No son iguales");
			}
			
			
			//se hace un for para recorrer la coleccion elemento por elemento
			for(Mamifero animal : animales) {
				System.out.println("->"+animal.getClass().getSimpleName());
				System.out.println("Habitat"+ animal.getHabitat());
				System.out.println("Altura"+ animal.getAltura());
				System.out.println("Largo"+ animal.getLargo());
				System.out.println("Nombre cientifico"+ animal.getNombreCientifico());
				System.out.println("Peso"+ animal.getPeso());
				
				if(animal instanceof Felino) {
					System.out.println("Tamaño garras"+ ((Felino)animal).getTamanoGarras());
					System.out.println("Velocidad"+((Felino)animal).getVelocidad());
					if(animal instanceof Tigre) {
						System.out.println("Especie tigre"+((Tigre) animal).getEspecieTigre());
					}else if(animal instanceof Leon) {
						System.out.println("Numero de manada" +((Leon) animal).getNumManada());
						System.out.println("Potencia de rugido" +((Leon) animal).getPotenciaRugido());
					}else if(animal instanceof Guapardo) {
						System.out.println("Es un guapardo");
					}
				}
					
				if(animal instanceof Canino) {
					System.out.println("Color" +((Canino) animal).getColor());
					System.out.println("Tamaño de colmillos" +((Canino) animal).getTamanoColmillos());
				}if (animal instanceof Perro) {
					System.out.println("Fuerza de la mordida" +((Perro) animal).getFuerzaMordida());
				}else if(animal instanceof Lobo) {
					System.out.println("Numero de camada" +((Lobo) animal).getNumCamada());
					System.out.println("Especie de lobo" +((Lobo) animal).getEspecieLobo());
				}
				
				
				System.out.println(animal.comer());
				System.out.println(animal.dormir());
				System.out.println(animal.correr());
				System.out.println(animal.comunicarse());
				}
			
			
	}

}
