/*
--------------------------------------------------
--------------------Usuarie---------------------
--------------------------------------------------
*/
public class Usuarie{
	public List<Prenda> prendas;
	public List<Atuendo> atuendos;
	public enum estetica{
		MODERNA, CLASICA, NORMAL, EXTRAVAGANTE;
	}
	public Atuendo armarAtuendo(estetica){
		Atuendo nuevoAtuendo;
		nuevoAtuendo.queMePongo(estetica);
		return nuevoAtuendo;
	}
}

/*
--------------------------------------------------
----------------------ATUENDO---------------------
--------------------------------------------------
*/
public class Atuendo{
	public List<Prenda> prendas;
	public Clima condicionesClimaticas;
	public String estetica;


}

/*
--------------------------------------------------
----------------------PRENDA----------------------
--------------------------------------------------
*/
public class Prenda{
	public String telaMaterial;
	public Categoria categoria;
	public String colorPrincipal;
	public String color Secundario;
	public enum tipo{
		REMERA_CORTA, REMERA_LARGA, CAMISA_CORTA, CAMISA_LARGA, SHORT, BERMUDA, PANTALON, BUZO, CAMPERA,
		CHOMBA, ZAPATO, ZAPATILLA, OJOTA, GORRA, SOMBRERO, ANTEOJOS, COLLAR, PULSERA; 
	}

}

/*
--------------------------------------------------
--------------------CATEGORIA---------------------
--------------------------------------------------
*/
abstract class Categoria{

}
public class Superior extends Categoria{
	public enum tipo{
		REMERA_CORTA, REMERA_LARGA, CAMISA_CORTA, CAMISA_LARGA, BUZO, CAMPERA,
		CHOMBA; 
	}
}
public class Inferior extends Categoria{
	public enum tipo{
		SHORT, BERMUDA, PANTALON, BUZO; 
	}
}
public class Calzado extends Categoria{
	public enum tipo{
		ZAPATO, ZAPATILLA, OJOTA; 
	}
}
public class Accesorio extends Categoria{
	public enum tipo{
		GORRA, SOMBRERO, ANTEOJOS, COLLAR, PULSERA;
	}
}