public class Cat {
    private String name;
    private int age;
    private String colour;

    public Cat(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void showInfo() {
        System.out.println("Тварина: Кіт");
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Колір: " + colour);
    }
}
