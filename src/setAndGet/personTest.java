package setAndGet;

public class personTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("周杰伦" );
        p1.setAge( 18 );
        p1.setSex("男");

        p1.eat();
        int age = p1.getAge();

    }
}
