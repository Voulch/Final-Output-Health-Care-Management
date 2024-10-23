package Healthcare;

public class MedicalLog {
    private final String logId;
    private final Patient patient;
    private final Doctor doctor;
    private Nurse nurse;

    public MedicalLog(String logId, Patient patient, Doctor doctor, Nurse nurse) {
        this.logId = logId;
        this.patient = patient;
        this.doctor = doctor;
        this.nurse = nurse;
    }

    public void addStaff(Nurse nurse) {
        this.nurse = nurse;
    }
    
    public void displayLog() {
        System.out.println("\n============= Medical Log =============");
        System.out.println("\nLog ID: " + logId);
        System.out.println("Patient ID: " + patient.getId());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Nurse: " + nurse.getName());
        System.out.println("\n=======================================");
    }
}