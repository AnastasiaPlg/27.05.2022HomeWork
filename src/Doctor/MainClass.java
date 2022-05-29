package task2;

public class MainClass {
    public static void main(String[] args) {
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();
        Doctor doctor = new Therapist();
        dentist.treatIllness();
        therapist.treatIllness();
        doctor.treatIllness();
    }
}
