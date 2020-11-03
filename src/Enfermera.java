import java.util.ArrayList;

public class Enfermera extends Thread {
    public String nombre;
    public Entrenador entr;

    public Enfermera(String nombre, Entrenador entr) {
        this.nombre = nombre;
        this.entr=entr;
    }

    @Override
    public void run() {
        curarPokemon(entr.equipo);
    }

    public void hablar() {
        ArrayList<String> frases = new ArrayList<String>("Hola que alegria", "Como estás", "Cuánto tiempo", "Todo bien?")
        try {
            System.out.println();
            sleep(1000);
            System.out.println();
            sleep(1000);
            System.out.println();
            sleep(1000);
            System.out.println();
            sleep(1000);
            System.out.println("Tus pokemon se están curando");
            sleep(1000);
            System.out.println("Ya casi está");
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        public void curarPokemon(ArrayList<Pokemon> equipo) {
        try {
            for (Pokemon i : equipo) {
                i.salud_Act = i.salud_Max;
                sleep(4000);
                System.out.println("¡El pokémon "+i.id+" ya está curado! "+i.salud_Act+"/"+i.salud_Max);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
