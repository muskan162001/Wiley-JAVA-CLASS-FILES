import java.util.Scanner;

public class IfExample {
    
    public static int totalCartValueMethod(int n, int array[]){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int n;
        System.out.println("Enter the number of items in cart ");

        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();

        System.out.println("Enter the item prices : ");
        int[] array = new int[n];  

        for(int i=0; i<n; i++){
            array[i]=scn.nextInt();  
        }

        int totalCartValue = totalCartValueMethod(n, array);

        int discount = (totalCartValue * 10) / 100;

        if(totalCartValue >= 10000) {
            System.out.println("Yeah!! You got the discount");
            System.out.println(totalCartValue - discount);
        }
        else{
            System.out.println("Sorry!!! You didn't get the Discount");
        }
    }
}
