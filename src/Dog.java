public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, "Собака", age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Реалізація принципу динамічного поліморфізму
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Порода: " + breed);
    }

    // Реалізація принципу динамічного поліморфізму
    @Override
    public void showRecommendations() {
        System.out.println("Рекомендації: Обов'язкові щоденні прогулянки, використання для прогулянок шлейки " +
                "замість нашийника та наявність адресника з Вашим телефоном");
    }
}
