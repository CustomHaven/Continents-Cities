// https://www.codecademy.com/courses/learn-java/projects/continents-cities
// Continents and their largest cities. // Q2
// Q1
public class Continents {
    public static void main(String[] args) {
        // Q3
        int continent = 4;

        // Q4
        switch (continent) {
            case 1: // Q5 - Q7
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2: // Q8 Q9
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3: // Q10
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4: // Q11
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5: // Q12
                System.out.println("Asia Shanghai, China");
                break;
            case 6: // Q13
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7: // Q14
                System.out.println("Antarctica: McMurdo Station, US");
                break;
            default: // Q15
                System.out.println("Undefined continent!");
        }


//        A quick way to do switch statement look we don't even have break;!!

//        they call it enhanced 'switch'

        switch (continent) {
            case 1 -> System.out.println("North America: Mexico City, Mexico");
            case 2 -> System.out.println("South America: Sao Paulo, Brazil");
            case 3 -> System.out.println("Europe: Moscow, Russia");
            case 4 -> System.out.println("Africa: Lagos, Nigeria");
            case 5 -> System.out.println("Asia Shanghai, China");
            case 6 -> System.out.println("Australia: Sydney, Australia");
            case 7 -> System.out.println("Antarctica: McMurdo Station, US");
            default -> System.out.println("Undefined continent!");
        }


    }
}