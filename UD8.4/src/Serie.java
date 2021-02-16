
public class Serie {

	

		//Constantes
		private final int temporadas_def = 3;
		private final boolean entregado_def = false;
		
		//Atributos
		private String titulo;
		private int numTemporadas;
		private boolean entregado;
		private String genero;
		private String creador;
		
		//Constructor por defecto
		public Serie() {
			this.titulo = "";
			this.creador = "";
			this.numTemporadas = temporadas_def;
			this.genero = "";
			this.entregado = entregado_def;
		}

		//constructor con titulo y creador, el resto por defecto
		public Serie(String titulo, String creador) {
			this.titulo = titulo;
			this.creador = creador;
			this.numTemporadas = temporadas_def;
			this.genero = "";
			this.entregado = entregado_def;
		}

		//constructor con todos los atributos, excepto entregado
		public Serie(String titulo, int numTemporadas, String genero, String creador) {
			this.titulo = titulo;
			this.numTemporadas = numTemporadas;
			this.genero = genero;
			this.creador = creador;
			this.entregado = entregado_def;
		}

}
