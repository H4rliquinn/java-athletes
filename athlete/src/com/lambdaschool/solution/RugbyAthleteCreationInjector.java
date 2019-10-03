package src.com.lambdaschool.solution;

public class RugbyAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new App(new RugbyAthleteImpl());
    }
}
