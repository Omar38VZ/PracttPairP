package Cafe;

public class ProductoMenu {
    private String nombre; 
    private int SKU;
    private double precioBase; 

    ProductoMenu(String nombre, int SKU, double precioBase) {
        this.nombre = nombre; 
        this.SKU = SKU; 
        this.precioBase = precioBase;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int sKU) {
        SKU = sKU;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    public String getNombre() {
        return nombre;
    }

}

