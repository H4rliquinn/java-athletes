package src.com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteInjector
{
    @Override
    public Processor displayAthlete()
    {
        return new app(new TrackAthleteImpl());
    }
}
