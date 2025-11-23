
/* * Clase que representa un Producto en un sistema de comercio electrónico
 * Implementa los conceptos de POO: encapsulamiento, constructores, métodos
 */
public class Producto {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private boolean disponible;
    
    // Constructor que inicializa los 5 atributos
    public Producto(String nombre, String categoria, double precio, int stock, boolean disponible) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.disponible = disponible;
    }
    
    // MÉTODO 1: mostrarInformacion - muestra todos los detalles del producto
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL PRODUCTO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + String.format("%,.0f", precio).replace(",", ".") + " COP");
        System.out.println("Stock: " + stock + " unidades");
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("--------------------------------");
    }
    
    // MÉTODO 2: aplicarDescuento - reduce el precio según un porcentaje
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = precio * (porcentaje / 100);
            double precioAnterior = precio;
            precio -= descuento;
            System.out.println(" Descuento del " + porcentaje + "% aplicado a '" + nombre + "'");
            System.out.println("   Precio anterior: $" + String.format("%,.0f", precioAnterior).replace(",", ".") + " COP");
            System.out.println("   Nuevo precio: $" + String.format("%,.0f", precio).replace(",", ".") + " COP");
            System.out.println("   Ahorro: $" + String.format("%,.0f", descuento).replace(",", ".") + " COP");
        } else {
            System.out.println("Error: El porcentaje de descuento debe estar entre 0 y 100.");
        }
    }
    
    // MÉTODO 3: registrarCompra - suma unidades al inventario
    public void registrarCompra(int cantidad) {
        if (cantidad > 0) {
            int stockAnterior = stock;
            stock += cantidad;
            System.out.println(" Compra registrada para '" + nombre + "'");
            System.out.println("   Cantidad comprada: +" + cantidad + " unidades");
            System.out.println("   Stock anterior: " + stockAnterior + " unidades");
            System.out.println("   Stock actual: " + stock + " unidades");
            
            // Si el producto estaba no disponible y ahora tiene stock, se marca como disponible
            if (!disponible && stock > 0) {
                disponible = true;
                System.out.println("    Producto marcado como disponible automáticamente");
            }
        } else {
            System.out.println(" Error: La cantidad a comprar debe ser mayor que cero.");
        }
    }
    
    // MÉTODO 4: marcarComoDisponible - cambia el estado de disponibilidad
    public void marcarComoDisponible() {
        if (stock > 0) {
            disponible = true;
            System.out.println(" Producto '" + nombre + "' marcado como DISPONIBLE");
        } else {
            disponible = false;
            System.out.println("Producto '" + nombre + "' marcado como NO DISPONIBLE (stock cero)");
        }
    }
    
    // MÉTODO ADICIONAL: registrarVenta - resta unidades al inventario
    public void registrarVenta(int cantidad) {
        if (!disponible) {
            System.out.println("Venta no permitida: '" + nombre + "' no está disponible.");
        } else if (cantidad <= 0) {
            System.out.println(" Error: La cantidad a vender debe ser mayor que cero.");
        } else if (cantidad > stock) {
            System.out.println(" Error: Stock insuficiente para '" + nombre + "'");
            System.out.println("   Se solicitaron: " + cantidad + " unidades");
            System.out.println("   Stock disponible: " + stock + " unidades");
            System.out.println("   Faltan: " + (cantidad - stock) + " unidades");
        } else {
            int stockAnterior = stock;
            stock -= cantidad;
            System.out.println(" Venta registrada para '" + nombre + "'");
            System.out.println("   Cantidad vendida: -" + cantidad + " unidades");
            System.out.println("   Stock anterior: " + stockAnterior + " unidades");
            System.out.println("   Stock actual: " + stock + " unidades");
            
            // Si el stock llega a cero, se marca como no disponible
            if (stock == 0) {
                disponible = false;
                System.out.println("    Producto marcado como no disponible (stock agotado)");
            }
        }
    }
    
    // GETTERS Y SETTERS (encapsulamiento)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}
