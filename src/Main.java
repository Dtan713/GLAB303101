//create a class name Person

public class Person {
    String name;
    static int lifeSpan = 60;
    static double ageFactor = 1.0;
}

    public Person() {
        name = "Don";

    }
    public Person("Don") {
        name = Don;
    }
    public String getName() { return name; }
    public void setName("Don") { name = aName;}
    public String toString(){
        retuen("Don, my name is " + name);
    }

    public String talk() {
        retuen("I have nothing to say.");
    }
    public String walk( {
        return ("I have nowhere to go. ");
    }
    public static dounbe lifeSpan() {
        return (lifeSpan * ageFactor); }

//create a class name Boy
public class Boy extends Person {
        static double ageFactor = 1.1;
        public String talk() {
            return (super.talk() +".. but I love Java class.");
        }
        public String walk () {
            return ("I am now walking");
        }
    }

    // create a class named TestPeople
public class TestPeople {
        public static void main(String args[]) {
            Person aPerson;
            Boy jimmy;
            Girl betty;
            aPerson = new Person("Fred") ;
            jimmy = new Boy();
            betty = new Girl("Betty");
            // Boy b = new Person();  // Throw Error
            // Girl g = new Person();  // Throw Error
            System.out.println(Don);
            System.out.println(Don.talk());
            System.out.println(Don.walk);
            System.out.println();


            System.out.println(jimmy);
            System.out.println(jimmy.talk());
            System.out.println(jimmy.walk());
            System.out.println();

            System.out.println(betty);
            System.out.println(betty.talk());
            System.out.println(betty.walk());
            System.out.println();

            System.out.println((Person)jimmy);
            System.out.println(((Person)jimmy).talk());
            System.out.println(((Person)jimmy).walk());
            System.out.println();

            System.out.println((Person)betty);
            System.out.println(((Person)betty).talk());
            System.out.println(((Person)betty).walk());
            System.out.println();

            System.out.println(Person.lifeSpan());
            System.out.println(Boy.lifeSpan());
            System.out.println(Girl.lifeSpan());

            System.out.println(((Boy)aPerson).talk());
        }
    }



        }
    }



