import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public abstract class Catalogo {
	private ArrayList<Disco> listaDiscos= new ArrayList<Disco>();
	
	public Catalogo() {	
	}
	
	public Disco buscarPorTitulo(String titulo) {
		Disco discobuscado=null;
		for (Disco disco:listaDiscos) {
			if(disco.getTituloAlbum().equals(titulo)) {
				discobuscado=disco;
			}
		}
	return discobuscado;
	}
	
	public void meterDisco(Disco disco) {
		listaDiscos.add(disco);
		disco.setStock(true);
	}
	
	public void eliminarDisco(String titulo) {
		if(buscarPorTitulo(titulo)!=null) {
			listaDiscos.remove(buscarPorTitulo(titulo));
		}
	}
	
	public void cambiarAtributos(String titulo) {
		Disco discotrabajado=buscarPorTitulo(titulo);
		if(discotrabajado!=null) {
			int seleccion=JOptionPane.showOptionDialog(null,"¿Que desea editar?","Disco", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Artista","Canciones","Duracion","Stock","Comentario","Genero","Nada"}, "Nada");
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
	
	public void listarDiscos() {
		for(Disco disco:listaDiscos) {
			System.out.println("Los discos que posee son: "+disco.getTituloAlbum()+"-"+disco.getArtista());
		}
	}
	
	public void listarDiscoEnStock() {
		for(Disco disco:listaDiscos) {
			if(disco.isStock()==true) {
				System.out.println("Los discos que posee en stock son: "+disco.getTituloAlbum()+"-"+disco.getArtista());
			}else {
				;
			}	
		}
	}
	
	public void listarDiscoPorDuracion(double duracion) {
		for(Disco disco:listaDiscos) {
			if(disco.getDuracion()<duracion) {
				System.out.println("Los discos que posee con menor duracion a la indicada son: "+disco.getTituloAlbum()+"-"+disco.getArtista());
			}else {
				;
			}	
		}
	}
	
	public void listarDiscoPorArtista(String autor) {
		for(Disco disco:listaDiscos) {
			if(disco.getArtista().equals(autor)) {
				System.out.println("Los discos del artista "+disco.getArtista()+" que posee son: "+disco.getTituloAlbum());
			}else {
				;
			}	
		}
	}
	
	public void listarDiscoPorTitulo() {
		Collections.sort(listaDiscos,new Comparator<Disco>(){
			public int compare(Disco disco1,Disco disco2) {
				return disco1.getTituloAlbum().compareTo(disco2.getTituloAlbum());
			}});
			for(Disco disco:listaDiscos) {
				System.out.println(disco.getTituloAlbum()+"-"+disco.getArtista());
			}
		}
	
	public void cuantosDiscos() {
		int contadordiscos=0;
		for(@SuppressWarnings("unused") Disco disco:listaDiscos) {
			contadordiscos+=1;
		}System.out.println("la cantida de discos es de : "+contadordiscos);
	}
	
	public void cuantosDiscosEnStock() {
		int contadordisco=0;
		for(Disco disco:listaDiscos) {
			if(disco.isStock()==true) {
				contadordisco+=1;
			}System.out.println("la cantida de discos en stock es de : "+contadordisco);
		}
	}

}
