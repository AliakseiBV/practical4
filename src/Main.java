import entity.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(new FileReader("/home/ave/university-2/practical4/src/in"))){

//            1. Create an array for 6 objects.
            final int PURCHASES_NUMBER = 6;
            Purchase purchases[] = new Purchase[PURCHASES_NUMBER];


//            2. Input data from the given file into the array.
            for(int i = 0; i < purchases.length; i++){
                purchases[i] = PurchaseFactory.getPurchaseFromFactory(scanner);

                // 3. Output the array content to the console (one element per line).
                System.out.println(purchases[i]);

//               4. Output the purchase with maximum cost.
                System.out.println("with max cost is - " + purchases[i].withMaxCost(purchases[0]));


//                5. Determine whether all purchases are equal.
                System.out.println("Are the purchases equal? - " + purchases[i].equals(0));

            }


        }catch (FileNotFoundException e){
            System.err.println("Input file is not found :(");
        }

    }


}