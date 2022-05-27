package task3;

public class Candidate extends Person {
    private int numberOfVoters;
    private String program;

    public Candidate(String name, String sex, int age, String program) {
        super(name, sex, age);
        this.program = program;
    }

    public int getNumberOfVoters() {
        return numberOfVoters;
    }

    public void setNumberOfVoters(int numberOfVoters) {
        this.numberOfVoters = numberOfVoters;
    }

    @Override
    public String toString() {
        return getName() + ", " + getAge() + ", " + program + ", number of voters: " + numberOfVoters;
    }

    @Override
    public void vote() {
        numberOfVoters++;
    }

    public void registerAsCandidate() {
        listOfCandidates.add(this);
    }

}
