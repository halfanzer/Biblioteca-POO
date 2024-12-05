public class Libro extends Generico{
  String Editorial;

  public Libro () {
  }

  public Libro (int id, String nombre, String formato, String Editorial) {
      this.Editorial=Editorial;
}

public String getEditorial(){
  return Editorial;
}
public void setEditorial(String Editorial){
this.Editorial = Editorial;
}
}