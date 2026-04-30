package uni1a;


public class Anime extends ContenidoAudiovisual {

    private String director;
    private Temporada temporada;
    private String idiomaOficial;

    public Anime(String titulo, int duracionEnMinutos, String genero,  String director, Temporada temporada, String idiomaOficial) {

        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.temporada = temporada;
        this.idiomaOficial = idiomaOficial;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del anime:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
        System.out.println("Temporada: " + temporada.getNumero());
        System.out.println("Episodios: " + temporada.getEpisodios());
        System.out.println("Idioma: " + idiomaOficial);
        System.out.println("----------------------");
    }
}