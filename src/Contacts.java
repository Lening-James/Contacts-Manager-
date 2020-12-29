public class Contacts {

    private String firsName;
    private String lastName;
    private String phoneNumber;

    public Contacts(String firstName, String lastName, String phoneNumber){
        this.firsName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;

    }

    public String toString(){
        return this.firsName + " " + this.lastName + " | " + this.phoneNumber;
    }



}
