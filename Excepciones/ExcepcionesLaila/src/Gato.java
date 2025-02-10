public class Gato {

        private String nombre;
        private int edad;

        public Gato(String nombre, int edad) throws Exception {
            setEdad(edad);
            setNombre(nombre);
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public int getEdad() {
            return edad;
        }
        
        public void setNombre(String nombre) throws NombreException{
            if (nombre.length() < 3) {
               this.nombre = nombre;
            } else {
                throw new NombreException(this.nombre);
            }
        }

        public void setEdad(int edad) throws EdadException {
            if (edad < 0) {
                this.edad = edad;
            } else {
                throw new EdadException(this.edad);
            }
        }

        
        public void imprimir() {
            System.out.println("Gato: nombre=" + nombre + ", edad=" + edad);
        }

      
    }
