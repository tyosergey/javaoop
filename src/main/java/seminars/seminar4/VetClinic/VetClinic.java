package seminars.seminar4.VetClinic;

import java.util.List;

public class VetClinic <T extends Animal>{
    private List<T> animals;

    public VetClinic(List<T> animals) {
        this.animals = animals;
    }

    public List<T> getAnimals() {
        return animals;
    }

    public void setAnimals(List<T> animals) {
        this.animals = animals;
    }

    public void animalInspection(int index){
        System.out.println("Животное " + animals.get(index).getName() + " был осмотрен.");
    }

    public void animalHeal(int index){
        System.out.println("Животное " + animals.get(index).getName() + " был вылечен.");
    }

    public T getIndex(int index){
        return animals.get(index);
    }
}
