package lectures.lecture5;

import java.util.List;

public class Contact {
    private List<People> contacts;
    private int index;

    public Contact(List<People> contacts) {
        this.contacts = contacts;
    }

    public Contact() {
    }

    public List<People> getContacts() {
        return contacts;
    }

    public void setContacts(List<People> contacts) {
        this.contacts = contacts;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contacts=" + contacts +
                ", index=" + index +
                '}';
    }
}
