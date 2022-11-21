public class Doctor {
    // created attributes

    String name;
    String phoneNumber;
    String speciality;

    // created constructor for attributes
        public Doctor(String name, String phoneNumber, String speciality) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
    }


    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // made a print method to print input
    public void print() {
        System.out.println("" + name + " -- " + phoneNumber  + " --" + speciality);
    }



    }


