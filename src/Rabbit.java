public class Rabbit {
    private String name;
    private int age;
    private boolean vaccinated;

    public Rabbit(String name, int age, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
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

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void showInfo() {
        System.out.println("Тварина: Кролик");
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        if (vaccinated) {
            System.out.println("Вакцинація: Провакциновано");
        } else {
            System.out.println("Вакцинація: Відсутня");
        }
    }
}
