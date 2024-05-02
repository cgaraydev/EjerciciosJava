package ejerciciosotros;

public class Automovil {
    String marca;
    String color;
    int potencia;
    double precio;

    public Automovil() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("La marca es: " + marca);
        System.out.println("El color es: " + color);
        System.out.println("La potencia es: " + potencia);
        System.out.println("El precio es: " + precio);
    }

    @Override
    public String toString() {
        return "ejerciciosotros.Automovil{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                ", precio=" + precio +
                '}';
    }
}

