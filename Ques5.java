//Find common elements between two arrays.
import java.util.*;
public class Ques5 {
    public static void main(String[] args)
    {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Scanner sc=new Scanner(System.in);
        //Entering the first array
        System.out.println("Enter the first Array");
        for(int i=0;i<5;i++){
            array1[i] = sc.nextInt();
        }
        //entering the second array
        System.out.println("Enter the second Array");
        for(int i=0;i<5;i++){
            array2[i] = sc.nextInt();
        }

        System.out.println("Array1 : "+Arrays.toString(array1));//converting array object to strings using tosting()
        System.out.println("Array2 : "+Arrays.toString(array2));

        System.out.println("Common Elements are: ");
        for (int i = 0; i < array1.length; i++)//iterating first array
        {
            for (int j = 0; j < array2.length; j++)//iterating second array
            {
                if(array1[i] == (array2[j]))
                {

                    array1[i]=array2[j];
                    System.out.println(array1[i]);
                }
            }

        }

    }
}
