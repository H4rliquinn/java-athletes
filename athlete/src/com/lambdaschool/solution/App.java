package src.com.lambdaschool.solution;

public class App implements Processor
{
    private CreateAthlete athlete;

    public App(CreateAthlete athlete)
    {
        this.athlete = athlete;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        athlete.displayAthlete();
        System.out.println("************\n");
    }
}
