// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    printFizzBuzz(100); }
    public static void printFizzBuzz(int n) {
        for(int i = 1; i<101; i++){

            if(i % 15 == 0) {
                System.out.println(i + " FizzBuzz");}
                else if(i % 5 == 0){

                    System.out.println(i + " Fizz");
                }
                else if(i % 3 == 0){
                    System.out.println(i + " Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }

