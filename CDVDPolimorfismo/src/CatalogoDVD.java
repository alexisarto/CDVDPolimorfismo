import java.util.ArrayList;


import javax.swing.JOptionPane;

public class CatalogoDVD extends Catalogo {
	private ArrayList<DVD> listaDVD= new ArrayList<DVD>();
	
	@Override
	public void cambiarAtributos(String titulo) {
		Disco discotrabajado=buscarPorTitulo(titulo);
		if(discotrabajado!=null) {
			int seleccion=JOptionPane.showOptionDialog(null,"¿Que desea editar?","DVD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Artista","Canciones","Duracion","Stock","Comentario","Genero","Nada"}, "Nada");
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
		for(Disco disco:listaDVD) {
			System.out.println("Los DVDs que posee son: "+disco.getTituloAlbum()+"-"+disco.getArtista());
		}
	}
	
	@Override
	public void listarDiscoEnStock() {
		for(Disco disco:listaDVD) {
			if(disco.isStock()==true) {
				System.out.println("Los DVDs que posee en stock son: "+disco.getTituloAlbum()+"-"+disco.getArtista());
			}else {
				;
			}	
		}
	}
	
	@Override
	public void listarDiscoPorDuracion(double duracion) {
		for(Disco disco:listaDVD) {
			if(disco.getDuracion()<duracion) {
				System.out.println("Los DVDs que posee con menor duracion a la indicada son: "+disco.getTituloAlbum()+"-"+disco.getArtista());
			}else {
				;
			}	
		}
	}
	
	@Override
	public void listarDiscoPorArtista(String autor) {
		for(Disco disco:listaDVD) {
			if(disco.getArtista().equals(autor)) {
				System.out.println("Los DVDs del artista "+disco.getArtista()+" que posee son: "+disco.getTituloAlbum());
			}else {
				;
			}	
		}
	}
	
	@Override
	public void cuantosDiscos() {
		int contadordiscos=0;
		for(@SuppressWarnings("unused") Disco disco:listaDVD) {
			contadordiscos+=1;
		}System.out.println("la cantida de DVDs es de : "+contadordiscos);
	}
	
	@Override
	public void cuantosDiscosEnStock() {
		int contadordisco=0;
		for(Disco disco:listaDVD) {
			if(disco.isStock()==true) {
				contadordisco+=1;
			}System.out.println("la cantida de DVDs en stock es de : "+contadordisco);
		}
	}
	
	@Override
	public Disco buscarPorTitulo(String titulo) {
		Disco discobuscado=null;
		for (Disco disco:listaDVD) {
			if(disco.getTituloAlbum().equals(titulo)) {
				discobuscado=disco;
			}
		}
	return discobuscado;
	}
	
	@Override
	public void meterDisco(Disco disco) {
		listaDVD.add((DVD) disco);
		disco.setStock(true);
	}
	
	@Override
	public void eliminarDisco(String titulo) {
		if(buscarPorTitulo(titulo)!=null) {
			listaDVD.remove(buscarPorTitulo(titulo));
		}
	}
	

}
