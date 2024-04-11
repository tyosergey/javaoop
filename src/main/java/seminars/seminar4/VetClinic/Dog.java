package seminars.seminar4.VetClinic;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void voice(){
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
