package Lista9.Atividade1;

public class HomeTheaterMain {
    public static void main(String[] args) {

        SistemaDeSom som = new SistemaDeSom();
        SistemaDeVideo video = new SistemaDeVideo();

        HomeTheater homeTheater = new HomeTheater(som, video);

        System.out.println(homeTheater);

    }
}
