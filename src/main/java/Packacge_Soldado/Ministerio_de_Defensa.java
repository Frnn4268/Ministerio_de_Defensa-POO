package Packacge_Soldado;

public class Ministerio_de_Defensa {
    
    private String Codigo;
    private String Nombre;
    private String Apellido;
    private String Graduacion;

    public String getGraduacion() {
        return Graduacion;
    }

    public void setGraduacion(String Graduacion) {
        this.Graduacion = Graduacion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public void Graduacion(){
      System.out.println("Fecha de Graduación");
    }
}
