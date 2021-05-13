import java.util.ArrayList;


import javax.swing.JOptionPane;

public class CatalogoCD extends Catalogo{
	private ArrayList<CD> listaCD= new ArrayList<CD>();
	
	public void buscarPorArtista(String artista) {
		for (CD cd:listaCD) {
			if(cd.getArtista().equals(artista)) {
				System.out.println(cd.getTituloAlbum());
			}
		}
	}
	
	public void cuantosTemas(String titulo) {
		System.out.println("El cd tiene: "+buscarPorTitulo(titulo).getCanciones()+" canciones");
	}
	
	@Override
	public void cambiarAtributos(String titulo) {
		Disco discotrabajado=buscarPorTitulo(titulo);
		if(discotrabajado!=null) {
			int seleccion=JOptionPane.showOptionDialog(null,"¿Que desea editar?","CD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Artista","Canciones","Duracion","Stock","Comentario","Genero","Nada"}, "Nada");
			if(seleccion!=-1) {
				if(seleccion==0) {
					discotrabajado.setTituloAlbum(JOptionPane.showInputDialog("Nuevo titulo:"));
				}else if(seleccion==1) {
					int cantidadCanciones= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de canciones:"));
					discotrabajado.setCanciones(cantidadCanciones);
				}else if(seleccion==2) {
					double duracion= Double.parseDouble(JOptionPane.showInputDialog("Duración:"));
					discotrabajado.setDuracion(duracion);
				}else if(seleccion==3) {
					boolean stock= Boolean.parseBoolean(JOptionPane.showInputDialog("Stock:"));
					discotrabajado.setStock(stock);
				}else if(seleccion==4) {
					discotrabajado.setComentario(JOptionPane.showInputDialog("Comentario:"));
				}else if(seleccion==5) {
					discotrabajado.setGenero(JOptionPane.showInputDialog("Genero:"));
				}else if(seleccion==6) {
					System.out.println("No desea cambiar nada");
				}
			}
		}	
	}
	
	@Override
	public void listarDiscos() {
		for(CD cd:listaCD) {
			System.out.println("Los CDs que posee son: "+cd.getTituloAlbum()+"-"+cd.getArtista());
		}
	}
	
	@Override
	public void listarDiscoEnStock() {
		for(CD cd:listaCD) {
			if(cd.isStock()==true) {
				System.out.println("Los CDs que posee en stock son: "+cd.getTituloAlbum()+"-"+cd.getArtista());
			}else {
				;
			}	
		}
	}
	
	@Override
	public void listarDiscoPorDuracion(double duracion) {
		for(CD cd:listaCD) {
			if(cd.getDuracion()<duracion) {
				System.out.println("Los CDs que posee con menor duracion a la indicada son: "+cd.getTituloAlbum()+"-"+cd.getArtista());
			}else {
				;
			}	
		}
	}
	
	@Override
	public void listarDiscoPorArtista(String autor) {
		for(CD cd:listaCD) {
			if(cd.getArtista().equals(autor)) {
				System.out.println("Los CDs del artista "+cd.getArtista()+" que posee son: "+cd.getTituloAlbum());
			}else {
				;
			}	
		}
	}
	
	@Override
	public void cuantosDiscos() {
		int contadordiscos=0;
		for(@SuppressWarnings("unused") CD cd:listaCD) {
			contadordiscos+=1;
		}System.out.println("la cantida de CDs es de : "+contadordiscos);
	}
	
	@Override
	public void cuantosDiscosEnStock() {
		int contadordisco=0;
		for(CD cd:listaCD) {
			if(cd.isStock()==true) {
				contadordisco+=1;
			}System.out.println("la cantida de CDs en stock es de : "+contadordisco);
		}
	}
	
	@Override
	public Disco buscarPorTitulo(String titulo) {
		Disco discobuscado=null;
		for (Disco disco:listaCD) {
			if(disco.getTituloAlbum().equals(titulo)) {
				discobuscado=disco;
			}
		}
	return discobuscado;
	}
	
	@Override
	public void meterDisco(Disco disco) {
		listaCD.add((CD) disco);
		disco.setStock(true);
	}
	
	@Override
	public void eliminarDisco(String titulo) {
		if(buscarPorTitulo(titulo)!=null) {
			listaCD.remove(buscarPorTitulo(titulo));
		}
	}
	

}
