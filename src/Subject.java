import java.util.ArrayList;

public class Subject
{
    private String title;
    private double credits;
    private Teacher prepod;
    protected ArrayList<Day>  days = new ArrayList<>();

    public void AddDay (Day day)
    {
        days.add(day);
    }
    public double calculateGPA ()
    {
        int a =0;

        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public Teacher getPrepod() {
        return prepod;
    }

    public void setPrepod(Teacher prepod) {
        this.prepod=prepod;
    }


}
