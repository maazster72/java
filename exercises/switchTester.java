package exercises;

class SwitchTester {
    public static void main(String args[]) {
        for (int i = 1; i < 6; i++) {
            int b = (int) Math.pow(i, 2);
            switchExperiment(i, b);
        }

        String[] months = {"January",
                            "Febuary",
                            "March",
                            "April",
                            "May",
                            "June",
                            "July",
                            "August",
                            "September",
                            "October",
                            "November",
                            "December",
                            "MONTHYMONTH"
                        };
        for (String month : months) {
            switchSeason(month);
        }

      
    }

    public static void switchExperiment(int a, int b) {
        switch(a) {
            case 1-> b -=4;
            case 2-> b += 4;
            case 3-> b /= 4;
            case 4-> b *= 4;
            default -> b = 0;
        }
        System.out.println("b is " + b);
    }

    public static void switchSeason(String month) {
        String str;
        month = month.toUpperCase();
        switch(month) {
            case "JANUARY" -> str = "New Year, New Me!";
            case "DECEMBER","FEBUARY" -> str = "Winter! Brrrrrr!";
            case "MARCH","APRIL","MAY" -> str = "Spring-a-ling!";
            case "JUNE","JULY" -> str = "Summer is FUN-ner!";
            case "AUGUST" -> str = "Summer Vacation!";
            case "SEPTEMBER","OCTOBER","NOVEMBER" -> str = "Autumn.";
            default -> str = "That's not a month...";
        }
        System.out.println(str);
    }

// It's often helpful to understand the limits of a new command. 
// Here are some things to try, which does Java allow you to do 
// with a switch ? Which ones do you predict will work? 
// Were your intuitions correct?

// 1. A switch that works over a boolean value 
    //A: Switch only works with integral types
//2. A switch that works over a float value
    //A: Switch cannot work on type float
// 3. A switch whose cases are of different types
    //Switch does not work on different types, must cast vars
// 4. A case that contains multiple statements
    //A: As long as they are the same type, then yes
// 5. A switch where integer cases appear in an arbitrary order
    //A: Order does not matter, as it is executed from top to bottom, just 
    //ensure that break statement
// 6. A switch statement without a default
    //A: A deafult is not necessary but good habit, if all cases are false but no deafult then no output will be given
// 7. A case value that is determined by a constant (keyword: final )
    //A:IS fine
// 8. A case value that is determined by a variable
    //A: Case values must be constant expression
// 9. A case value that is determined by a value (ie an arithmetic operation 2*5 )
    //A: is fine
// 10. A case with multiple values
    //A: is fine
// 11. A default case with a break
    //A: Not needed but perfectly lega;
// 12. A switch statement where one or more of the case labels are duplicated 13. A combination of case s with -> and : operators
    //A: No, you can not duplicate a case, error would happen at compile time
// 14. A case with no content after the colon
    //A: Is fine
        
}