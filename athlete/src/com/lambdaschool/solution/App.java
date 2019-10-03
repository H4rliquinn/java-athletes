package com.lambdaschool.solution;

public class App implements Processor
{
    private CreateAthlete athlete;

    App(CreateAthlete athlete)
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
