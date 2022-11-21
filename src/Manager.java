import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    Scanner scan = new Scanner(System.in);
    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
    String name;


    {

    }
    // method to create new patient

    public void createNewPatient() {
        System.out.println("Enter patient name: ");
        String name = scan.nextLine();
        System.out.println("Enter patient phone number: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter patient description: ");
        String description = scan.nextLine();
        System.out.println("Enter patient age: ");
        int age = scan.nextInt();
        scan.nextLine();

        Patient patient = new Patient(name, phoneNumber, description, age);
        patients.add(patient);

    }

    public void createNewDoctor() {
        System.out.println("Enter doctor name: ");
        String name = scan.nextLine();
        System.out.println("Enter doctor phone number: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter doctor speciality: ");
        String specialty = scan.nextLine();
        Doctor doctor = new Doctor(name, phoneNumber, specialty);
        doctors.add(doctor);

    }

    public void readPatient() {
        System.out.println("here is your patient");
        for (Patient patient : this.patients) {
            patient.print();
        }


    }

    public void readDoctor() {
        System.out.println("here is your doctor");
        for (Doctor doctor : this.doctors) {
            doctor.print();
        }
    }

    public void updatePatient() {

        System.out.println("Enter patient name: ");
        String name = scan.nextLine();
        for (Patient patient : patients) {
            if (patient.getName().equals(name)) {
                System.out.println("Enter patient phone number: ");
                String phoneNumber = scan.nextLine();
                System.out.println("Enter patient description: ");
                String description = scan.nextLine();
                System.out.println("Enter patient age: ");
                int age = scan.nextInt();
                scan.nextLine();
                patient.setPhoneNumber(phoneNumber);
                patient.setDescription(description);
                patient.setAge(age);
                break;

            }
        }
    }

            public void updateDoctor() {

                System.out.println("Enter doctor name: ");
                name = scan.nextLine();
                for (Doctor doctor : doctors) {
                    if (doctor.getName().equals(name)) {
                        System.out.println("Enter doctor phone number: ");
                        String phoneNumber = scan.nextLine();
                        System.out.println("Enter doctor speciality: ");
                        String speciality = scan.nextLine();
                        scan.nextLine();
                        doctor.setPhoneNumber(phoneNumber);
                        doctor.setSpeciality(speciality);
                        break;
                    }


                }

            }

            public void deletePatient () {

                System.out.println("Enter patient name you want to delete: ");
                name = scan.nextLine();
                for (Patient patient : patients) {
                    if (patient.getName().equals(name)) {
                        patients.remove(patient);
                        break;
                    }

                }
            }


            public void deleteDoctor () {
                System.out.println("Enter patient name you want to delete: ");
                name = scan.nextLine();
                for (Doctor doctor : doctors) {
                    if (doctor.getName().equals(name)) {
                        doctors.remove(doctor);
                        break;
                    }


                }

            }
        }


