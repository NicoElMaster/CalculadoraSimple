package packpageOperaciones;

public class Operaciones {

    public Operaciones() {
    }

    public Double sumar(Double param1, Double param2) {
        return param1 + param2;
    }

    public Double restar(Double param1, Double param2) {
        return param1 - param2;
    }

    public Double multiplicar(Double param1, Double param2) {
        return param1 * param2;
    }

    public Double dividir(Double param1, Double param2) {
        Double resultado = 0.0;
        if (param2 != 0) {
            resultado = param1 / param2;
        }
        return resultado;
    }

}
