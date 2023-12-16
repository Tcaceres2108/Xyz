
package xyz;


public class productos {
    private int idProductos;
    private String NombreProducto;
    private String Descripcion;
    private double Precio;
    private int Cantidad;

    public productos(int idproductos, String Nombre, String Descripcion, double Precio, int Cantidad) {
        this.idProductos = idproductos;
        this.NombreProducto = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public int getIdproductos() {
        return idProductos;
    }

    public void setIdproductos(int idproductos) {
        this.idProductos = idproductos;
    }

    public String getNombre() {
        return NombreProducto;
    }

    public void setNombre(String Nombre) {
        this.NombreProducto = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
    
}
