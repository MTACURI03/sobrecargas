public class Producto {
        public double precio;
        public String nombre;
        public int cantidad;

        public Producto() {
            this.nombre = "Vacio";
        }

        public Producto(double precio, String nombre) {
            this.precio = precio;
            this.nombre = nombre;
        }

        public Producto(String nombre,  int cantidad, double precio) {
            this.precio = precio;
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        public void imprimir(){
            System.out.println("nombre :   "+nombre + "  "+   "precio:    " +precio + "  "+   "cantidad:   " +"  "     +cantidad);
        }
        public static void main (String [] args){
            Producto producto1 = new Producto();
            Producto producto2 = new Producto(12,"Mateo");
            Producto producto3 = new Producto("mateo",2,25);
            System.out.println("Producto sin parametros");
            System.out.println("Producto con dos parametros");
            producto2.imprimir();
            System.out.println("Producto con tres parametros");
            producto3.imprimir();
        }
    }
