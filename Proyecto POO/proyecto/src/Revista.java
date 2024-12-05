public class Revista extends Generico {
    public int edicion;


    public Revista () {

    }

    public Revista (int id, String nombre, String formato, int edicion) {
        this.edicion=edicion;

    }
    // getters and setters

    public int getEdicion(){
        return edicion;
    }

   public void setEdicion(int edicion){
    this.edicion = edicion;
   }
}


