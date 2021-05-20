package domain;

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
    //Por defecto si no se especifica es LISA
    public void setearTrama(){
        unaTrama = Trama.LISA;
    }

    public void setearMaterial(TelaMaterial unMateriaPrenda){
        unMaterial = unMateriaPrenda;
    }

    public void setearColorPrincipal(Color unColorPrenda1){
        unColorPrincipal = unColorPrenda1;
    }

    public void setearColorSecundario(Color unColorPrenda2){
        unColorSecundario = unColorPrenda2;
    }

}