/**
 * Clase principal que demuestra el funcionamiento de la clase Producto
 * Implementa todos los métodos requeridos con casos de prueba completos
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(" INICIO DEL SISTEMA DE GESTIÓN DE PRODUCTOS");
        System.out.println("=============================================\n");
        
        // Crear 5 productos de tecnología con datos reales de Colombia 2025
        System.out.println(" CREANDO 5 PRODUCTOS DE TECNOLOGÍA");
        System.out.println("=====================================");
        
        Producto producto1 = new Producto("iPhone 15 128 GB", "Tecnología", 4299000.0, 10, true);
        Producto producto2 = new Producto("Tablet Samsung Galaxy Tab S9", "Tecnología", 2599900.0, 6, true);
        Producto producto3 = new Producto("Audífonos Sony WH-1000XM5", "Tecnología", 1399000.0, 0, false);
        Producto producto4 = new Producto("Control DualSense para PS5", "Tecnología", 429900.0, 3, true);
        Producto producto5 = new Producto("Televisor LG 65\" UHD 4K Smart TV", "Tecnología", 2199000.0, 0, false);
        
        System.out.println(" 5 productos creados exitosamente!\n");
        
        // 1. MOSTRAR INFORMACIÓN DE TODOS LOS PRODUCTOS
        System.out.println(" MOSTRANDO INFORMACIÓN COMPLETA DE PRODUCTOS");
        System.out.println("==============================================");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
        producto4.mostrarInformacion();
        producto5.mostrarInformacion();
        
        // 2. APLICAR DESCUENTOS
        System.out.println(" APLICANDO DESCUENTOS A PRODUCTOS");
        System.out.println("===================================");
        producto1.aplicarDescuento(7);   // 7% de descuento
        producto2.aplicarDescuento(10);  // 10% de descuento
        producto4.aplicarDescuento(15);  // 15% de descuento
        producto3.aplicarDescuento(120); // Prueba de validación (error)
        System.out.println();
        
        // 3. REGISTRAR COMPRAS DE INVENTARIO
        System.out.println(" REGISTRANDO COMPRAS DE INVENTARIO");
        System.out.println("====================================");
        producto3.registrarCompra(15); // Reponer producto agotado
        producto5.registrarCompra(8);  // Reponer producto agotado
        producto1.registrarCompra(5);  // Aumentar stock existente
        producto3.registrarCompra(-2); // Prueba de validación (error)
        System.out.println();
        
        // 4. CAMBIAR DISPONIBILIDAD
        System.out.println(" CAMBIANDO ESTADO DE DISPONIBILIDAD");
        System.out.println("====================================");
        producto3.marcarComoDisponible(); // Debería marcarse como disponible
        producto5.marcarComoDisponible(); // Debería marcarse como disponible
        producto2.marcarComoDisponible(); // Cambio de estado
        System.out.println();
        
        // 5. REGISTRAR VENTAS
        System.out.println(" REGISTRANDO VENTAS DE PRODUCTOS");
        System.out.println("==================================");
        producto1.registrarVenta(2);  // Venta exitosa
        producto2.registrarVenta(10); // Error: stock insuficiente
        producto3.registrarVenta(5);  // Venta exitosa
        producto4.registrarVenta(1);  // Venta exitosa
        producto5.registrarVenta(3);  // Venta exitosa
        producto3.registrarVenta(-2); // Prueba de validación (error)
        System.out.println();
        
        // ESTADO FINAL DEL SISTEMA
        System.out.println("ESTADO FINAL DEL INVENTARIO");
        System.out.println("==============================");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
        producto4.mostrarInformacion();
        producto5.mostrarInformacion();
        
        System.out.println(" PROGRAMA FINALIZADO EXITOSAMENTE");
        System.out.println("===================================");
        System.out.println("Resumen de implementación:");
        System.out.println("✓ Clase Producto con 5 atributos correctamente definidos");
        System.out.println("✓ Constructor que inicializa todos los atributos");
        System.out.println("✓ 5 métodos implementados con validaciones");
        System.out.println("✓ Encapsulamiento mediante atributos privados");
        System.out.println("✓ Clase Main con demostración completa");
        System.out.println("✓ Manejo de errores y casos edge");
        System.out.println("✓ Formato de precios en COP colombianos");
    }
}
