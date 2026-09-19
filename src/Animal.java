public class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 40) {
            this.age = age;
        } else {
            System.out.println("Помилка: вік тварини повинен бути від 0 до 40 років");
        }
    }

    public void showInfo() {
        System.out.println("Тварина: " + species);
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
    }
}
