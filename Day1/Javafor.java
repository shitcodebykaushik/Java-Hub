package  Day1;

public class Javafor {
    public static void main (String [] args ) {
        for (int i =0;i<=5;i++){
            System.out.println(
                "Count : " + i
            );
        }
 
        int [] numbers = {1,2,3,4,5};
        for (int i = 0;i<numbers.length;i++){
            System.out.println("Element at index " + i +  " " + numbers[i]);

        };

        String [] Fruits = {"Apple","Banana","Mango"};
        for(int i = 0;i<Fruits.length;i++) {
            System.out.println("The fruite at index " + i + " "+Fruits[i]);
        };
    };
}