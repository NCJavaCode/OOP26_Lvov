public class Class {
    public static void main(String[] args) {
        Application application1 = Application.createApplication("Олексій", "Белла");
        Application application2 = Application.createApplication("Оксана", "Мурчик",
                "Опікунство");
        application1.showInfo();
        application2.showInfo();

        Animal animal1 = new Dog("Рекс", 4, "Вівчарка");
        Animal animal2 = new Cat("Фелікс", 2, "Рудий");
        Animal animal3 = new Rabbit("Джордж", 1, true);
        animal1.showInfo();
        animal2.showInfo();
        animal2.showRecommendations();
        animal3.showRecommendations();
    }
}
