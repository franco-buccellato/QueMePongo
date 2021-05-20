package domain;

public enum Tipo{
    REMERA(Categoria.SUPERIOR),
    BUZO(Categoria.SUPERIOR),
    CAMISA_LARGA(Categoria.SUPERIOR),
    CAMISA_CORTA(Categoria.SUPERIOR),
    PANTALON(Categoria.INFERIOR),
    SHORT(Categoria.INFERIOR),
    ZAPATILLA(Categoria.CALZADO),
    ZAPATO(Categoria.CALZADO),
    TACO(Categoria.CALZADO),
    OJOTA(Categoria.CALZADO),
    SANDALIA(Categoria.CALZADO),
    GORRA(Categoria.ACCESORIO),
    BOINA(Categoria.ACCESORIO),
    VINCHA(Categoria.ACCESORIO),
    COLLAR(Categoria.ACCESORIO),
    PULSERA(Categoria.ACCESORIO),
    PANUELO(Categoria.ACCESORIO),
    ANTEOJOS(Categoria.ACCESORIO);

    Tipo(Categoria unaCategoria) {

    }
}