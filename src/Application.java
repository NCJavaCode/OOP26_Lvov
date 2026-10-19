public class Application {
    private String userName;
    private String animalName;
    private String applicationType;

    public Application(String userName, String animalName, String applicationType) {
        this.userName = userName;
        this.animalName = animalName;
        setApplicationType(applicationType);
    }

    public static Application createApplication(String userName, String animalName) {
        return new Application(userName, animalName, "Усиновлення");
    }

    public static Application createApplication(String userName, String animalName, String applicationType) {
        return new Application(userName, animalName, applicationType);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        if ("Усиновлення".equalsIgnoreCase(applicationType) || "Опікунство".equalsIgnoreCase(applicationType)) {
            this.applicationType = applicationType;
        } else {
            System.out.println("Помилка: тип заявки може бути лише 'Усиновлення' або 'Опікунство'");
        }
    }

    public void showInfo() {
        System.out.println("Заявка на " + applicationType + ": користувач " + userName + " обирає тваринку " +
                "на ім'я " + animalName);
    }
}
