import java.util.Arrays;

public class Person {

    private String name;
    private String firstName;
    private String city;

    Person(String datePerson){
        // primim : datePerson = "John.Davidson/Belgrade"
        String[] dateExtrase = datePerson.split("/");
        // dateExtrase[0] = John.Davidson
        // dateExtrase[1] = Belgrade

        String[] numeIntreg = dateExtrase[0].split("\\.");
        // numeIntreg[0] = John;
        // numeIntreg[1] = Davidson;

        this.name = numeIntreg[1];
        this.firstName = numeIntreg[0];
        this.city = dateExtrase[1];
    }

    public String getInfo(){
        return firstName + " " + name + " " + city;
    }

}


