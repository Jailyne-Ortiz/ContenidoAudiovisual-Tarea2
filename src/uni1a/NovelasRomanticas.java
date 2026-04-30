package uni1a;

public class NovelasRomanticas extends ContenidoAudiovisual {

    private String autor;
    private Actor actor;

    public NovelasRomanticas(String titulo, int duracionEnMinutos, String genero, String autor, Actor actor) {
        super(titulo, duracionEnMinutos, genero);
        this.autor = autor;
        this.actor = actor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la novela:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Autor: " + autor);
        System.out.println("Actor: " + (actor != null ? actor.getNombre() : "N/A"));
        System.out.println("----------------------");
    }
}