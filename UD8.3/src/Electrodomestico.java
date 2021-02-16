
public class Electrodomestico {

	


	//Constantes
	private final String color_def = "blanco";
	private final char consumo_def = 'F';
	private final double precio_base_def = 100;
	private final double peso_def = 5;
	
	//Atributos
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	//array  con los colores disponibles
	String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
	//array con los tipos de consumo disponibles
	char[] tiposConsumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};
		
	//Constructores
	//Contructor base con los atributos inicializados
	public Electrodomestico() {
		this.color = color_def;
		this.consumoEnergetico = consumo_def;
		this.precioBase = precio_base_def;
		this.peso = peso_def;
		
	}
	
	//Constructor con precioBase y peso como parámetros
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;	
		this.color = color_def;
		this.consumoEnergetico = consumo_def;
		
	}
	
	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;		
	}
	
}

	

