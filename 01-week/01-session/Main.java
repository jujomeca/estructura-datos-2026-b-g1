public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Juan José", "Ingeniería de Sistemas", 3);
        Estudiante est2 = new Estudiante("María Pérez", "Ingeniería Industrial", 5);

        est1.presentarse();
        est2.presentarse();
    }
}