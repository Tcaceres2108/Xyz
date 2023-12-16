
package xyz;


public class ventas {
    private int idVentas;
    private String Fecha_transaccion;
    private String NombreProducto;
    private int Cantidad;
    private double Precio;

    public ventas(int idVentas, String Fecha_transaccion, String NombreProducto, int Cantidad) {
        this.idVentas = idVentas;
        this.Fecha_transaccion = Fecha_transaccion;
        this.NombreProducto = NombreProducto;
        this.Cantidad = Cantidad;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public String getFecha_transaccion() {
        return Fecha_transaccion;
    }

    public void setFecha_transaccion(String Fecha_transaccion) {
        this.Fecha_transaccion = Fecha_transaccion;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
   
    
    
    
    
}
