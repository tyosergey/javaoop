package seminars.seminar4.Bank;

public class Exchange {
    private String name;

    public Exchange(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "name='" + name + '\'' +
                '}';
    }

    public Exchange() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
