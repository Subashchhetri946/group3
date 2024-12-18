public class App {
    public static void main(String[] args) throws Exception {
        // 1. declare two variables number1 and number2. Assign them values.
        int number1 = 1;
        int number2 = 2;
        
        // a. test if number1 is equal to number2
        if (number1 == number2) {
            System.out.println("number1 is equal to number2.");
        } 
        

        // b. test if number1 is greater than number2
        if ( number1 < number2) {
            System.out.println("number1 is less than number2.");
        } 

        // c. test if number1 is greater or equal to number2
        if (number1 >= number2) {
            System.out.println("number1 is greater or equal to number2.");
        } 

        // d. test if number1 is not equal to number2.
        if (number1 != number2) {
            System.out.println("number1 is not equal to number2.");
        }



        // 2. Declare three variables number1, number2 and number3. Assign values to the variables.

        number1 = 35;
        number2 = 10;
        int number3 = 35;

        // a. test if all numbers are equal.
        if (number1 == number2 && number2 == number3) {
            System.out.println("All three numbers are equal");
        } 

        // b. test if number1 and number2 are equal OR number2 and number3 are equal.
        if ( number1 == number2 || number2 == number3) {
            System.out.println("Number1 and number2 are equal OR number2 and number3 are equal.");
        } 

        // c. test if number1 is greater than number2 AND number1 is greater than number3.
        if ( number1 > number2 && number1 > number3) {
            System.out.println("Number1 is greater than number2 AND number1 is greater than number3.");
        }

        // d. test if number1 is greater than number2. if not, test if number2 is greater than number3.
        if (number1 > number2) {
            System.out.println("number1 is greater than number2.");
        } else if (number2 > number3) {
            System.out.println("number2 is greater than number3");
        }


        // e. test if number1 and number2 are equal . if not, test if number1 and number3 are equal.
        if (number1 == number2) {
            System.out.println("number1 and number2 are equal.");
        } else if (number1 == number3) {
            System.out.println("number1 and number3 are equal.");
        }


        // 3. Make three typed variable = for eg, name1, name2 and name3. assign values.
        String name1 = "Subash";
        String name2 = "Durga";
        String name3 = "Narayan";

        // a. test if name1 and name2 are equal.
        if (name1.equals(name2))  {
            System.out.println("name1 is Subash.");
        }

        // b. test if name1 and name2 are not equal
        if (!name1.equals(name2)) {
            System.out.println("name1 and name2 are not equal.");
        }


        // c. test name1 and name2 are equal. if not, test name1 and name3 are equal.
        if (name1.equals(name2)) {
            System.out.println("name1 and name2 are equal.");
        } else {
            System.out.println("name1 and name3 are equal");
        }

        

        // if AGE (if statement exercise)




        // 1. make an app which tells us what we can do depending on our age
        int age = 60;
        if(age > 0 && age < 18) {
            System.out.println("You are underage.");
        } else {
            System.out.println("You are adult.");
        }

        System.out.println("Press space to exit.");

        // lets make the conditions a bit better
        if ( age > 0 && age < 18) {
            System.out.println("You are underage.");
        } else if ( age >= 65) {
            System.out.println("You are retired.");
        } else {
            System.out.println("You are Adult.");
        }

        // and a bit further again
        if (age > 0 && age < 18) {
            System.out.println("You are underage.");
            if (age >= 15) {
                System.out.println("You can drive a moped.");
            }
        } else if (age >= 65) {
            System.out.println("You are retired.");
        } else {
            System.out.println("You are Adult.");
        }


 
        // Practice
        //a. if the age is equal to 18, print: "YOu can drive a car".
        if (age == 18) {
            System.out.println("You can drive a car.");
        }

        // b. if the age is 10, 20, 30, 40, 50,60, 70, 80, 90, 100, 110, 120. Print: "Anniversary Party!!"
        if (age ==10||age ==20||age ==30||age ==40||age ==50||age ==60||age ==70||age ==80||age ==90||age ==100||age ==110||age==120) {
            System.out.println("Anniversary Party!!");
        }

        // c. if the age is 100, print the three line , Congratulations!
        if ( age == 100) {
            System.out.println("Congratulations!");
            System.out.println("Congratulations!");
            System.out.println("Congratulations!");
        }


        // d. if the age is between 40- 50 wish, happy mid-life.
        if (age > 40 && age < 50) {
            System.out.println("Happy mid-life.");
        }


        String text = "vowel";
        if (text.equals("vowel")) {
            System.out.println("Its true.");
        }

    }
}
