import java.util.concurrent.ThreadLocalRandom;

public class Pasword {
	
	
	public class Password {

		//longitud por defecto
		private final int longitud_def = 8;
		
		//Creamos los atributos
		int longitud;
		String contraseña;
		
		//Constructor por defecto
		public Password() {
			this.longitud = longitud_def;
			this.contraseña = "";
		}

		//constructor con longitud introducida y contraseña aleatoria
		public Password(int longitud) {
			this.longitud = longitud;
			this.contraseña = contraAleatoria(longitud);
		}
		
		//Metodo para generar una contraseña aleatoria
		public String contraAleatoria (int longitud) {
			
			
			//creamos una variable para almacenar la contraseña
			String contraseña = "";
			int numero;
			
			//usamos un loop para recorrer la longitud de la contraseña, generar numeros aleatorios y añadirlos a esta
			for (int i = 0; i < longitud; i++) {
				numero = ThreadLocalRandom.current().nextInt(0,10);
				contraseña = contraseña + Integer.toString(numero);
			}
			
			return contraseña;
			
		}


	}
}
