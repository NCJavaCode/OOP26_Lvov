public class Rabbit extends Animal {
    private boolean vaccinated;

    public Rabbit(String name, int age, boolean vaccinated) {
        super(name, "Кролик", age);
        this.vaccinated = vaccinated;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        if (vaccinated) {
            System.out.println("Вакцинація: Провакциновано");
        } else {
            System.out.println("Вакцинація: Відсутня");
        }
    }

    @Override
    public void showRecommendations() {
        System.out.println("Рекомендації: Кролику обов'язково потрібен просторий вольєр та " +
                "будиночок-схованка з двома виходами");
    }
}
