class Game{
    Game(int i){
        System.out.println("Game Constructor");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame Constructor");
    }
}
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess Constructor");
    }

    public static void main(String... args) {
        Chess x = new Chess();
    }
}
