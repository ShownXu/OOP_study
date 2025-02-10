package test;

public class Client {
    public static void main(String[] args) {
        Game dnf = new DNF();
        Game lol = new LOL();
        Game cs = new CS();

        Player x = new Player();
        x.setName("彭于晏");
        x.happy(dnf);
        x.happy(lol);
        x.happy(cs);

    }
}
