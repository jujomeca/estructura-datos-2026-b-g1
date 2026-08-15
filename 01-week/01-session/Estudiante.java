public class Estudiante {
    String nombre;
    String programa;
    int semestre;

    public Estudiante(String nombre, String programa, int semestre) {
        this.nombre = nombre;
        this.programa = programa;
        this.semestre = semestre;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + ", estudio " + programa + " y voy en el semestre " + semestre + ".");
    }
}