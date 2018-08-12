package raj.aayush.after.jdk8.groupby;
public class Pet {
    private final String name;
    private final int age;
    
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Pet{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}