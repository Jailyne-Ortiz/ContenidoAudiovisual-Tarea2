package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // 1. Objetos de apoyo (Asegúrate de haber guardado Actor, Temporada e Investigador)
        Actor actor1 = new Actor("Pedro Pascal");
        Temporada temp1 = new Temporada(1, 3);
        Investigador investi1 = new Investigador("Claude Lanzmann");
        Temporada tempAnime = new Temporada(1, 26);

        // 2. Arreglo de tamaño 5 (Fundamental para incluir la Novela Romántica)
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // 3. Creación de las 5 instancias con los parámetros correctos
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", actor1);
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", temp1);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy", investi1);
        contenidos[3] = new Anime("Kimetsu No Yaiba", 24, "Accion", "Haruo Sotazaki", tempAnime, "Japones");
        contenidos[4] = new NovelasRomanticas("Orgullo y Prejuicio", 120, "Romance", "Jane Austen", actor1);

        // 4. Bucle para mostrar los detalles
        for (ContenidoAudiovisual contenido : contenidos) {
            if (contenido != null) {
                contenido.mostrarDetalles();
            }
        }
    }
}