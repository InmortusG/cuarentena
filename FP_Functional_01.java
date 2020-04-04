import java.util.List;
public class FP_Functional_02{
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        
        System.out.println("Using to --> [System.out::print] by default");
        printAllNumbersInListFunctional_Two(numbers);
        System.out.println("\nprintAllNumbersInListFunctional:");
        printAllNumbersInListFunctional(numbers);
        System.out.println("\nprintEvenNumbersInListFunctional:");
        printEvenNumbersInListFunctional(numbers);
        System.out.println("\nprintSquaresOfEvenNumbersInListFunctional:");
        printSquaresOfEvenNumbersInListFunctional(numbers);
        System.out.println("");
    }

    private static void print(int number){
        System.out.print(number + ", ");
    }

    private static boolean isEven(int number){
        return (number % 2 == 0);
    }

    private static void printAllNumbersInListFunctional_Two(List<Integer> numbers){
        //What to do?
        numbers.stream()                    //---->Convert to Stream
                .forEach(System.out::print);//---->Method Reference
        System.out.println("");
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream()                    //---->Convert to Stream
        .forEach(FP_Functional_02::print);  //---->Method Reference
        System.out.println("");
    }

    //number -> number % 2 == 0
    private static void printEvenNumbersInListFunctional(List<Integer> numbers){
        //What to do?
        numbers.stream()                        //----->Convert to Stream
            .filter(FP_Functional_02::isEven)   //----->Method Reference --> Filter = Only Allow Even NUmbers
            .forEach(FP_Functional_02::print);  //----->Method Reference
        System.out.println("");
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()                            //----->Convert to Stream
                .filter(number -> number % 2 == 0)  //----->Lambda Expression
                .map(number -> number * number)     //----->Lambda --> mapping = x -> x * x
                .forEach(FP_Functional_02::print);  //----->Method Reference
        System.out.println("");
    }
}
