package Session15.Btth_ss15;

public class EmergencyPatient extends Patient {
    private int priorityLevel;

    public EmergencyPatient(String id, String fullName, int age,
                            String medicalCondition, int priorityLevel) {
        super(id, fullName, age, medicalCondition);
        this.priorityLevel = priorityLevel;
    }

    @Override
    public void showInfo() {
        System.out.println("CAP CUU | ID: " + id +
                ", Ten: " + fullName +
                ", Tuoi: " + age +
                ", Tinh trang: " + medicalCondition +
                ", Muc do uu tien: " + priorityLevel);
    }
}