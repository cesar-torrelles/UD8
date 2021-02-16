
public class Persona {
	
	
		
		//generamos una constante para el sexo
		private final char sexo_def = 'H';
		
		//añadimos los atributos
		private String nombre;
		private int edad;
		private String DNI;
		private char sexo;
		private double peso;
		private double altura;
		
		//Creamos los constructores por defecto
		public Persona() {
			this.nombre = "";
			this.edad = 0;
			this.DNI = "";
			this.sexo = sexo_def;
			this.peso = 0;
			this.altura = 0;
		}
		//Creamos los constructores con nombre, edad y sexo, el resto por defecto
		public Persona(String nombre, int edad, char sexo) {
			this.nombre = nombre;
			this.edad = edad;
			this.sexo = sexo;
			this.peso = 0;
			this.altura = 0;
		}
		//creamos el ultimo constructor con todos los atributos como parametro
		public Persona(String nombre, int edad, String DNI, char sexo, Double peso, Double altura) {
			this.nombre = nombre;
			this.edad = edad;
			this.DNI = DNI;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}
		
	}
	


