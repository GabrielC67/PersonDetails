package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;
    String currentPerson = ""; //Instance variable - currentPerson

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {
        String result = "";
        // create a `counter
        int i = 0;
        // while `counter` is less than length of array
        // begin loop
        while (i < personArray.length) {

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

            Person currentPerson = personArray[i];
            result += currentPerson.toString();

            // end loop
            i++;
        }
        return result;
    }


    public String forLoop() {
        String result = "";

        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++) {
            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
            Person currentPerson = personArray[i];
            result += currentPerson.toString();

        }
        return result;
    }


    public String forEachLoop() {
        String result = "";

        // identify array's type - Array's type is Person
        // identify array's variable-name - personArray
        for (Person i : personArray) {
            result += i;

            //for each variable that's in that array
            // use the above discoveries to declare for-each-loop signature
            // begin loop`
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
            //Person[] personArray = {person1, person2, person3};
            //person1 = (firstName, lastName);
            //person2 = (firstName, lastName);
            //person3 = (firstName, lastName);
            System.out.println(result);

        }
        return result;
    }


    //return result;


    public Person[] getPersonArray() {
        return personArray;
    }
}
