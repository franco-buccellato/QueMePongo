package domain;

public class PrendaBorrador{
    public Prenda unaPrenda;
    public Tipo unTipoPrenda;
    public TelaMaterial unTipoMaterialPrenda;
    public Color colorPrincipal;
    public Color colorSecundario;
    public Trama unaTramaPrenda;

    void Prenda(Tipo tipoPrenda){
        unTipoPrenda = tipoPrenda;
    }

    void setUnaPrenda(TelaMaterial unaTelaMaterial,
                      Color unColorPrincipal,
                      Color unColorSecundario,
                      Trama unaTrama){
        unTipoMaterialPrenda = unaTelaMaterial;
        colorPrincipal = unColorPrincipal;
        colorSecundario = unColorSecundario;
        unaTramaPrenda = unaTrama;
    }

    Prenda nuevaPrenda(Tipo unTipoPrenda){
        return unaPrenda = new Prenda(unTipoPrenda);
    }

}