package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface Vote {
    List<Voter> listOfVoters = new ArrayList<>();
    List<Candidate> listOfCandidates = new ArrayList<>();

    public void vote();

    public static Candidate win() {
        Comparator<Candidate> comparator = Comparator.comparing(obj -> obj.getNumberOfVoters());
        Collections.sort(listOfCandidates, comparator);
        return listOfCandidates.get(listOfCandidates.size() - 1);
    }

}
