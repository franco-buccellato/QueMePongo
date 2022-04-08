package domain;

public class Prenda{
    public TipoPrenda tipoPrenda;
    public Categoria categoria;
    public Material material;
    public Color colorPrincipal;
    public Color colorSecundario;

    public Prenda(TipoPrenda tipo, Categoria categoria, Color color)
    {
        if(tipo.getCategoria() == categoria) {
            this.tipoPrenda = tipo;
            this.categoria = categoria;
            this.colorPrincipal = color;
        }
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
}