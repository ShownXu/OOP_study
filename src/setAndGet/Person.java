package setAndGet;
public class Person {

    private String name;
    private int age;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    public void setAge(int age) {
        if(age < 0) {
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    public int getAge() {
        System.out.println(this.age);
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }


    public void eat(){
        System.out.println(this.getName() + " is eating");
    }
}
