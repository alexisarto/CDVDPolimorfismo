
public abstract class Disco {
	public String tituloAlbum;
	public String artista;
	public int canciones;
	public double duracion;
	public boolean stock;
	public String comentario;
	public String genero;
	
	public Disco(String album,String artista, int canciones,double duracion,boolean stock,String comentario,String genero) {
		this.tituloAlbum=album;
		this.artista=artista;
		this.canciones=canciones;
		this.duracion=duracion;
		this.stock=stock;
		this.comentario=comentario;
		this.genero=genero;
	}

	public String getTituloAlbum() {
		return tituloAlbum;
	}

	public void setTituloAlbum(String tituloAlbum) {
		this.tituloAlbum = tituloAlbum;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getCanciones() {
		return canciones;
	}

	public void setCanciones(int canciones) {
		this.canciones = canciones;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


}
