public class Main {

    public static void main(String[] args) {

        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        String[] datePersons = text.split(" ");

        Person person1 = new Person(datePersons[0]);
        Person person2 = new Person(datePersons[1]);
        Person person3 = new Person(datePersons[2]);

        Person[] persons = new Person[3];
        persons[0] = person1;
        persons[1] = person2;
        persons[2] = person3;

        for(int i = 0; i < persons.length; i++)
        {
            System.out.println(persons[i].getInfo());
        }
    }
}

