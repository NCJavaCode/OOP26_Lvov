public class Cat extends Animal {
    private String colour;

    public Cat(String name, int age, String colour) {
        super(name, "Кіт", age);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Колір: " + colour);
    }

    @Override
    public void showRecommendations() {
        System.out.println("Рекомендації: Потрібні регулярні консультації та огляд у ветеринара. " +
                "Обов'язкова наявність спеціальних ігрових комплексів");
    }
}
