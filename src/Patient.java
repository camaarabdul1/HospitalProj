public class Patient {
    // created attributes
    String name;
    String phoneNumber;
    String description;
    int age;


    // created constructor for attributes
    public Patient(String name, String phoneNumber, String description, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.age = age;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    // made a print method to print out input
    public void print() {
        System.out.println("--" + name + " -- " + phoneNumber + "--" +description+ " --" + age);
    }
}