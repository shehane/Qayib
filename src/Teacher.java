public class Teacher extends Human {
    private int experience;
    private int salary;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, String surname, int age, int experience, int salary) {

        super(name, surname, age);
        this.experience = experience;
        this.salary = salary;
    }

}
