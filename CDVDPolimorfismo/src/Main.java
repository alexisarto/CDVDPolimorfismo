
public class Main {

	public static void main(String[] args) {
		
		CatalogoCD catalogo1= new CatalogoCD();
		
		Disco cd1=new CD("gL INDIO","asd",3,25.7,true,"asd","asd");
		Disco cd2=new CD("aL INDIO","asd",3,25.7,true,"asd","asd");
		Disco cd3=new CD("sL INDIO","asd",3,25.7,true,"asd","asd");
		Disco cd4=new CD("dL INDIO","asd",3,25.7,true,"asd","asd");
		
		
		catalogo1.meterDisco(cd1);
		catalogo1.meterDisco(cd2);
		catalogo1.meterDisco(cd3);
		catalogo1.meterDisco(cd4);
		
		catalogo1.listarDiscos();
		catalogo1.cuantosDiscos();
		catalogo1.buscarPorArtista("asd");

	}

}
