import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pokemon pk1 = new Pokemon("charmander", 0, 15);
        Pokemon pk2 = new Pokemon("squirtle", 0, 15);
        Pokemon pk3 = new Pokemon("pikachu", 0, 20);
        Pokemon pk4 = new Pokemon("lugia", 0, 100);
        Pokemon pk5 = new Pokemon("abra", 0, 40);
        Pokemon pk6 = new Pokemon("onix", 0, 25);

        ArrayList<Pokemon> equipo = new ArrayList<Pokemon>();
        equipo.add(pk1);
        equipo.add(pk2);
        equipo.add(pk3);
        equipo.add(pk4);
        equipo.add(pk5);
        equipo.add(pk6);

        Entrenador jaime = new Entrenador("Jaime", equipo);

        Enfermera miriam = new Enfermera("Miriam", jaime);
        miriam.start();
    }
}
