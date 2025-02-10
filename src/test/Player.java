package test;

public class Player {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void happy(Game game) {

        game.start();
        game.play();
        game.end();
        System.out.println(this.getName()+"很开心");

    }
}
