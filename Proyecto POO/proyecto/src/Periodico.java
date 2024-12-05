public class Periodico extends Generico{
    public String fecha;
    public Periodico(int id, String nombre, String formato, String fecha) {
        this.fecha=fecha;
    
}
public String getFecha(){
    return fecha;
  }
  public void setFecha(String fecha){
  this.fecha = fecha;
  }


}
