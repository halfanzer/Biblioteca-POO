public class Generico {
    //Nombre de la clase  
  
    //Variables de instancia
      public int id;
      public String nombre;
      private boolean estado;
      public String autor;
      
      
      //Constructores  
      public Generico() {
    
      }
      public Generico(int id, String nombre, String formato, boolean estado, String autor) {
          this.id = id;
          this.nombre = nombre;
          this.estado = estado;
          this.autor = autor;
      }

      // getters and setters
      public int getId() {
        return id;
      }

      public void setId(int id){
        this.id = id;
      }

      public String getNombre() {
        return nombre;
      }

      public void setNombre(String nombre){
        this.nombre = nombre;
      }

      public boolean getEstado() {
        return estado;
      }
      
      public void setEstado(boolean estado){
        this.estado = estado;
      }

      //Metodos
      public void mostrarId () {
  
          System.out.println();
      }
  }
  
