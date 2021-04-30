/*----------------------Prenda----------------------*/
public class Prenda{
	public TelaMaterial unMaterial;
	public Tipo unTipo;
	public Trama unaTrama;
	public Color unColorPrincipal;
	public Color unColorSecundario;

	public Prenda(Tipo unTipoPrenda){
		unTipo = unTipoPrenda;
	}

	public void setearTrama(Trama unTramaPrenda){
		unaTrama = unTramaPrenda;
	}

	public void setearTrama(){
		unaTrama = LISA;
	}

	public void setearMaterial(Material unMateriaPrenda){
		unMaterial = unMateriaPrenda;
	}

	public void setearColorPrincipal(Color unColorPrenda1){
		unColorPrincipal = unColorPrenda1;
	}

	public void setearColorSecundario(Color unColorPrenda2){
		unColorSecundario = unColorPrenda2;
	}

}

/*------------------TelaMaterial-------------------*/
public enum TelaMaterial{
	JEAN, PANA, POLAR;
}

/*-----------------------Tipo-----------------------*/
public enum Tipo{
	REMERA(Categoria.SUPERIOR), 
	BUZO(Categoria.SUPERIOR), 
	CAMISA_LARGA(Categoria.SUPERIOR), 
	CAMISA_CORTA(Categoria.SUPERIOR), 
	PANTALON(Categoria.INFERIOR),
	SHORT(Categoria.INFERIOR);
}

/*--------------------Categoria---------------------*/
public enum Categoria{
	SUPERIOR,
	INFERIOR,
	CALZADO,
	ACCESORIO;
}

/*----------------------Color-----------------------*/
public class Color{
	public int rojo;
	public int azul;
	public int amarillo;
} 

/*-----------------------Trama----------------------*/
public enum Trama{
	LISA,
	CUADRADOS,
	ESTAMPADA,
	LUNARES,
	RAYADA;
}

/*--------------------Uniforme----------------------*/
public class Uniforme{
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Prenda calzado;
}

/*--------------------PrendaBorrador---------------*/
public class PrendaBorrador{
	public Prenda unaPrenda;
	public TipoPrenda unTipoPrenda;
	public TelaMaterial unTipoMaterialPrenda;
	public Color colorPrincipal;
	public Color colorSecundario;
	public Trama unaTramaPrenda;

	Prenda nuevaPrenda(unTipoPrenda){
		return unaPrenda = new Prenda(unTipoPrenda);
	}
}