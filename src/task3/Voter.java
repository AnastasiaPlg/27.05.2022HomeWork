package task3;

import java.util.Objects;

public class Voter extends Person implements Vote {
    String passportNumber;

    public Voter(String name, String sex, int age, String passportNumber) {
        super(name, sex, age);
        this.passportNumber = passportNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voter voter = (Voter) o;
        return Objects.equals(passportNumber, voter.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    @Override
    public void vote() {
        int i = (int) (listOfCandidates.size() * Math.random());
        Candidate candidate = listOfCandidates.get(i);
        if (getAge() >= 18 && listOfVoters.contains(this) == false) {
            candidate.setNumberOfVoters(candidate.getNumberOfVoters() + 1);
            listOfVoters.add(this);
        } else {
            System.out.println("You can't vote!");
        }
    }
}
