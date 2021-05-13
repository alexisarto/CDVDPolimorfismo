
public class DVD extends Disco {
	public String tituloAlbum;
	public String artista;
	public int canciones;
	public double duracion;
	public boolean stock;
	public String comentario;
	public String genero;
	
	public DVD(String album, String artista, int canciones, double duracion, boolean stock, String comentario,
			String genero) {
		super(album, artista, canciones, duracion, stock, comentario, genero);
	}

}
