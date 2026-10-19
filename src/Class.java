public class Class {
    public static void main(String[] args) {
        Application application1 = Application.createApplication("Олексій", "Белла");
        Application application2 = Application.createApplication("Оксана", "Мурчик",
                "Опікунство");
        application1.showInfo();
        application2.showInfo();
    }
}
