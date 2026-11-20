import java.util.*;

public class OperacionesConjuntos {

    public static void main(String[] args) {

        HashMap<Integer, String> alumnos = new HashMap<>();

        alumnos.put(101, "Antonio");
        alumnos.put(102, "Carlos");
        alumnos.put(103, "Maria");
        alumnos.put(104, "Jose");
        alumnos.put(105, "Luis");
        alumnos.put(106, "Ana");

        HashSet<Integer> programacion = new HashSet<>();
        programacion.add(101);
        programacion.add(102);
        programacion.add(103);
        programacion.add(104);

        HashSet<Integer> redes = new HashSet<>();
        redes.add(103);
        redes.add(104);
        redes.add(105);
        redes.add(106);

        // UNION
        HashSet<Integer> union =
                new HashSet<>(programacion);
        union.addAll(redes);

        // INTERSECCION
        HashSet<Integer> interseccion =
                new HashSet<>(programacion);
        interseccion.retainAll(redes);

        // DIFERENCIA
        HashSet<Integer> diferencia =
                new HashSet<>(programacion);
        diferencia.removeAll(redes);

        // ARBOL ORDENADO
        TreeSet<Integer> ordenados =
                new TreeSet<>(union);

        System.out.println("UNION:");
        for (int id : union) {
            System.out.println(alumnos.get(id));
        }

        System.out.println("INTERSECCION:");
        for (int id : interseccion) {
            System.out.println(alumnos.get(id));
        }

        System.out.println("DIFERENCIA:");
        for (int id : diferencia) {
            System.out.println(alumnos.get(id));
        }

        System.out.println("MATRICULAS ORDENADAS:");
        for (int id : ordenados) {
            System.out.println(id + " - " + alumnos.get(id));
        }
    }
}