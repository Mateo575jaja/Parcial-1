public class Estudiante {
    String nombre;
    String apellido;
    String carnet;
    int semestre;
    float promedio;

    public Estudiante(String nombre, String apellido, String carnet, int semestre, float promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Estudiante() {
    }
    
    
}
