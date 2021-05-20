package domain;

import java.util.List;

public class Guardaropa {
    List<Prenda> prendasSuperiores;
    List<Prenda> prendasInferiores;
    List<Prenda> calzados;
    List<Prenda> accesorios;

    public List<Prenda> sugerencias() {
        return Sets // Sets no es una clase estándar de Java, ver notas finales
                .cartesianProduct(prendasSuperiores, prendasInferiores, calzados)
                .stream()
                .map((list) -> new Atuendo(list.get(0), list.get(1), list.get(2)))
                .collect(toList());
    }
}
