import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Manager manager = new Manager();

    public static void main(String[] args) {
        int option = 0;


        do {
            System.out.println("1. create new patient");
            System.out.println("2. create new doctor");
            System.out.println("3. read patients");
            System.out.println("4. read doctors");
            System.out.println("5. update patient by name");
            System.out.println("6. update doctor by name");
            System.out.println("7. Delete patient");
            System.out.println("8. Delete doctor");
            System.out.println("9. quit");

            option = scan.nextInt();

            switch (option) {


                case 1:
                    manager.createNewPatient();
                    break;

                case 2:
                    manager.createNewDoctor();
                    break;


                case 3:
                    manager.readPatient();
                    break;


                case 4:
                    manager.readDoctor();
                    break;


                case 5:
                    manager.updatePatient();
                    break;


                case 6:
                    manager.updateDoctor();
                    break;


                case 7:
                    manager.deletePatient();
                    break;

                case 8:
                    manager.deleteDoctor();
                    break;

            }
        }
        while (option != 9);

        }

    }

