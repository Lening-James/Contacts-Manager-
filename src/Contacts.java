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


//    public static void main(String[] args) {
//        Contacts contact1 = new Contacts("lening", "rodas", "43534346453");
//        System.out.println("Name " + "  |  " + "Phone Number");
//        System.out.println("--------------");
//        System.out.println(contact1.toString());
//
//
//    }

}
