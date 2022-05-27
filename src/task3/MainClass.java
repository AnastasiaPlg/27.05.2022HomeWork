package task3;

import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("Emelian", "Male", 35, "All the best!");
        candidate1.registerAsCandidate();
        candidate1.vote();
        Candidate candidate2 = new Candidate("Sharlotta", "female", 39, "Tasty pies!");
        candidate2.registerAsCandidate();
        candidate2.vote();
        Candidate candidate3 = new Candidate("Ignatiy", "Male", 56, "Free taxi!");
        candidate3.registerAsCandidate();
        candidate3.vote();
        Candidate candidate4 = new Candidate("Boleslav", "Male", 47, "Make great country!");
        candidate4.registerAsCandidate();
        candidate4.vote();
        Voter voter1 = new Voter("Cristian", "Male", 25, "MP1236547");
        voter1.vote();
        Voter voter2 = new Voter("Elena", "Female", 25, "MC8754691");
        voter2.vote();
        Voter voter3 = new Voter("Gleb", "Male", 55, "MP1236547");
        voter3.vote();
        Voter voter4 = new Voter("Maria", "Female", 25, "MC8745693");
        voter4.vote();
        Voter voter5 = new Voter("Prohor", "Male", 37, "MP7412589");
        voter5.vote();
        Voter voter6 = new Voter("Olesia", "Female", 25, "MP3265984");
        voter6.vote();
        Voter voter7 = new Voter("Nikita", "Male", 43, "MP8523674");
        voter7.vote();
        Voter voter8 = new Voter("Feliks", "Male", 16, "MV6547832");
        voter8.vote();
        Voter voter9 = new Voter("Inessa", "Female", 25, "MW8546973");
        voter9.vote();
        Voter voter10 = new Voter("Tihon", "Male", 19, "MR1258746");
        voter10.vote();
        System.out.println("Winner is " + Vote.win());
    }
}
