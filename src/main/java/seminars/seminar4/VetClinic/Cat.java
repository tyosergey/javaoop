package seminars.seminar4.VetClinic;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void voice(){
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
